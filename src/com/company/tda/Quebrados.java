package com.company.tda;
import java.util.Scanner;

public class Quebrados {

    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);//Llamamos al contructor de la clase Scanner para la lectura de datos
        System.out.println("Ingrese la fracción 1");
        int a = sc.nextInt();//Declaramos una variable de tipo entero, en ella se almacenará lo que el usuario ingrese
        System.out.println("-");
        int b = sc.nextInt();
        System.out.println("Ingrese la fracción 2");
        int c = sc.nextInt();
        System.out.println("-");
        int d = sc.nextInt();

        //Llamamos a los métodos, ocuparemos 4 variables, a y c los numeradores y b y d los denominadores
        Suma(a,b,c,d);
        Resta(a,b,c,d);
        Multiplicacion(a,b,c,d);
        Division(a,b,c,d);
    }

    static void Suma(int a, int b , int c, int d) {//Creamos un método de tipo void, este realizará la suma de las fracciones dadas
        if (b == d) {//En la ley de fracciones si el denominador de la fracción 1 es igual al de la fracción 2, solo se afectará los numeradores
            System.out.println("La suma de los quebrados con mismo denominador es : ");
            System.out.println(a + c);
            System.out.println("-");
            System.out.println(d);
        } else {//En caso contrario se realiza un producto cruzado
            System.out.println("La suma de los quebrados con distinto denominador es : ");
            System.out.println((a * d) + (b * c));
            System.out.println("-");
            System.out.println(b * d);
        }
    }

        static void Resta(int a, int b, int c, int d) {//Creamos un método para realizar la ressta de fracción
            if (b == d) {//En la ley de fracciones si el denominador de la fracción 1 es igual al de la fracción 2, solo se afectará los numeradores
                System.out.println("La resta de los quebrados con mismo denominador es : ");
                System.out.println( a - c);
                System.out.println("-");
                System.out.println(b);
            } else {//En caso contrario se realiza un producto cruzado
                System.out.println("La resta de los quebrados con distinto denominador es : ");
                System.out.println((a * d) - (b * c));
                System.out.println("-");
                System.out.println(b * d);
            }
    }

            static void Multiplicacion(int a, int b, int c, int d){//Método de la multiplicación
                System.out.println("La multiplicación de quebrados es : ");
                System.out.println(a*c);//SE multiplican numeradores con numeradores
                System.out.println("-");
                System.out.println(b*d);//Denominadores con denominadores
    }

            static void Division(int a, int b, int c, int d){//Método de la división, hacemos la ley de sandwich
                System.out.println("La división de quebrados es : ");
                System.out.println(a*d);
                System.out.println("-");
                System.out.println(b*c);
            }
}




