public class Incidencia {
    private int id;
    private String descripcion;
    private Usuari u1;

    public Incidencia(int id, String descripcion) {
        this.id = id;
        this.descripcion = descripcion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Usuari getU1() {
        return u1;
    }

    public void setU1(Usuari u1) {
        this.u1 = u1;
    }

    public void mostrarDetalle() {
        u1.mostrarInfo();
        System.out.println("Incidencia #" + id + ": " + descripcion);
    }
}