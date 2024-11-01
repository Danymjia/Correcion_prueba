package FigurasRegulares;

public class SumadeAreas {

    public double sumatoria(Cuadrado cuadrado, Rectangulo rectangulo, Triangulo triangulo, Circulo circulo) {
        double areaCuadrado = cuadrado.calcularArea();
        double areaRectangulo = rectangulo.calcularArea();
        double areaTriangulo = triangulo.calcularArea();
        double areaCirculo = circulo.calcularArea();

        return areaCuadrado + areaRectangulo + areaTriangulo + areaCirculo;
    }
}

