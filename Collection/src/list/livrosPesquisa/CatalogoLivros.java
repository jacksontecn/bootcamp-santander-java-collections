package list.livrosPesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {

    private List<Livro> livros;

    public CatalogoLivros() {
        this.livros = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        livros.add(new Livro(titulo,autor,anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor){
        List<Livro> livroPorAutor = new ArrayList<>();
        if (!livros.isEmpty()){
            for (Livro livro: livros) {
                if (livro.getAutor().equals(autor)) {
                    livroPorAutor.add(livro);
                }
            }
        }
        return livroPorAutor;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
        List<Livro> livroPorAno = new ArrayList<>();
        if (!livros.isEmpty()){
            for (Livro livro: livros){
                if (livro.getAnoPublicacao() >= anoInicial && livro.getAnoPublicacao() <= anoFinal){
                    livroPorAno.add(livro);
                }
            }
        }
        return livroPorAno;
    }

    public Livro pesquisarPorTitulo(String titulo){
        Livro livroPorTitulo = null;
        if (!livros.isEmpty()){
            for (Livro livro : livros){
                if (livro.getTitulo().equalsIgnoreCase(titulo)){
                    livroPorTitulo = livro;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }

}
