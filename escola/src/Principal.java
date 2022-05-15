public class Principal {

    public static void main(String[] args) {

        Aluno aluno1 = new Aluno();
        aluno1.nome = "claudia";
        aluno1.idade = 28;
        aluno1.nota = 10;

        Aluno aluno2 = new Aluno();
        aluno2.nome = "wallace";
        aluno2.idade=23;
        aluno2.nota=10;

        Aluno aluno3 = new Aluno();
        aluno3.nome = "daniel";
        aluno3.idade=19;
        aluno3.nota=10;

       Professor professor = new Professor();
       professor.nome = "mateus";
       professor.idade= 24;
       professor.disiplina= "programação Oriental a Objetos";

        disiplina disiplina= new disiplina();
        disiplina.nome="Programação oriental a Objetivo";
        disiplina.alunos[0]=aluno1;
        disiplina.alunos[1]=aluno2;
        disiplina.alunos[2]=aluno3;


    }
}