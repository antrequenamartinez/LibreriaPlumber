package es.externa.libreriaplumber;

import es.externa.libreriaplumber.Material;

public abstract class Material<O extends Obra<?>> {

    private String nombre;
    private String descripcion;
    private Double precioUnidad;
    private int unidades;

    public Material() {
    }

    public Material(String nombre, String descripcion, Double precioUnidad, int unidades) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precioUnidad = precioUnidad;
        this.unidades = unidades;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Double getPrecioUnidad() {
        return precioUnidad;
    }

    public void setPrecioUnidad(Double precioUnidad) {
        this.precioUnidad = precioUnidad;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    public abstract O getObra();

    public abstract void setObra(Obra<? extends Material<?>> obra);
}
