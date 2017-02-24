import org.daw1.StdDraw;
import java.awt.Color;
import java.util.Random;

public class Punto {
    // Coordenadas
    private int x;
    private int y;
    
    // Vector de dirección
    private int deltaX;
    private int deltaY;
    Color color;

    public Punto(){
        int incrVar=5;
        Random random = new java.util.Random();
        x = random.nextInt(Salvapantallas.MAX_X);
        y = random.nextInt(Salvapantallas.MAX_Y);
        // La resta es para que el vector pueda tener 
        // negativos, que serían la dirección hacia la izquierda
        // y hacia abajo.
        deltaX=random.nextInt(incrVar)-(incrVar/2);
        deltaY=random.nextInt(incrVar)-(incrVar/2);
        color = Color.RED;
    }
    
    public void dibujar() {
        StdDraw.setPenColor(color);
        StdDraw.setPenRadius(1);
        StdDraw.filledCircle(x, y, 2);
    }
    
    public void mover() {
        x = x + deltaX;
        y = y + deltaY;
    }

    

}
