package conexao;



import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import com.google.gson.Gson;

import modelo.Endereco;


public class  ConexaoHttp {
    //---Representação de ConsultaCep---
    public Endereco conexaoHttp(String cep) {

        //String cep = "01001000";

        String url = "https://viacep.com.br/ws/"+ cep +"/json/";

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();

        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Endereco.class);//---Converte o Json no objeto da classe Endereco

        } catch (Exception e) {
            throw new RuntimeException(" Codigo do erro: "+e
                    +"\nNão consegui obter o endereço a partir desse CEP.");
        }

    }
}