package laboratorioCiclos;

import java.util.Scanner;
import java.util.logging.Logger;

public class NumAleatorio {

    public static final Logger LOGGER =
            Logger.getLogger(NumAleatorio.class.getName());

    public static void main(String[] args) {
        //1. Realizar un programa que genere un número aleatorio, entre 1 y 10,
        // y le pida al usuario que adivine el número, sin límite de intentos.
        Scanner sc=new Scanner(System.in);

        //Uso la ayuda (int)(Math.random() * 10 + 1) para generar el numero
        int nro = (int)(Math.random() * 10 + 1);

        //Declaro la variable del usuario
        int usuario;

        //uso el do-while para para que repita el ciclo mientras el numero del usuario
        //y el numero generado aleatorio sean distintos.
        do{
            LOGGER.info("Intenta adivinar el numero entre 1 y 10");
            LOGGER.info("Ingrese un numero:");
            //le asigno valor a la variable declarada y comparamos
            usuario = sc.nextInt();
        } while (usuario != nro);

        LOGGER.info("CORRECTO! El numero era: " + nro);

    }
}
