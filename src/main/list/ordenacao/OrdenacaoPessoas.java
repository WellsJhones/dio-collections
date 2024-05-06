package main.list.ordenacao;

import java.util.ArrayList;
import java.util.List;

public class OrdenacaoPessoas {
    private List<Pessoa> pessoaList;

    public OrdenacaoPessoas() {
        this.pessoaList = new ArrayList<>();
    }
    public void adicionarPessoa(String nome, int idade, double altura) {
        pessoaList.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade() {
        List<Pessoa>pessoasPorIdade = new ArrayList<>(pessoaList);
        pessoaList.sort(Pessoa::compareTo);
        return pessoaList;
    }

    public List<Pessoa> ordenarPorAltura() {
        List<Pessoa>pessoasPorAltura = new ArrayList<>(pessoaList);
        pessoaList.sort(new ComparatorPorAltura());
        return pessoaList;
    }

    public static void main(String[] args) {
        OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas();
        ordenacaoPessoas.adicionarPessoa("João", 20, 1.80);
        ordenacaoPessoas.adicionarPessoa("Maria", 25, 1.70);
        ordenacaoPessoas.adicionarPessoa("José", 30, 1.90);
        ordenacaoPessoas.adicionarPessoa("Ana", 35, 1.60);
        ordenacaoPessoas.adicionarPessoa("Carlos", 40, 1.75);

        System.out.println("Ordenado por idade: ");
        ordenacaoPessoas.ordenarPorIdade().forEach(System.out::println);

        System.out.println("Ordenado por altura: ");
        ordenacaoPessoas.ordenarPorAltura().forEach(System.out::println);
    }

}
