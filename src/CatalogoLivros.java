import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private List<Livro> CatalogoLivros;

    public CatalogoLivros() {
        this.CatalogoLivros = new ArrayList<>();
    }
    public void adicionarLivro (String titulo, String autor, int anoPublicacao) {
        Livro livro = new Livro(titulo, autor, anoPublicacao);
        this.CatalogoLivros.add(livro);
    }
    public void pesquisarPorAutor(String autor) {
        List<Livro> PesquisaAutor = new ArrayList<>();
        if (!CatalogoLivros.isEmpty()) {
            for (Livro l : CatalogoLivros) {
                if (l.getAutor().equalsIgnoreCase(autor)) {
                    PesquisaAutor.add(l);
                }
            }
        }
    }
    public void exibirLivros () {
        if (!CatalogoLivros.isEmpty()) {
            System.out.println(this.CatalogoLivros);
        } else {
            System.out.println("Nenhum livro!");
        }
    }
}
