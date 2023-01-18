package entidades;

//Clase que implementa de las interfaces animal y perro
public class Mascota implements Animal, Perro{

    //Metodos de ambas interfaces
    @Override
    public void movimiento() {
        System.out.println("Caminar");
    }

    @Override
    public void Alimentarse() {
        System.out.println("Croquetas");
    }
}
