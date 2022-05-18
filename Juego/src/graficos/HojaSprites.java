package graficos;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class HojaSprites {
    private final int ANCHO;
    private final int ALTO;
    private final int[] PIXELES;

    public HojaSprites(final String ruta, final int ANCHO, final int ALTO) {
        this.ANCHO = ANCHO;
        this.ALTO = ALTO;

        PIXELES = new int[ANCHO * ALTO];
        
        try {
            BufferedImage imagen = ImageIO.read(HojaSprites.class.getResource(ruta));
            imagen.getRGB(0, 0, ANCHO, ALTO, PIXELES, 0, ANCHO); 
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public int getANCHO() {
        return ANCHO;
    }

    public int[] getPIXELES(){
        return PIXELES;
    }
}
