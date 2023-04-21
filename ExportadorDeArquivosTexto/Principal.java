package ExportadorDeArquivosTexto;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in, StandardCharsets.UTF_8);
        List<Texto> novoTextoLista = new ArrayList<>();

        System.out.println("Digite as informações sobre você: ");
        System.out.print("Digite o seu nome: ");
        String nome = scan.nextLine();
        System.out.print("Digite o título: ");
        String titulo = scan.nextLine();
        System.out.print("Digite o gênero: ");
        String genero = scan.nextLine();
        System.out.println("****   Escreva o seu texto   ****");
        String texto = scan.nextLine();

        Texto novoTexto = new Texto(nome, texto, titulo, genero);
        novoTextoLista.add(novoTexto);

        System.out.print("Qual formato você deseja exportar? (txt ou csv) ");
        String formato = scan.nextLine();

        String caminhoSalvarTexto = "C:\\Users\\Fronz\\OneDrive\\Área de Trabalho\\" + titulo + "." + formato;

        //Utiliza o OutpuStreamWriter para adicionar o CharsetCorreto no momento de exportar o arquivo - UTF-8
        try (BufferedWriter novoBuffeedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(caminhoSalvarTexto), "UTF-8"))) {
            for(Texto textoExportar : novoTextoLista){
                novoBuffeedWriter.write(textoExportar.toString());
                novoBuffeedWriter.newLine();;
            }
            
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally{
            scan.close();
        }

        
    }
}
