package FigurasRegulares;

public class Triangulo {

    //Atributos
    private Double baseT;
    private Double alturaT;
    private Double lado1;
    private Double lado2;
    private Double lado3;

    //Constructor
    public Triangulo(Double baseT, Double alturaT, Double lado1, Double lado2, Double lado3) {
        this.baseT = baseT;
        this.alturaT = alturaT;
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    //Getters y Setters

    public Double getBaseT() {
        return baseT;
    }

    public void setBaseT(Double baseT) {
        this.baseT = baseT;
    }

    public Double getAlturaT() {
        return alturaT;
    }

    public void setAlturaT(Double alturaT) {
        this.alturaT = alturaT;
    }

    public Double getLado1() {
        return lado1;
    }

    public void setLado1(Double lado1) {
        this.lado1 = lado1;
    }

    public Double getLado2() {
        return lado2;
    }

    public void setLado2(Double lado2) {
        this.lado2 = lado2;
    }

    public Double getLado3() {
        return lado3;
    }

    public void setLado3(Double lado3) {
        this.lado3 = lado3;
    }

    //Metodo para calcular el area del Triangulo
    public double calcularArea() {
        return (alturaT*baseT)/2;
    }

    //Metodo para calcular el perimetro del Triangulo
    public double calcularPerimetro() {
        return (lado1+lado2+lado3);
    }

    //Metodo para mostrar los valores
    public void imprimirValores() {
        System.out.println("Base: " + baseT);
        System.out.println("Altura: " + alturaT);
        System.out.println("Lado1: " + lado1);
        System.out.println("Lado2: " + lado2);
        System.out.println("Lado3: " + lado3);
        System.out.println("Area: " + calcularArea());
        System.out.println("Perimetro: " + calcularPerimetro());
    }
}
