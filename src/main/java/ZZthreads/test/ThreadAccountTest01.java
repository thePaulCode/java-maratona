package ZZthreads.test;

import ZZthreads.dominio.Account;

public class ThreadAccountTest01 {

    private Account account = new Account();

    public static void main(String[] args) {

    }

    private void withdrawl(int amount){
        if(account.getBalance() >= amount) {
            System.out.println(Thread.currentThread().getName() + " esta indo sacar dinheiro.");
            account.withgrawl(amount);
            System.out.println(Thread.currentThread().getName() + " completou o saque, saldo: " + account.getBalance());

        } else{
            System.out.println("Saldo indisponivel para saque, " + Thread.currentThread().getName() + ", saldo :" + account.getBalance());
        }
    }
}
