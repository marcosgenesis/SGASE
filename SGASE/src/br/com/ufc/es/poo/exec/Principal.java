
package br.com.ufc.es.poo.exec;

import java.util.Scanner;


public class Principal {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        boolean shouldcontinue = true;
        int tipoUsuario = 1;
            do{
                System.out.println("BEM-VINDO AO SGASE");
                System.out.println("digite o número do seu tipo de Usuário");
                System.out.println("1 - Aluno");
                System.out.println("2 - Professor");
                System.out.println("3 - Admin");
                tipoUsuario = Integer.parseInt(ler.nextLine());
            }while(tipoUsuario > 4 || tipoUsuario < 1);
            switch(tipoUsuario){
                case 1: {
                    do{
                        
                    System.out.println("Essas são as opções disponíveis para você:");
                    System.out.println("");
                        
                    }while(!shouldcontinue);
                }
                case 2:{
                    System.out.println("Essas são as opções disponíveis para você:");
                    System.out.println("");
                }
                case 3:{
                    System.out.println("Essas são as opções disponíveis para você:");
                    System.out.println("");
                }
            }
    }
}
