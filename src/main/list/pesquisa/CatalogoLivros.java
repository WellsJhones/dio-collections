package main.list.pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    //atributo
    private List<Livro> livrosList;

    //construtor
    public CatalogoLivros() {
        this.livrosList = new ArrayList<>();
    }

    public CatalogoLivros(String autor, String titulo, int anoPublicacao) {
       livrosList.add(new Livro(titulo,autor,anoPublicacao));
    }
    public List<Livro>pesquisaPorAutor(String autor){
        List<Livro> livrosAutor = new ArrayList<>();
        for (Livro livro : livrosList) {
            if (livro.getAutor().equals(autor)){
                livrosAutor.add(livro);
            }
        }
        return livrosAutor;
    }
    public List<Livro>pesquisaPorIntervaloDeAno(int anoInicio, int anoFim){
        List<Livro> livrosAno = new ArrayList<>();
        for (Livro livro : livrosList) {
            if (livro.getAnoPublicacao() >= anoInicio && livro.getAnoPublicacao() <= anoFim){
                livrosAno.add(livro);
            }
        }
        return livrosAno;
    }
    public Livro pesquisaPorTitulo(String titulo){
        for (Livro livro : livrosList) {
            if (livro.getTitulo().equals(titulo)){
                return livro;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        CatalogoLivros catalogo = new CatalogoLivros();
        catalogo.livrosList.add(new Livro("O Pequeno Príncipe","Antoine de Saint-Exupéry",1943));
        catalogo.livrosList.add(new Livro("Dom Casmurro","Machado de Assis",1899));
        catalogo.livrosList.add(new Livro("O Senhor dos Anéis","J. R. R. Tolkien",1954));
        catalogo.livrosList.add(new Livro("O Hobbit","J. R. R. Tolkien",1937));

        System.out.println(catalogo.pesquisaPorAutor("J. R. R. Tolkien"));
        System.out.println(catalogo.pesquisaPorIntervaloDeAno(1900,1950));
    }
}
