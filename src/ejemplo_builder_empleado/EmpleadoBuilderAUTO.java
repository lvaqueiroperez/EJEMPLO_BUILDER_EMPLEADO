package ejemplo_builder_empleado;

/**
 * CLASE BUILDER HECHA AUTOMÁTICAMENTE DESDE NETBEANS Fijarse que no lo hace
 * todo bien, faltan por rellenar cosas en la clase
 *
 * @author luis-
 */
public class EmpleadoBuilderAUTO {
    //Inicializar los atributos OPCIONALES con un VALOR POR DEFECTO
    private String nombre;
    private String apellido1;
    private String apellido2 = "apellido";
    private int dia = 1;
    private int mes = 1;
    private int anho = 1;
    private float altura = 1;
    private float pie = 1;
    private float diamCabeza = 1;
    private float sueldo = 1;
    private String dni;
    private String cargo = "nada";
    private String formacion = "nada";

    /**
     * Constructor de la clase Builder donde se ponen como parámentros
     * únicamente los atributos obligatorios
     *
     * @param nombre
     * @param apellido1
     * @param dni
     */
    public EmpleadoBuilderAUTO(final String nombre, final String apellido1, final String dni) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.dni = dni;

    }

    //SETTERS DE LOS ATRIBUTOS OPCIONALES !!!!
    //MODIFICADOS CON UN "RETURN THIS" Y DEVOLVIENDO UNA VARIABLE DEL MISMO
    //TIPO DE LA CLASE
//    public EmpleadoBuilderAUTO setNombre(String nombre) {
//        this.nombre = nombre;
//        return this;
//    }
//
//    public EmpleadoBuilderAUTO setApellido1(String apellido1) {
//        this.apellido1 = apellido1;
//        return this;
//    }
    public EmpleadoBuilderAUTO setApellido2(String apellido2) {
        this.apellido2 = apellido2;
        return this;
    }

    public EmpleadoBuilderAUTO setDia(int dia) {
        this.dia = dia;
        return this;
    }

    public EmpleadoBuilderAUTO setMes(int mes) {
        this.mes = mes;
        return this;
    }

    public EmpleadoBuilderAUTO setAnho(int anho) {
        this.anho = anho;
        return this;
    }

    public EmpleadoBuilderAUTO setAltura(float altura) {
        this.altura = altura;
        return this;
    }

    public EmpleadoBuilderAUTO setPie(float pie) {
        this.pie = pie;
        return this;
    }

    public EmpleadoBuilderAUTO setDiamCabeza(float diamCabeza) {
        this.diamCabeza = diamCabeza;
        return this;
    }

    public EmpleadoBuilderAUTO setSueldo(float sueldo) {
        this.sueldo = sueldo;
        return this;
    }

//    public EmpleadoBuilderAUTO setDni(String dni) {
//        this.dni = dni;
//        return this;
//    }
    public EmpleadoBuilderAUTO setCargo(String cargo) {
        this.cargo = cargo;
        return this;
    }

    public EmpleadoBuilderAUTO setFormacion(String formacion) {
        this.formacion = formacion;
        return this;
    }

    /**
     * Método para crear el objeto deseado y retornarlo
     * @return Empleado object
     */
    public Empleado createEmpleado() {
        return new Empleado(nombre, apellido1, apellido2, dia, mes, anho, altura, pie, diamCabeza, sueldo, dni, cargo, formacion);
    }

}
