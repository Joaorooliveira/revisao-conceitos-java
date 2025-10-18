package revisao.conceitos.inputeoutput.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {

        try {
            Path path = Paths.get("meuArquivo2.txt");

            //Escrevendo em um arquivo
            Files.write(path, "Hello World".getBytes());

            //Lendo de um arquivo

            byte[] bytes = Files.readAllBytes(path);

            String content = new String(bytes);

            System.out.println(content);
        }catch(IOException e){
            System.out.println("Erro ao ler o arquivo"+e.getMessage());
        }

    }
}
