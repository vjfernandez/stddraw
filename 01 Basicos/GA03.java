import org.daw1.StdDraw;

public class GA03 {

    public void run() {
        // definir que voy a utilizar un sistema de coordenadas entre 0 y 100
        StdDraw.setXScale(0, 100); 
        StdDraw.setYScale(0, 100);
        StdDraw.show();

        int desplazamiento = 10;
        int longitud = 50;

        //cuento hasta 6
        for (int k = 0; k < 6; k++) {
            StdDraw.line(k*desplazamiento, 100-(k*desplazamiento), //inicio linea
                k*desplazamiento+longitud, 100-(k*desplazamiento)
            ); //fin linea. La y no cambia
        }

        //cuento hasta 6 otra vez
        for (int k = 0; k < 6; k++) {
            StdDraw.line(k*desplazamiento, 100, //inicio linea
                k*desplazamiento, 100 - longitud - 5
            ); //fin linea. La x no cambia
        }
    }

    public static void main(String[] args) {
        new GA03().run();
    }
}