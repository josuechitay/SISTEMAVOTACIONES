/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pf.sistemavotaciones;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author JOSHUA
 */
public class AccesoSistemaVotante {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        private String titulo;
    private String proposito;
    private String descripcion;
    private String codigoIdentificacion;
    private Date inicioInscripcion;
    private Date finInscripcion;
    private Date inicioVotacion;
    private Date finVotacion;
    private boolean eliminada;

    // Constructor
    public Eleccion(String titulo, String proposito, String descripcion, String codigoIdentificacion,
                    Date inicioInscripcion, Date finInscripcion, Date inicioVotacion, Date finVotacion) {
        this.titulo = titulo;
        this.proposito = proposito;
        this.descripcion = descripcion;
        this.codigoIdentificacion = codigoIdentificacion;
        this.inicioInscripcion = inicioInscripcion;
        this.finInscripcion = finInscripcion;
        this.inicioVotacion = inicioVotacion;
        this.finVotacion = finVotacion;
        this.eliminada = false;
    }

    // Getters, Setters y métodos para la gestión de elecciones
    // ...

}

class Candidato {
    private String nombre;
    private String formacion;
    private String experienciaProfesional;
    private String codigoIdentificacion;

    // Constructor
    public Candidato(String nombre, String formacion, String experienciaProfesional, String codigoIdentificacion) {
        this.nombre = nombre;
        this.formacion = formacion;
        this.experienciaProfesional = experienciaProfesional;
        this.codigoIdentificacion = codigoIdentificacion;
    }

    // Getters, Setters y métodos para la gestión de candidatos
    // ...
}

class AdministracionElecciones {
    private List<Eleccion> elecciones;
    private List<Candidato> candidatos;

    public AdministracionElecciones() {
        elecciones = new ArrayList<>();
        candidatos = new ArrayList<>();
    }

    // Métodos para la gestión de elecciones
    public void crearEleccion(String titulo, String proposito, String descripcion, String codigoIdentificacion,
                              Date inicioInscripcion, Date finInscripcion, Date inicioVotacion, Date finVotacion) {
        Eleccion nuevaEleccion = new Eleccion(titulo, proposito, descripcion, codigoIdentificacion,
                inicioInscripcion, finInscripcion, inicioVotacion, finVotacion);
        elecciones.add(nuevaEleccion);
    }

    public void eliminarEleccion(String codigoIdentificacion) {
        for (Eleccion eleccion : elecciones) {
            if (eleccion.getCodigoIdentificacion().equals(codigoIdentificacion)) {
                if (!eleccion.getInicioInscripcion().before(new Date())) {
                    eleccion.setEliminada(true);
                    return;
                } else {
                    System.out.println("No se puede eliminar una elección después de su inicio.");
                    return;
                }
            }
        }
        System.out.println("Eleccion no encontrada");
    }

    // Métodos para la gestión de candidatos
    // ...

    // Método para configurar candidatos para una elección
    public void configurarCandidatosParaEleccion(String codigoEleccion, List<Candidato> candidatosSeleccionados) {
        // Lógica para asociar candidatos a una elección específica
        // ...
    }

    }
    
}
