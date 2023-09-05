package classroom;

public class Ejecutar {
    public static void main(String[] args) {
        Persona[] personas = new Persona[5];
    personas[0] = new Persona();
    personas[1] = new Persona("Jaime");
    personas[2] = new Persona(1234);
    personas[3] = new Persona("Oswaldo", 2345);
    personas[4] = new Persona(3456, "David");
    
    Persona profesor1 = new Persona("Guzman", 8769);
    Persona profesor2 = new Persona("Andres", 8769);
    Asignatura asignatura1 = new Asignatura("POO", Tipo.DISCIPLINAR);
    Asignatura asignatura2 = new Asignatura("Vision por computador", 3984, 4983, Tipo.ELECTIVA);
    
    Grupo grupo1 = new Grupo(personas, profesor1, asignatura1, 5456, "L V 4-6");
    Grupo grupo2 = new Grupo(3, profesor2, asignatura2, 6784, "W V 8-10");
    
    boolean ok = false;
    if (grupo1.codigo == 5456 && grupo1.estudiantes[3].getNombre().equals("Oswaldo") &&
        grupo2.codigo == 6784 && grupo2.profesor.getNombre().equals("Andres")) {
      ok = true;
    }
    System.out.println(ok);
    System.out.println(grupo2.profesor);

    }
    
}
