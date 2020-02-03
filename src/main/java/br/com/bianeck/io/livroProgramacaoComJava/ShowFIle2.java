package br.com.bianeck.io.livroProgramacaoComJava;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ShowFIle2 {
    public static void main(String[] args) {

        int i;
        FileInputStream fin = null;

        try {
            fin = new FileInputStream("file1.txt");
            do {
                i = fin.read();
                if(i != -1) System.out.print((char) i);
            } while(i != -1);
        } catch (IOException exc) {
            System.out.println("I/O Error: " + exc);
        } finally {
            try {
                if(fin != null) fin.close();
            } catch (IOException exc) {
                System.out.println("Error closing file");
            }
        }
    }
}
