import org.daw1.StdDraw;

public class GA02 {

    public void run() {
        // definir que voy a utilizar un sistema de coordenadas entre 0 y 100
        StdDraw.setXScale(0, 100); 
        StdDraw.setYScale(0, 100);

        // voy a poner en constantes la longitud de un segmento y el desplazamiento
        // Prueba a cambiarlos
        final int desplazamiento = 10;
        final int longitud = 50;
        
        //cuento hasta 6
        for (int k = 0; k < 6; k++) {
            StdDraw.line(k*desplazamiento, 100-(k*desplazamiento), //inicio linea
                k*desplazamiento+longitud, 100-(k*desplazamiento)
            ); //fin linea. La y no cambia
        }
    }
    
    public static void main(String[] args) {
        new GA02().run();
    }
}