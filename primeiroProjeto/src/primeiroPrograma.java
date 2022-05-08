import java.util.Scanner;

public class primeiroPrograma {

  public static void main(String[] args){
      Scanner scan = new Scanner(System.in);
     Float nota1;
     float nota2;
     float nota3;
     float nota4;

     System.out.println("Digite a nota 1");
     nota1 = scan.nextFloat();

      System.out.println("Digite a nota 2");
      nota2 = scan.nextFloat();

      System.out.println("Digite a nota 3");
      nota3 = scan.nextFloat();

      System.out.println("Digite a nota 4");
      nota4 = scan.nextFloat();

      float media = (nota1+nota2+nota3+nota4)/4;
      System.out.println("a media do aluno é"+media);

      if (media>=5) {
          System.out.println("aluno aprovado");

      }else{
      System.out.println("aluno reprovado");

      }
  }

}
