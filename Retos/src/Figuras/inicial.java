package Figuras;

import java.util.Scanner;

public class inicial {
    public static void main(String[] args) {
        
    
    float b, l, a;
    double r;
    int respuesta=1, figura;

    Scanner captura=new Scanner(System.in);

    while (respuesta==1) {
        System.out.println("Elige la figura a la que le quieras sacar el area. \n1. para circulo \n2. para triangulo \n3. para rectangulo ");
        figura=captura.nextInt();

        switch (figura) {
            case 1:
            System.out.println("Ingresa el radio del circulo");
            r=captura.nextInt();
            circulo fi1 = new circulo(r);
            fi1.calcularArea();
            System.out.println("ingresa 2 si quieres terminar el juego, 1 si quieres continuar con otra figura");
            respuesta=captura.nextInt();
            break;
            
            case 2:
            System.out.println("Ingresa la altura del triangulo: ");
            a=captura.nextInt();
            System.out.println("Ingresa la base del triangulo: ");
            b=captura.nextInt();

            triangulo fi2 = new triangulo(b, a);
            fi2.calcularArea();
            System.out.println("ingresa 2 si quieres terminar el juego, 1 si quieres continuar con otra figura");
            respuesta=captura.nextInt();
            break;

            case 3:
            System.out.println("Ingresa la altura del rectangulo: ");
            a=captura.nextInt();
            System.out.println("Ingresa la base del rectangulo: ");
            b=captura.nextInt();
            System.out.println("ingresa 2 si quieres terminar el juego, 1 si quieres continuar con otra figura");
            respuesta=captura.nextInt();

            rectangulo fi3 = new rectangulo(b, a);
            fi3.calcularArea();
            break;
            default:
            System.out.println("Figura no encontrada");
            break;

        }
        
        
    }


}
}
