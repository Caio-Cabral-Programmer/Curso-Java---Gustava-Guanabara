public class OperadoresLogicos  {
    public static void main(String[] args) {
        int x, y, z;
        x = 10;
        y = 20;
        z = 12;
        boolean resultado;
        resultado = (x > y) && (y < z) ? true : false; // and
        System.out.println(resultado);
        resultado = (x > y) || (y < z) ? true : false; // Ou
        System.out.println(resultado);
        resultado = !(x > y) ? true : false; // no
        System.out.println(resultado);
        resultado = (x < y) ^ (y > z) ? true : false; // Ou exclusivo
        System.out.println(resultado);
    }
}
