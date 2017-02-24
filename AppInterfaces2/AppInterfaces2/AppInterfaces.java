
/**
 * Write a description of class AppInterfaces here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AppInterfaces
{
    // instance variables - replace the example below with your own
    public static final int MAX_X=500;
    public static final int MAX_Y=400;
    private static final int MAX_LINEAS=10;
    private static final int MAX_ARCOS=10;
    
    public void run()
    {
        Linea misLineas[]=new Linea[MAX_LINEAS];
        Arco misArcos[]=new Arco[MAX_ARCOS];
        boolean quieroSalir=false;
        
        StdDraw.setCanvasSize(MAX_X,MAX_Y);
        StdDraw.setXscale(0,MAX_X);
        StdDraw.setYscale(0,MAX_Y);
        
        for(int i=0;i<misLineas.length;i++)
        {
            misLineas[i]=new Linea();
        }
        
        for(int i=0;i<misArcos.length;i++)
        {
            misArcos[i]=new Arco();
        }
        
        while (!quieroSalir)
        {
            StdDraw.clear();
            for (int i=0;i<misLineas.length;i++)
            {
                misLineas[i].dibujar();
                misLineas[i].mover();
            }
            for (int i=0;i<misLineas.length;i++)
            {
                misArcos[i].dibujar();
                misArcos[i].mover();
            }
            StdDraw.show(80);
        }
    }
    
    public static void main(String[] args)
    {
        new AppInterfaces().run();
    }


}
