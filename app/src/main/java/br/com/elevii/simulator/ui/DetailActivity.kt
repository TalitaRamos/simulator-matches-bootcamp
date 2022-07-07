package br.com.elevii.simulator.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.elevii.simulator.databinding.ActivityDetailBinding
import br.com.elevii.simulator.domain.Match
import com.bumptech.glide.Glide

class DetailActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailBinding

    object Extras {
        const val MATCH = "EXTRA_MATCH"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        loadMatchFromExtra()
    }

    private fun loadMatchFromExtra() {
        intent?.extras?.getParcelable<Match>(Extras.MATCH)?.let {
           Glide.with(this).load(it.place.image).into(binding.ivPlace)
            supportActionBar?.title = it.place.name

            binding.tvDescription.text = it.description
            binding.tvHomeTeamName.text = it.homeTeam.name
            binding.tvAwayTeamName.text = it.awayTeam.name

            Glide.with(this).load(it.homeTeam.image).into(binding.ivHomeTeam)
            Glide.with(this).load(it.awayTeam.image).into(binding.ivAwayTeam)

            if (it.homeTeam.score != null) {
                binding.tvHomeTeamScore.text = it.homeTeam.score.toString()
                binding.tvAwayTeamScore.text = it.awayTeam.score.toString()
            }

            binding.rbHomeTeamStars.rating = it.homeTeam.stars.toFloat()
            binding.rbAwayTeamStars.rating = it.awayTeam.stars.toFloat()
        }
    }
}