package Figuras;

public class circulo extends figura {
private double r;


 public circulo (Double r) {
    this.r=r;
 }

public Double getR() {
    return r;
}

public void setR(Double r) {
    this.r = r;
}

public void calcularArea() {
    double pi= 3.1416;
    double area= (r*r)*pi;
    System.out.println("el area del circulo es: "+area);
}
    
}
