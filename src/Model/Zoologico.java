package Model;

public class Zoologico {
    String nome;
    Ambiente ambiente;

    Ambiente ambiente2;

    Ambiente ambiente3;

    public Zoologico(String nome, Ambiente ambiente, Ambiente ambiente2, Ambiente ambiente3){
        this.nome= nome;
        this.ambiente= ambiente;
        this.ambiente2 = ambiente2;
        this.ambiente3 = ambiente3;
    }

    public String getNome() {
        return nome;
    }

    public Ambiente getAmbiente() {
        return ambiente;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAmbiente(Ambiente ambiente) {
        this.ambiente = ambiente;
    }

    public Ambiente getAmbiente2() {
        return ambiente2;
    }

    public void setAmbiente2(Ambiente ambiente2) {
        this.ambiente2 = ambiente2;
    }

    public Ambiente getAmbiente3() {
        return ambiente3;
    }

    public void setAmbiente3(Ambiente ambiente3) {
        this.ambiente3 = ambiente3;
    }

    @Override
    public String toString() {
        return "Zoologico" +
                "Nome = '" + nome + '\'' +
                "Ambiente Terrestre = " + ambiente +
                "Ambiente Aquatico = " + ambiente2 +
                "Ambiente Aereo  = " + ambiente3;
    }
}
