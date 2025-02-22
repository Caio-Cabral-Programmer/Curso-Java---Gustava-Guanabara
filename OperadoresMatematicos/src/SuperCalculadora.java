import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SuperCalculadora extends JFrame {
    private JSpinner numeroSpinner;
    private JLabel resultadoLabel;
    private JLabel imagemCalculadora;

    public SuperCalculadora() {
        // Configuração básica da janela
        setTitle("Super Calculadora");
        setSize(400, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout(10, 10));
        setLocationRelativeTo(null);

        // Painel principal com padding
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        // Configuração do Spinner
        SpinnerNumberModel spinnerModel = new SpinnerNumberModel(1, -1000, 1000, 1);
        numeroSpinner = new JSpinner(spinnerModel);
        numeroSpinner.setMaximumSize(new Dimension(150, 30));
        numeroSpinner.setAlignmentX(Component.CENTER_ALIGNMENT);

        // Configuração do botão com ícone
        JButton calcularButton = new JButton("Calcular");
        calcularButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        try {
            ImageIcon iconOperadores = new ImageIcon(getClass().getResource("calculadora_1.png"));
            Image img = iconOperadores.getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH);
            calcularButton.setIcon(new ImageIcon(img));
        } catch (Exception e) {
            System.out.println("Erro ao carregar ícone de operadores");
        }

        // Configuração da imagem da calculadora
        try {
            ImageIcon iconCalculadora = new ImageIcon(getClass().getResource("calculadora_2.png"));
            Image img = iconCalculadora.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
            imagemCalculadora = new JLabel(new ImageIcon(img));
            imagemCalculadora.setAlignmentX(Component.CENTER_ALIGNMENT);
        } catch (Exception e) {
            imagemCalculadora = new JLabel("Imagem da Calculadora");
            System.out.println("Erro ao carregar imagem da calculadora");
        }

        // Área de resultados
        resultadoLabel = new JLabel("<html><center>Os resultados aparecerão aqui</center></html>");
        resultadoLabel.setAlignmentX(Component.CENTER_ALIGNMENT);

        // Adicionar componentes ao painel principal
        mainPanel.add(Box.createVerticalStrut(20));
        mainPanel.add(imagemCalculadora);
        mainPanel.add(Box.createVerticalStrut(20));
        mainPanel.add(numeroSpinner);
        mainPanel.add(Box.createVerticalStrut(20));
        mainPanel.add(calcularButton);
        mainPanel.add(Box.createVerticalStrut(20));
        mainPanel.add(resultadoLabel);

        // Adicionar o painel principal à janela
        add(mainPanel);

        // Configurar ação do botão
        calcularButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcular();
            }
        });
    }

    private void calcular() {
        int numero = (Integer) numeroSpinner.getValue();

        // Realizar cálculos
        int resto = numero % 2;
        double cubo = Math.pow(numero, 3);
        double raizQuadrada = Math.sqrt(Math.abs(numero));
        double raizCubica = Math.cbrt(numero);
        int valorAbsoluto = Math.abs(numero);

        // Formatar e exibir resultados
        String resultado = String.format("<html><center>" +
                        "Resto da divisão por 2: %d<br>" +
                        "Elevado ao cubo: %.0f<br>" +
                        "Raiz quadrada: %.2f<br>" +
                        "Raiz cúbica: %.2f<br>" +
                        "Valor absoluto: %d</center></html>",
                resto, cubo, raizQuadrada, raizCubica, valorAbsoluto);

        resultadoLabel.setText(resultado);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new SuperCalculadora().setVisible(true);
            }
        });
    }
}