package es.externa.libreriaplumber;

import java.util.ArrayList;
import java.util.List;

public abstract class Obra<M extends Material<?>> {

    private String nombre;
    private String descripcion;
    private String direccion;
    private boolean abierta = true;
    private double horasTrabajo;

    private List<M> materialesConsumidos = new ArrayList<>();

    public Obra() {
    }

    public Obra(String nombre, String descripcion, String direccion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.direccion = direccion;
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public boolean isAbierta() {
        return abierta;
    }

    public void setAbierta(boolean abierta) {
        this.abierta = abierta;
    }

    public double getHorasTrabajo() {
        return horasTrabajo;
    }

    public void setHorasTrabajo(double horasTrabajo) {
        this.horasTrabajo = horasTrabajo;
    }

    public List<M> getMaterialesConsumidos() {
        return materialesConsumidos;
    }

    public void setMaterialesConsumidos(List<M> materialesConsumidos) {
        this.materialesConsumidos = materialesConsumidos;
    }

    public void addMaterialConsumido(String nombre, String descripcion, Double precioUnidad, int unidades) {
        M material = crearMaterial(nombre, descripcion, precioUnidad, unidades);
        material.setObra(this);
        materialesConsumidos.add(material);
    }

    public boolean removeMaterial(M material) {
        return materialesConsumidos.remove(material);
    }

    protected abstract M crearMaterial(String nombre, String descripcion, Double precioUnidad, int unidades);
}
