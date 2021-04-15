package com.cleberazevedo;

import java.util.Scanner;

public class CifraCesar{

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        Scanner v = new Scanner(System.in);

        char ascii;
        char x, y;

        System.out.println("Digite a MENSAGEM a ser criptografada com a Cifra de César: ");
        String mensagem = t.nextLine();
        System.out.println("Digite a CHAVE (Tem que ser número): ");
        int chave = v.nextInt();
        while (chave >= 26) {
            chave = chave - 26;
        }
        for (int i = 0; i < mensagem.length(); i++) {

            //Utilizei a tabela ASCII
            //Tratamento Letras minusculas
            if (mensagem.charAt(i) >= 97 && mensagem.charAt(i) <= 122) {
                if ((int) (mensagem.charAt(i) + chave) > 122) {
                    x = (char) (mensagem.charAt(i) + chave);
                    y = (char) (x - 122);
                    ascii = (char) (96 + y);
                    System.out.print(ascii);
                } else {
                    ascii = (char) (mensagem.charAt(i) + chave);
                    System.out.print(ascii);
                }
            }
            //Tratamento Letras mausculas
            if (mensagem.charAt(i) >= 65 && mensagem.charAt(i) <= 90) {
                if (mensagem.charAt(i) + chave > 90) {
                    x = (char) (mensagem.charAt(i) + chave);
                    y = (char) (x - 90);
                    ascii = (char) (64 + y);
                    System.out.print(ascii);
                } else {
                    ascii = (char) (mensagem.charAt(i) + chave);
                    System.out.print(ascii);
                }
            }
        }
    }
}
