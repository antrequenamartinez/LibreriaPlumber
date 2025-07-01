package es.externa.libreriaplumber;

import java.util.ArrayList;
import java.util.List;

public abstract class Obra {

    private String nombre;
    private String descripcion;
    private String direccion;
    private boolean abierta = true;
    private double horasTrabajo;

    private List<Material> materialesConsumidos = new ArrayList<>(); 

    public Obra() {}

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

    public List<Material> getMaterialesConsumidos() {
        return materialesConsumidos;
    }

    public void setMaterialesConsumidos(List<Material> materialesConsumidos) {
        this.materialesConsumidos = materialesConsumidos;
    }

    public void addMaterialConsumido(String nombre, String descripcion, Double precioUnidad, int unidades) {
        Material material = new Material();
        material.setNombre(nombre);
        material.setDescripcion(descripcion);
        material.setPrecioUnidad(precioUnidad);
        material.setUnidades(unidades);
        material.setObra(this);
        materialesConsumidos.add(material);
    }
    
    public boolean removeMaterial(Material material) {
        return materialesConsumidos.remove(material);
    }
    
}
