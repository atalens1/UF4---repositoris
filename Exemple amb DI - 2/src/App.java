public class App {
    public static void main(String[] args) throws Exception {

        Usuari user1 = new Usuari("Eric A", "eric_a@iticbcn.cat");
        
        Incidencia inc1 = new Incidencia(1, "Configuració errònia xarxa");

        inc1.setU1(user1);

        inc1.mostrarDetalle();
    }
}
