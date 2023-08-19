package main.java.list.operacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> listaItem = new ArrayList<>();

    public CarrinhoDeCompras() {
        this.listaItem = new ArrayList<>();
    }
    public void adicionarItem(String nome, double preco, int quantidade) {
        listaItem.add(new Item(nome, preco, quantidade));
    }
    public void removerItem(String nome) {
        List<Item> itensParaRemover = new ArrayList<>();
        for (Item i:listaItem) {
            if (i.getNome().equalsIgnoreCase(nome)) {
                itensParaRemover.add(i);
            }
        }
        listaItem.removeAll(itensParaRemover);
    }
    public double calcularValorTotal() {
        double valorTotal = 0;
        for (Item i : listaItem) {
            valorTotal = valorTotal + i.getPreco() * i.getQuantidade();
        }
        return valorTotal;
    }
    public void exibirItens() {
        System.out.println(listaItem);
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
        System.out.println("O valor total é: " + carrinhoDeCompras.calcularValorTotal());
        carrinhoDeCompras.adicionarItem("Sofá", 1500.99, 2);
        carrinhoDeCompras.adicionarItem("Televisão", 999.99, 1);
        carrinhoDeCompras.exibirItens();
        System.out.println("O valor total é: " + carrinhoDeCompras.calcularValorTotal());
        carrinhoDeCompras.removerItem("sofá");
        carrinhoDeCompras.exibirItens();
        System.out.println("O valor total é: " + carrinhoDeCompras.calcularValorTotal());

    }
}