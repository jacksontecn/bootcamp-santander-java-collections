    package atividadesList.pesquisas;

    import java.util.ArrayList;
    import java.util.List;

    public class SomaNumeros {

        private List<Integer> numerosList;

        public SomaNumeros() {
            this.numerosList = new ArrayList<>();
        }

        public void adicionarNumero(int numero) {
            this.numerosList.add(numero);
        }

        public int calcularSoma() {
            int numerosCalculados = 0;
            for (Integer numeros : numerosList) {
                numerosCalculados += numeros;
            }
            return numerosCalculados;
        }

        public int encontrarMaiorNumero() {
            int maiorNumero = Integer.MIN_VALUE;
            for (Integer numeros : numerosList) {
                if (numeros >= maiorNumero) {
                    maiorNumero = numeros;
                }
            }

            return maiorNumero;

        }

        public int encontrarMenorNumero() {
            int menorNumero = Integer.MAX_VALUE;
            if (!numerosList.isEmpty()) {
                for (Integer numero : numerosList) {
                    if (numero <= menorNumero) {
                        menorNumero = numero;
                    }
                }
                return menorNumero;
            } else {
                throw new RuntimeException("A lista está vazia!");
            }

        }

        public void exibirNumeros() {
            if (!numerosList.isEmpty()) {
                System.out.println(this.numerosList);
            } else {
                System.out.println("A lista está vazia!");
            }
        }

    }


