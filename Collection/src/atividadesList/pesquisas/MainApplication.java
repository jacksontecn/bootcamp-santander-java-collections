package atividadesList.pesquisas;

public class MainApplication {
    public static void main(String[] args) {

        SomaNumeros somaNumeros = new SomaNumeros();

        somaNumeros.adicionarNumero(20);
        somaNumeros.adicionarNumero(13);
        somaNumeros.adicionarNumero(63);
        somaNumeros.adicionarNumero(3);
        somaNumeros.adicionarNumero(2);
        somaNumeros.adicionarNumero(55);

        somaNumeros.exibirNumeros();

        System.out.println(somaNumeros.calcularSoma());

        System.out.println(somaNumeros.encontrarMaiorNumero());

        System.out.println(somaNumeros.encontrarMenorNumero());

    }
}
