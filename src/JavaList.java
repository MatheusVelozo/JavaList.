public class JavaList {

    public static void main(String[] args) {
       CarrinhoDeCompras CarrinhoDeCompras = new CarrinhoDeCompras ();
       
       CarrinhoDeCompras.adicionarItens("Lápis", 2d, 3);
       CarrinhoDeCompras.adicionarItens("Lápis", 2d, 3);
       CarrinhoDeCompras.adicionarItens("Caderno", 35d, 1);
       CarrinhoDeCompras.adicionarItens("Borracha", 2d, 2);
       
       CarrinhoDeCompras.exibirItens();
       
       CarrinhoDeCompras.removerItens("Caderno");
       CarrinhoDeCompras.exibirItens();
       
        System.out.println("O Valor total da compra é = " + CarrinhoDeCompras.calcularValorTotal(0, 0));
       

       ListaTarefa listaTarefa = new ListaTarefa();
       System.out.println("Elementos na Lista: " + listaTarefa.obterNumeroTotalTarefas());
       listaTarefa.adicionarTarefa("Tarefa 01");
       System.out.println("Elementos na Lista: " + listaTarefa.obterNumeroTotalTarefas());
    }
    
}
