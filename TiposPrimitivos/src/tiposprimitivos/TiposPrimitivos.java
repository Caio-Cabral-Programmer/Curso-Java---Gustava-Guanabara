package tiposprimitivos;

import java.util.Scanner;

public class TiposPrimitivos {
    public static void main(String[] args) {
        // Com entrada de teclado.
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o nome do aluno: ");
        String nome1 = teclado.nextLine();
        System.out.print("Digite a nota do aluno: ");
        float nota1 = teclado.nextFloat();
        System.out.print("Digite a idade do aluno: ");
        int idade1 = teclado.nextInt();
        System.out.print("Digite o valor do prêmio que o aluno receberá: ");
        float premio = teclado.nextFloat();
        System.out.format("A nota de %s é: %.1f\n", nome1, nota1);
        System.out.format("A idade do aluno %s é: %d\n", nome1, idade1);
        System.out.format("O valor do prêmio é: R$ %.2f\n", premio);

        // Sem entrada de teclado
        String nome = "Flavia";
        float nota = 8.5f;
        System.out.println("A nota é: " + nota);
        System.out.printf("A nota é: %.2f\n", nota);
        System.out.printf("A nota é: %.1f\n", nota);
        System.out.printf("A nota é: %.0f\n", nota);
        System.out.printf("A nota de %s é: %.2f\n", nome, nota);
        System.out.format("A nota de %s é: %.2f\n", nome, nota);

    }
}
