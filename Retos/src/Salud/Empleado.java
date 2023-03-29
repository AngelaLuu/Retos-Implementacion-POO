package Salud;

public class Empleado extends Persona {

    private String cargo, departamento; 
    private int valorHora=0, hTrabajadas=0, honorarios=0;
    //private double RETEICA= 0,00966;
    
    public Empleado(String _tipodoc, int _documento, String _nombre, String _apellido, String _cargo, int _hTrabajadas, int _valorHora, String _departamento, int _honorarios, String _sexo) {
       super(_tipodoc, _documento, _nombre, _apellido, _honorarios, _sexo);
        
        honorarios=_honorarios;
        cargo=_cargo;
        hTrabajadas=_hTrabajadas;
        valorHora=_valorHora;
        departamento=_departamento;

    }
    public void mostrarPersona(){
        System.out.println("tu tipo de documento es: "+getTipoDoc()+"tu documento es: "+getDocumento()+"tu nombres es: "+getNombre()+"tu apellido es: "+getApellido()+
        "tu cargo es: "+cargo+"tu departamento es"+departamento+"tu sexo es: "+getSexo()+"Digita las horas trabajadas: "+hTrabajadas+ "digita el valor por hora"+valorHora);
    }
    public void calcularHonorarios() {
        honorarios= hTrabajadas*valorHora;
        System.out.println("Sus honorarios son: "+honorarios);


    }
    

    
}
