package geradorDeArquivos;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import modelo.Endereco;

import java.io.FileWriter;
import java.io.IOException; //----Methodo de asiabtura do lançamento do erro.
import java.util.List;

public class GeradorDeArquivos {
    Gson gson = new GsonBuilder().setPrettyPrinting().create();
    //salvaJson
    public void capturaJson(Endereco endereco) throws IOException {

        FileWriter escrita = new FileWriter(endereco.cep()+"UsandoOCEP.json");
        escrita.write(gson.toJson(endereco));
        escrita.close();
    }

    public void capturaColecao(List<Endereco> lista) throws IOException {

        FileWriter escrita = new FileWriter("ColecaoCEP.json");
        escrita.write(lista.toString());
        escrita.close();
        //for (Endereco item : lista ){}

    }
}

//        if (endereco instanceof Endereco logradouro) {
//            escrita = new FileWriter(logradouro.cep()+"UsandoOCEP.json");
//            escrita.write(gson.toJson(logradouro));
//            escrita.close();
//
//        if (endereco instanceof List ) {
//                for (Endereco item: endereco) {
//                FileWriter escrita = new FileWriter(item.cep() + "UsandoOCEP.json");
//                escrita.write(gson.toJson(item));
//                escrita.close();
//                }
//
//                }else{
//                FileWriter escrita = new FileWriter(endereco.cep()+"UsandoOCEP.json");
//                escrita.write(gson.toJson(endereco));
//                escrita.close();
//                }

