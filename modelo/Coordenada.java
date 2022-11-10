package modelo;

public class Coordenada
{
    private double x;
    private double y;

    public Coordenada()
    {
    }

    public Coordenada(double sX,double sY)
    {
        this.x=sX;
        this.y=sY;
    }

    
    public double getX() 
    {
        return x;
    }

    public void setX(double x) 
    {
        this.x = x;
    }

    
    public double getY() 
    {
        return y;
    }

    public void setY(double y) 
    {
        this.y = y;
    }

    public String ImprimirCoordenada()
    {
        return "Coordenadas: ("+ x + " , " + y + ")" ;
    }

    public String Comparar(Coordenada punto2)
    {
        String resultado;

        if(this.x==punto2.getX())
        {
            if(this.y==punto2.getY())
            {  
                resultado ="\nLas coordenadas "+ x + " y " + y +"\nY las coordenadas "+ punto2.getX() + " y " + punto2.getY() +"\nSI son iguales";
            }
            else
            {
                resultado ="\nLas coordenadas "+ x + " y " + y +"\nY las coordenadas "+ punto2.getX() + " y " + punto2.getY() +"\nNO son iguales";
            }
        }
        else
        {
            resultado ="\nLas coordenadas "+ x + " y " + y +"\nY las coordenadas "+ punto2.getX() + " y " + punto2.getY() +"\nNO son iguales";
        }
        return resultado;
    }

    public String Distancia(Coordenada punto2)
    {
        double distancia;
        Double Xfinal = (punto2.getX()-this.x);
        Double Yfinal = (punto2.getY()-this.y);
        distancia = Math.sqrt(Math.pow(Xfinal, 2) + Math.pow(Yfinal, 2));
        
        return "La Distancia entre el punto: "+ x + " y " + y +"\nY el punto: "+ punto2.getX() + " y " + punto2.getY() +"\nEs: " + distancia;
    }
    



}