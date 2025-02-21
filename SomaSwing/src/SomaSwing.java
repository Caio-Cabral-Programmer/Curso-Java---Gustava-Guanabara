import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SomaSwing extends JFrame {
    private JTextField num1Field;
    private JTextField num2Field;
    private JLabel resultLabel;

    public SomaSwing() {
        // Configuração básica da janela
        setTitle("Calculadora de Soma");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Criando o painel principal
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(4, 2, 10, 10));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        // Criando os componentes
        JLabel num1Label = new JLabel("Primeiro número:");
        num1Field = new JTextField();

        JLabel num2Label = new JLabel("Segundo número:");
        num2Field = new JTextField();

        JButton calcButton = new JButton("Somar");
        resultLabel = new JLabel("Resultado: ");

        // Adicionando ação ao botão
        calcButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double num1 = Double.parseDouble(num1Field.getText());
                    double num2 = Double.parseDouble(num2Field.getText());
                    double result = num1 + num2;
                    resultLabel.setText("Resultado: " + result);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null,
                            "Por favor, insira números válidos!",
                            "Erro",
                            JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        // Adicionando componentes ao painel
        mainPanel.add(num1Label);
        mainPanel.add(num1Field);
        mainPanel.add(num2Label);
        mainPanel.add(num2Field);
        mainPanel.add(new JLabel()); // Espaço em branco
        mainPanel.add(calcButton);
        mainPanel.add(new JLabel()); // Espaço em branco
        mainPanel.add(resultLabel);

        // Adicionando o painel principal à janela
        add(mainPanel);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new SomaSwing().setVisible(true);
            }
        });
    }
}