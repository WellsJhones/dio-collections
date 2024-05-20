package main.list.map;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    //atributos
    private Map<Long, Produto> estoqueProdutosMap;

    //construtor
    public EstoqueProdutos() {
        estoqueProdutosMap = new HashMap<>();
    }

    //método
    public void adicionarProduto(Long id, String nome, Double preco, int quantidade) {
        estoqueProdutosMap.put(id, new Produto(nome, preco, quantidade));

    }
    public void exibirProduto (){
        System.out.println(estoqueProdutosMap);
    }
    public double calcularValorTotal(){
        double valorTotal = 0;
        if(!estoqueProdutosMap.isEmpty()){
            for (Produto p: estoqueProdutosMap.values()) {
                valorTotal += p.getPreco() * p.getQuantidade();
                ;
            }
        }
        return valorTotal;
    }
    //obter produto com maior valor
    public Produto obterProdutosComMaiorValor(){
        Produto maisCaro = null;

        if(!estoqueProdutosMap.isEmpty()) {
            for (Produto p: estoqueProdutosMap.values()) {
                if(maisCaro == null || p.getPreco() > maisCaro.getPreco()){
                    maisCaro = p;
                }
            }
        }
        return maisCaro;

    }

    public static void main(String[] args) {

        EstoqueProdutos estoqueProdutos = new EstoqueProdutos();
        estoqueProdutos.exibirProduto();

        estoqueProdutos.adicionarProduto(1L, "Coca-cola", 5.99, 10);
        estoqueProdutos.exibirProduto();
//        estoqueProdutos.adicionarProduto(2L, "Coca-cola", 5.99, 10);
        estoqueProdutos.adicionarProduto(3L, "Coca-cola", 7.99, 10);
//        estoqueProdutos.exibirProduto();
        System.out.println(estoqueProdutos.calcularValorTotal());
        System.out.println(estoqueProdutos.obterProdutosComMaiorValor());
    }
}


