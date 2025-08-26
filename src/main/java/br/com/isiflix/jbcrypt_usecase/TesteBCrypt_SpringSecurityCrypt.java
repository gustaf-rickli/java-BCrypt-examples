package br.com.isiflix.jbcrypt_usecase;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.Scanner;

public class TesteBCrypt_SpringSecurityCrypt {
    public static void main(String[] args) {

        BCryptPasswordEncoder encoder;
        encoder = new BCryptPasswordEncoder();

        Scanner scan = new Scanner(System.in);

        final String SENHA_PADRAO = "12345";

        String senhaCrypto = encoder.encode(SENHA_PADRAO);

        System.out.println("\n\nSenha padrao: " + SENHA_PADRAO);
        System.out.println("Senha criptografada: " + senhaCrypto);

        System.out.print("digite uma string (senha): ");
        String senha = scan.next();

        if (encoder.matches(senha, SENHA_PADRAO)) {
            System.out.println("Acesso permitido");
        } else {
            System.out.println("Acesso negado");
        }

    }
}
