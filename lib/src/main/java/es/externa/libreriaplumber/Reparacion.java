package es.externa.libreriaplumber;

import java.time.LocalDate;

public abstract class Reparacion<M extends Material<?>> extends Obra<M> {

    private int prioridad;
    private double precioServicio;
    private boolean plusHorario;
    private LocalDate fecha;

    public Reparacion() {
        super();
    }

    public Reparacion(String nombre, String descripcion, String direccion) {
        super(nombre, descripcion, direccion);
    }

    public int getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }

    public double getPrecioServicio() {
        return precioServicio;
    }

    public void setPrecioServicio(double precioServicio) {
        this.precioServicio = precioServicio;
    }

    public boolean isPlusHorario() {
        return plusHorario;
    }

    public void setPlusHorario(boolean plusHorario) {
        this.plusHorario = plusHorario;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
}
