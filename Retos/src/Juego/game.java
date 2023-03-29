package Juego;

import java.util.Random;
import java.util.Scanner;

public class game implements juego {

    private String nombre;
    private int OpcionUsu, OpcionCompu;

    Scanner captura = new Scanner(System.in);

    public void iniciar() {
      System.out.println("ingrese el nombre del jugador");
      nombre=captura.next();

    }

    
    public void jugar() {
       System.out.println(nombre+" realice su eleccion \n 1. si elije piedra \n 2. si elije papel \n 3. si elije tijera");
       OpcionUsu=captura.nextInt();
       Random aleatorio= new Random();
       OpcionCompu=aleatorio.nextInt(3)+1;
       System.out.println("piedra, pepel o tijera");
    }

    
    public void finalizar() {
        System.out.println("Indique su jugada \n1.Piedra \n2.Papel \n3.Tijera");
        OpcionUsu = captura.nextInt();
 
        System.out.print("La computadora habia escogido: ");
        switch ( OpcionCompu )
        {
            case 1:
                System.out.println("Piedra");
                switch ( OpcionUsu )
                {
                   case 1: System.out.println("Empatan"); 
                   break;
                   case 2: System.out.println("Ganadoor"); 
                   break;
                   case 3: System.out.println("La compu es ganador");
                    break;
                }
                break;
 
            case 2:
                System.out.println("Papel");
                switch ( OpcionUsu )
                {
                   case 1: System.out.println("La compu es ganador"); 
                   break;
                   case 2: System.out.println("Empatan"); 
                   break;
                   case 3: System.out.println("Ganadoor"); 
                   break;
                }
                break;
 
            case 3:
                System.out.println("Tijera");
                switch ( OpcionUsu )
                {
                   case 1: System.out.println("Ganadoor"); 
                   break;
                   case 2: System.out.println("La compu es ganador"); 
                   break;
                   case 3: System.out.println("Empatan"); 
                   break;
                }
                break;
        }
    }
}

