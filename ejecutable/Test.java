package ejecutable;

import modelo.Coordenada;

public class Test 
{
    public static void main(String[] args) 
    {
        Coordenada c1 = new Coordenada();
        Coordenada c2 = new Coordenada(1.3 , 5.3);

        Coordenada c3 = c1;
        Coordenada c4 = c2;

        System.out.println(c1.ImprimirCoordenada());
        System.out.println(c2.ImprimirCoordenada());
        System.out.println(c3.ImprimirCoordenada());
        System.out.println(c4.ImprimirCoordenada());
        System.out.println("-------------------------");

        System.out.println(c1.Comparar(c2));
        System.out.println("-------------------------");

        System.out.println(c1.Comparar(c3));
        System.out.println("-------------------------");
        
        System.out.println(c2.Comparar(c3));
        System.out.println("-------------------------");

        System.out.println(c2.Comparar(c4));
        System.out.println("-------------------------");

        System.out.println(c1.Distancia(c2));
        System.out.println("-------------------------");

        System.out.println(c1.Distancia(c3));
        System.out.println("-------------------------");
    }
}
