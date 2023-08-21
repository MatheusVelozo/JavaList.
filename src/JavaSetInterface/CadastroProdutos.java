package JavaSetInterface;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    Set<Produtos> produtoSet;

    public CadastroProdutos () {
        this.produtoSet = new HashSet<>();
    }
    public void adicionarProduto (String nome, long codigo, double preco, int quantidade) {
        produtoSet.add(new Produtos(nome, codigo, preco, quantidade));
    }
    public Set<Produtos> exibiProdutosPorNome () {
        Set<Produtos> produtosPorNome = new TreeSet<>(produtoSet);
        return produtosPorNome;
    }
    public Set<Produtos> exibirPorPreco () {
        Set<Produtos> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtosPorPreco.addAll(produtoSet);
        return produtosPorPreco;
    }
}
