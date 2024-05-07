package main.list.set.pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContato {
    Set<Contato> contatoSet;

    public AgendaContato() {
        this.contatoSet = new HashSet<>();
    }
    public void adicionarContato(String  nome, int numero) {
        contatoSet.add(new Contato(nome, numero));
    }
    public void imprimirContatos() {
        for (Contato contato : contatoSet) {
            System.out.println(contato);
        }
    }
    public Set<Contato> pesquisaPorContato(String nome) {
        Set<Contato> contatos = new HashSet<>();
        for (Contato contato : contatoSet) {
            if (contato.getNome().startsWith(nome)) {
                contatos.add(contato);
            }
        }
        return contatos;
    }
    public Contato atualizarNumero(String nome, int numero) {
        for (Contato contato : contatoSet) {
            if (contato.getNome().equals(nome)) {
                contato.setNumero(numero);
                return contato;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        AgendaContato agendaContato = new AgendaContato();
        agendaContato.adicionarContato("João", 123456789);
        agendaContato.adicionarContato("Maria", 987654321);
        agendaContato.adicionarContato("José", 456789123);
        agendaContato.adicionarContato("Ana", 0);
        agendaContato.adicionarContato("João", 112);
        agendaContato.imprimirContatos();
        System.out.println("Pesquisa por João: " + agendaContato.pesquisaPorContato("João"));
        System.out.println("Pesquisa por Maria: " + agendaContato.pesquisaPorContato("Maria"));
        System.out.println("Pesquisa por José: " + agendaContato.pesquisaPorContato("José"));
        System.out.println("Pesquisa por Ana: " + agendaContato.pesquisaPorContato("Ana"));
        System.out.println("Atualizar número de João: " + agendaContato.atualizarNumero("João", 987654321));
        System.out.println("Atualizar número de Maria: " + agendaContato.atualizarNumero("Maria", 123456789));
        System.out.println("Atualizar número de José: " + agendaContato.atualizarNumero("José", 654321987));
        System.out.println("Atualizar número de Ana: " + agendaContato.atualizarNumero("Ana", 456789123));
        agendaContato.imprimirContatos();
    }
}
