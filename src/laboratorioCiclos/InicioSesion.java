package laboratorioCiclos;


import java.util.Scanner;
import java.util.logging.Logger;

public class InicioSesion{
    public static final Logger LOGGER
            =Logger.getLogger(InicioSesion.class.getName());

    public static void main(String[] args) {
        //Realizar un programa que indique usuario y  contraseña con un máximo de 3 intentos.
        // Si supera la cantidad de intentos con datos inválidos:
        // mostrar un mensaje indicando que  se ha bloqueado el usuario.

        Scanner sc=new Scanner(System.in);

        //Creo los datos correctos del usuario y contraseña
        String usuarioSis ="admin";
        String contraSis ="admin";

        //declaro la variable para contar los intentos
        int intentos = 0;

        //uso un While para repetir el ciclo hasta que su cumpla alguna condicion
        while (intentos < 3){
            LOGGER.info("Ingrese su Usuario");
            String usuario = sc.next();

            LOGGER.info("Ingrese su Contraseña");
            String contra = sc.next();

            //uso un IF para comparar los datos ingresados con los correctos
            if(usuario.equals(usuarioSis) && contra.equals(contraSis)){
                LOGGER.info("Los datos son correctos, Bienvenido!");
                //pongo un break si ingresa los datos correctos
                break;
            }else{
                LOGGER.info("Los datos son incorrectos.");
                intentos ++;
                LOGGER.info("Este es su intento " + intentos + " de 3");
            }
            //En caso de que los intentos lleguen a su maximo se compara y se bloquea la cuenta
        }if (intentos==3) LOGGER.warning("Su cuenta fue BLOQUEADA por exceso de intentos");


    }



}