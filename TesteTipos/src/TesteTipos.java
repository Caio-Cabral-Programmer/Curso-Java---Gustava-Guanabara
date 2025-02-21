public class TesteTipos {
    public static void main(String[] args) {
        // Conversão de int para String
        int idade = 30;
        String valor = Integer.toString(idade);
        System.out.println("A idade é: " + valor);
        // Conversão de String para inteiro
        String idadeStr = "30";
        int idadeInt = Integer.parseInt(idadeStr);
        System.out.println("A idade é: " + idadeInt);
        // Conversão de float para String
        float salario = 5000.0f;
        String salarioStr = Float.toString(salario);
        System.out.println("O salário é: " + salarioStr);
        // Conversão de String para float
        String salarioStr2 = "8000.0";
        float salarioFloat = Float.parseFloat(salarioStr2);
        System.out.println("O salário é: " + salarioFloat);

    }
}