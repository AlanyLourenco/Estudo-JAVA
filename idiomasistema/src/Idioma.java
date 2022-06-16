package idiomasistema.src;

import java.util.Locale;
import java.awt.Toolkit;
import java.awt.Dimension;


public class Idioma {
     
    public static void main(String[] args) {
        Locale loc = Locale.getDefault();
        System.out.println (loc.getDisplayLanguage());
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension d = tk.getScreenSize();
        System.out.println("A resolução do seu sistema é: " + d.width +" X " + d.height);
    }
}
