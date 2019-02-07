package ejemplo_builder_empleado;

public class Ejemplo_Builder_Empleado {

    public static void main(String[] args) {

        //como es un ejemplo sin usar el Builder, tenemos que rellenar todos 
        //los campos para que el constructor funcione
        //en este caso, los campos que no queramos, dejarlos a 0 o en String sin nada
        Empleado emp1 = new EmpleadoBuilderAUTO().setNombre("juan").setApellido1("vazquez").setApellido2("rodriguez").setAnho(1999).setAltura(1.80f).setPie(0).setDiamCabeza(0).setSueldo(0).setDni("158877U").setCargo("").setFormacion("").createEmpleado();

        Empleado emp2 = new EmpleadoBuilderAUTO().setNombre("ter").setApellido1("vazquez").setApellido2("garcia").setDia(2).setMes(2).setAnho(1998).setAltura(1.70f).setPie(0).setDiamCabeza(0).setSueldo(0).setDni("158877U").setCargo("").setFormacion("").createEmpleado();
        //hacemos un debug para comprobar que crea los objetos correctamente

//        EmpleadoBuilder miBuilder = new EmpleadoBuilder("pedro", "vazquez", "454545U");
//
//        EmpleadoBuilder miMismoBuilder = miBuilder.setApellido2("perez");
        //este objeto se define, pero no se instancia (NO TIENE EL new !!!)
        Empleado jefeTaller = new EmpleadoBuilder("juan", "perez", "458154Y")
                .setApellido2("rodriguez")
                //aqui irian todos los set, puestos asi para que sea legible
                .crearEmpleado();

        Empleado operarioTaller = new EmpleadoBuilder("pepe", "perez", "548545O")
                .setApellido2("gerez")
                .crearEmpleado();

    }

}
