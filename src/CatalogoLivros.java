import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private List<Livro> CatalogoLivros;

    public CatalogoLivros() {
        this.CatalogoLivros = new ArrayList<>();
    }
    public void adicionarLivro (String titulo, String autor, int anoPublicacao) {
        CatalogoLivros.add(new Livro(titulo, autor, anoPublicacao));
    }
    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> LivrosPorAutor = new ArrayList<>();
        if (!CatalogoLivros.isEmpty()) {
            for (Livro l : CatalogoLivros) {
                if (l.getAutor().equalsIgnoreCase(autor)) {
                    LivrosPorAutor.add(l);
                }
            }
        }
        return LivrosPorAutor;
    }
    public List<Livro> pesquisaPorIntervaloAnos (int anoInicial, int anoFinal) {
        List<Livro> livrosPorIntervalosDeAnos = new ArrayList<>();
        if (!CatalogoLivros.isEmpty()) {
            for (Livro l : CatalogoLivros) {
                if (l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal);
                livrosPorIntervalosDeAnos.add(l);
            }
        }
        return livrosPorIntervalosDeAnos;
    }
    public Livro pesquisarPorTitulo (String titulo) {
        Livro livroPorTitulo = null;
        if (!CatalogoLivros.isEmpty()) {
            for (Livro l : CatalogoLivros) {
                if (l.getTitulo().equalsIgnoreCase(titulo)) {
                    livroPorTitulo = l;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }
    
}
