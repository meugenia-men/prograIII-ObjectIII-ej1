import java.security.cert.Extension;

public class Cylinder extends Circle {
    private Double high = 1.0;

    public Cylinder() {
    }

    public Cylinder(Double radius, String color, Double high) {
        super(radius, color);
        this.high = high;
    }

    public Double getHigh() {
        return high;
    }

    public void setHigh(Double high) {
        this.high = high;
    }

    public Double volume() {
        return this.circleArea() * this.high;
    }

    /*Sobreescribir el método calcular area declarado en Círculo, para que nos
   permita calcular el área del cilindro.
   (2π×radius×height + 2×areaBase)*/
    @Override
    public Double circleArea() {
        return (2 * Math.PI * this.getRadius() * this.high) + (2 * Math.PI * this.getRadius() * this.getRadius());
    }

    @Override
    public String toString() {
        ///no me sale llamar al toString de la clase padre dentro del toString de la subclase
        return "Subclase de " + Circle.class.toString() +
                " altura = " + this.high +
                ".";
    }

}
