package main.java.map.ordenacao;

import java.util.*;

public class LivrariaOnline {
    private Map<String, Livro> livrosMap;

    public LivrariaOnline() {
        this.livrosMap = new HashMap<>();
    }

    public void adicionarLivro(String link, Livro livro) {
        livrosMap.put(link, livro);
    }

    public void removerLivro(String titulo) {
        Livro livroRemovido = null;
        for (Map.Entry<String, Livro> l :
                livrosMap.entrySet()) {
            livroRemovido = l.getValue();
            break;
        }
        if (livroRemovido != null) {
            livrosMap.remove(livroRemovido);
        }
    }

    public Map<String, Livro> exibirLivro(String titulo) {
        return new TreeMap<>(livrosMap);
    }

    public Map<String, Livro> exibirLivrosOrdenadosPorAutor(String autor) {
        Set<Map.Entry<String, Livro>> setLivrosPorAutor = new TreeSet<>(new ComparatorPorAutor());
        for (Map.Entry<String, Livro> l :
             livrosMap.entrySet()) {
            if (l.getValue().getAutor().equals(autor)) {
                setLivrosPorAutor.add(l);
            }
        }
        Map<String, Livro> livrosPorAutor = new LinkedHashMap<>();
        for (Map.Entry<String, Livro> l: setLivrosPorAutor) {
            livrosPorAutor.put(l.getKey(), l.getValue());
        }
        return livrosPorAutor;
    }
    public Livro obterLivroMaisCaro() {
        Livro livroMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        for (Livro l :
                livrosMap.values()) {
            if (l.getPreco() > maiorPreco) {
                livroMaisCaro = l;
            }
        }
        return livroMaisCaro;
    }

    public Livro obterLivroMaisBarato() {
        Livro livroMaisBarato = null;
        double menorPreco = Double.MAX_VALUE;
        for (Livro l :
                livrosMap.values()) {
            if (l.getPreco() < menorPreco) {
                livroMaisBarato = l;
            }
        }
        return livroMaisBarato;
    }
    public static void main(String[] args) {
        LivrariaOnline livrariaOnline = new LivrariaOnline();
        livrariaOnline.adicionarLivro("https://amzn.to/3JjrxJl", new Livro("1984", "George Orwell",  19.60d));
        livrariaOnline.adicionarLivro("https://amzn.to/3PmYFnb", new Livro("Caixa de Pássaros - Bird Box: Não Abra os Olhos", "Josh Malerman", 19.99d ));
        livrariaOnline.adicionarLivro("https://amzn.to/43Sfzi0", new Livro("Assassinato no Expresso do Oriente", "Agatha Christie", 26.90d));
    }
}
