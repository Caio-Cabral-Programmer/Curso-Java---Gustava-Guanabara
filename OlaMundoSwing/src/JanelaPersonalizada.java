import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JanelaPersonalizada extends JFrame {

    private JButton botao;
    private JLabel titulo;
    private int contadorCliques = 0;

    public JanelaPersonalizada() {
        // Configurações da janela
        setTitle("Minha Janela Personalizada");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Mudando a cor de fundo da janela
        getContentPane().setBackground(new Color(230, 230, 250)); // Cor lavanda clara

        // Usando um layout mais sofisticado
        setLayout(new BorderLayout(10, 10)); // 10 pixels de espaçamento

        // Adicionando um painel para o título
        JPanel painelTitulo = new JPanel();
        painelTitulo.setBackground(new Color(147, 112, 219)); // Cor púrpura médio
        titulo = new JLabel("Bem-vindo!");
        titulo.setFont(new Font("Arial", Font.BOLD, 24));
        titulo.setForeground(Color.WHITE);
        painelTitulo.add(titulo);

        // Adicionando um painel para o botão
        JPanel painelBotao = new JPanel();
        painelBotao.setBackground(new Color(230, 230, 250)); // Mesma cor do fundo

        // Criando e personalizando o botão
        botao = new JButton("Clique Aqui!");
        botao.setFont(new Font("Arial", Font.BOLD, 16));
        botao.setBackground(new Color(147, 112, 219));
        botao.setForeground(Color.WHITE);
        botao.setFocusPainted(false);
        botao.setBorder(BorderFactory.createRaisedBevelBorder());

        // Adicionando efeitos de hover ao botão
        botao.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                botao.setBackground(new Color(123, 104, 238)); // Cor mais clara ao passar o mouse
            }

            public void mouseExited(MouseEvent e) {
                botao.setBackground(new Color(147, 112, 219)); // Cor original
            }
        });

        // Adicionando ação ao botão
        botao.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                contadorCliques++;
                String mensagem = String.format("Olá pessoal!\nVocê já clicou %d vez%s!",
                        contadorCliques, contadorCliques == 1 ? "" : "es");

                // Criando um JOptionPane personalizado
                UIManager.put("OptionPane.background", new Color(230, 230, 250));
                UIManager.put("Panel.background", new Color(230, 230, 250));

                JOptionPane.showMessageDialog(
                        null,
                        mensagem,
                        "Mensagem Especial",
                        JOptionPane.INFORMATION_MESSAGE
                );
            }
        });

        // Adicionando componentes aos painéis
        painelBotao.add(botao);

        // Adicionando painéis à janela
        add(painelTitulo, BorderLayout.NORTH);
        add(painelBotao, BorderLayout.CENTER);

        // Adicionando uma borda à janela
        ((JPanel)getContentPane()).setBorder(
                BorderFactory.createEmptyBorder(10, 10, 10, 10)
        );
    }

    public static void main(String[] args) {
        // Definindo o look and feel do sistema
        try {
            UIManager.setLookAndFeel(
                    UIManager.getSystemLookAndFeelClassName()
            );
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Iniciando a aplicação
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new JanelaPersonalizada().setVisible(true);
            }
        });
    }
}