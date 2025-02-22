import java.util.Scanner;

public class ProgramaMedia {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite a sua primeira nota: ");
        float n1 = teclado.nextFloat();
        System.out.print("Digite a sua segunda nota: ");
        float n2 = teclado.nextFloat();
        float m = (n1 + n2) / 2;
        System.out.println("A média é: " + m);
        if (m >= 7) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }
        teclado.close();
    }


}
