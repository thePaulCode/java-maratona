package javacore.Oexception.exception.test;

import javacore.Oexception.exception.dominio.LoginInvalidoException;

import java.util.Scanner;

public class LoginInvalidoExceptionTest {
    public static void main(String[] args) {
        try {
            logar();
        } catch (LoginInvalidoException e) {
            e.printStackTrace();
        }
        System.out.println("Continue...");
        teclado.nextLine();
    }
    static Scanner teclado = new Scanner(System.in);
    private static void logar() throws LoginInvalidoException {
        //Scanner teclado = new Scanner(System.in);
        String unsernameDB = "Goku";
        String password = "ssj";
        System.out.println("Usuário");
        String usernameWritten = teclado.nextLine();
        System.out.println("Senha");
        String passwordWritten = teclado.nextLine();
        if(!unsernameDB.equals(usernameWritten) || !password.equals(passwordWritten)){
            throw  new LoginInvalidoException("Dados do usuário inválidos.");
        }
        System.out.println("Usuário logado com sucesso!");
    }
}
