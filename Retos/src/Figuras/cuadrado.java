package Figuras;

public class cuadrado extends figura {
    private float l;
    
    

    public cuadrado (float l) {
       this.l=l;
    }

    public float getL() {
        return l;
    }

    public void setL(float l) {
        this.l = l;
    }
    public void calcularArea() {
        float area=0;
        area=(l*l);
        System.out.println("El area del cuadrado es: "+area);

    }


    
}
