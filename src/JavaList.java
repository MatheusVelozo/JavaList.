public class JavaList {

    public static void main(String[] args) {
      /*TESTES CARRINHO DE COMPRAS.
      CarrinhoDeCompras CarrinhoDeCompras = new CarrinhoDeCompras (); 
      CarrinhoDeCompras.adicionarItens("Lápis", 2d, 3);
      CarrinhoDeCompras.adicionarItens("Lápis", 2d, 3);
      CarrinhoDeCompras.adicionarItens("Caderno", 35d, 1);
      CarrinhoDeCompras.adicionarItens("Borracha", 2d, 2);
      CarrinhoDeCompras.exibirItens(); 
      CarrinhoDeCompras.removerItens("Caderno");
      CarrinhoDeCompras.exibirItens();  
      System.out.println("O Valor total da compra é = " + CarrinhoDeCompras.calcularValorTotal(0, 0)); 
      ------------------------------------------------------------------------------------------------
      TESTES LISTA DE TAREFAS.
       ListaTarefa listaTarefa = new ListaTarefa();
       System.out.println("Elementos na Lista: " + listaTarefa.obterNumeroTotalTarefas());
       listaTarefa.adicionarTarefa("Tarefa 01");
       System.out.println("Elementos na Lista: " + listaTarefa.obterNumeroTotalTarefas());
      -------------------------------------------------------------------------------------------------
      TESTES CATALOGOS DE LIVROS.
      CatalogoLivros catalogoLivros = new CatalogoLivros();
      catalogoLivros.adicionarLivro("Livro 1", "Joao", 2020);
      catalogoLivros.adicionarLivro("Livro 1", "jose", 2022);
      catalogoLivros.adicionarLivro("Livro 2", "Judas", 2023);
      catalogoLivros.adicionarLivro("Livro 3", "Jaco", 2024);
      catalogoLivros.adicionarLivro("Livro 4", "Joabe", 2025);
      System.out.println(catalogoLivros.pesquisarPorAutor("Joabe"));
      System.out.println(catalogoLivros.pesquisaPorIntervaloAnos(2020, 2023));
      System.out.println(catalogoLivros.pesquisarPorTitulo("Livro 1"));
      ------------------------------------------------------------------------------------------------
      TESTES ORDENAÇÃO DE PESSOAS.*/
      OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();
      ordenacaoPessoa.adicionarPessoa("nome 1", 20, 1.98);
      ordenacaoPessoa.adicionarPessoa("nome 2", 30, 1.80);
      ordenacaoPessoa.adicionarPessoa("nome 3", 40, 1.56);
      ordenacaoPessoa.adicionarPessoa("nome 4", 25, 1.70);
      System.out.println(ordenacaoPessoa.pessoaList);
      System.out.println(ordenacaoPessoa.ordenarPorIdade());
      System.out.println(ordenacaoPessoa.ordenarPorAltura());
    }
    
}
