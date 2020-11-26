package com.mycompany.testeentrada;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class TesteEntrada3 {
    public static void main(String[] args) throws IOException{
        InputStream is = new FileInputStream("arquivo.txt");
        Scanner entrada = new Scanner(is);
        //Scanner entrada = new Scanner(is, "UTf-8");
        //Scanner entrada = new Scanner(is, charsetName: "ISO-8859-1");
        while(entrada.hasNextLine()){
            System.out.println(entrada.nextLine());
        }
        is.close();
    }
}
