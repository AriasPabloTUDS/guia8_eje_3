/*


A continuación, en la clase main hacer lo siguiente:
Crear 4 objetos de tipo Persona con distintos valores, a continuación, 
llamaremos todos los métodos para cada objeto, deberá comprobar si la persona 
está en su peso ideal, tiene sobrepeso o está por debajo de su peso ideal e indicar 
para cada objeto si la persona es mayor de edad.
Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad 
en distintas variables(arrays), para después calcular un porcentaje de esas 4 
personas cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, 
por encima, y también calcularemos un porcentaje de cuantos son mayores de edad y 
cuantos menores. Para esto, podemos crear unos métodos adicionales

 */
package guia.pkg8.eje.pkg3;

import Entidad.Persona;
import Servicio.PersonaServicio;

/**
 *
 * @author Pablo
 */
public class GUIA8EJE3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Persona persona01 = new Persona("Pablo",38,"M");
        PersonaServicio ps = new PersonaServicio();

        //Persona persona1 = ps.crearPersona();
        Persona persona1 = new Persona("Pablo", 38, "M", 89, 1.83);
        System.out.println("Es mayor de edad: " + ps.esMayorDeEdad(persona1));
        boolean pers1 = ps.esMayorDeEdad(persona1);
        System.out.println("El IMC de: " + persona1.getNombre() + " es: " + ps.calcularIMC(persona1));

        //Persona persona2 = ps.crearPersona();
        Persona persona2 = new Persona("Noelia", 12, "f", 89, 1.50);
        System.out.println("Es mayor de edad: " + ps.esMayorDeEdad(persona2));
        boolean pers2 = ps.esMayorDeEdad(persona2);
        System.out.println("El IMC de: " + persona2.getNombre() + " es: " + ps.calcularIMC(persona2));

        //Persona persona3 = ps.crearPersona();
        Persona persona3 = new Persona("Sebastian", 23, "M", 99, 1.90);
        System.out.println("Es mayor de edad: " + ps.esMayorDeEdad(persona3));
        boolean pers3 = ps.esMayorDeEdad(persona3);
        System.out.println("El IMC de: " + persona3.getNombre() + " es: " + ps.calcularIMC(persona3));

        //Persona persona4 = ps.crearPersona();
        Persona persona4 = new Persona("Ivan", 7, "M", 45, 1.30);
        System.out.println("Es mayor de edad: " + ps.esMayorDeEdad(persona4));
        boolean pers4 = ps.esMayorDeEdad(persona4);
        System.out.println("El IMC de: " + persona4.getNombre() + " es: " + ps.calcularIMC(persona4));

        boolean[] edades = {pers1, pers2, pers3, pers4};

        double mayor = 0;
        double menor = 0;
        int i;
        for (i = 0; i < edades.length; i++) {
            System.out.println(edades[i]);
            if ((edades[i]) == true) {
                mayor++;
            } else {
                menor++;
            }

        }
        System.out.println(mayor);
        System.out.println(menor);
        System.out.println(i);
        System.out.println("porcentaje Mayor de edad: " + (mayor / edades.length) * 100+"%");
        System.out.println("porcentaje Menor de edad: " + (menor / edades.length) * 100+"%");
    }

}
