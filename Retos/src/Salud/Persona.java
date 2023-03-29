package Salud;

import java.util.Scanner;


public class Persona {
    public String tipoDoc;
    public String nombre;
    public String apellido;
    public String sexo;
    public int documento;
    //public int peso;
    //public int estatura;
    public int edad;
    public float pesoActual;

    public Persona(String tipodoc, int documento, String nombre, String apellido, int edad, String sexo) {

    }
    public Persona() {

    }

    public void pedirDatos() {
        Scanner captura=new Scanner(System.in);

        System.out.println("Digite el tipo de documento");
        tipoDoc= captura.nextLine();
        System.out.println("Digite el apellido");
        apellido= captura.nextLine();
        System.out.println("Digite el nombre");
        nombre= captura.nextLine();
        System.out.println("Digite el sexo");
        sexo= captura.nextLine();
        System.out.println("Digite el documento");
        documento= captura.nextInt();
        //System.out.println("Digite el peso");
        //peso= captura.nextInt();
        //System.out.println("Digite la estatura");
        //estatura= captura.nextInt();
        System.out.println("Digite la edad");
        edad= captura.nextInt();
        captura.close();
    }
    public void mostrarPersona() {
        System.out.println("El tipo de documento es:"+tipoDoc);
        System.out.println("El  apellido es:"+apellido);
        System.out.println("El  nombre es:"+nombre);
        System.out.println("El  sexo es:"+sexo);
        System.out.println("El  documento es:"+documento);
        //System.out.println("El  peso es:"+peso);
        //System.out.println("El  estatura es:"+estatura);
        System.out.println("El  edad es:"+edad);
    }
    public void calcularImc (float peso, float estatura) {
        pesoActual= peso/(estatura*estatura);
        if (pesoActual>25) {
            System.out.println("Tiene sobre peso"+pesoActual);
           } else if (pesoActual>=20) {
             System.out.println("Peso ideal"+pesoActual);
            } else {
              System.out.println("Peso por debajo de lo ideal"+pesoActual);
            }
        
    }
    public void imc(){
        if (pesoActual>25) {
            System.out.println("Tiene sobre peso"+pesoActual);
           } else if (pesoActual>=20) {
             System.out.println("Peso ideal"+pesoActual);
            } else {
              System.out.println("Peso por debajo de lo ideal"+pesoActual);
            }
    }
    public void mayorEdad() {
        if (edad>18) {
            System.out.println("Es mayo de edad");
            
        } else {
            System.out.println("es menor de edad");

        }
        
    } 
    public String getTipoDoc() {
        return tipoDoc;
    }
    public void setTipoDoc(String tipoDoc) {
        this.tipoDoc = tipoDoc;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public int getDocumento() {
        return documento;
    }
    public void setDocumento(int documento) {
        this.documento = documento;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public float getPesoActual() {
        return pesoActual;
    }
    public void setPesoActual(float pesoActual) {
        this.pesoActual = pesoActual;
    }
    
    
    





    
}

