package ejemplo_builder_empleado;

/**
 * En esta clase pondremos todos los atributos que podrá tener el objeto
 * complejo y definimos su constructor.
 *
 * @author luis-
 */
public class Empleado {

    //Pensar qué atributos serán OBLIGATORIOS a la hora de crear el objeto complejo
    private String nombre;
    private String apellido1;
    private String apellido2;
    private int dia;
    private int mes;
    private int anho;
    private float altura;
    private float pie;
    private float diamCabeza;
    private float sueldo;
    private String dni;
    private String cargo;
    private String formacion;

    /**
     * Constructor de la clase con todos sus atributos donde se distinguen
     * aquellos "obligatorios" como "final" para evitar futuros errores
     *
     * @param nombre
     * @param apellido1
     * @param apellido2
     * @param dia
     * @param mes
     * @param anho
     * @param altura
     * @param pie
     * @param diamCabeza
     * @param sueldo
     * @param dni
     * @param cargo
     * @param formacion
     */
    public Empleado(final String nombre, final String apellido1, final String apellido2, int dia, int mes, int anho, float altura, float pie, float diamCabeza, float sueldo, String dni, String cargo, String formacion) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.dia = dia;
        this.mes = mes;
        this.anho = anho;
        this.altura = altura;
        this.pie = pie;
        this.diamCabeza = diamCabeza;
        this.sueldo = sueldo;
        this.dni = dni;
        this.cargo = cargo;
        this.formacion = formacion;
    }
    //OJO !!!
    //poniendo el cursor encima de el costructor
    //PODEMOS CREAR LA CLASE BUILDER DIRECTAMENTE
}
