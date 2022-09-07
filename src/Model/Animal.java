package Model;

public class Animal {

   public Animal(
            String nome,
            String especie,
            String tipoDeAlimentacao,
            int idade,
            float tempoDeVidaEstimado,
            boolean temRabo,
            boolean temChifre,
            boolean temPelos,
            boolean temEscamas,
            int quantidadeDePatas

    ){
        this.nome= nome;
        this.especie = especie;
        this.tipoDeAlimentacao = tipoDeAlimentacao;
        this.idade = idade;
        this.tempoDeVidaEstimado= tempoDeVidaEstimado;
        this.temRabo= temRabo;
        this.temChifre= temChifre;
        this.temPelos= temPelos;
        this.temEscamas= temEscamas;
        this.quantidadeDePatas= quantidadeDePatas;

    }
    String nome;

    String especie;

    String tipoDeAlimentacao;

    int idade;
    float   tempoDeVidaEstimado=0;
    boolean temRabo=false;
    boolean temChifre=false;
    boolean temPelos= false;
    boolean temEscamas= false;
    int quantidadeDePatas= 0;


    //GET


    public float getTempoDeVidaEstimado() {
        return tempoDeVidaEstimado;
    }

    public int getQuantidadeDePatas() {
        return quantidadeDePatas;
    }

    public String getNome() {
        return nome;
    }

    public String getEspecie() {
        return especie;
    }

    public String getTipoDeAlimentacao() {
        return tipoDeAlimentacao;
    }

    public int getIdade() {
        return idade;
    }

    public boolean isTemRabo() {
        return temRabo;
    }

    public boolean isTemChifre() {
        return temChifre;
    }

    public boolean isTemPelos() {
        return temPelos;
    }

    public boolean isTemEscamas() {
        return temEscamas;
    }

    //SET


    public void setTempoDeVidaEstimado(float tempoDeVidaEstimado) {
        tempoDeVidaEstimado = tempoDeVidaEstimado;
    }

    public void setTemRabo(boolean temRabo) {
        temRabo = temRabo;
    }

    public void setTemChifre(boolean temChifre) {
        temChifre = temChifre;
    }

    public void setTemPelos(boolean temPelos) {
        temPelos = temPelos;
    }

    public void setTemEscamas(boolean temEscamas) {
        temEscamas = temEscamas;
    }

    public void setQuantidadeDePatas(int quantidadeDePatas) {
        quantidadeDePatas = quantidadeDePatas;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public void setTipoDeAlimentacao(String tipoDeAlimentacao) {
        this.tipoDeAlimentacao = tipoDeAlimentacao;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "\nEstimativa de vida = " + tempoDeVidaEstimado + "\nTem Rabo = " + temRabo +
                "\nTem Chifre = "+ temChifre +"\nTem Pelos = "+ temPelos + "\nTem Escama = " + temEscamas +
                "\nQuantidade De Patas = " + quantidadeDePatas + "\nNome = " + nome +
                "\nEspecie = " + especie + "\nTipo De Alimentacao = " + tipoDeAlimentacao +
                "\nIdade Do Animal = " + idade;
    }
}
