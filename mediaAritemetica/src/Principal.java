import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.printf("digite a nota 1: ");
        float nota1=scan.nextFloat();

        System.out.printf("digite a nota 2: ");
        float nota2=scan.nextFloat();

        System.out.printf("digite a nota 3: ");
        float nota3=scan.nextFloat();

        float media=(nota1+nota2+nota3)/3;
        System.out.println(media);
    }
}
