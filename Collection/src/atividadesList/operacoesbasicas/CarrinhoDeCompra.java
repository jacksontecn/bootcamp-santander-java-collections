package atividadesList.operacoesbasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompra {

    private List<Item> itemList;

    public CarrinhoDeCompra() {
        this.itemList = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        this.itemList.add(new Item(nome,preco,quantidade));
    }
    public void removerItem(String nome){
        List<Item> itemParaRemover = new ArrayList<>();
        for (Item item : itemList){
            if (item.getNome().equalsIgnoreCase(nome)){
                itemParaRemover.add(item);
            }
        }
        itemList.removeAll(itemParaRemover);
    }

    public double calcularValorTotal(){
        double valorCalculado = 0.00;
        for (Item item : itemList){
            valorCalculado += (item.getPreço()* item.getQuantidade());
        }

        return valorCalculado;
    }

    public List<Item> exibirItens(){
        return this.itemList;
    }

}
