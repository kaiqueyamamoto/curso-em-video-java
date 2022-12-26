package resolucaodatela;

import java.awt.*;

public class PegarAResolucaoDaTela {
    public static void main(String[] argv) {
        Toolkit display = Toolkit.getDefaultToolkit();
        Dimension displayDimension = display.getScreenSize();
        System.out.println(displayDimension);
    }
}
