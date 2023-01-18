import entidades.ImpTransporte;

public class Main {
    public static void main(String[] args) {

        //Siempre instanciamos la clase en donde implementamos las interfaces
        ImpTransporte auto = new ImpTransporte();
        auto.TipoTransporte(); //Metodos de las interfaces
        auto.Asientos();
        auto.Velocidad();

    }
}