package com.company.recursividad;

import java.util.Scanner;

public class SumDig {

    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);//Llamamos al contructor de la clase Scanner para la lectura de datos
        System.out.println("Introduce un número entero de 2 dígitos");
        int n = sc.nextInt();//Declaramos una variable de tipo entero, en ella se almacenará lo que el usuario ingrese
        System.out.println("La suma de los dígitos es " + SumDi(n));//Se llama e imprime el método


    }

    public static int SumDi(int numero){//Se crea el método
        if(numero == 0)//Si el número es igual a 0 se retorna el número ingresado
            return numero;
        else
            /*
            En caso contrario al numero se dividira entre 10 y se sumará el residuo, esto es para separar los digitos de un número de 2 dígitos. Ejemplo 15/10
            Es 1 y el residuo 5, se suman los resultado 5 mas 1 es igual a 6. Si el residuo es 0 se retorna el número
             */
            return SumDi(numero /10) + (numero % 10);

        }
    }

