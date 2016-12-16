import org.daw1.StdDraw;

public class GA04 {

    public void run() {
        StdDraw.setXScale(0,100);
        StdDraw.setXScale(0,100);

        int anchura = 10;
        int desplazamientoInicial = 10;
        
        for (int i = 0; i < 8; i++) {
            StdDraw.line( desplazamientoInicial + (i * anchura), 100 - desplazamientoInicial,
                desplazamientoInicial + (i * anchura), desplazamientoInicial);
        }
    }
    
}
