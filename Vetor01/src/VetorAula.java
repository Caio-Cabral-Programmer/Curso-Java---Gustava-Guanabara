import java.util.Arrays;

public class VetorAula {
    public static void main(String[] args) {
        System.out.println("Exemplo 1");
        System.out.println("==============================================");
        int[] numeros = {1, 2, 3, 4, 5};
        int soma = 0;
        for (int i = 0; i < numeros.length; i++) {
            soma += numeros[i];
        }
        System.out.println("A soma dos números é: " + soma);
        System.out.println("---------------------------------------------");
        System.out.println("---------------------------------------------");

        // Outra forma
        System.out.println("Exemplo 2");
        System.out.println("==============================================");
        int n [] = {3,2,1,4,5};
        System.out.println("Total de casas de n é: " + n.length);

        for (int count = 0; count < n.length; count++) {
            System.out.println(n[count]);
            System.out.println("Na posição " + count + " está o número " + n[count]);
        }
        System.out.println("---------------------------------------------");
        System.out.println("---------------------------------------------");

        System.out.println("Exemplo 3");
        System.out.println("==============================================");

        String mes [] = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
        int totalDias [] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        System.out.println("Total de dias em cada mês é: ");
        for (int i = 0; i < mes.length; i++) {
            System.out.println(mes[i] + " tem " + totalDias[i] + " dias.");
        }
        System.out.println("---------------------------------------------");
        System.out.println("---------------------------------------------");

        System.out.println("Exemplo 4");
        System.out.println("==============================================");

        // For-Each
        double num [] = {3.5, 2.8, 1.4, 4.5, 5.6};
        for (double valor : num) {
            System.out.println(valor);
        }
        System.out.println("---------------------------------------------");
        System.out.println("---------------------------------------------");

        System.out.println("Exemplo 5");
        System.out.println("==============================================");

        // For-Each com String
        String[] nomes = {"Alice", "Bob", "Charlie", "David", "Eve"};
        for (String nome : nomes) {
            System.out.println(nome);
        }
        System.out.println("---------------------------------------------");
        System.out.println("---------------------------------------------");

        System.out.println("Exemplo 6");
        System.out.println("==============================================");

        // For-Each com int
        int[] numbers = {1, 2, 3, 4, 5};
        for (int numero : numbers) {
            System.out.println(numero);
        }
        System.out.println("---------------------------------------------");
        System.out.println("---------------------------------------------");

        System.out.println("Exemplo 7");
        System.out.println("==============================================");

        // For-Each com char
        char[] letras = {'A', 'B', 'C', 'D', 'E'};
        for (char letra : letras) {
            System.out.println(letra);
        }
        System.out.println("---------------------------------------------");
        System.out.println("---------------------------------------------");

        System.out.println("Exemplo 8");
        System.out.println("==============================================");

        // For-Each com boolean
        boolean[] verdadeiros = {true, false, true, false, true};
        for (boolean verdadeiro : verdadeiros) {
            System.out.println(verdadeiro);
        }

        System.out.println("---------------------------------------------");
        System.out.println("---------------------------------------------");

        System.out.println("Exemplo 9");
        System.out.println("==============================================");

        // For-Each com ordenação de array
        double number [] = {3.5, 2.8, 1.4, 4.5, 5.6};
        int posicao = Arrays.binarySearch(number, 5.6);
        System.out.println("A posição do número 5.6 antes da ordenação Arrays.sort é: " + posicao);
        Arrays.sort(number);
        for (double valor : number) {
            System.out.println(valor);

        }

        System.out.println("---------------------------------------------");
        System.out.println("---------------------------------------------");

        System.out.println("Exemplo 10");
        System.out.println("==============================================");

        int v [] = new int[20];
        Arrays.fill(v, 0);
        System.out.println("Array v preenchido com zeros: ");
        for (int valor : v) {
            System.out.print(valor + " ");
        }





    }
}
