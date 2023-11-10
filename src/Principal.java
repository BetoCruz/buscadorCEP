import conexao.ConexaoHttp;
import geradorDeArquivos.GeradorDeArquivos;
import modelo.Endereco;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws IOException {


        ConexaoHttp conexaoHttp = new ConexaoHttp();
        Scanner leitura = new Scanner(System.in);
        List<Endereco> listaDeEmdereco = new ArrayList<>();
        GeradorDeArquivos gerador = new GeradorDeArquivos();

        var cep = "";
        while (cep.toLowerCase() !="sair"){

            System.out.println("Digite o CEP desejado: ");
            cep = leitura.nextLine();
            try{
                Endereco novoEndereco = conexaoHttp.conexaoHttp(cep);
                System.out.println(novoEndereco);
                listaDeEmdereco.add(novoEndereco);
                gerador.capturaJson(novoEndereco);

            }catch (RuntimeException | IOException e){
                System.out.println(e.getMessage());
                System.out.println("\nFinalizando a aplicação.");
                break;
            }
            //gerador.capturaJson("write da lista:  "+listaDeEmdereco);
        }
//        FileWriter escrever = new FileWriter(cep.txt");
//        escrever.write(listaDeEmdereco);
//        escrever.close();

        gerador.capturaColecao(listaDeEmdereco);
        System.out.println("\n"+listaDeEmdereco);
        System.out.println("Programa encerrado!");
    }
}