package br.com.bianeck.io.livroProgramacaoComJava;

import java.io.FileInputStream;
import java.io.IOException;

public class CompFiles {
    public static void main(String[] args) {

        int i = 0, j = 0;

        // Compara os arquivos.
        try (FileInputStream f1 = new FileInputStream("first.txt");
             FileInputStream f2 = new FileInputStream("second.txt"))
        {
            // Verifica o conteúdo de cada arquivo.
            do {
                i = f1.read();
                j = f2.read();
                if(i != j) break;
            } while(i != -1 && j != -1);
            if(i != j)
                System.out.println("Files differ.");
            else
                System.out.println("Files are the same.");
        } catch(IOException exc) {
            System.out.println("I/O Error: " + exc);
        }
    }
}
