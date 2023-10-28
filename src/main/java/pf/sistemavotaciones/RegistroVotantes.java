/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pf.sistemavotaciones;
import java.util.Date;
import java.util.Random;

/**
 *
 * @author JOSHUA
 */
public class RegistroVotantes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        private String nombres;
    private String apellidos;
    private String CUI;
    private String sexo;
    private Date fechaNacimiento;
    private String direccion;
    private String departamentoResidencia;
    private String municipioResidencia;
    private String paisResidencia;
    private String contraseña;
    private boolean activo;

    // Constructor
    public Votante(String nombres, String apellidos, String CUI, String sexo, Date fechaNacimiento,
                   String direccion, String departamentoResidencia, String municipioResidencia,
                   String paisResidencia) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.CUI = CUI;
        this.sexo = sexo;
        this.fechaNacimiento = fechaNacimiento;
        this.direccion = direccion;
        this.departamentoResidencia = departamentoResidencia;
        this.municipioResidencia = municipioResidencia;
        this.paisResidencia = paisResidencia;
        this.contraseña = generarContraseñaAleatoria();
        this.activo = true; // El votante se registra como activo por defecto
    }

    // Generar contraseña aleatoria
    private String generarContraseñaAleatoria() {
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder sb = new StringBuilder(16);
        Random random = new Random();
        for (int i = 0; i < 16; i++) {
            int index = random.nextInt(caracteres.length());
            sb.append(caracteres.charAt(index));
        }
        return sb.toString();
    }

    // Métodos para modificar datos del votante
    public void modificarDireccion(String direccion, String departamento, String municipio, String pais) {
        this.direccion = direccion;
        this.departamentoResidencia = departamento;
        this.municipioResidencia = municipio;
        this.paisResidencia = pais;
    }

    public void cambiarContraseña() {
        this.contraseña = generarContraseñaAleatoria();
    }

    public void darDeBaja() {
        this.activo = false;
    }

   
}

// Clase para manejar el registro de votantes
public class RegistroVotantes {
    // Método para registrar un nuevo votante
    public void registrarVotante(String nombres, String apellidos, String CUI, String sexo, Date fechaNacimiento,
                                 String direccion, String departamentoResidencia, String municipioResidencia,
                                 String paisResidencia) {
        // Verificar la elegibilidad (suponiendo que la fecha actual es "now")
        Date now = new Date();
        int edadMinima = 18; // Edad mínima para votar
        long diferenciaEnMilisegundos = now.getTime() - fechaNacimiento.getTime();
        long edadEnAnios = diferenciaEnMilisegundos / 1000 / 60 / 60 / 24 / 365; // Años

        if (edadEnAnios >= edadMinima) {
            Votante nuevoVotante = new Votante(nombres, apellidos, CUI, sexo, fechaNacimiento,
                    direccion, departamentoResidencia, municipioResidencia, paisResidencia);

            // Guardar el nuevo votante en alguna estructura de datos (lista, base de datos, etc.)
            // Ejemplo: listaDeVotantes.add(nuevoVotante);
        } else {
            System.out.println("El votante no es elegible debido a su edad.");
        }
    }

    }
    
}
