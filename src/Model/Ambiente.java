package Model;


import java.util.Arrays;

public class Ambiente {
    Animal[] listaDeAnimais;

    public Ambiente(int totalDeAnimaisSuportados){
        listaDeAnimais = new Animal[totalDeAnimaisSuportados];
    }

    public void getListaDeAnimais() {
        for(int i = 0; i< this.listaDeAnimais.length; i++){
            System.out.println(listaDeAnimais[i]);
        }
    }

    public void setListaDeAnimais(int posicao, Animal Animal) {
        this.listaDeAnimais[posicao] = Animal;
    }

    @Override
    public String toString() {
       this.getListaDeAnimais();
       return "";
    }
}
