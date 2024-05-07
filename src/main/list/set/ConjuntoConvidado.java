package main.list.set;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidado {
    //atributo
    private Set<Convidado> convidadoSet;

    public ConjuntoConvidado() {
        this.convidadoSet = new HashSet<>();
    }
    public void adicionarConvidado(String nome, int codigoConvite) {
        convidadoSet.add(new Convidado(nome, codigoConvite));
    }
    public void removerConvidado(int codigoConvite) {
        convidadoSet.removeIf(convidado -> convidado.getCodigoConvite() == codigoConvite);
    }
    public void listarConvidados() {
        convidadoSet.forEach(System.out::println);
    }
    public void contarConvidados() {
        System.out.println("Total de convidados: " + convidadoSet.size());
    }

    public static void main(String[] args) {
        ConjuntoConvidado conjuntoConvidado = new ConjuntoConvidado();
        conjuntoConvidado.adicionarConvidado("João", 1);
        conjuntoConvidado.adicionarConvidado("Maria", 2);
        conjuntoConvidado.adicionarConvidado("José", 3);
        conjuntoConvidado.adicionarConvidado("Ana", 4);
        conjuntoConvidado.adicionarConvidado("Carlos", 5);
        conjuntoConvidado.adicionarConvidado("mariazinha", 2);

        conjuntoConvidado.listarConvidados();
        conjuntoConvidado.contarConvidados();

        conjuntoConvidado.removerConvidado(3);
        conjuntoConvidado.listarConvidados();
        conjuntoConvidado.contarConvidados();
    }
}
