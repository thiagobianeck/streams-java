package br.com.bianeck.io.livroProgramacaoComJava;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {
    public static void main(String[] args) {
        int i;

        // copiar o arquivo
        try (FileInputStream fin = new FileInputStream("first.txt"); FileOutputStream fout = new FileOutputStream("second.txt")){
            // tenta abrir os arquivos
            do {
                i = fin.read();
                if(i != -1) fout.write(i);
            }while(i != -1);
        } catch (IOException exc) {
            System.out.println("I/O Error: " + exc);
        }
    }
}
