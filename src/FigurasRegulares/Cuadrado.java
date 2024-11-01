package FigurasRegulares;

public class Cuadrado {

    //Atributos
    private Double ladoCua;

    //Constructor
    public Cuadrado(Double ladoCua) {
        this.ladoCua = ladoCua;
    }

    public Double getLadoCua() {
        return ladoCua;
    }

    public void setLadoCua(Double ladoCua) {
        this.ladoCua = ladoCua;
    }

    //Metodo para calcular el area del Cuadrado
    public double calcularArea() {
        return ladoCua * ladoCua;
    }

    //Metodo para calcular el perimetro del Cuadrado
    public double calcularPerimetro() {
        return 4 * ladoCua;
    }

    //Metodo para mostrar los valores
    public void imprimirValores() {
        System.out.println("Lado: " + ladoCua);
        System.out.println("Area: " + calcularArea());
        System.out.println("Perimetro: " + calcularPerimetro());
    }
}
