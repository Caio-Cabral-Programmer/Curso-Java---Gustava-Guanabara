public class ComparacaoString {
    public static void main(String[] args) {
        String nome1 = "Gustavo";
        String nome2 = "Gustavo";
        String nome3 = new String("Gustavo");
        String resultado;
        resultado = (nome1==nome2) ? "Nome1 e Nome2 são iguais" : "Nome1 e Nome2 são diferentes";
        System.out.println(resultado);
        resultado = (nome1==nome3) ? "Nome1 e Nome3 são iguais" : "Nome1 e Nome3 são diferentes";
        System.out.println(resultado);
        resultado = (nome1.equals(nome3)) ? "Nome1 e Nome3 são iguais" : "Nome1 e Nome3 são diferentes";
        System.out.println(resultado);
    }
}
