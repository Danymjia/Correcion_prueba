package FigurasRegulares;

public class Rectangulo {

    //Atributos
    private Double largoR;
    private Double anchoR;

    //Constructor
    public Rectangulo(Double largoR, Double anchoR) {
        this.largoR = largoR;
        this.anchoR = anchoR;
    }

    //Getters y Setters
    public Double getLargoR() {
        return largoR;
    }

    public void setLargoR(Double largoR) {
        this.largoR = largoR;
    }

    public Double getAnchoR() {
        return anchoR;
    }

    public void setAnchoR(Double anchoR) {
        this.anchoR = anchoR;
    }

    //Metodo para calcular el area del Rectangulo
    public double calcularArea() {
        return anchoR * largoR;
    }

    //Metodo para calcular el perimetro del Rectangulo
    public double calcularPerimetro() {
        return 2 * (anchoR * largoR);
    }

    //Metodo para mostrar los valores
    public void imprimirValores() {
        System.out.println("Largo: " + largoR);
        System.out.println("Ancho: " + anchoR);
        System.out.println("Area: " + calcularArea());
        System.out.println("Perimetro: " + calcularPerimetro());
    }
}
