package main.java.set.pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero) {
        contatoSet.add(new Contato(nome, numero));
    }

    public void exibirContatos() {
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato> contatosPorNome = new HashSet<>();
        for (Contato c :
                contatoSet) {
            if (c.getNome().startsWith(nome)) {
                contatosPorNome.add(c);
            }
        }
        return contatosPorNome;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero) {
        Contato contatoAtualizado = null;
        for (Contato c :
                contatoSet) {
            if (c.getNome().equalsIgnoreCase(nome)) {
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContatos ac = new AgendaContatos();

        ac.adicionarContato("Matheus", 123456);
        ac.adicionarContato("Matheus", 654321);
        ac.adicionarContato("Matheus Luiz", 546321);
        ac.adicionarContato("Matheus rico", 849225);
        ac.adicionarContato("Josefa", 123654);
        ac.exibirContatos();
        System.out.println(ac.pesquisarPorNome("M"));
        System.out.println("Contato atualizado: " + ac.atualizarNumeroContato("Josefa", 888888));
        System.out.println(ac.pesquisarPorNome("J"));
    }
}
