
package sistemauniversidade;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;


public class SistemaUniversidade {
    
    

    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Scanner tecladoString = new Scanner(System.in);
        
        int menu; //Variável que vai ajudar o usuário a utilizar o menu
        int valido = 0; //Variável usada caso o usuário digite um número não existente no menu
        
        //Lista que vai ser usada para guardar os alunos registrados em uma disciplina
        ArrayList<Historico> listaHistorico = new ArrayList <Historico> ();
        Historico objHistorico;
        float nota;
        
        //Listas que vão ser usadas no armazenamento de Alunos e disciplinas
        ArrayList<Disciplina> listaDisciplina = new ArrayList <Disciplina> ();
        ArrayList<Aluno> listaAlunos = new ArrayList();
        
        int selecAluno = 0; //Variável que vai servir na hora de registrar um aluno em uma disciplina
        
        //Variáveis que serão utilizadas no cadastro de uma nova Disciplina
        String nomeDisciplina;
        String professor;
        int numeroDisciplina = 1;
        Disciplina objDisciplina;
        int selecDisciplina = 0;
        //Procedimento usado para pegar a data do computador do usuário
        int mes, ano; 
        Calendar data = Calendar.getInstance(); 
        Date data2 = new Date();
        data.setTime(data2);
        mes = 1 + data.get(Calendar.MONTH);
        ano = data.getWeekYear();
        
        //Declaração dos cursos e departamentos, previamente declarados na universidade
        Departamento informatica = new Departamento("Departamento de Informática", 1000, 12, "31952432234");
        Departamento administracao = new Departamento("Departamento de Administracao", 2000, 26, "31931284361");
        Curso tecInformatica = new Curso("Curso Técnico em Informática", "Curso da Área de Computação", 1, 200, "graduação", informatica);
        Curso bacAdm = new Curso("Bacharelado em Administração", "Curso da Área de Administração", 2, 200, "mestrado", administracao);
        //Coloca os cursos em seus respectivos departamentos
        informatica.setCursos(tecInformatica);
        administracao.setCursos(bacAdm);
        
        //Declaração dos alunos, previamente registrados na Universidade
        Aluno a = new Aluno("Flavio", 1000, "100.500.400-80", "Rua a - Municipio A",
            "3127416161", "02/02/2002",
            "M", "Calouro", "Graduação", informatica, administracao);
        
        Aluno b = new Aluno("Augusto", 1001, "200.600.500-80", "Rua b - Municipio A",
            "3124698532", "15/08/2000",
            "M", "Veterano", "Graduação", administracao, null);
        
        Aluno c = new Aluno("Jessica", 1002, "300.400.300-80", "Rua a - Municipio B",
            "3145632589", "01/01/2002",
            "F", "Calouro", "Graduação", administracao, null);
        
        Aluno d = new Aluno("Amanda", 1003, "500.500.500-80", "Rua b - Municipio B",
            "3112365874", "08/09/1995",
            "F", "Veterano", "Doutorado", informatica, administracao);
        
        Aluno e = new Aluno("Thais", 1004, "600.100.100-80", "Rua c - Municipio A",
            "3112365478", "06/06/2001",
            "F", "Calouro", "Graduação", informatica, null);
        
        Aluno f = new Aluno("Rodolfo", 1005, "200.300.400-80", "Rua d - Municipio A",
            "3165236523", "19/01/1999",
            "M", "Calouro", "Mestrado", informatica, administracao);
        
        Aluno g = new Aluno("Gabriela", 1006, "900.900.900-80", "Rua c - Municipio B",
            "3135742654", "30/01/2002",
            "F", "Calouro", "Graduação", informatica, administracao);
        
        Aluno h = new Aluno("Natalia", 1007, "111.550.440-80", "Rua d - Municipio B",
            "3112501456", "28/04/2002",
            "F", "Calouro", "Graduação", informatica, null);
        
        listaAlunos.add(a);
        listaAlunos.add(b);
        listaAlunos.add(c);
        listaAlunos.add(d);
        listaAlunos.add(e);
        listaAlunos.add(f);
        listaAlunos.add(g);
        listaAlunos.add(h);
        
        ////Coloca os alunos em seus respectivos departamentos
        administracao.setAlunos(a);
        administracao.setAlunos(b);
        administracao.setAlunos(c);
        administracao.setAlunos(d);
        administracao.setAlunos(f);
        administracao.setAlunos(g);
        informatica.setAlunos(a);
        informatica.setAlunos(d);
        informatica.setAlunos(e);
        informatica.setAlunos(f);
        informatica.setAlunos(g);
        informatica.setAlunos(h);
        
        
        do{
            exibirMenu();
            menu = teclado.nextInt();
            
            switch (menu){
                case 1:
                    System.out.println("Digite o nome da disciplina:");
                    nomeDisciplina = tecladoString.nextLine();
                    System.out.println("Digite o nome do professor responsável:");
                    professor = tecladoString.nextLine();
                    objDisciplina = new Disciplina(nomeDisciplina, professor, mes, ano, numeroDisciplina);
                    numeroDisciplina ++;
                    System.out.println("Selecione o curso em que a disciplina faz parte:");
                    System.out.println("1 - Curso Técnico em Informática");
                    System.out.println("2 - Bacharelado em Administração");
                    //Repetição para evitar que o usuário escolha uma opção inválida
                    for(;(selecDisciplina != 1) &&  (selecDisciplina != 2);){
                        selecDisciplina = teclado.nextInt();
                        //Condição para escolher o curso da disciplina, conforme os relacionamentos
                        if(selecDisciplina == 1){
                            objDisciplina.setCurso(tecInformatica);
                            tecInformatica.setDisciplinas(objDisciplina);
                            
                            valido ++;
                        }else if(selecDisciplina == 2){
                            objDisciplina.setCurso(bacAdm);
                            bacAdm.setDisciplinas(objDisciplina);
                            
                            valido ++;
                        }else{
                            System.out.println("Disciplina não existe! Tente novamente:");
                        }
                    }
                    selecDisciplina = 0;
                    listaDisciplina.add(objDisciplina);
                    if(valido == 0){
                        System.out.println("\nErro! Opção não existente no menu");
                    }else{
                        System.out.println("\nDisciplina " + objDisciplina.getNome() + 
                            " foi adicionada com o número de identificação " + objDisciplina.getNumero());
                    }
                    valido = 0;
                    break;
                case 2:
                    //Imprime uma lista com os alunos já matriculados na Universidade 
                    //para o usuário saber quais são seus número de matrícula
                    System.out.println("\nLista dos alunos matriculados:");
                    for(int cont = 0; cont < listaAlunos.size(); cont++){
                        System.out.println(listaAlunos.get(cont).toString());
                    }
                    //Imprime uma lista com as disciplinas já registradas na Universidade 
                    //para o usuário saber quais são seus número de identificação
                    System.out.println("\nLista das disciplinas:");
                    for(int cont = 0; cont < listaDisciplina.size(); cont++){
                        System.out.println(listaDisciplina.get(cont).toString());
                    }
                    
                    System.out.println("\nDigite o número de matricula do aluno que deseje matricular:");
                    selecAluno = teclado.nextInt();
                    
                    for(int cont = 0; cont < listaAlunos.size(); cont++){
                        if(selecAluno == listaAlunos.get(cont).getMatricula()){
                            System.out.println("Digite o número da disciplina em que o aluno irá se matricular:");
                            selecDisciplina = teclado.nextInt();
                            for(int cont2 = 0; cont2 < listaDisciplina.size(); cont2++){
                                if(selecDisciplina == listaDisciplina.get(cont2).getNumero()){
                                    objHistorico = new Historico();
                                    objHistorico.setAluno(listaAlunos.get(cont));
                                    objHistorico.setDisciplina(listaDisciplina.get(cont2));
                                    listaHistorico.add(objHistorico);
                                    listaDisciplina.get(cont2).getHistorico().add(objHistorico);
                                    listaAlunos.get(cont).getHistorico().add(objHistorico);
                                    
                                    valido ++;
                                }
                            }
                        }
                    }
                    selecAluno = 0;
                    selecDisciplina = 0;
                    if(valido == 0){
                        System.out.println("\nErro! Opção não existente no menu");
                    }else{
                        System.out.println("\nA matricula foi um sucesso!");
                    }
                    valido = 0;
                    break;
                case 3:
                    //Imprime uma lista com as disciplinas já registradas na Universidade 
                    //para o usuário saber quais são seus número de identificação
                    System.out.println("\nLista das matriculas:");
                    for(int cont = 0; cont < listaHistorico.size(); cont++){
                        System.out.println(listaHistorico.get(cont).toString());
                    }
                    System.out.println("\nDigite o codigo da disciplina:");
                    selecDisciplina = teclado.nextInt();
                    for(int cont = 0; cont < listaHistorico.size(); cont++){
                        if(selecDisciplina == listaHistorico.get(cont).getDisciplina().getNumero()){
                            System.out.println("Digite a matricula do aluno:");
                            selecAluno = teclado.nextInt();
                            for(int cont2 = 0; cont2 < listaHistorico.get(cont).getDisciplina().getHistorico().size(); cont2++){
                                if(selecAluno == listaHistorico.get(cont).getDisciplina().getHistorico().get(cont2).getAluno().getMatricula()){
                                    System.out.println("Digite a nota do aluno:");
                                    nota = teclado.nextFloat();
                                    listaHistorico.get(cont).getDisciplina().getHistorico().get(cont2).setNota(nota);
                                    listaHistorico.get(cont).getDisciplina().getHistorico().get(cont2).setConceito(nota);
                                    listaHistorico.get(cont).getDisciplina().getHistorico().get(cont2).setStatus(nota);
                                    
                                    //Repetição usada para acessar a lista Historico da classe Aluno e atualizar sua nota, conforme a lista Historico da classe Disciplina
                                    for(int cont3 = 0; cont3 < listaHistorico.get(cont).getAluno().getHistorico().size(); cont3++){
                                        if(listaHistorico.get(cont).getAluno().getHistorico().get(cont3).getDisciplina().getNumero() == selecDisciplina){
                                            listaHistorico.get(cont).getAluno().getHistorico().get(cont3).setNota(nota);
                                            listaHistorico.get(cont).getAluno().getHistorico().get(cont3).setConceito(nota);
                                            listaHistorico.get(cont).getAluno().getHistorico().get(cont3).setStatus(nota);
                                            
                                            valido ++;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    selecDisciplina = 0;
                    selecAluno = 0;
                    if(valido == 0){
                        System.out.println("\nErro! Opção não existente no menu");
                    }else{
                        System.out.println("\nA nota foi aadicionada com sucesso!");
                    }
                    valido = 0;
                    break;
                case 4:
                    //Imprime uma lista com as disciplinas já registradas na Universidade 
                    //para o usuário saber quais são seus número de identificação
                    System.out.println("\nLista das disciplinas:");
                    for(int cont = 0; cont < listaDisciplina.size(); cont++){
                        System.out.println(listaDisciplina.get(cont).toString());
                    }
                    System.out.println("Digite o número de identificação da disciplina que você quer ver os alunos:");
                    selecDisciplina = teclado.nextInt();
                    
                    for(int cont = 0; cont < listaHistorico.size(); cont++){
                        if(selecDisciplina == listaHistorico.get(cont).getDisciplina().getNumero()){
                            for(int cont2 = 0; cont2 < listaHistorico.get(cont).getDisciplina().getHistorico().size(); cont2++){
                                System.out.println(listaHistorico.get(cont).getDisciplina().getHistorico().get(cont2).emprimeAlunos());
                                
                                valido ++;
                            }
                        }
                    }
                    if(valido == 0){
                        System.out.println("\nErro! Opção não existente no menu");
                    }
                    valido = 0;
                    break;
                case 5:
                    System.out.println("\nSaindo...");
                    break;
                default:
                        System.out.println("\nOpção não existente!");
            }
            
        }while (menu != 5);
        
        
    }
    //Menu que vai ser usado pelo usuário para acessar as funções do programa
    static void exibirMenu(){
        System.out.println(" Sistema Acadêmico");
        System.out.println("1 - Cadastro de Disciplina");
        System.out.println("2 - Matricula de um aluno na Disciplina");
        System.out.println("3 - Registro de Notas");
        System.out.println("4 - Listar alunos de uma disciplina");
        System.out.println("5 - Sair");
    }
    
}
