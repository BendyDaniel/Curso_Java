import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        Caixa<Integer> caixa = new Caixa<>();
        caixa.setDado(1);
        caixa.imprimeDado();

        int[] arrayNumero = new int[3];
        arrayNumero[0] = 6;
        arrayNumero[1] = 12;
        arrayNumero[2] = 18;

        List<Object> listaNumeros = new ArrayList<>();
        listaNumeros.add(6);
        listaNumeros.add(12);
        listaNumeros.add(18);

        for (int indice = 0; indice < listaNumeros.size(); indice++) {
            System.out.println(listaNumeros.get(indice));
        }

        listaNumeros.remove(1);

        for (int indice = 0; indice < listaNumeros.size(); indice++) {
            System.out.println(listaNumeros.get(indice));

        }
        listaNumeros.remove(1);

        for (int indice = 0; indice < listaNumeros.size(); indice++) {
            System.out.println(listaNumeros.get(indice));

        }
    }
}
