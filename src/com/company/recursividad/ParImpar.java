package com.company.recursividad;

import java.util.Scanner;
//El programa evalua si el número es par o impar, en caso afirmativo, realizala la suma a partir del número ingresado.
public class ParImpar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//Llamamos al contrustor de clase para la entrada de datos

        System.out.print("Introduce un número : ");
        int n = sc.nextInt();//Declaramos una variable para almacenar lo que el usuario a ingresado

        System.out.println("\nLa suma es " + ParImpar(n));//Se manda a llamar el método y se imprime
    }

    static int ParImpar(int numero) {//Creamos el método para realizar las operaciones correspondientes
        if (numero <=  1) {//Si el numero ingresado es menor o igual a 1 se retornará lo que se ingreso, ejemplo si ingresa 1 la suma es 1.
            return numero;
            /*
            En caso contrario si el número se divida y si el resto es igual a 0, se suma a partir del 2 hasta el número ingresado dado a saber que es número par
            sino se suma del 1 al número ingresado. Se le va restando 2. Por ejemplo se ingresa 4, el resto es 0, se va restando 2, quedaría así: 4, 2 que es igual a 6 y si
            se ingresa 3, se divide, el resto es 1 y se resta 2, quedaría asi: 3, 1, igual a 4.
             */
        } else if (numero % 2 == 0) {
            return numero + ParImpar(numero - 2);
        } else {
            return numero + ParImpar(numero - 2);
        }

    }
}
