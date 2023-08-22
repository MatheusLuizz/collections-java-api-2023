package main.java.map.operacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    private Map<String, String> palavrasMap;

    public Dicionario() {
        this.palavrasMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, String definicao) {
        palavrasMap.put(palavra, definicao);
    }

    public void removerPalavra(String palavra) {
        palavrasMap.remove(palavra);
    }

    public void exibirPalavras() {
        System.out.println(palavrasMap);
    }

    public String pesquisarPorPalavra(String palavra) {
        if (!palavrasMap.isEmpty()) {
            return palavrasMap.get(palavra);
        }
        return null;
    }

    public static void main(String[] args) {
        Dicionario dicionario = new Dicionario();

        // Adicionar palavras
        dicionario.adicionarPalavra("maçã", "Fruta comestível de polpa suculenta e sabor doce.");
        dicionario.adicionarPalavra("casa", "Lugar onde alguém mora.");

        // Exibir todas as palavras
        dicionario.exibirPalavras();

        // Pesquisar uma palavra
        String definicaoMaca = dicionario.pesquisarPorPalavra("maçã");
        System.out.println("Definição da palavra 'maçã': " + definicaoMaca);
        String definicaoUva = dicionario.pesquisarPorPalavra("uva");
        System.out.println("Definição da palavra 'uva': " + definicaoUva);

        // Remover uma palavra
        dicionario.removerPalavra("casa");
        System.out.println("Após remover a palavra 'casa':");
        dicionario.exibirPalavras();
    }
}
