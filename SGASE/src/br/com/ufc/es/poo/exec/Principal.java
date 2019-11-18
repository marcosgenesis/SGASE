
package br.com.ufc.es.poo.exec;

import br.com.ufc.es.poo.model.Administrador;
import br.com.ufc.es.poo.model.AlunoBolsista;
import br.com.ufc.es.poo.model.Professor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Principal {
    public static void main(String[] args) {
        //"Base de dados" para o sistema
        Map<String, AlunoBolsista> alunosCadastrados = new HashMap<String, AlunoBolsista>();
        Map<String, Professor> professoresCadastrados = new HashMap<String, Professor>();
        Map<String, Administrador> administradoresCadastrados = new HashMap<String, Administrador>();
        
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
                        System.out.println("Digite sua matricula:");
                        String matricula = ler.nextLine();
                        System.out.println("Digite sua senha:");
                        String senha = ler.nextLine();
                        if(alunosCadastrados.containsKey(matricula)){
                            if(alunosCadastrados.get(matricula).equals(senha)){
                                do{
                                    System.out.println("Essas são as opções disponíveis para você:");
                                    System.out.println("1 - Visualizar minha média");
                                    System.out.println("2 - Visualizar meu curso");
                                    System.out.println("3 - Conferir frequência");
                                    System.out.println("4 - Sair");
                                    int respostaOpcaoDisponivel = Integer.parseInt(ler.nextLine());
                                    switch(respostaOpcaoDisponivel){
                                        case 1:{
                                        };
                                        case 2:break;
                                        case 3:break;
                                        case 4:break;
                                        default: break;
                                    }
                                }while(shouldcontinue);
                            }
                            else System.out.println("Senha incorreta");
                        }else System.out.println("Você não tem cadastro. Contate um professor ou administrador para lhe cadastrar.");
                    }while(shouldcontinue);
                    break;
                }
                case 2:{
                    do{
                        System.out.println("Digite seu CPF:");
                        String cpf = ler.nextLine();
                        System.out.println("Digite sua senha:");
                        String senha = ler.nextLine();
                        if(professoresCadastrados.containsKey(cpf)){
                            if(professoresCadastrados.get(cpf).equals(senha)){
                                do{
                                    System.out.println("Essas são as opções disponíveis para você:");
                                    System.out.println("1 - Visualizar minha média");
                                    System.out.println("2 - Visualizar meu curso");
                                    System.out.println("3 - Conferir frequência");
                                    System.out.println("4 - Sair");
                                    int respostaOpcaoDisponivel = Integer.parseInt(ler.nextLine());
                                    switch(respostaOpcaoDisponivel){
                                        case 1:{
                                        };
                                        case 2:break;
                                        case 3:break;
                                        case 4:break;
                                        default: break;
                                    }
                                }while(shouldcontinue);
                            }
                            else System.out.println("Senha incorreta");
                        }
                        
                    }while(shouldcontinue);
                    break;
                }
                case 3:{
                    do{
                        System.out.println("Digite seu CPF:");
                        String cpf = ler.nextLine();
                        System.out.println("Digite sua senha:");
                        String senha = ler.nextLine();
                        if(administradoresCadastrados.containsKey(cpf)){
                            if(administradoresCadastrados.get(cpf).equals(senha)){
                                do{
                                    System.out.println("Essas são as opções disponíveis para você:");
                                    System.out.println("1 - Visualizar minha média");
                                    System.out.println("2 - Visualizar meu curso");
                                    System.out.println("3 - Conferir frequência");
                                    System.out.println("4 - Sair");
                                    int respostaOpcaoDisponivel = Integer.parseInt(ler.nextLine());
                                    switch(respostaOpcaoDisponivel){
                                        case 1:{
                                        };
                                        case 2:break;
                                        case 3:break;
                                        case 4:break;
                                        default: break;
                                    }
                                }while(shouldcontinue);
                            }
                            else System.out.println("Senha incorreta");
                        }else{
                            System.out.println("Você não tem cadastro. Deseja se cadastrar?!(1-sim 2-não");
                            if(!(Integer.parseInt(ler.nextLine()) == 1)) break;
                            System.out.println("Digite seu nome: ");
                            String nome = ler.nextLine();
                            System.out.println("Digite seu CPF");
                            cpf = ler.nextLine();
                            System.out.println("Digite seu email");
                            String email = ler.nextLine();
                            System.out.println("Digite sua senha");
                            senha = ler.nextLine();
                            administradoresCadastrados.put(cpf, new Administrador(cpf, nome, email,senha));
                        }
                    }while(shouldcontinue);
                }
            }
    }
}
