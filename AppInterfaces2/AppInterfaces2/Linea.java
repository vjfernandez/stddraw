
/**
 * Write a description of class Linea here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Linea
{
    
    private double x1,y1,x2,y2;
    private double ix1,iy1,ix2,iy2;
    java.awt.Color color;

    /**
     * Constructor for objects of class Linea
     */
    public Linea()
    {
        int incrVar=5;
        java.util.Random r=new java.util.Random();
        x1=r.nextInt(AppInterfaces.MAX_X);
        y1=r.nextInt(AppInterfaces.MAX_Y);
        x2=r.nextInt(AppInterfaces.MAX_X);
        y2=r.nextInt(AppInterfaces.MAX_Y);
        ix1=r.nextInt(incrVar)-(incrVar/2);
        ix2=r.nextInt(incrVar)-(incrVar/2);
        iy1=r.nextInt(incrVar)-(incrVar/2);
        iy2=r.nextInt(incrVar)-(incrVar/2);
        color=new java.awt.Color(r.nextInt(255*255*255));
    }
    
    public void dibujar()
    {
        StdDraw.setPenColor(color);
        StdDraw.line(x1,y1,x2,y2);
    }
    
    public void mover()
    {
        x1=(x1+ix1+AppInterfaces.MAX_X)%AppInterfaces.MAX_X;
        x2=(x2+ix2+AppInterfaces.MAX_X)%AppInterfaces.MAX_X;
        y1=(y1+iy1+AppInterfaces.MAX_Y)%AppInterfaces.MAX_Y;
        y2=(y2+iy2+AppInterfaces.MAX_Y)%AppInterfaces.MAX_Y;
    }

    

}
