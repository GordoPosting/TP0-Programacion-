import java.util.ArrayList;
import java.util.List;

public class Estudiante {
    private String nombre;
    private String apellido;
    private int edad;
    private String carrera;
    private double promedio;
    private List<Materia> materias;

    public Estudiante() {
        this.materias = new ArrayList<>();
    }

    public Estudiante(String nombre, String apellido, int edad, String carrera, double promedio) {
        this.materias = new ArrayList<>();
        setNombre(nombre);
        setApellido(apellido);
        setEdad(edad);
        setCarrera(carrera);
        setPromedio(promedio);
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) {
        if (nombre == null || nombre.trim().isEmpty())
            throw new IllegalArgumentException("El nombre no puede estar vacío");
        this.nombre = nombre;
    }

    public String getApellido() { return apellido; }
    public void setApellido(String apellido) {
        if (apellido == null || apellido.trim().isEmpty())
            throw new IllegalArgumentException("El apellido no puede estar vacío");
        this.apellido = apellido;
    }

    public int getEdad() { return edad; }
    public void setEdad(int edad) {
        if (edad < 16)
            throw new IllegalArgumentException("La edad debe ser mayor a 16");
        this.edad = edad;
    }

    public String getCarrera() { return carrera; }
    public void setCarrera(String carrera) { this.carrera = carrera; }

    public double getPromedio() { return promedio; }
    public void setPromedio(double promedio) {
        if (promedio < 0 || promedio > 10)
            throw new IllegalArgumentException("El promedio debe estar entre 0 y 10");
        this.promedio = promedio;
    }

    public void agregarMateria(Materia materia) {
        materias.add(materia);
    }

    public double calcularPromedio() {
        if (materias.isEmpty()) return 0;
        double total = 0;
        for (Materia m : materias) {
            total += m.getCalificacion();
        }
        this.promedio = total / materias.size();
        return this.promedio;
    }
}