package idiomadosistema;

import java.util.Locale;

public class IdiomaDoSistema {
    public static void main(String[] argv) {
        Locale lang = Locale.getDefault();
        System.out.println("O idioma do sistema é:");
        System.out.println(lang);
        System.out.println(lang.getDisplayLanguage());
        System.out.println(lang.getLanguage());
    }
}
