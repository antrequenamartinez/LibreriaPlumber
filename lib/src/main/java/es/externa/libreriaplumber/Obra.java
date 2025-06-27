package es.externa.libreriaplumber;

public class Obra {

    private String nombre;
    private String descripcion;
    private String direccion;
    private boolean abierta;
    private Double horasTrabajo;

    public Obra() {
        this.abierta = true;
    }

    public Obra(String nombre, String descripcion, String direccion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.direccion = direccion;
        this.abierta = true;
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

    public Double getHorasTrabajo() {
        return horasTrabajo;
    }

    public void setHorasTrabajo(Double horasTrabajo) {
        this.horasTrabajo = horasTrabajo;
    }
   
}
