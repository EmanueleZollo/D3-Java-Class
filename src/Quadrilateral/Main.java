package Quadrilateral;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
         Rectangular one = new Rectangular(4.3, 6.7);
        printRectangular(one);
        Rectangular two = new Rectangular(3.5, 8.3);
        printTwoRectangulars(one, two);

        }

    public static void printRectangular(Rectangular x){
        System.out.println("L'area del rettangolo misura " + x.area() + " cm2");
        System.out.println("Il perimetro del rettangolo è " + x.perimeter() + " cm");
    }

    public static void printTwoRectangulars(Rectangular x, Rectangular y){
        System.out.println("-------------------");
        System.out.println("L'area del primo rettangolo misura " + x.area() + " cm2");
        System.out.println("Il perimetro del primo rettangolo è " + x.perimeter() + " cm");
        System.out.println("L'area del secondo rettangolo misura " + y.area() + " cm2");
        System.out.println("Il perimetro del secondo rettangolo è " + y.perimeter() + " cm");
        System.out.println("La somma dei perimetri dei due rettangoli misura " + (x.perimeter() + y.perimeter()) + " cm");
        System.out.println("La somma delle aree dei due rettangoli misura " + (x.area() + y.area()) + " cm2");
    }
    }
