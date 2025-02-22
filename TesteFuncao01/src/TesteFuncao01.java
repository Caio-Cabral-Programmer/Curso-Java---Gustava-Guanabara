public class TesteFuncao01 {

    static void soma (int a, int b) {
        int s = a + b;
        System.out.println("A soma é: " + s);
    }

    static int adicao (int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {

        System.out.println("Começou o programa");
        soma(5, 2);

        System.out.println("------------------------------------------------------");
        System.out.println("Exemplo 2");
        System.out.println("------------------------------------------------------");
        int sm = adicao(5, 2);
        System.out.println("A soma é: " + sm);

    }

}