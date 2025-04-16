package laboratorioCiclos;

import java.util.Scanner;
import java.util.logging.Logger;

public class InicioSesionMejorado {
    public static final Logger LOGGER
            =Logger.getLogger(InicioSesionMejorado.class.getName());
    public static void main(String[] args) {
        //Desarrolla un programa en Java que simule un sistema de acceso mejorado donde el usuario debe ingresar:Usuario y contraseña (como en el ejercicio anterior)
        // Si los datos son correctos, se le hará una pregunta de seguridad (ej: "¿Cuál es tu color favorito?").
        // Intentos: Máximo 3 intentos para las credenciales. Si acierta, tiene 2 intentos para la pregunta de seguridad.


        Scanner sc=new Scanner(System.in);

        //Creo los datos correctos
        String usuarioSis ="admin";
        String contraSis ="admin";
        String preguntaSis ="rojo";

        int intentos = 0;
        int intentosMejor = 0;

        while (intentos < 3){
            LOGGER.info("Ingrese su Usuario");
            String usuario = sc.next();

            LOGGER.info("Ingrese su Contraseña");
            String contra = sc.next();

            if(usuario.equals(usuarioSis) && contra.equals(contraSis)){
                LOGGER.info("Los datos son correctos, Verifiquemos su identidad");
                while (intentosMejor <2){
                    LOGGER.info("¿Cuál es tu color favorito?");
                    String pregunta = sc.next();
                    if (pregunta.equals(preguntaSis)){
                        LOGGER.info("Bienvenido!");
                        break;
                    }else{
                        LOGGER.info("El color es incorrecto");
                        intentosMejor ++;
                        LOGGER.info("Este es su intento " + intentosMejor + " de 2");
                    }
                }break;
            }else{
                LOGGER.info("Los datos son incorrectos.");
                intentos ++;
                LOGGER.info("Este es su intento " + intentos + " de 3");
            }
        }if (intentos==3) LOGGER.warning("La cuenta fue BLOQUEADA por exceso de intentos");
        if (intentosMejor==2) LOGGER.warning("Acceso denegado por fallar la pregunta de seguridad");


    }
}
