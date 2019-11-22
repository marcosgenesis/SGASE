
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
        boolean sair = false;
        int tipoUsuario = 1;
        int quantidadeTurmas = 0;
        boolean[] logado = new boolean[3];
        //Base da dados prévia
        //alunosCadastrados.put("000", new AlunoBolsista("000", "000", "mmmm", "marcos", 120, "Artesanato"));
        while(!sair){
            do {
                System.out.println("BEM-VINDO AO SGASE");
                System.out.println("digite o número do seu tipo de Usuário");
                System.out.println("1 - Aluno");
                System.out.println("2 - Professor");
                System.out.println("3 - Admin");
                tipoUsuario = Integer.parseInt(ler.nextLine());
            } while (tipoUsuario > 3 || tipoUsuario < 1);
            switch (tipoUsuario) {
            case 1: {
                AlunoBolsista alunoLogado = null;
                shouldcontinue = true;
                do{
                        System.out.println("Digite sua matricula:");
                        String matricula = ler.nextLine();
                        System.out.println("Digite sua senha:");
                        String senha = ler.nextLine();
                        if (alunosCadastrados.containsKey(matricula)) {
                            if (alunosCadastrados.get(matricula).getSenha().equals(senha)) {
                                logado[0] = true;
                            } else
                                System.out.println("Senha incorreta");
                        } else{
                            System.out.println("Você não tem cadastro. Contate um administrador para lhe cadastrar.");
                            break;
                        }
                        alunoLogado = alunosCadastrados.get(matricula);
                        do {
                            System.out.println("Essas são as opções disponíveis para você:");
                            System.out.println("1 - Visualizar minha média");
                            System.out.println("2 - Visualizar média da turma");
                            System.out.println("3 - Conferir frequência");
                            System.out.println("4 - Sair");
                            int respostaOpcaoDisponivel = Integer.parseInt(ler.nextLine());
                            switch (respostaOpcaoDisponivel) {
                            case 1: {
                                alunoLogado.visualizaMediaAluno(alunoLogado.getCursoMatriculado());
                            }
                            case 2:
                                alunoLogado.visualizaMediaTurma(turmasCadastradas, alunoLogado.getCursoMatriculado());
                                break;
                            case 3:
                                alunoLogado.visualizarPresenca();
                                break;
                            case 4:
                                logado[0] = false;
                                break;
                            default:
                                break;
                            }
                        } while (logado[0]);
                    
                }while(shouldcontinue);
            break;
            }
            case 2: {
                do {
                        System.out.println("Digite seu CPF:");
                        String cpf = ler.nextLine();
                        System.out.println("Digite sua senha:");
                        String senha = ler.nextLine();
                        if (professoresCadastrados.containsKey(cpf)) {
                            if (professoresCadastrados.get(cpf).getSenha().equals(senha)) {
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
                                                System.out.println(" - " + turma.getCurso().getNome());
                                        }
                                        break;
                                    }
                                    case 2: {
                                        Turma turmaEscolhida = null;
                                        System.out.println("======CADASTRAR NOTAS TRABALHO=======");
                                        System.out.println("Escolha a turma desejada para adcionar as notas.");
                                        for (Turma turma : turmasCadastradas) {
                                            if (turma.getProfessor(professorLogado))
                                                System.out.println(turma.getIdentificacao() + " - " + turma.getCurso().getNome());
                                        }
                                            int idTurmaEscolhida = Integer.parseInt(ler.nextLine());
                                        
                                        if (!(idTurmaEscolhida > turmasCadastradas.size() || idTurmaEscolhida < 0)) {
                                               for (Turma turma : turmasCadastradas) {
                                                    if (turma.getIdentificacao() == turmasCadastradas.get(idTurmaEscolhida).getIdentificacao()){
                                                        turmaEscolhida = turma;
                                                        break;
                                                    }
                                                }
                                                if(turmaEscolhida.getParticipantes().isEmpty()){
                                                    System.out.println("Turma vazia. Sem alunos");
                                                }else{
                                                    System.out.println("=====ALUNOS DESSA TURMA=====");
                                                    for (int i = 0; i < turmaEscolhida.getParticipantes().size(); i++) {
                                                        System.out.println(turmaEscolhida.getAluno(i).getCpf() + " - " + turmaEscolhida.getAluno(i).getNome());
                                                    }
                                                    AlunoBolsista alunoEscolhido = null;
                                                    String cpfAlunoEscolhido = ler.nextLine();
                                                    for (int i = 0; i < turmaEscolhida.getParticipantes().size(); i++) {
                                                        if (cpfAlunoEscolhido.equals(turmaEscolhida.getAluno(i).getCpf())) {
                                                            alunoEscolhido = turmaEscolhida.getAluno(i);
                                                        }
                                                    }
                                                    if (alunoEscolhido == null) 
                                                        System.out.println("Aluno Inexistente");
                                                    int trabalhoEscolhido = 0;
                                                    do{
                                                        System.out.println("Qual trabalho você quer adicionar a nota?");
                                                        System.out.println("1° Trabalho");
                                                        System.out.println("2° Trabalho");
                                                        trabalhoEscolhido = Integer.parseInt(ler.nextLine());
                                                    }while(trabalhoEscolhido > 2 || trabalhoEscolhido<1);
                                                    double notaTrabalho = 0;
                                                    do {
                                                        System.out.println("DIGITE A NOTA DO TRABALHO DISPONÍVEL");
                                                        notaTrabalho = Double.parseDouble(ler.nextLine());
                                                    } while (notaTrabalho > 10 || notaTrabalho<0);
                                                    alunosCadastrados.get(alunoEscolhido.getCpf()).setNotaTrabalho(trabalhoEscolhido, notaTrabalho);
                                                }
                                        }
                                        
                                        
                                    }
                                    case 3:
                                        break;
                                    case 9:
                                        voltarMenuPrincipal = true;
                                    default:
                                        break;
                                    }
                                } while (voltarMenuPrincipal == false);
                            } else
                                System.out.println("Senha incorreta");
                        } else{
                            System.out.println("Cadastro inexistente. Contate um administrador e realize seu cadastro.");
                            shouldcontinue = false;
                        }
                    
                } while (shouldcontinue);
                break;
            }
            case 3: {
                do {
                    if(!logado[2]){
                        System.out.println("Digite seu CPF:");
                        String cpf = ler.nextLine();
                        System.out.println("Digite sua senha:");
                        String senha = ler.nextLine();
                        if (administradoresCadastrados.containsKey(cpf))
                            if (administradoresCadastrados.get(cpf).getSenha().equals(senha)){
                                logado[2] = true;
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
                        shouldcontinue = true;
                        do {

                            System.out.println("Essas são as opções disponíveis para o seu acesso:");
                            System.out.println("1 - Cadastrar aluno");
                            System.out.println("2 - Cadastrar professor");
                            System.out.println("3 - Cadastrar turma");
                            System.out.println("4 - sair");
                            respostaOpcaoDisponivel = Integer.parseInt(ler.nextLine());

                        } while (respostaOpcaoDisponivel > 4 || respostaOpcaoDisponivel < 1);

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
                                    alunosCadastrados.put(cpf, new AlunoBolsista(cpf, senha, email, nome, (Integer.parseInt(cpf)/10),turmaEscolhida.getCurso()));
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
                                    professoresCadastrados.put(cpf, new Professor(cpf, senha, email, nome));
                                    turmaEscolhida.setProfessor(professoresCadastrados.get(cpf));
                                    System.out.println("Professor! Cadastrado!");
                                    System.out.println("Os dados do professor cadastrado são:");
                                    System.out.println(professoresCadastrados.get(cpf).toString());
                                    System.out.println("Repasse os dados para o administrador se necessário.");
                                    break;  
                                }
                            }
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
                                                System.out.println("Digite a carga horáaria para este curso: ");
                                                int cargaHorariaCurso = Integer.parseInt(ler.nextLine());
                                                turmasCadastradas.add(new Turma(quantidadeTurmas,new Artesanato("Artesanato", cargaHorariaCurso)));
                                                quantidadeTurmas++;
                                                System.out.println(turmasCadastradas.get(0).getCurso().getNome() + 
                                                        turmasCadastradas.get(0).toString());
                                        }
                                    }
                                } catch (NumberFormatException err) {
                                    System.out.println("Erro! digite novamente!");
                                }
                            break;
                            }
                            case 4:shouldcontinue=false;break;
                        }
                    }
                } while (shouldcontinue);
            }
            }
        }
    }
}
