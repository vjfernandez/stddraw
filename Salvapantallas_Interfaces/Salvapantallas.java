import org.daw1.*;

public class Salvapantallas {
    public static final int MAX_X=800;
    public static final int MAX_Y=600;

    
    public void run() {
        Punto misFiguras[] = new Punto[10];

        boolean quieroSalir=false;
        
        StdDraw.setCanvasSize(MAX_X,MAX_Y);
        StdDraw.setXScale(0,MAX_X);
        StdDraw.setYScale(0,MAX_Y);
        
        for(int i = 0; i < misFiguras.length; i++) {
            misFiguras[i]=new Punto();
        }

        // Bucle de eventos
        while (!quieroSalir) {
            StdDraw.clear();
            for (int i = 0; i < misFiguras.length; i++) {
                misFiguras[i].dibujar();
                misFiguras[i].mover();
            }
            StdDraw.show(40);
        }
    }
    
    public static void main(String[] args) {
        new Salvapantallas().run();
    }


}
