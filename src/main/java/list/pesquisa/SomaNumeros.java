package main.java.list.pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {

    private List<Integer> listaInteiros;

    public SomaNumeros() {
        listaInteiros = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        listaInteiros.add(numero);
    }
    public int calcularSoma() {
        int soma = 0;
        for (int n:
             listaInteiros) {
            soma += n;
        }
        return soma;
    }
    public int encontrarMaiorNumero() {
        int maior = listaInteiros.get(0);
        if (!listaInteiros.isEmpty()) {
            for (int n:
                 listaInteiros) {
                if (n > maior) {
                    maior = n;
                }
            }
        }
        return maior;
    }
    public int encontrarMenorNumero() {
        int menor = listaInteiros.get(0);
        if (!listaInteiros.isEmpty()) {
            for (int n:
                    listaInteiros) {
                if (n < menor) {
                    menor = n;
                }
            }
        }
        return menor;
    }
    public List<Integer> exibirNumeros() {
        return listaInteiros;
    }

    public static void main(String[] args) {
        SomaNumeros sn = new SomaNumeros();
        sn.adicionarNumero(1);
        sn.adicionarNumero(10);
        sn.adicionarNumero(20);
        sn.adicionarNumero(30);
        sn.adicionarNumero(40);
        sn.adicionarNumero(50);
        sn.adicionarNumero(60);
        System.out.println(sn.calcularSoma());
        System.out.println(sn.encontrarMaiorNumero());
        System.out.println(sn.encontrarMenorNumero());
        System.out.println(sn.exibirNumeros());
    }
}
