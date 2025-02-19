import java.awt.Dimension;
import java.awt.Toolkit;

public class ResolucaoTela {
    public static void main(String[] args) {
        // Obtém o objeto Toolkit padrão
        Toolkit toolkit = Toolkit.getDefaultToolkit();

        // Obtém a dimensão da tela
        Dimension dimensaoTela = toolkit.getScreenSize();

        // Obtém largura e altura
        int largura = (int) dimensaoTela.getWidth();
        int altura = (int) dimensaoTela.getHeight();

        // Exibe as informações
        System.out.println("Resolução da Tela:");
        System.out.println("Largura: " + largura + " pixels");
        System.out.println("Altura: " + altura + " pixels");
        System.out.println("Resolução total: " + largura + " x " + altura + " pixels");


    }
}