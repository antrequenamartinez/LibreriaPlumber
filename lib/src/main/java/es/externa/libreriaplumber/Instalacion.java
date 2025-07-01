package es.externa.libreriaplumber;

import java.time.LocalDate;

public class Instalacion extends Obra {

    private Double estimacionTemporal;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;

    public Instalacion() {
    }

    public Instalacion(String nombre, String descripcion, String direccion) {
        super(nombre, descripcion, direccion);
    }

    public Double getEstimacionTemporal() {
        return estimacionTemporal;
    }

    public void setEstimacionTemporal(Double estimacionTemporal) {
        this.estimacionTemporal = estimacionTemporal;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }
}