import java.util.Scanner;

public class Animal {
    public float altura;
    public float peso;

    public void alimentar(){
        System.out.println("o animal esta se alimentando");
        Scanner scanner = new Scanner(System.in);
        Animal animal;
        System.out.println("Escolha o animal que deseja instanciar");
        System.out.println("[1] golfinho");
        System.out.println("[2] leão");
        int escolha = scanner.nextInt();

        if (escolha == 1){
        animal = new Golfinho();
        }else{
        animal = new Leao();
        }
    }
}