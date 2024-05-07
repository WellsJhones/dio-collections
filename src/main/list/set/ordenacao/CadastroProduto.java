package main.list.set.ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProduto {
    //attributes
    Set<Produto> produtoSet;

    public CadastroProduto() {
        this.produtoSet = new HashSet<>();
    }

    public void adicionarProduto(String nome, double preco, int quantidade, long codigo) {
        Produto produto = new Produto(codigo, nome, preco, quantidade);
        produtoSet.add(produto);
    }

    public void removerProduto(long codigo) {
        Produto produto = new Produto(codigo, null, 0, 0);
        produtoSet.remove(produto);
    }

    public Set<Produto> exibirProdutoPorNome() {
        Set<Produto> produtoSetOrdenado = new TreeSet<>(produtoSet);
        return produtoSetOrdenado;

    }
    public Set<Produto> exibirProdutoPorPreco() {
        Set<Produto> produtoSetOrdenado = new TreeSet<>(new Produto.ComparatorPorPreco());
        produtoSetOrdenado.addAll(produtoSet);
        return produtoSetOrdenado;
    }

    public static void main(String[] args) {
        CadastroProduto cadastroProduto = new CadastroProduto();
        cadastroProduto.adicionarProduto("Produto 1", 10.0, 10, 1);
        cadastroProduto.adicionarProduto("Produto 2", 20.0, 20, 2);
        cadastroProduto.adicionarProduto("Produto 3", 30.0, 30, 3);
        cadastroProduto.adicionarProduto("Produto 4", 40.0, 40, 4);
        cadastroProduto.adicionarProduto("Produto 5", 50.0, 50, 5);


        Set<Produto> produtoSet = cadastroProduto.exibirProdutoPorNome();
        for (Produto produto : produtoSet) {
            System.out.println(produto);
        }

        System.out.println("====================================");

        produtoSet = cadastroProduto.exibirProdutoPorPreco();
        for (Produto produto : produtoSet) {
            System.out.println(produto);
        }

        System.out.println(produtoSet);
    }


}