import FigurasRegulares.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Inicializar sin valores -- Cuadrado
        Cuadrado micuadrado = new Cuadrado(0.0);
        System.out.println("----------- CUADRADO --------------");
        System.out.println("Inicializacion sin valores: ");
        micuadrado.imprimirValores();

        //Valores ingresados por el usuario -- Cuadrado
        System.out.println("Ingrese el valor del lado: ");
        double lado = sc.nextDouble();
        micuadrado.setLadoCua(lado);
        micuadrado.imprimirValores();

        //Inicializar sin valores -- Rectangulo
        Rectangulo mirectangulo = new Rectangulo(0.0,0.0);
        System.out.println("----------- RECTANGULO --------------");
        System.out.println("Inicializacion sin valores: ");
        mirectangulo.imprimirValores();

        //Valores ingresados por el usuario -- Rectangulo
        System.out.println("Ingrese el valor del ancho");
        double anchoR = sc.nextDouble();
        System.out.println("Ingrese el valor de la altura: ");
        double alturaR = sc.nextDouble();
        mirectangulo.setAnchoR(anchoR);
        mirectangulo.setLargoR(alturaR);
        mirectangulo.imprimirValores();

        //Inicializar sin valores -- Triangulo
        Triangulo mitriangulo = new Triangulo(0.0,0.0,0.0,0.0,0.0);
        System.out.println("----------- TRIANGULO --------------");
        System.out.println("Inicializacion sin valores: ");
        mitriangulo.imprimirValores();

        //Valores ingresados por el usuario -- Triangulo
        System.out.println("Ingrese el valor de la base: ");
        double baseT = sc.nextDouble();
        System.out.println("Ingrese el valor de la altura: ");
        double alturaT = sc.nextDouble();
        System.out.println("Ingrese el valor del primer lado: ");
        double lado1T = sc.nextDouble();
        System.out.println("Ingrese el valor del segundo lado: ");
        double lado2T = sc.nextDouble();
        System.out.println("Ingrese el valor del tercer lado: ");
        double lado3T = sc.nextDouble();
        mitriangulo.setBaseT(baseT);
        mitriangulo.setAlturaT(alturaT);
        mitriangulo.setLado1(lado1T);
        mitriangulo.setLado2(lado2T);
        mitriangulo.setLado3(lado3T);
        mitriangulo.imprimirValores();

        //Inicializar sin valores -- Triangulo
        Circulo micirculo = new Circulo(0.0);
        System.out.println("----------- CIRCULO --------------");
        System.out.println("Inicializacion sin valores: ");
        micirculo.imprimirValores();

        //Valores ingresados por el usuario -- Circulo
        System.out.println("Ingrese el valor del radio: ");
        double radioC = sc.nextDouble();
        micirculo.setRadio(radioC);
        micirculo.imprimirValores();

        //Imprimir valores de todas las areas
        SumadeAreas sumadeAreas = new SumadeAreas();
        double areaTotal = sumadeAreas.sumatoria(micuadrado, mirectangulo, mitriangulo, micirculo);
        System.out.println("----------- SUMATORIA DE AREAS --------------");
        System.out.println("La sumatoria de las áreas de todas las figuras es: " + areaTotal);

        /*CONCEPTOS DE POO
                - CLASE: es una plantilla o un molde que define las características y el comportamiento de un tipo particular de objeto

                - OBJETOS: un objeto es una representación concreta que sigue esa plantilla, con sus propios valores específicos para
                         los atributos definidos en la clase

                - CONSTRCUTOR: es un metodo especial que se utiliza para inicializar objetos de una clase

                - SETTERS Y GETTERS: permiten establecer (set) y obtener (get) los valores de los atributos de un objeto

                - METODO: es una función que se define dentro de una clase y describe un comportamiento o una acción que un
                        objeto de esa clase puede realizar
        */
    }
}