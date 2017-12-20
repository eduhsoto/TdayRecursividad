package com.company.tda;

/*
Un proyectil se dispara verticalmente hacia arriba desde el nivel del suelo con una velocidad inicial
de 49 m/s. ¿Cuál es la velocidad en t = 2 s? ¿Cuál es la altura máxima que alcanza el proyectil?
¿Cuánto tiempo permanece en el aire el proyectil? ¿Cuál es la velocidad de impacto?
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class IntegralIndefinida {
    public static void main (String []args){
        Scanner sc = new Scanner(System.in);//Llamamos al constructor de clase Scanner para la lectura de datos
        System.out.println("Introduce la velocidad inicial con la cual el proyectil se lanza");
        double vo = sc.nextDouble();//Declaramos una veriable para leer y almacenar la velocidad inicial

        System.out.println("Se calculará la velocidad en el tiempo:");
        double t = sc.nextDouble();//Declaramos una veriable para almacenar el tiempo

        Vt(vo,t);//Llamamos al método

    }

    static void Vt(double vi, double ti){
        /*
        Calcularemos la velocidad en un tiempo determinado, para ello empezamos con la aceleración, el valor de la aceleración es igual a(t)= -9.8 .
        Esta es aceleración de la gravedad que provoca que los cuerpos aumenten o disminuyan su velocidad. Integraremos la constante con respecto al tiempo
        obtenemos v(t) =  ∫ (-9.8)dt es igual a v(t)= -9.8t + C1, donde c es la constante que se obtiene de la velocidad inicial del proyectil
         */
        DecimalFormat format = new DecimalFormat("0.00");//Llamamos al constructor de clase DecimalFormat para limitar el numero de decimales dandole un formato
        double vt, g=-9.8, vtd;//Declaramos las variables, vtd para almacenar el resultado de vt. La aceleración de la gravedad
        vt = g * ti;//Multiplicamos la aceleración por el tiempo
        vtd = vt + vi; //Sumamos el resultado de la multiplicación por la velocidad inicial

        if (vtd == 0.0 || vtd <0 ){//Si la velocidad = v(t)=0 del proyectil es igual a cero a alcanzado la altura máxima
            System.out.println("El proyectil esta en su altura máxima");
            //Calculamos la altura que alcanzo, integramos ∫ -9.8t + C1 dt , s(t)= -4.9t^2 + Ct, ...... , s(5)= -4.9t^2 + Ct
            double  gf= -4.9, h ;//Declaramos, como se integro la aceleración de la gravedad a cambiado de valor. Declaramos la variable altura
            h= gf * Math.pow(ti,2) + vi * ti;//Sustituimos el valor de t en la formula
            System.out.println("La altura máxima que alcanzo el proyectil es de " + format.format(h) + " m");
            //Calcularemos ahora el tiempo en que permaneció en el aire: 5 * 2
            double tot;//Declaramos una variable para almacenar el resultado de cuanto tiempo permaneció el proyectil en el aire
            tot = ti * 2;
            System.out.println("El tiempo en que permaneció en el aire el proyectil es de  " + format.format(tot) + " seg");
            //Calculamos la velocidad de impacto: v(10) = -9.8t + C1
            double vf;//Se declara una variable para almacenar el resultado de la velocidad de impacto sustituyendo los valores en la formula -9.8t + C1
            vf = g * tot + vi;
            System.out.println("La velocidad de impacto es de  " + format.format(vf) + "m/s");

        }else{//En caso cntrario se imprimirá la velocidad en el timpo determinado
            System.out.println("La velocidad en la que estuvo el proyectil en el tiempo " + ti + " es " + format.format(vtd) + "m/s");
        }
    }


}
