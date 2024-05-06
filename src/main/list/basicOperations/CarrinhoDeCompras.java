package main.list.basicOperations;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<item> itens;

    public CarrinhoDeCompras() {
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(String descricao, double preco, int quantidade) {
        itens.add(new item(descricao, preco, quantidade));
    }

    public void removerItem(String descricao) {
        List<item> itensParaRemover = new ArrayList<>();
        for (item i : itens) {
            if (i.getDescricao().equalsIgnoreCase(descricao)) {
                itensParaRemover.add(i);
            }
        }
        itens.removeAll(itensParaRemover);
    }

    public double obterValorTotal() {
        double total = 0;
        for (item i : itens) {
            total += i.getPreco() * i.getQuantidade();
        }
        return total;
    }

    public void obterItens() {
        System.out.println(itens);
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
        System.out.println(carrinhoDeCompras.obterValorTotal());

        carrinhoDeCompras.adicionarItem("item 1", 10.0, 2);
        carrinhoDeCompras.adicionarItem("item 2", 20.0, 1);
        carrinhoDeCompras.adicionarItem("item 1", 10.0, 2);
        carrinhoDeCompras.adicionarItem("item 2", 20.0, 1);
        carrinhoDeCompras.adicionarItem("item 3", 30.0, 1);
        carrinhoDeCompras.removerItem("item 1");
        System.out.println(carrinhoDeCompras.obterValorTotal());
        carrinhoDeCompras.obterItens();


    }

}
