import javax.swing.JOptionPane;

public class ExercicioRepita {
    public static void main(String[] args) {
        int n, s = 0;
        do {
            n = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "<html> Digite um número: <br> <em> (valor 0 interrompe) </em> </html>"));
            s += n;
        } while (n != 0);
        JOptionPane.showMessageDialog(null, "<html> Resultado final <hr>" +
                "<br> A soma dos números é: " + s);

    }

}
