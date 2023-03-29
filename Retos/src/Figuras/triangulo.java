package Figuras;

public class triangulo extends figura{

    private float a, b, area=0;

    public triangulo (float a, float b) {
        this.b=b;
        this.a=a;
    }

    public float getA() {
        return a;
    }

    public void setA(float a) {
        this.a = a;
    }

    public float getB() {
        return b;
    }

    public void setB(float b) {
        this.b = b;
    }
    public void calcularArea() {
        area=(b*a)/2;
        System.out.println("el area del triangulo es: "+area);


    }
    
    
}
