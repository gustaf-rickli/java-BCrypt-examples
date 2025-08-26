package br.com.isiflix.jbcrypt_usecase;

import org.mindrot.jbcrypt.BCrypt;

import java.util.Scanner;

public class TesteBCrypt_Mindrot {
    public static void main(String[] args) {

        String senhaMindrot = "1234";
        String senhaMindrotBCryptHashString;

        senhaMindrotBCryptHashString = BCrypt.hashpw(senhaMindrot, BCrypt.gensalt());


        System.out.println("Utilizando a Lib Favre");
        System.out.println("Senha" + senhaMindrot);
        System.out.println(senhaMindrotBCryptHashString);

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite uma senha: ");
        String senha = scan.next();

        if (BCrypt.checkpw(senha, senhaMindrotBCryptHashString)) {
            System.out.println("Senha valida");
        } else {
            System.out.println("Senha incorreta");
        }

    }
}
