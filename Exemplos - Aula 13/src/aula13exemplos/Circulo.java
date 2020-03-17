
package aula13exemplos;

public class Circulo implements IArea {

    protected double radius;
    protected String color;

    public Circulo() {
        radius = 1.0;
        color = "red";
    }

    public Circulo(double r) {
        radius = r;
        color = "red";
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    public double getRadius() {
        return radius;
    }

    @Override
    public String toString() {
        return "Circulo{" + "radius=" + radius + ", color=" + color + '}';
    }

    @Override
    public double Area() {
        return Math.pow(this.radius, 2) * Math.PI;        
    }
    
    
}
