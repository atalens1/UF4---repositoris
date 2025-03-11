public class Cost {

    private Comandes comanda;

    public Cost (Comandes comanda) {
        this.comanda = comanda;
    }

    public double CalcularCost(double tarifa, double hores) {
        double cost = 0;

        cost = tarifa * hores *  (comanda.assignarComplexitat(hores)/4.0);

        return cost;
    }

    public Comandes getComanda() {
        return comanda;
    }

    public void setComanda(Comandes comanda) {
        this.comanda = comanda;
    }

}
