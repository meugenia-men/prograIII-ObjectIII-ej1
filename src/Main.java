//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    /*Inicializar un Cilindro y debuguear analizando los constructores a los que va
    llamando para inicializar la cadena de herencia. Imprimir por pantalla, el
    radio del cilindro, la altura, el área de la base y el volumen.*/
        Circle cir1 = new Circle(10d, "amarillo");
        Cylinder cy1 = new Cylinder();
        System.out.println(cy1);
        System.out.println(cir1);

    /*Inicializar un segundo CIlindro esta vez especificando la altura y radio.
    Imprimir por pantalla el radio, la altura, el área de la base y el volumen.*/
        Cylinder cy2 = new Cylinder(10d, "azul", 20d);
        System.out.println(cy2);

        System.out.println("El volumen es " + cy2.volume());

        System.out.println(cy2.toString());
    }
}
