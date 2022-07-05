package br.com.elevii.simulator.ui;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import br.com.elevii.simulator.databinding.ActivityMainBinding;
import br.com.elevii.simulator.domain.Team;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setupMatchesList();
        setUpdateMatches();
        setupFloatingActtionButton();
    }

    private void setupMatchesList() {
        //TODO: Listar partidas consumindo a API
    }

    private void setupFloatingActtionButton() {
        //TODO: Criar evento de clique e simulação de partidas
    }

    private void setUpdateMatches() {
        //TODO: Atualizar as partidas na ação de swipe
    }

}
