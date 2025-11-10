package Modelos;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaMonedas {
    public Moneda buscaMoneda() throws IOException, InterruptedException {
        String apiCode = "c0b8a6afe349137c79c996e1";
        String url = "https://v6.exchangerate-api.com/v6/"+apiCode+"/latest/USD";

        // Creando cliente HTTP
        HttpClient cliente = HttpClient.newHttpClient();
        HttpRequest solicitud = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .GET()
                .build();

        HttpResponse<String> response = cliente
                .send(solicitud, HttpResponse.BodyHandlers.ofString());

        return new Gson().fromJson(response.body(), Moneda.class);
    }
}
