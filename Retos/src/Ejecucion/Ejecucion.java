package Ejecucion;
import java.util.Scanner;

import Salud.Empleado;
import Salud.Persona;

public class Ejecucion {
    public static void main(String[]args) {
        /*int peso;
        int estatura;
        int imc; */
        String nombre, apellido, cargo, departamento, tipoDoc, sexo;
        int valorHora, hTrabajadas,  documento, honorarios=0; 
        Scanner captura=new Scanner(System.in);


        /* Persona persona=new Persona();
        persona.mostrarPersona();
        persona.imc(); 
        
        System.out.println("Digite el peso");
        peso= captura.nextInt();
        System.out.println("Digite la estatura");
        estatura= captura.nextInt();
        
        persona.calcularImc(peso, estatura);
        //System.out.println("Resultados"+imc);
        

        persona.mayorEdad();*/
        System.out.println("Digite el tipo de documento");
        tipoDoc= captura.nextLine();
        System.out.println("Digite el apellido");
        apellido= captura.nextLine();
        System.out.println("Digite el sexo");
        sexo= captura.nextLine();
        System.out.println("Digite el nombre");
        nombre= captura.nextLine();
        System.out.println("Digite el departamento");
        departamento= captura.nextLine();
        System.out.println("Digite el cargo");
        cargo= captura.nextLine();
        System.out.println("Digite el documento");
        documento= captura.nextInt();
        System.out.println("Digite las horas trabajadas");
        hTrabajadas= captura.nextInt();
        System.out.println("Digite el valor por hora");
        valorHora= captura.nextInt();
        captura.close();

        Empleado imp = new Empleado (tipoDoc, documento, nombre, apellido, cargo, hTrabajadas, valorHora, departamento, honorarios, sexo);

        imp.mostrarPersona();
        imp.calcularHonorarios();

    

        

    }

    
}
