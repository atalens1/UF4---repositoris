public class App {
    public static void main(String[] args) throws Exception {

        Usuari user1 = new Usuari("Eric A", "eric_a@iticbcn.cat");
        
        Comandes inc1 = new Incidencia(1, "Configuració errònia xarxa",user1);
        Comandes pet1 = new Peticio(1, "Aprovar desplaçament"
        , false,user1);

        Cost cost = new Cost(inc1);

        System.out.println("El cost de la incidència: " + inc1.mostrarIdDescripcio() + " és: " + 
        cost.CalcularCost(12, 7) + " eur" );

        cost.setComanda(pet1);

        System.out.println("El cost de la petició: " + pet1.mostrarIdDescripcio() + " és: " + 
        cost.CalcularCost(12, 7) + " eur" );
        
    }
}
