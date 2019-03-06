package ejemplo_builder_empleado;

public class Ejemplo_Builder_Empleado {

    public static void main(String[] args) {

        //EJEMPLO SIN USAR BUILDER: 
        //tenemos que rellenar todos los parámetros para que el constructor funcione
        //en este caso, los campos que no queramos, dejarlos a 0 o en String sin nada,NO PODEMOS OMITIRLOS
        Empleado emp1 = new Empleado("maria", "rodriguez", "sanchez", 2, 2, 2000, 1.80f, 40, 20, 1200, "555555P", "operadora", "Bachillerato");

//        EmpleadoBuilder miBuilder = new EmpleadoBuilder("pedro", "vazquez", "454545U");
//
//        EmpleadoBuilder miMismoBuilder = miBuilder.setApellido2("perez");
        //este objeto se define, pero no se instancia (NO TIENE EL new !!!)
        //////////////////////////
        /////////////////////////
        ////////////////////////
        //UTILIZANDO EL BUILDER:
        //EN EL CONSTRUCTOR INICIAL SOLO SE PONEN LOS PARÁMETROS CONSIDERADOS "OBLIGATORIOS" !!!
        Empleado jefeTaller = new EmpleadoBuilder("juan", "perez", "458154Y")
                //aqui irían todos los set QUE QUERAMOS !!! puestos de manera legible
                .setApellido2("rodriguez")
                //cuando tengamos hecho el objeto complejo, LO CREAMOS
                .crearEmpleado();

        //EJEMPLO CON BUILDER AUTOMÁTICO
        Empleado operarioTaller = new EmpleadoBuilderAUTO("pepe", "perez", "548545O")
                .setApellido2("gerez")
                .setFormacion("cacaDeVaca")
                .setSueldo(999999999)
                .createEmpleado();

        //hacemos un DEBUG para comprobar que crea los objetos correctamente
    }

}
