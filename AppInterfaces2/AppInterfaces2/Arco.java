
public class Arco
{
    private double x1,y1,a1,a2,radio;
    private double ix1,iy1,ia1,ia2;
    java.awt.Color color;

    /**
     * Constructor for objects of class Linea
     */
    public Arco()
    {
        int incrVar=5;
        java.util.Random r=new java.util.Random();
        x1=r.nextInt(AppInterfaces.MAX_X);
        y1=r.nextInt(AppInterfaces.MAX_Y);
        a1=0;
        a2=0;
        radio=30+r.nextInt(incrVar)-(incrVar/2);
        ix1=r.nextInt(incrVar)-(incrVar/2);
        iy1=r.nextInt(incrVar)-(incrVar/2);
        ia1=r.nextInt(incrVar);
        ia2=r.nextInt(incrVar);
        color=new java.awt.Color(r.nextInt(255*255*255));
    }
    
    public void dibujar()
    {
        StdDraw.setPenColor(color);
        StdDraw.arc(x1,y1,radio,a1,a2);
    }
    
    public void mover()
    {
        //x1=(x1+ix1+AppInterfaces.MAX_X)%AppInterfaces.MAX_X;
        //x2=(x2+ix2+AppInterfaces.MAX_X)%AppInterfaces.MAX_X;
        a1=(a1+ia1+360)%360;
        a2=(a2+ia2+360)%360;
    }

    
}
