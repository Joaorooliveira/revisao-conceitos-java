package revisao.conceitos.inputeoutput.io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        //Escrevendo em um arquivo

        try {
            FileWriter writer = new FileWriter("meuArquivo.txt");
            writer.write("Ola ,mundo!");// Gravar

            writer.close();
            //Lendo de um arquivo

            FileReader reader = new FileReader("meuArquivo.txt");

            int data = reader.read(); //Ler

            while(data != -1){
                System.out.print((char)data);
                data = reader.read();
            }
            reader.close();
        }catch (IOException e){
            System.out.println("Probelmas de IO:"+e.getMessage());
        }
    }
}
