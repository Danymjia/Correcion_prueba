package FigurasRegulares;

public class Circulo {

    //Atributos
    private double radio;

    //Contrsuctor
    public Circulo(double radio) {
        this.radio = radio;
    }

    //Getters y Setters
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    //Metodo para calcular el area del Circulo
    public double calcularArea() {
        return Math.PI * (radio * radio);
    }

    //Metodo para calcular el perimetro del Circulo
    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }

    //Metodo para mostrar los valores
    public void imprimirValores() {
        System.out.println("Radio: " + radio);
        System.out.println("Area: " + calcularArea());
        System.out.println("Perimetro: " + calcularPerimetro());
    }
}
