package Entities;
public class Rutina {
    private int id;
    private String nombre;
    private Double duracion;
    private int dificultad;
    private String descripcion;
    public Rutina() {
    }
    public Rutina(int id, String nombre, Double duracion, int dificultad, String descripcion) {
        this.id = id;
        this.nombre = nombre;
        this.duracion = duracion;
        this.dificultad = dificultad;
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Rutina{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", duracion=" + duracion +
                ", dificultad=" + dificultad +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getDuracion() {
        return duracion;
    }

    public void setDuracion(Double duracion) {
        this.duracion = duracion;
    }

    public int getDificultad() {
        return dificultad;
    }

    public void setDificultad(int dificultad) {
        this.dificultad = dificultad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
