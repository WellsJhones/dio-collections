package main.list.map.ordenacao;

public class Evento {
    //atributo
    private String nome;
    private String atracao;

    //construtor
    public Evento(String nome, String atracao) {
        this.nome = nome;
        this.atracao = atracao;
    }

    //getters
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
