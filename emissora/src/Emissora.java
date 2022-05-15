public class Emissora {

    Programa[] listaDeProgramas = new Programa[3];

    void encontraProgramaMaisPopular() {
        Programa programaTemporario = listaDeProgramas[0];

        for (int contador = 1; contador < 3; contador++) {
        if (listaDeProgramas[contador].pontoDeAudiencia>programaTemporario.pontoDeAudiencia){
           programaTemporario=listaDeProgramas[contador];
        }
    }

        System.out.println("O programa de maior audiência é o :" + programaTemporario.nome);

    }
}
