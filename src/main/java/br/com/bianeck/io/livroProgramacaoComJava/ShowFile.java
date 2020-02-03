package br.com.bianeck.io.livroProgramacaoComJava;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ShowFile {
    public static void main(String[] args) {

        int i;
        FileInputStream fin;

        try {
            fin = new FileInputStream("file1.txt");
        }catch (FileNotFoundException exc) {
            System.out.println("File Not Found.");
            return;
        }

        try{
            // lê os bytes até o fim do arquivo ser alcançado
            do {
                i = fin.read();
                if(i != -1) System.out.print((char) i);
            } while (i != -1);
        } catch (IOException exc) {
            System.out.println("Error reading file.");
        } finally {
            try {
                fin.close();
            } catch (IOException exc) {
                System.out.println("Error closing file");
            }
        }

    }
}
