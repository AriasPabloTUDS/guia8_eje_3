/*
En el paquete Servicios crear PersonaServicio con los siguientes 3 métodos:

 */
package Servicio;

import Entidad.Persona;
import java.util.Scanner;

/**
 *
 * @author Pablo
 */
public class PersonaServicio {

    Scanner leer = new Scanner(System.in);
    private String sexo;
//    Método esMayorDeEdad(): indica si la persona es mayor de edad. La función 
//devuelve un booleano.

    public boolean esMayorDeEdad(Persona persona) {
        boolean comprobación = false;
        if (persona.getEdad() > 0) {
            comprobación = persona.getEdad() > 18;
        } else {
            System.out.println("Error edad incorrecta");
        }
        return comprobación;
    }

//    Metodo crearPersona(): el método crear persona, le pide los valores de los
//atributos al usuario y después se le asignan a sus respectivos atributos para 
//llenar el objeto Persona. Además, comprueba que el sexo introducido sea correcto,
//es decir, H, M o O. Si no es correcto se deberá mostrar un mensaje
    public Persona crearPersona() {
        System.out.println("Crear Persona");

        System.out.println("Ingrese el nombre: ");
        String nombre = leer.next();
        System.out.println("Ingrese la edad: ");
        int edad = leer.nextInt();
        do {
            System.out.println("Ingrese Sexo M para masculino F para femenino u O para otro");
            sexo = leer.next().toUpperCase();
            switch (sexo) {
                case "M":
                    sexo = "M";
                    break;
                case "F":
                    sexo = "F";
                    break;
                case "O":
                    sexo = "O";
                    break;
                default:
                    System.out.println("Error reintente");
                    sexo = "error";
            }
        } while ("error".equals(sexo));

        System.out.println("Ingrese peso KG: ");
        double peso = leer.nextDouble();
        System.out.println("Ingrese altura MTs: ");
        double altura = leer.nextDouble();

        return new Persona(nombre, edad, sexo, peso, altura);
    }
//    Método calcularIMC(): calculara si la persona está en su peso ideal 
//(peso en kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor 
//menor que 20, significa que la persona está por debajo de su peso ideal y 
//la función devuelve un -1. Si la fórmula da por resultado un número entre 
//20 y 25 (incluidos), significa que la persona está en su peso ideal y la función 
//devuelve un 0. Finalmente, si el resultado de la fórmula es un valor mayor que 25 
//significa que la persona tiene sobrepeso, y la función devuelve un 1.
//

    public int calcularIMC(Persona persona) {
        double calculo;
        int resultado;
        calculo = persona.getPeso() / (Math.pow(persona.getAltura(), 2));
        if (calculo < 20) {
            resultado = -1;
        } else if (calculo >= 20 && calculo <= 25) {
            resultado = 0;
        } else {
            resultado = 1;
        }
        return resultado;
    }
}
