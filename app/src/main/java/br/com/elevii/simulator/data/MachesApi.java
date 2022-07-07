package br.com.elevii.simulator.data;

import java.util.List;

import br.com.elevii.simulator.domain.Match;
import retrofit2.Call;
import retrofit2.http.GET;

public interface MachesApi {

    @GET("matches.json")
    Call<List<Match>> getMatches();
}
