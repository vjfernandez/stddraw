import org.daw1.StdDraw;

public class GA01 {

    public void run() {
        // definir que voy a utilizar un sistema de coordenadas entre 0 y 100
        StdDraw.setXScale(0, 100); 
        StdDraw.setYScale(0, 100);
        
        // a dibujar... las coordenadas las voy a sacar "a ojo".
        
        // El cuadradao
        StdDraw.setPenColor(StdDraw.RED);
        StdDraw.square(25, 75, 20);//Centro en (25,75) radio 20 -longitud de lado 20*2
        
        // El círculo
        // ---la parte interna en naranja
        StdDraw.setPenColor(StdDraw.ORANGE);
        StdDraw.filledCircle(75, 75, 20);
        // ---la linea externa en azul
        StdDraw.setPenColor(StdDraw.BLUE);
        StdDraw.circle(75, 75, 20); //el mismo circulo, pero sin relleno
        
        // El texto
        StdDraw.setPenColor(StdDraw.BLACK);
        StdDraw.text(50, 52, "Programacion");
        StdDraw.text(50, 48, "1ºDAW");
        
        // las líneas
        StdDraw.line(30,45, 70,5);
        // --Cambio el grosor del lápiz
        StdDraw.setPenRadius(5);
        StdDraw.line(30,5, 70,45);
        
    }
    
    public static void main(String[] args)
    {
        new GA01().run();
    }
}