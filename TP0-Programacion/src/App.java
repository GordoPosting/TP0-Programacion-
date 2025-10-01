public class App {
    public static void main(String[] args) {

        // Crear estudiantes (con y sin constructor parametrizado)
        Estudiante e1 = new Estudiante("Juan", "Pérez", 20, "Ingeniería", 0);
        Estudiante e2 = new Estudiante("Ana", "Gómez", 22, "Ingeniería", 0);
        Estudiante e3 = new Estudiante();
        e3.setNombre("Luis");
        e3.setApellido("Martínez");
        e3.setEdad(21);
        e3.setCarrera("Ingeniería");
        e3.setPromedio(0);

        // Almacenar en arreglo
        Estudiante[] estudiantes = { e1, e2, e3 };

        // Mostrar nombre y promedio
        for (Estudiante e : estudiantes) {
            System.out.println(e.getNombre() + " - Promedio inicial: " + e.getPromedio());
        }

        // Crear materias y asignarlas
        Materia m1 = new Materia("Programación", "INF101", 4, 9);
        Materia m2 = new Materia("Matemática", "MAT101", 5, 8);
        e1.agregarMateria(m1);
        e1.agregarMateria(m2);
        e1.calcularPromedio();

        // Crear carrera y agregar estudiantes
        Carrera carrera = new Carrera("Ingeniería en Sistemas");
        carrera.agregarEstudiante(e1);
        carrera.agregarEstudiante(e2);
        carrera.agregarEstudiante(e3);

        // Mostrar datos actualizados
        System.out.println("\nEstudiantes en la carrera:");
        carrera.listarEstudiantes();
        System.out.println("Promedio actualizado de " + e1.getNombre() + ": " + e1.getPromedio());
    }
}