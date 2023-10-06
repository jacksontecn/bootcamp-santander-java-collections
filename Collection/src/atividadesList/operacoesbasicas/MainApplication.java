package atividadesList.operacoesbasicas;

public class MainApplication {
    public static void main(String[] args) {
        CarrinhoDeCompra carrinhoDeCompra = new CarrinhoDeCompra();
        carrinhoDeCompra.adicionarItem("Melancia",5.00,2);
        carrinhoDeCompra.adicionarItem("Banana",3.00,4);
        carrinhoDeCompra.adicionarItem("Maçã",2.50,2);
        carrinhoDeCompra.adicionarItem("Laranja",1.50,10);
        carrinhoDeCompra.adicionarItem("Uva",7.00,1);

        System.out.println(carrinhoDeCompra.exibirItens());
        System.out.println("Valor total do carrinho é: R$ " +carrinhoDeCompra.calcularValorTotal());
        carrinhoDeCompra.removerItem("Banana");

        System.out.println(carrinhoDeCompra.exibirItens());
        System.out.println("Valor total do carrinho é: R$ " +carrinhoDeCompra.calcularValorTotal());
        carrinhoDeCompra.adicionarItem("Banana",3.00,4);
        carrinhoDeCompra.removerItem("laranja");

        System.out.println(carrinhoDeCompra.exibirItens());
        System.out.println("Valor total do carrinho é: R$ " +carrinhoDeCompra.calcularValorTotal());

    }
}
