package classes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;


public class CalculadoraIdade extends JFrame {
    private JComboBox<Integer> anoNascimento;
    private JLabel resultadoLabel;
    private JButton calcularButton;

    public CalculadoraIdade() {
        // Configuração básica da janela
        setTitle("Calculadora de Idade");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Criando o painel principal
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(3, 1, 10, 10));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        // Criando a JComboBox com anos
        Integer[] anos = new Integer[124]; // Anos de 1900 até 2023
        for (int i = 0; i < anos.length; i++) {
            anos[i] = 1900 + i;
        }
        anoNascimento = new JComboBox<>(anos);

        // Criando o botão e o label
        calcularButton = new JButton("Calcular");
        resultadoLabel = new JLabel("Sua idade aparecerá aqui", SwingConstants.CENTER);

        // Adicionando ação ao botão
        calcularButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcularIdade();
            }
        });

        // Adicionando componentes ao painel
        mainPanel.add(anoNascimento);
        mainPanel.add(calcularButton);
        mainPanel.add(resultadoLabel);

        // Adicionando o painel à janela
        add(mainPanel);
    }

    private void calcularIdade() {
        // Obtém o ano atual
        int anoAtual = Calendar.getInstance().get(Calendar.YEAR);

        // Obtém o ano selecionado
        int anoSelecionado = (Integer) anoNascimento.getSelectedItem();

        // Calcula a idade
        int idade = anoAtual - anoSelecionado;

        // Atualiza o label com o resultado
        resultadoLabel.setText("Sua idade é: " + idade + " anos");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new CalculadoraIdade().setVisible(true);
            }
        });
    }
}