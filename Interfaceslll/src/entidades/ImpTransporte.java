package entidades;

//Clase en donde implementamos la INTERFACE
//Siempre utilizamos implements para trabajar con insterfaces
public class ImpTransporte implements Transporte{

    @Override
    public void TipoTransporte() {
        System.out.println("Auto");
    }
    
    @Override
    public void Velocidad() {
        System.out.println("Puedo variar de velocidad");
    }

    @Override
    public void Asientos() {
        System.out.println("Asientos: 5 ");
    }
}
