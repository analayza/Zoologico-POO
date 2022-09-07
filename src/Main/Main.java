package Main;

import Model.*;

public class Main {
    public static void main(String[] args) {

        Ambiente Aquatico = new Ambiente(1);
        Ambiente Terrestre = new Ambiente(1);
        Ambiente Aerio = new Ambiente(1);

        Baleia Baleiaazul = new Baleia(
                true,
                true,
                "Baleia Azul",
                "Mamifero",
                "Carnivoro",
                40,
                90,
                true,
                false,
                false,
                false,
                0
        );

        Macaco MicoleAOdourado = new Macaco(
               true,
                true,
                "Miquinho",
                "Leontopithecus rosalia",
                "Onivoro",
                5,
                22,
                true,
                false,
                true,
                false,
                4
        );

        Papagaio Periquitoverde = new Papagaio(
                true,
                true,
                "Palestrinha",
                "Amazona aestiva",
                "herbivoro",
                10,
                15,
                true,
                false,
                false,
                false,
                2
        );

        Aquatico.setListaDeAnimais(0,Baleiaazul);
        Terrestre.setListaDeAnimais(0, MicoleAOdourado);
        Aerio.setListaDeAnimais(0,Periquitoverde);

        Zoologico zoologico = new Zoologico(
                " ZOOLOGICO ZOO",
                Terrestre,
                Aquatico,
                Aerio
        );
        System.out.println("======================");
        System.out.println(zoologico.getNome());
        System.out.println("=====================\n");
        System.out.println("======================");
        System.out.println("AMBIENTE TERRESTRE: ");
        System.out.println("======================\n");
        System.out.println(zoologico.getAmbiente());
        System.out.println("======================");
        System.out.println("AMBIENTE AQUATICO: ");
        System.out.println("======================\n");
        System.out.println(zoologico.getAmbiente2());
        System.out.println("======================");
        System.out.println("AMBIENTE AEREO: ");
        System.out.println("======================\n");
        System.out.println(zoologico.getAmbiente3());
    }

}
