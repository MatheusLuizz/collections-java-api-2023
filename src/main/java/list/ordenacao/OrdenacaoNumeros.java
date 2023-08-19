package main.java.list.ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
    private List<Integer> listNumeros;

    public OrdenacaoNumeros() {
        this.listNumeros = new ArrayList<>();
    }
    public void adicionarNumero(int numero) {
        listNumeros.add(numero);
    }

    public List<Integer> ordenarAscendente() {
        List<Integer> listaAsc = new ArrayList<>(this.listNumeros);
        if (!listNumeros.isEmpty()) {
            Collections.sort(listaAsc);
        }
        return listaAsc;
    }
    public List<Integer> ordenarDescendente() {
        List<Integer> listaDesc = new ArrayList<>(this.listNumeros);
        listaDesc.sort(Collections.reverseOrder());
        return listaDesc;
    }
    public void exibirNumeros() {
        if (!listNumeros.isEmpty()) {
            System.out.println(this.listNumeros);
        } else {
            System.out.println("A lista está vazia!");
        }
    }

    public static void main(String[] args) {
        OrdenacaoNumeros numeros = new OrdenacaoNumeros();

        numeros.adicionarNumero(2);
        numeros.adicionarNumero(5);
        numeros.adicionarNumero(4);
        numeros.adicionarNumero(1);
        numeros.adicionarNumero(99);

        System.out.println(numeros.ordenarAscendente());
        //numeros.exibirNumeros();

        System.out.println(numeros.ordenarDescendente());
        //numeros.exibirNumeros();
    }
}
