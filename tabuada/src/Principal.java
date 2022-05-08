public class Principal {

    public static void imprimatabuada(int numero){
        for(int contador = 1; contador <= numero; contador++){
         for(int contador2 = 1;contador2 <=10;contador2++){
           System.out.println(contador + "x"+contador2+"x"+ (contador + contador2));
           }
         System.out.println();

        }
    }



    public static void main(String[] args) {
     imprimatabuada(3);

    }
}
