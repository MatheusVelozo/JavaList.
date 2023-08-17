import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Itens> CarrinhoDeCompras;
    
    public CarrinhoDeCompras () {
        this.CarrinhoDeCompras = new ArrayList <>();
    }
    
    public void adicionarItens(String nome, double preco, int quantidade) {
        Itens itens = new Itens(nome, preco, quantidade);
        this.CarrinhoDeCompras.add(itens);
    }
    public void removerItens(String nome) {
        List<Itens> ItensParaRemover = new ArrayList <>();
        if (!CarrinhoDeCompras.isEmpty()) {
            for (Itens i : CarrinhoDeCompras) {
                if (i.getNome().equalsIgnoreCase(nome)) {
                    ItensParaRemover.add(i);
                }
            }
            CarrinhoDeCompras.removeAll(ItensParaRemover);
        } else {
            System.out.println("A lista está vazia!");
        }  
    }
    public double calcularValorTotal (double preco, int quantidade) {
        double valorTotal = 0d;
        if (!CarrinhoDeCompras.isEmpty()) {
            for (Itens itens : CarrinhoDeCompras) {
                double valorItem = itens.getPreco() * itens.getQuantidade();
                valorTotal += valorItem;
            }
            return valorTotal;
        } else {
            throw new RuntimeException("A lista está vazia!");
         }    
        }
    public void exibirItens () {
        if(!CarrinhoDeCompras.isEmpty()) {
            System.out.println(this.CarrinhoDeCompras);
        } else {
            System.out.println("A Lista está vazia!");
        }
    }
    @Override
    public String toString () {
        return "CarrinhoDeCompras{" + "Itens= " + CarrinhoDeCompras + '}';
    }
    }

