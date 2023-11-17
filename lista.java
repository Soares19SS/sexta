public class Aluno {
  private String nome;
  private int idade;
  
  public Aluno(String nome, int idade) {
    this.nome = nome;
    this.idade = idade;
  }
  
  public void imprimir() {
    System.out.println("Nome: " + nome);
    System.out.println("Idade: " + idade);
  }
}

public class Curso {
  private String nome;
  
  public Curso(String nome) {
    this.nome = nome;
  }
  
  public void imprimir() {
    System.out.println("Nome do curso: " + nome);
  }
}

public class Professor {
  private String nome;
  
  public Professor(String nome) {
    this.nome = nome;
  }
  
  public void imprimir() {
    System.out.println("Nome do professor: " + nome);
  }
}

public class Disciplina {
  private String nome;
  private List alunos;
  private List cursos;
  private Professor professor;
  
  public Disciplina(String nome) {
    this.nome = nome;
    this.alunos = new ArrayList&lt;&gt;();
    this.cursos = new ArrayList&lt;&gt;();
  }
  
  public void adicionarAluno(Aluno aluno) {
    alunos.add(aluno);
  }

  public void removerAluno(Aluno aluno) {
    alunos.remove(aluno);
  }
  
  public void adicionarCurso(Curso curso) {
    cursos.add(curso);
  }

  public void removerCurso(Curso curso) {
    cursos.remove(curso);
  }
  
  public void setProfessor(Professor professor) {
    this.professor = professor;
  }
  
  public void imprimir() {
    System.out.println("Nome da disciplina: " + nome);
    
    System.out.println("Alunos matriculados:");
    for (Aluno aluno : alunos) {
      aluno.imprimir();
    }
    
    System.out.println("Cursos relacionados:");
    for (Curso curso : cursos) {
      curso.imprimir();
    }
    
    if (professor != null) {
      professor.imprimir();
    } else {
      System.out.println("Nenhum professor atribuído.");
    }
  }
}

public class Main {
  public static void main(String[] args) {
    Aluno aluno1 = new Aluno("João", 20);
    Aluno aluno2 = new Aluno("Maria", 22);
    
    Curso curso1 = new Curso("Matemática");
    Curso curso2 = new Curso("História");
    
    Professor professor = new Professor("Carlos");
    
    Disciplina disciplina = new Disciplina("Cálculo");
    
    disciplina.adicionarAluno(aluno1);
    disciplina.adicionarAluno(aluno2);
    
    disciplina.adicionarCurso(curso1);
    disciplina.adicionarCurso(curso2);
    
    disciplina.setProfessor(professor);
    
    disciplina.imprimir();
  }
}
