/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pf.sistemavotaciones;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author JOSHUA
 */
public class InterfazVotacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    private String nombre;
    private String descripcion;

    public OpcionVotacion(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }
}

// Clase que representa una Elección
class Eleccion {
    private String titulo;
    private String descripcion;
    private boolean activa;
    private List<OpcionVotacion> opciones;

    public Eleccion(String titulo, String descripcion) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.activa = true;
        this.opciones = new ArrayList<>();
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public boolean estaActiva() {
        return activa;
    }

    public void agregarOpcion(OpcionVotacion opcion) {
        opciones.add(opcion);
    }

    public List<OpcionVotacion> getOpciones() {
        return opciones;
    }

    public void cerrarEleccion() {
        this.activa = false;
    }
}

// Clase para simular la gestión de elecciones y votos
public class InterfazVotacion {
    private List<Eleccion> elecciones;
    private List<Eleccion> votosEmitidos;

    public InterfazVotacion() {
        elecciones = new ArrayList<>();
        votosEmitidos = new ArrayList<>();
    }

    public void agregarEleccion(Eleccion eleccion) {
        elecciones.add(eleccion);
    }

    public void mostrarEleccionesActivas() {
        for (Eleccion eleccion : elecciones) {
            if (eleccion.estaActiva()) {
                System.out.println("Título: " + eleccion.getTitulo());
                System.out.println("Descripción: " + eleccion.getDescripcion());
            }
        }
    }

    public void votar(Eleccion eleccion) {
        if (eleccion.estaActiva() && !votosEmitidos.contains(eleccion)) {
            System.out.println("Se muestra la información de la elección: ");
            System.out.println("Título: " + eleccion.getTitulo());
            System.out.println("Descripción: " + eleccion.getDescripcion());

            Scanner scanner = new Scanner(System.in);
            System.out.println("¿Desea emitir su voto? (Sí/No)");
            String respuesta = scanner.nextLine();

            if (respuesta.equalsIgnoreCase("Sí")) {
                List<OpcionVotacion> opciones = eleccion.getOpciones();
                for (int i = 0; i < opciones.size(); i++) {
                    System.out.println((i + 1) + ". " + opciones.get(i).getNombre());
                }

                System.out.println("Seleccione una opción para emitir su voto:");
                int seleccion = scanner.nextInt();
                scanner.nextLine(); // Consumir el salto de línea

                if (seleccion > 0 && seleccion <= opciones.size()) {
                    System.out.println("¿Está seguro de su elección? (Sí/No)");
                    respuesta = scanner.nextLine();

                    if (respuesta.equalsIgnoreCase("Sí")) {
                        System.out.println("¡Gracias por emitir su voto!");
                        votosEmitidos.add(eleccion);
                    } else {
                        System.out.println("Seleccione una nueva opción.");
                    }
                } else {
                    System.out.println("Opción inválida.");
                }
            } else {
                System.out.println("Votación cancelada.");
            }
        } else {
            System.out.println("La elección ya no está activa o su voto ya ha sido emitido.");
        }
    }

    public static void main(String[] args) {
        // Crear elecciones y opciones de voto
        Eleccion eleccion1 = new Eleccion("Elección Presidencial", "Elección del nuevo presidente");
        eleccion1.agregarOpcion(new OpcionVotacion("Candidato A", "Partido X"));
        eleccion1.agregarOpcion(new OpcionVotacion("Candidato B", "Partido Y"));

        Eleccion eleccion2 = new Eleccion("Elección Local", "Elección de alcalde");
        eleccion2.agregarOpcion(new OpcionVotacion("Candidato C", "Partido Z"));
        eleccion2.agregarOpcion(new OpcionVotacion("Candidato D", "Partido W"));

        InterfazVotacion interfaz = new InterfazVotacion();
        interfaz.agregarEleccion(eleccion1);
        interfaz.agregarEleccion(eleccion2);

        // Simular la votación
        interfaz.mostrarEleccionesActivas();
        interfaz.votar(eleccion1);
        interfaz.votar(eleccion1); // Intentar votar nuevamente en la misma elección
        interfaz.votar(eleccion2);
    }
    
}
