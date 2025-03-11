public class Peticio implements Comandes {
    private int idComanda;
    private String descripcioComanda;
    private Usuari u1;
    private boolean aprovada;

    public Peticio(int idComanda, String descripcioComanda, boolean aprovada, Usuari u1) {
        this.idComanda = idComanda;
        this.descripcioComanda = descripcioComanda;
        this.aprovada = aprovada;
        this.u1 = u1;
    }

    @Override
    public String mostrarIdDescripcio() {
        return Integer.toString(idComanda) + " - " +  descripcioComanda ;
    }

    @Override
    public int assignarComplexitat(double numHores) {
        
        int complexitat;

        if (numHores >= 1.0 && numHores <3.0) {
            complexitat = 1;
        } else if (numHores >= 3.0 && numHores <9.0) {
            complexitat = 2;
        } else if (numHores >= 9.0) {
            complexitat = 3;
        } else {
            System.out.println("No es pot deteminar la complexitat");
            complexitat = 0;
        }

        return complexitat;
    }


    public int getIdComanda() {
        return idComanda;
    }

    public void setIdComanda(int idComanda) {
        this.idComanda = idComanda;
    }

    public String getDescripcioComanda() {
        return descripcioComanda;
    }

    public void setDescripcioComanda(String descripcioComanda) {
        this.descripcioComanda = descripcioComanda;
    }

    public Usuari getU1() {
        return u1;
    }

    public void setU1(Usuari u1) {
        this.u1 = u1;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
}
