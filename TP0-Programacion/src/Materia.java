public class Materia {
    private String nombre;
    private String codigo;
    private int creditos;
    private double calificacion;

    public Materia(String nombre, String codigo, int creditos, double calificacion) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.creditos = creditos;
        this.calificacion = calificacion;
    }

    public double getCalificacion() { return calificacion; }
}