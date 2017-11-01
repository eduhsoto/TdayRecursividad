package com.company.tda;

//Calcular la velocidad y el tiempo con la que cae un objeto
import java.text.DecimalFormat;
import java.util.Scanner;

public class CaidaLibre {
    static final double g = 9.8;//Declaramos la constante de aceleración de la gravedad
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);//Llamamos al contructor de la clase Scanner para la lectura de datos
        System.out.println("¿Qué desea saber?");
        boolean salir = true;//Declaramos una variable booleana dandole un valor a true, sera utilizada para iniciciar el while
        while(salir){//Se inicia el ciclo repetitivo while
            System.out.println("1: Conocer la velocidad final y el tiempo en el que cae un objeto conociendo la altura");//Pedimos datos al usuario
            System.out.println("2: Conocer la velocidad final y la altura en el que cae un objeto conociendo el tiempo");
            System.out.println("3. Conocer la altura y el tiempo con el que cae un objeto conociendo la velocidad final");
            System.out.println("4. Salir\n");

            int o = sc.nextInt();//Almacenamos la opción en una variable, leemos un tipo de dato entero

            switch (o){//Creamos la estructura de control switch, para la toma de desciones. Dentro del pátentesis llamaos
                case 1://En caso de que ingrese uno, se ejecutara lo que este en el caso 1
                    System.out.println("Ingrese la altura con la que dejo caer el objeto");
                    double m = sc.nextDouble();//Nombrams una variable de tipo double donde se almacenará lo que ingrese el usuario
                    VfT(m);//Llmamos al métodoy ponemos como parametro lo que el usuario ingreso
                    break;//Detiene el bucle y una vez obtenido la información prosigue
                case 2:
                    System.out.println("Introduce el tiempo con el que tardo en caer el objeto");
                    double t = sc.nextDouble();
                    VfA(t);
                    break;
                case 3:
                    System.out.println("Ingrese la velocidad final con la que cayó el objeto");
                    double vf = sc.nextDouble();
                    AlT(vf);
                    break;
                case 4:
                    salir = false;//En caso de elegir el 4, el bucle se detendrá
                    break;
            }
        }
    }
    static String format(double f){//Creamos un método de formato de decimales para usarlo en los correspondientes resultados
        DecimalFormat d = new DecimalFormat("0.00");//Llamamos al contructor de la clase DecimalFormat
        return d.format(f);//En la variable que declaramos en decimal, le pasamos el formato
    }
    static void VfT(double h){//creamos un método para calcular la velocidad final y tiempo

        //Calcularemos la velocidad final con la que cae el objeto, ocuparemos la formula vf^2=2gh
        double vf1,vf2;
        vf1 = 2 * g;//Multiplicamos 2 por la grevedad
        vf2 = vf1 * h; //El resultado lo volvemos a multiplicar por la altura que el usuario ingreso
        double vf =Math.sqrt(vf2);//sacamos raíz al resultado
        System.out.println("La velocidad final con la que cayó el objeto es " + format(vf) + " m/s ");

        //Ahora calcularemos el tiempo con el que cae el objeto
        //Despejemos t en la formula vf=gt, quedaría como t=vf/g
        double t;//Declaramos la varible tiempo
        t = vf / g ;//Hacemos uso del resultado de la velocidad final y lo dividimos entre la gravedad
        System.out.println("El tiempo en que tardó el objeto  es de " + format(t) + " seg\n");
    }
    static void VfA(double t){//Crear un método que calcule la velocidad final y altura del objeto
        //Calcularemos la velocidad final con la que cae el objeto, para ello ocupamos la formúla vf=gt

        double ti;//Declaramos la variable tiempo
        //aplicamos la formúla
        ti = g * t;//Multiplicamos aceleración de la gravedad por tiempo que el usuario ingreso
        System.out.println("La velocidad con la que cayó el objeto es de " + format(ti) + "m/s");

        //Calcularemos la altura con la que cae el objeto, aplicacmos la formúla h=1/2(g).t^2
        double h1, h2, h;//Declaramos 3 variables, para altura
        h1 = t * t;//Multiplicamos tiempo por tiempo, se almacenará en la variabla h1
        h2 = g * h1;//Multiplicamos la aceleración de la gravedad por el resultado de tiempo por tiempo
        h = h2/2;//El resultado lo dividmos entre 2
        System.out.println("La altura con la que cayó el objeto es de  " + format(h) + "seg\n");
    }
    static void AlT(double vf){//Creamos un método para calcular altura y tiempo
        //Calculamos primero el tiempo con la formúla t = vf/g
        double t;//Declaramos una variable para tiempo
        t= vf/g;//Dividimos velocidad final que el usuario ingreso sobre la aceleración de la gravedad
        System.out.println("El tiempo con el que cayó el objeto es " + format(t) + "seg");

        //Calculamos la altura con la fórmula h=1/2 g . T
        double h1, h2, h;//Declaramos 3 variables, para altura
        h1 = t * t;//Multiplicamos tiempo por tiempo, se almacenará en la variabla h1
        h2 = g * h1;//Multiplicamos la aceleración de la gravedad por el resultado de tiempo por tiempo
        h = h2/2;//El resultado lo dividmos entre 2
        System.out.println("La altura con la que cayó el objeto es de " + format(h) + "m\n");//Llamamos al método format
    }
}
