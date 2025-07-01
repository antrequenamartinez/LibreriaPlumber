package es.externa.libreriaplumber;

public class Material {

    private String nombre;
    private String descripcion;
    private Double precioUnidad;
    private int unidades;
    private Obra obra;

    public Material() {}

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

    public Obra getObra() {
        return obra;
    }

    public void setObra(Obra obra) {
        this.obra = obra;
    }
}
