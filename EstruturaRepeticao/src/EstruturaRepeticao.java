import java.util.*;

public class EstruturaRepeticao {
    public static void main(String[] args) {

        // For
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
        // While
        int contador = 0;
        while (contador < 5) {
            System.out.println(contador);
            contador++;
        }

        // Do-While
        int contadorDoWhile = 0;
        do {
            System.out.println(contadorDoWhile);
            contadorDoWhile++;
        } while (contadorDoWhile < 5);

        // Do-While outro exemplo
        int n, s=0;
        String resposta;
        Scanner teclado = new Scanner(System.in);
        do {
            System.out.print("Digite um número: ");
            n = teclado.nextInt();
            s += n;
            System.out.print("Deseja continuar? (S/N): ");
            resposta = teclado.next();
        } while (resposta.equals ("S"));
        System.out.println("A soma de todos os valores é " + s);


        // For-Each
        int[] numeros = {1, 2, 3, 4, 5};
        for (int numero : numeros) {
            System.out.println(numero);
        }

        // For-Each com String
        String[] nomes = {"Alice", "Bob", "Charlie"};
        for (String nome : nomes) {
            System.out.println(nome);
        }

        // For-Each com Map
        Map<String, Integer> mapa = new HashMap<>();
        mapa.put("Alice", 25);
        mapa.put("Bob", 30);
        mapa.put("Charlie", 35);
        for (Map.Entry<String, Integer> entry : mapa.entrySet()) {
            System.out.println("Nome: " + entry.getKey() + ", Idade: " + entry.getValue());
        }

        // For-Each com Set
        Set<String> set = new HashSet<>();
        set.add("Alice");
        // Adicionando mais elementos
        set.add("Bob");
        set.add("Charlie");
        set.add("Alice"); // Não será adicionado pois já existe

        // Verificando se contém um elemento
        System.out.println(set.contains("Alice")); // true

        // Imprimindo todos os elementos
        for (String nome : set) {
            System.out.println(nome);
        }

        // Utilizando continue
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) { // Ou seja, não imprimirá os números pares.
                continue;
            }
            System.out.println(i);
        }

        // Utilizando break
        for (int i = 0; i < 10; i++) {
            if (i == 5) { // Ou seja, quando chegar no número 5 o programa irá sair do loop.
                System.out.println(i);
                break; }
        }

        // Outro exemplo com continue
        int cc = 0;
        while (cc < 10) {
            cc++;
            if (cc == 5 || cc == 7) {
                continue;
            }
        System.out.println("Cambalhota: " + cc);}


    }
}

