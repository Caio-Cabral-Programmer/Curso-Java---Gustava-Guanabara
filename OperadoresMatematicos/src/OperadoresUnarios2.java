public class OperadoresUnarios2 {
    public static void main(String[] args) {
        //Pré incremento
        int numero = 10;
        int valor = 5 + ++numero;
        System.out.println(valor);
        System.out.println(numero);

        //Post incremento
        int numero2 = 10;
        int valor2 = 5 + numero2++;
        System.out.println(valor2);
        System.out.println(numero2);
    }
}
