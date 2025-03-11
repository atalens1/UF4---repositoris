public class Incidencia implements Comandes {
    private int id;
    private String descripcion;
    private Usuari u1;

    public Incidencia(int id, String descripcion, Usuari u1) {
        this.id = id;
        this.descripcion = descripcion;
        this.u1 = u1;
    }

    @Override
    public String mostrarIdDescripcio() {
        return Integer.toString(id) + " - " +  descripcion ;
    }

    @Override
    public int assignarComplexitat(double numHores) {
        
        int complexitat;

        if (numHores >= 0.5 && numHores <2.0) {
            complexitat = 1;
        } else if (numHores >= 2.0 && numHores <6.0) {
            complexitat = 2;
        } else if (numHores >= 6.0) {
            complexitat = 3;
        } else {
            System.out.println("No es pot deteminar la complexitat");
            complexitat = 0;
        }
        
        return complexitat;
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