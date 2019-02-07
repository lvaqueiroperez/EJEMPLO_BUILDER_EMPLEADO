package ejemplo_builder_empleado;

public class Empleado {

    //si ponemos el nombre como final, podremos proteger el codigo para
    //que una vez introducido el nombre no se pueda cambiar
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

//poniendo el cursor aqui, podemos generar todos los set con ventana refactor-->
    //replace constructor with builder CREARÁ LA CLASE BUIDER
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

}
