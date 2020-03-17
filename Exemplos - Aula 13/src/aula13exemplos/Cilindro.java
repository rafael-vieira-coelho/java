
package aula13exemplos;

public class Cilindro extends Circulo {

    private double height;

    public Cilindro() {
        super();
        height = 1.0;
    }

    public Cilindro(double height) {
        super();
        this.height = height;
    }

    public Cilindro(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
 
    public double getVolume() {
        return super.Area() * height;
    }
    
    @Override
    public String toString() {
        return super.toString() + "Cilindro{" + "height=" + height + '}';
    }
    
    
}
