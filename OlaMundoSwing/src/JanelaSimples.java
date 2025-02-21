import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JanelaSimples extends JFrame {

    public JanelaSimples() {
        // Configurações básicas da janela
        setTitle("Minha Janela");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Centraliza a janela na tela

        // Cria um botão
        JButton botao = new JButton("Clique Aqui");

        // Adiciona ação ao botão
        botao.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Olá pessoal!");
            }
        });

        // Adiciona o botão à janela
        setLayout(new FlowLayout());
        add(botao);
    }

    public static void main(String[] args) {
        // Cria e exibe a janela
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new JanelaSimples().setVisible(true);
            }
        });
    }
}