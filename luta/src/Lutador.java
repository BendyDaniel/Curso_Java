public class Lutador {
    String nome;
    float peso;
    int idade;

    public Lutador() {
    }

    public Lutador(String nome, float peso, int idade) {
        this.nome = nome;
        this.peso = peso;
        this.idade = idade;
    }

    public void setIdade(int idade) {
        if (idade >= 8) {
            this.idade = idade;
        } else {
            System.out.println("entrada inválida");
        }
    }

    public int getIdade(){
        return  this.idade;
    }