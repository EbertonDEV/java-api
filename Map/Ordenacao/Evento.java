package Map.Ordenacao;

public class Evento {
    //atributos

    private String nome;
    private String atracao;

    public Evento(String nome, String evento) {
        this.nome = nome;
        this.atracao = evento;
    }

    public String getNome() {
        return nome;
    }

    public String getAtracao() {
        return atracao;
    }

    @Override
    public String toString() {
        return "Evento{" +
                "nome='" + nome + '\'' +
                ", atracao='" + atracao + '\'' +
                '}';
    }
}
