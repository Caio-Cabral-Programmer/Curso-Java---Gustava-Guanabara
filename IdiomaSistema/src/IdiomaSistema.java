import java.util.Locale;

public class IdiomaSistema {
    public static void main(String[] args) {
        // Obtém o locale padrão do sistema
        Locale localeAtual = Locale.getDefault();

        // Exibe as informações do locale
        System.out.println("Informações do Idioma do Sistema:");
        System.out.println("Idioma: " + localeAtual.getDisplayLanguage());
        System.out.println("País: " + localeAtual.getDisplayCountry());
        System.out.println("Código do Idioma: " + localeAtual.toLanguageTag());
        System.out.println("Locale Completo: " + localeAtual.getDisplayName());

        // Méto do alternativo usando propriedades do sistema
        String idiomaSistema = System.getProperty("user.language");
        String paisSistema = System.getProperty("user.country");

        System.out.println("\nUsando Propriedades do Sistema:");
        System.out.println("Idioma do Sistema: " + idiomaSistema);
        System.out.println("País do Sistema: " + paisSistema);
    }
}

