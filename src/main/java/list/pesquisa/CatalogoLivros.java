package main.java.list.pesquisa;

import java.util.List;
import java.util.ArrayList;
public class CatalogoLivros {
    private List<Livro> livrosList;

    public CatalogoLivros() {
        this.livrosList = new ArrayList<>();
    }
    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        livrosList.add(new Livro(titulo, autor, anoPublicacao));

    }
    public List<Livro> pesquisarPorAutor (String autor) {
        List<Livro> livrosPorAutor = new ArrayList<>();
        if (!livrosList.isEmpty()) {
            for (Livro l: livrosList) {
                if (l.getAutor().equalsIgnoreCase(autor)) {
                    livrosPorAutor.add(l);
                }
            }
        }
        return livrosPorAutor;
    }
    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
        List<Livro> livrosPorIntervaloAno = new ArrayList<>();
        if (!livrosList.isEmpty()) {
            for (Livro l:
                 livrosList) {
                if (l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal) {
                    livrosPorIntervaloAno.add(l);
                }
            }
        }
        return livrosPorIntervaloAno;
    }
    public Livro pesquisarPorTitulo(String titulo) {
        Livro livrosPorTitulo = null;
        if (!livrosList.isEmpty()) {
            for (Livro l:
                 livrosList) {
                if (l.getTitulo().equalsIgnoreCase(titulo)) {
                    livrosPorTitulo = l;
                    break;
                }
            }
        }
        return livrosPorTitulo;
    }

    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();
        catalogoLivros.adicionarLivro("Livro 1", "Autor 1", 2020);
        catalogoLivros.adicionarLivro("Livro 1", "Autor 2", 2021);
        catalogoLivros.adicionarLivro("Livro 2", "Autor 2", 2022);
        catalogoLivros.adicionarLivro("Livro 3", "Autor 3", 2023);
        catalogoLivros.adicionarLivro("Livro 4", "Autor 4", 1994);
        System.out.println(catalogoLivros.pesquisarPorAutor("Autor 1"));

        System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2022, 1994));

        System.out.println(catalogoLivros.pesquisarPorTitulo("Livro 3"));

    }
}
