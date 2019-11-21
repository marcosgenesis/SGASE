
package br.com.ufc.es.poo.exec;

import br.com.ufc.es.poo.model.Administrador;
import br.com.ufc.es.poo.model.AlunoBolsista;
import br.com.ufc.es.poo.model.Artesanato;
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
        // "Base de dados" para o sistema
        Map<String, AlunoBolsista> alunosCadastrados = new HashMap<String, AlunoBolsista>();
        Map<String, Professor> professoresCadastrados = new HashMap<String, Professor>();
        Map<String, Administrador> administradoresCadastrados = new HashMap<String, Administrador>();
        ArrayList<Turma> turmasCadastradas = new ArrayList();
        Scanner ler = new Scanner(System.in);
        boolean shouldcontinue = true;
        int tipoUsuario = 1;
        int quantidadeTurmas = 0;
        boolean logado = false;
        //Base da dados prévia
        alunosCadastrados.put("000", new AlunoBolsista("000", "000", "mmmm", "marcos", 120, "Artesanato"));

        do {
            System.out.println("BEM-VINDO AO SGASE");
            System.out.println("digite o número do seu tipo de Usuário");
            System.out.println("1 - Aluno");
            System.out.println("2 - Professor");
            System.out.println("3 - Admin");
            System.out.println("4 - Coordenador");
            tipoUsuario = Integer.parseInt(ler.nextLine());
        } while (tipoUsuario > 4 || tipoUsuario < 1);
        switch (tipoUsuario) {
        case 1: {
            do {
                System.out.println("Digite sua matricula:");
                String matricula = ler.nextLine();
                System.out.println("Digite sua senha:");
                String senha = ler.nextLine();
                if (alunosCadastrados.containsKey(matricula)) {
                    if (alunosCadastrados.get(matricula).getSenha().equals(senha)) {
                        AlunoBolsista alunoLogado = alunosCadastrados.get(matricula);
                        do {
                            System.out.println("Essas são as opções disponíveis para você:");
                            System.out.println("1 - Visualizar minha média");
                            System.out.println("2 - Visualizar média da turma");
                            System.out.println("3 - Conferir frequência");
                            System.out.println("4 - Sair");
                            int respostaOpcaoDisponivel = Integer.parseInt(ler.nextLine());
                            switch (respostaOpcaoDisponivel) {
                            case 1: {
                                System.out.print("Sua média é: ");
                            }
                            case 2:
                                break;
                            case 3:
                                break;
                            case 4:
                                break;
                            default:
                                break;
                            }
                        } while (shouldcontinue);
                    } else
                        System.out.println("Senha incorreta");
                } else
                    System.out.println("Você não tem cadastro. Contate um administrador para lhe cadastrar.");
            } while (shouldcontinue);
            break;
        }
        case 2: {
            do {
                System.out.println("Digite seu CPF:");
                String cpf = ler.nextLine();
                System.out.println("Digite sua senha:");
                String senha = ler.nextLine();
                if (professoresCadastrados.containsKey(cpf)) {
                    if (professoresCadastrados.get(cpf).equals(senha)) {
                        Professor professorLogado = professoresCadastrados.get(cpf);
                        boolean voltarMenuPrincipal = false;
                        do {
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
                            switch (respostaOpcaoDisponivel) {
                            case 1: {
                                System.out.println("======MINHAS TURMAS=======");
                                for (Turma turma : turmasCadastradas) {
                                    if (turma.getProfessor(professorLogado))
                                        System.out.println(" - " + turma.getCurso());
                                }
                            }
                                ;
                            case 2: {
                            }
                            case 3:
                                break;
                            case 4:
                                voltarMenuPrincipal = true;
                            default:
                                break;
                            }
                        } while (voltarMenuPrincipal == false);
                    } else
                        System.out.println("Senha incorreta");
                } else
                    System.out.println("Cadastro inexistente. Contate um administrador e realize seu cadastro.");

            } while (shouldcontinue);
            break;
        }
        case 3: {
            do {
                if(!logado){
                    System.out.println("Digite seu CPF:");
                    String cpf = ler.nextLine();
                    System.out.println("Digite sua senha:");
                    String senha = ler.nextLine();
                    if (administradoresCadastrados.containsKey(cpf))
                        if (administradoresCadastrados.get(cpf).getSenha().equals(senha)){
                            logado = true;
                            Administrador adm = administradoresCadastrados.get(cpf);
                        }else System.out.println("Senha errada");
                    else{
                        System.out.println("Você não está cadastrado. Deseja cadastrar-se? ( 1-sim 2-não)");
                        int desejaCadastrar = Integer.parseInt(ler.nextLine());
                        if(desejaCadastrar == 1){
                            System.out.println("Nome do administrador:");
                            String nome = ler.nextLine();
                            System.out.println("Email do administrador");
                            String email = ler.nextLine();
                            System.out.println("CPF do administrador:");
                            cpf = ler.nextLine();
                            System.out.println("Senha do administrador:");
                            senha = ler.nextLine();
                            administradoresCadastrados.put(cpf, new Administrador(cpf, nome, email, senha));
                            System.out.println("Os dados do administrador cadastrado são:");
                            System.out.println(administradoresCadastrados.get(cpf).toString());
                            System.out.println("Repasse os dados para o administrador se necessário.");
                        }
                    }
                }else{
                    int respostaOpcaoDisponivel = 1;
                    do {
                        
                        System.out.println("Essas são as opções disponíveis para o seu acesso:");
                        System.out.println("1 - Cadastrar aluno");
                        System.out.println("2 - Cadastrar professor");
                        System.out.println("3 - Cadastrar turma");
                        System.out.println("4 - sair");
                        respostaOpcaoDisponivel = Integer.parseInt(ler.nextLine());
                        
                    } while (respostaOpcaoDisponivel > 3 || respostaOpcaoDisponivel < 1);
                    
                    switch (respostaOpcaoDisponivel){
                        case 1:{
                            System.out.println("Nome do aluno:");
                            String nome = ler.nextLine();
                            System.out.println("Email do aluno");
                            String email = ler.nextLine();
                            System.out.println("CPF do aluno:");
                            String cpf = ler.nextLine();
                            System.out.println("Senha do aluno:");
                            String senha = ler.nextLine();
                            if (turmasCadastradas.isEmpty()){
                                System.out.println("Nenhuma turma cadastrada ainda. Cadastre primeiro uma turma.");
                                break;
                            }else{
                                int opcaoTurma=0;
                                do{
                                    System.out.println("Turmas disponíveis, escoha o id qda turma que quer cadastrar o aluno.");
                                    for (Turma turmasCadastrada : turmasCadastradas) {
                                        System.out.println("ID " + turmasCadastrada.getIdentificacao());
                                    }
                                    opcaoTurma = Integer.parseInt(ler.nextLine());
                                }while(opcaoTurma > turmasCadastradas.size() || opcaoTurma < 0);
                                Turma turmaEscolhida = turmasCadastradas.get(opcaoTurma);
                                alunosCadastrados.put(cpf, new AlunoBolsista(cpf, senha, email, nome, (Integer.parseInt(cpf)/10),"artesanato"));
                                AlunoBolsista alunocadastrado = alunosCadastrados.get(cpf);
                                turmaEscolhida.setAluno(alunocadastrado);
                                System.out.println("Aluno Cadastrado!");
                                break;
                            }
                        }
                        case 2:{
                            System.out.println("Nome do Professor:");
                            String nome = ler.nextLine();
                            System.out.println("Email do Professor");
                            String email = ler.nextLine();
                            System.out.println("CPF do Professor:");
                            String cpf = ler.nextLine();
                            System.out.println("Senha do Professor:");
                            String senha = ler.nextLine();
                            professoresCadastrados.put(cpf, new Professor(cpf, senha, email, nome));
                            System.out.println("Os dados do professor cadastrado são:");
                            System.out.println(professoresCadastrados.get(cpf).toString());
                            System.out.println("Repasse os dados para o administrador se necessário.");
                        }break;
                        case 3:{
                            System.out.println("Cursos disponíveis:");
                            System.out.println("1 - Artesanato");
                            System.out.println("2 - Auxiliar de Cozinha");
                            System.out.println("3 - Informática básica");
                            int cursoEscolhido;
                            try {
                                cursoEscolhido = Integer.parseInt(ler.nextLine());
                                if (cursoEscolhido < 3 && cursoEscolhido >= 1){
                                    switch(cursoEscolhido){
                                        case 1:
                                            turmasCadastradas.add(new Turma(quantidadeTurmas,new Artesanato("Artesanato", tipoUsuario)));
                                            System.out.println(turmasCadastradas.get(0));
                                    }
                                }
                            } catch (NumberFormatException err) {
                                System.out.println("Erro! digite novamente!");
                            }
                            
                        }
                        case 4:{
                            
                        }
                    }
                }
            } while (shouldcontinue);
        }
        }
    }
}
