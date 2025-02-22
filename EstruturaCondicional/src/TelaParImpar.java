import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class TelaParImpar extends JFrame {
    private JLabel tituloLabel;
    private JTextField numeroTextField;
    private JButton verificarButton;
    private JLabel resultadoLabel;

    public TelaParImpar() {
        setTitle("Verificar Par ou Impar");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout(FlowLayout.CENTER, 20, 20));

        // Criando componentes
        tituloLabel = new JLabel("Verificação de Par ou Ímpar");
        numeroTextField = new JTextField(10); // Criar o campo de texto vazio
        // Adicionar placeholder (texto de dica)
        numeroTextField.setForeground(Color.GRAY);
        numeroTextField.setText("Digite um número");
        verificarButton = new JButton("Verificar");
        resultadoLabel = new JLabel("Resultado:");

        // Adicionando componentes à janela
        add(tituloLabel);
        add(numeroTextField);
        add(verificarButton);
        add(resultadoLabel);


        // Adicionar listeners para controlar o comportamento do placeholder
        numeroTextField.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (numeroTextField.getText().equals("Digite um número")) {
                    numeroTextField.setText("");
                    numeroTextField.setForeground(Color.BLACK);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (numeroTextField.getText().isEmpty()) {
                    numeroTextField.setForeground(Color.GRAY);
                    numeroTextField.setText("Digite um número");
                }
            }
        });

        // Adicionando ação ao botão
        verificarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                verificarParImpar();
            }
        });

    }

    private void verificarParImpar() {
        // Pegando o número digitado pelo usuário
        int numero = Integer.parseInt(numeroTextField.getText());

        // Verificando se é par ou ímpar
        if (numero % 2 == 0) {
            resultadoLabel.setText("Resultado: PAR");
        } else {
            resultadoLabel.setText("Resultado: ÍMPAR");

            }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TelaParImpar().setVisible(true);
            }
        });
    }

}
