
package br.com.ufc.es.poo.exec;

import br.com.ufc.es.poo.controller.ValidaCpfController;
import br.com.ufc.es.poo.model.Administrador;
import br.com.ufc.es.poo.model.AlunoBolsista;
import br.com.ufc.es.poo.model.CursosOfertados;
import br.com.ufc.es.poo.model.FrequenciaRemunerada;
import br.com.ufc.es.poo.model.Professor;
import br.com.ufc.es.poo.model.Turma;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;


public class Principal {
    public static void main(String[] args) {
        //"Base de dados" para o sistema
        Map<String, AlunoBolsista> alunosCadastrados = new HashMap<String, AlunoBolsista>();
        Map<String, Professor> professoresCadastrados = new HashMap<String, Professor>();
        Map<String, Administrador> administradoresCadastrados = new HashMap<String, Administrador>();
        ArrayList<Turma> turmasCadastradas = new ArrayList();
        Scanner ler = new Scanner(System.in);
        boolean shouldcontinue = true;
        ValidaCpfController x = new ValidaCpfController();
        int tipoUsuario = 1;
            do{
                System.out.println("BEM-VINDO AO SGASE");
                System.out.println("digite o número do seu tipo de Usuário");
                System.out.println("1 - Aluno");
                System.out.println("2 - Professor");
                System.out.println("3 - Admin");
                System.out.println("4 - Coordenador");
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
                                    System.out.println("2 - Visualizar média da turma");
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
                        }else System.out.println("Você não tem cadastro. Contate um administrador para lhe cadastrar.");
                    }while(shouldcontinue);
                    break;
                }
                case 2:{
                    do{
                        System.out.println("Digite seu CPF:");
                        String cpf = ler.nextLine(); 
                        x.metodoBom(cpf);//excessão
                        System.out.println("Digite sua senha:");
                        String senha = ler.nextLine();
                        if(professoresCadastrados.containsKey(cpf)){
                            if(professoresCadastrados.get(cpf).equals(senha)){
                                Professor professorLogado = professoresCadastrados.get(cpf);
                                do{
                                    System.out.println("Essas são as opções disponíveis para você:");
                                    System.out.println("1 - Visualizar minhas turmas");
                                    System.out.println("2 - Cadastrar nota de trabalhos");
                                    System.out.println("3 - Cadastrar nota de provas");
                                    System.out.println("4 - Cadastrar faltas de aluno");
                                    System.out.println("5 - Cadastrar presenças de aluno");
                                    System.out.println("6 - Verificar frequência remunerada");
                                    System.out.println("7 - Fazer média da turma");
                                    System.out.println("8 - Fazer média de aluno");
                                    System.out.println("9 - Sair");
                                    int respostaOpcaoDisponivel = Integer.parseInt(ler.nextLine());
                                    switch(respostaOpcaoDisponivel){
                                        case 1:{
                                            System.out.println("======MINHAS TURMAS=======");
                                            for (Turma turma : turmasCadastradas) {
                                               if(turma.getProfessor(professorLogado)) 
                                                  System.out.println(" - " +turma.getCurso());
                                            }
                                        };
                                        case 2:{
                                        }
                                        case 3:break;
                                        case 4:break;
                                        default: break;
                                    }
                                }while(shouldcontinue);
                            }else System.out.println("Senha incorreta");
                        }else System.out.println("Cadastro inexistente. Contate um administrador e realize seu cadastro.");
                        
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
                            if(administradoresCadastrados.get(cpf).getSenha().equals(senha)){
                                do{
                                    System.out.println("Essas são as opções disponíveis para você:"); //AQUI DEVE SER FEITO O CRUD DE COORDENADOR
                                    System.out.println("1 - Cadastrar Professor");
                                    System.out.println("2 - Cadastrar Aluno");
                                    System.out.println("3 - Conferir frequência");
                                    System.out.println("4 - Sair");
                                    int respostaOpcaoDisponivel = Integer.parseInt(ler.nextLine());
                                    switch(respostaOpcaoDisponivel){
                                        case 1:{
                                            System.out.println("Digite o nome do professor"); 
                                            String nome = ler.nextLine();
                                            System.out.println("Digite o email do professor");
                                            String email = ler.nextLine();
                                            System.out.println("Digite o CPF do professor");
                                            cpf = ler.nextLine();
                                            professoresCadastrados.put(cpf, new Professor(cpf, senha, email, nome));
                                            break;
                                        }
                                        case 2:{
                                            System.out.println("Digite o nome do aluno");
                                            String nome = ler.nextLine();
                                            System.out.println("Digite o email do aluno");
                                            String email = ler.nextLine();
                                            System.out.println("Digite o CPF do aluno");
                                            cpf = ler.nextLine();
                                            System.out.println("Digite a senha do aluno");
                                            senha = ler.nextLine();
                                            int turmaEscolhida=0;
                                            do{
                                            System.out.println("Veja as turmas possiveis para o cadastro");
                                            for(int i = 1; i<turmasCadastradas.size();i++){
                                                if(turmasCadastradas.size()==0){
                                                    System.out.println("Sem turmas cadastradas. Cadastre uma.");
                                                    break;
                                                }
                                                System.out.println((i-1) + " - " +turmasCadastradas.get(i).getCurso());
                                            }
                                            turmaEscolhida = Integer.parseInt(ler.nextLine());
                                            }while(turmaEscolhida > turmasCadastradas.size() || turmaEscolhida<1);
                                            Random geradorMatricula = new Random();
                                            FrequenciaRemunerada[] frequenciaRemunerada = null;
                                            CursosOfertados cursoMatriculado = null;
                                            alunosCadastrados.put(cpf, new AlunoBolsista(cpf, senha, email, nome,geradorMatricula.nextInt(10), 0, 0, 0, 0, 0,frequenciaRemunerada,cursoMatriculado,0));
                                            System.out.println("Informe ao aluno os seus dadoos que foram cadastrados:");
                                            System.out.println(alunosCadastrados.get(cpf).toString());
                                            break;
                                        }
                                        case 3:break;
                                        case 4:break;
                                        default: break;
                                    }
                                }while(shouldcontinue);
                            }
                            else{
                                System.out.println("Senha incorreta");
                                for (String key : administradoresCadastrados.keySet()) {
                                        //Capturamos o valor a partir da chave
                                        Administrador value = administradoresCadastrados.get(key);
                                        System.out.println(key + " = " + value);
                                 }
                            }
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
                            System.out.println(administradoresCadastrados.get(cpf).getSenha());
                        }
                    }while(shouldcontinue);
                }
            }
    }
}
