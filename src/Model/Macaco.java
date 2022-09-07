package Model;

public class Macaco extends Animal{

    public Macaco(
            boolean sobeEmArvores,
            boolean gostaDeBanana,
            String nome,
            String especie,
            String tipoDeAlimentacao,
            int idade,
            float tempoDeVidaEstimado,
            boolean temRabo,
            boolean temChifre,
            boolean temPelos,
            boolean temEscamas,
            int quantidadeDePatas)

    {
        super(nome, especie, tipoDeAlimentacao,
                idade, tempoDeVidaEstimado, temRabo,
                temChifre, temPelos, temEscamas, quantidadeDePatas);

        this.sobeEmArvores= sobeEmArvores;
        this.gostaDeBanana= gostaDeBanana;

    }
    boolean sobeEmArvores= false;
    boolean gostaDeBanana= false;

    public boolean isSobeEmArvores() {
        return sobeEmArvores;
    }

    public boolean isGostaDeBanana() {
        return gostaDeBanana;
    }

    public void setSobeEmArvores(boolean sobeEmArvores) {
        this.sobeEmArvores = sobeEmArvores;
    }

    public void setGostaDeBanana(boolean gostaDeBanana) {
        this.gostaDeBanana = gostaDeBanana;
    }

    Macaco(String nome, String especie, String tipoDeAlimentacao, int idade, float tempoDeVidaEstimado, boolean temRabo, boolean temChifre, boolean temPelos, boolean temEscamas, int quantidadeDePatas) {
        super(nome, especie, tipoDeAlimentacao, idade, tempoDeVidaEstimado, temRabo, temChifre, temPelos, temEscamas, quantidadeDePatas);
    }

    @Override
    public float getTempoDeVidaEstimado() {
        return super.getTempoDeVidaEstimado();
    }

    @Override
    public int getQuantidadeDePatas() {
        return super.getQuantidadeDePatas();
    }

    @Override
    public String getNome() {
        return super.getNome();
    }

    @Override
    public String getEspecie() {
        return super.getEspecie();
    }

    @Override
    public String getTipoDeAlimentacao() {
        return super.getTipoDeAlimentacao();
    }

    @Override
    public int getIdade() {
        return super.getIdade();
    }

    @Override
    public boolean isTemRabo() {
        return super.isTemRabo();
    }

    @Override
    public boolean isTemChifre() {
        return super.isTemChifre();
    }

    @Override
    public boolean isTemPelos() {
        return super.isTemPelos();
    }

    @Override
    public boolean isTemEscamas() {
        return super.isTemEscamas();
    }

    @Override
    public void setTempoDeVidaEstimado(float tempoDeVidaEstimado) {
        super.setTempoDeVidaEstimado(tempoDeVidaEstimado);
    }

    @Override
    public void setTemRabo(boolean temRabo) {
        super.setTemRabo(temRabo);
    }

    @Override
    public void setTemChifre(boolean temChifre) {
        super.setTemChifre(temChifre);
    }

    @Override
    public void setTemPelos(boolean temPelos) {
        super.setTemPelos(temPelos);
    }

    @Override
    public void setTemEscamas(boolean temEscamas) {
        super.setTemEscamas(temEscamas);
    }

    @Override
    public void setQuantidadeDePatas(int quantidadeDePatas) {
        super.setQuantidadeDePatas(quantidadeDePatas);
    }

    @Override
    public void setNome(String nome) {
        super.setNome(nome);
    }

    @Override
    public void setEspecie(String especie) {
        super.setEspecie(especie);
    }

    @Override
    public void setTipoDeAlimentacao(String tipoDeAlimentacao) {
        super.setTipoDeAlimentacao(tipoDeAlimentacao);
    }

    @Override
    public void setIdade(int idade) {
        super.setIdade(idade);
    }

    @Override
    public String toString() {
        return "Macaco" +
                "\nSobe Em Arvores = " + sobeEmArvores +
                "\nGosta De Banana = " + gostaDeBanana +
                super.toString();
    }
}
