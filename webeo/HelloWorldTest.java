public class HelloWorldTest {
    public static void main(String[] args) {

        // 1.
        System.out.println("Joaquin Antonio Torrent Jara");
        System.out.println("20");
        System.out.println();

        // 2.
        System.out.print("soy");
        System.out.print("kako");
        System.out.println();

        // 3.
        System.out.println("su nombre creo que era \"kako\" o algo asi...");
        System.out.println();
        /* Anotacion: al usar \"\" permite usar comillas dentro de un String */

        // 4.
        System.out.println("La funcion de este programa es practicar lo mas basico, como lo son los prints");
        System.out.println("fue escrito por un ingeniero informatico en formacion llamado kako");
        System.out.println("y su fecha de creacion fue un 21 de agosto del 2026");
        System.out.println();

        // Check
        // 5.
        System.err.println("nombre\tedad");
        System.out.println("kako\t20");
        System.out.println("pipe\t19");
        System.out.println("facu\t21");
        System.out.println();
        /* Anotacion: Usar \t permite imprimir una estructura tipo tabla */

        // 6.
        System.out.println("hola, soy " + "\n" + "kako");
        System.out.println();

        // 7.
        // System.out.println("hola, esto es una prueba");
        // La linea de codigo se transforma en un comentario

        // 8.
        System.out.println("x) <3 O.O");
        System.out.println();

        // 9.
        String name = "kako";
        int age = 20;
        System.out.println("hola, soy " + name + " y tengo " + age + " años");
        System.out.println();

        // 10.
        /* al quitarle el static a la funcion main lanza un error cual la JVM necesita invocar main sin iniciar una instancia en la clase */
    }
}
