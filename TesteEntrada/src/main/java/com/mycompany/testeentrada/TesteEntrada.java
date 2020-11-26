package com.mycompany.testeentrada;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.FileInputStream;

public class TesteEntrada {
    public static void main(String[] args) throws IOException {
        InputStream is = new FileInputStream("arquivo.txt");
        InputStreamReader isr = new InputStreamReader(is);
        //InputStreamReader isr = new InputStreamReader(is, "UTF-8");
        //InputStreamReader isr = new InputStreamReader(is, charsetName: "ISO-8859-1");

        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine(); //primeira linha
        System.out.println(s);


        s = br.readLine();
        System.out.println(s);

    }
}