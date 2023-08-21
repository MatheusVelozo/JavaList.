package JavaSetInterface;



public class Java {
    public static void main(String[] args) {
        
        /*------TESTES-------------
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
        conjuntoConvidados.adicionarConvidado("Convidado 1", 123);
        conjuntoConvidados.adicionarConvidado("Convidado 2", 321);
        conjuntoConvidados.adicionarConvidado("Convidado 3", 231);
        conjuntoConvidados.adicionarConvidado("Convidado 4", 123);

        conjuntoConvidados.exibirConvidados();
        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidados na lista.");

        conjuntoConvidados.removerConvidadoPorCodigoConvite(123);
        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidados na lista.");
        
        AgendaContatos agendaContatos = new AgendaContatos();
        agendaContatos.exibirContato();

        agendaContatos.adicionarContato("Matheus", 123456);
        agendaContatos.adicionarContato("Matheus", 1456);
        agendaContatos.adicionarContato("Mathe", 1236);
        agendaContatos.adicionarContato("theus", 3456);
        agendaContatos.adicionarContato("Matus", 1234);
        agendaContatos.exibirContato();

        System.out.println(agendaContatos.pesquisarPorNome("Matheus"));
        System.out.println("Contato atualizado: " + agendaContatos.atualizarNumeroContato("theus", 456975));
        agendaContatos.exibirContato();*/

        CadastroProdutos cadastroProdutos = new CadastroProdutos();
        System.out.println(cadastroProdutos.produtoSet);

        cadastroProdutos.adicionarProduto("p1", 45l, 22.5d, 5);
        cadastroProdutos.adicionarProduto("p2", 50l, 13.5d, 10);
        cadastroProdutos.adicionarProduto("p3", 45l, 20.5d, 15);
        cadastroProdutos.adicionarProduto("p4", 60l, 15d, 20);
        cadastroProdutos.adicionarProduto("p5", 65l, 16.5d, 25);
        System.out.println(cadastroProdutos.produtoSet);
        System.out.println(cadastroProdutos.exibiProdutosPorNome());
        System.out.println(cadastroProdutos.exibirPorPreco());
    }

}
