package br.com.isiflix.jbcrypt_usecase;

import at.favre.lib.crypto.bcrypt.BCrypt;

public class TesteBCrypt_Favre {
    public static void main(String[] args) {

        String senhaFavre = "1234";
        String senhaFavreBCryptHashString = BCrypt.withDefaults().hashToString(10, senhaFavre.toCharArray());

        System.out.println("Utilizando a Lib Favre");
        System.out.println("Senha" + senhaFavre);
        System.out.println(senhaFavreBCryptHashString);

    }
}
