import org.daw1.*;

public class Main {

    public void run() {
        String q;
        boolean b;
        StdDraw.setXScale(0, 100); // Fija la escala de 0 a 100 en ambos ejes
        StdDraw.setYScale(0, 100);

        StdDraw.square(20, 80, 10); // Cuadrado sin relleno (x, y, tamaño)
        StdDraw.filledSquare(80, 80, 20); //Cuadrado relleno
        StdDraw.circle(80, 20, 20); // Círculo (x, y, radio)

        StdDraw.setPenColor(StdDraw.RED);
        StdDraw.setPenRadius(5); // Lapiz grosor de 5px
        StdDraw.arc(80, 20, 10, 200, 45);

        // draw a blue diamond
        StdDraw.setPenRadius(); // Lapiz grosor 1px
        StdDraw.setPenColor(StdDraw.BLUE);
        double[] x = { 10, 20, 30, 20 };
        double[] y = { 20, 30, 20, 10 };
        StdDraw.filledPolygon(x, y); // Polígono relleno

        // text
        q = StdDraw.prompt("Dime tu nombre"); // Pide una cadena en un diálogo
        StdDraw.setPenColor(StdDraw.BLACK);
        StdDraw.text(20, 50, "Nombre:" + q); // texto centrado

        b = StdDraw.question("¿Te gusta programar?"); // pide si o no y devuelve boolean
        StdDraw.setPenColor(StdDraw.WHITE);
        StdDraw.text(80, 80, "Programar:" + (b ? "si" : "no"));

        StdDraw.alert("Gracias"); // mensaje emergente
    }

    public static void main(String[] args) {
        new Main().run();
    }
}