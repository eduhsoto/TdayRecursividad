package com.company.recursividad;

import java.util.Scanner;

public class Multiplo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//Llamamos al constructor de clase Scanner
        System.out.println("Introduce un número entero");
        int nu = sc.nextInt(); //Se declara una variable para el límite de múltiplos
        System.out.println("¿Cuál es la cantidad de múltiplos que desea saber?");
        int n = sc.nextInt();//Declaramos una variable que será para limitar los múltiplos
        Multiplos(nu, n);//Llamamos al  método

    }

    static void Multiplos(int n, int m) { //creamos el método

        if (m > 1) {//Si el límite es mayor a 1 se llama al método
            Multiplos(n, m - 1);

        }
        int resul = n * m;//Se multiplica el número ingresado por la cantidad de múltiplos
        if (resul % 2 == 0 ) {//Si el resultado de la multiplicación da como residuo 0 se imprime que ese número es par
            System.out.print("Par: " + resul + " , ");
        }
        if (resul % 2 != 0) {//En caso contrario es impar
            System.out.print("Impar: " + resul + " , ");
        }

    }
}
