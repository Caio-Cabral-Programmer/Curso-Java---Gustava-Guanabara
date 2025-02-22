import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class JogoAdivinhacao extends JFrame {
    private JSpinner numeroSpinner;
    private JLabel mensagemLabel;
    private JButton palpiteButton;

    public JogoAdivinhacao() {
        // Configuração básica da janela
        setTitle("Jogo de Adivinhação");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout(FlowLayout.CENTER, 20, 20));

        // Criando componentes
        JLabel instrucaoLabel = new JLabel("Vou pensar em um número de 1 a 5:");

        // Configurando o Spinner
        SpinnerNumberModel spinnerModel = new SpinnerNumberModel(1, 1, 5, 1);
        numeroSpinner = new JSpinner(spinnerModel);

        // Configurando o botão
        palpiteButton = new JButton("Palpite");

        // Label para mostrar o resultado
        mensagemLabel = new JLabel("");

        // Adicionando ação ao botão
        palpiteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                verificarPalpite();
            }
        });

        // Adicionando componentes à janela
        add(instrucaoLabel);
        add(numeroSpinner);
        add(palpiteButton);
        add(mensagemLabel);
    }

    private void verificarPalpite() {
        // Gerando número aleatório entre 1 e 5
        Random random = new Random();
        int numeroAleatorio = random.nextInt(5) + 1;

        // Pegando o número escolhido pelo usuário
        int palpiteUsuario = (Integer) numeroSpinner.getValue();

        // Verificando se acertou
        if (palpiteUsuario == numeroAleatorio) {
            mensagemLabel.setText("Você acertou!");
        } else {
            mensagemLabel.setText("Você errou! O número era " + numeroAleatorio);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new JogoAdivinhacao().setVisible(true);
            }
        });
    }
}