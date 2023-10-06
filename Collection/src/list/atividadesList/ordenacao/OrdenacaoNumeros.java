package atividadesList.ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenacaoNumeros{

    private List<Integer> numeros;

    public OrdenacaoNumeros() {
        this.numeros = new ArrayList<>();
    }

    public List<Integer> getNumeros() {
        return numeros;
    }

    public void adicionarNumero(int numero){
        this.numeros.add(numero);
    }

    public List<Integer> ordenarAscendente() {
        List<Integer> ordemCrescente = new ArrayList<>(numeros);
        if (!numeros.isEmpty()){
            Collections.sort(ordemCrescente);
            return ordemCrescente;
        }else {
            throw new RuntimeException("A lista está vazia");
        }

    }

    public List<Integer> ordenarDescendente() {
        List<Integer> ordemDecrescente = new ArrayList<>(numeros);
        if (!numeros.isEmpty()){
            ordemDecrescente.sort(Collections.reverseOrder());
            return ordemDecrescente;
        }else {
            throw new RuntimeException("A lista está vazia");
        }
    }

    public void exibirNumeros() {
        if (!numeros.isEmpty()) {
            System.out.println(this.numeros);
        } else {
            System.out.println("A lista está vazia!");
        }
    }
}


