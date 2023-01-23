import entidades.ImpBiblioteca;

public class Main {
    public static void main(String[] args) {

        int menu = 1; //Inicializamos el menu

        System.out.println("Bienvenidos - Crear los libros"); //Parte visual

            do{

           ImpBiblioteca biblioteca = new ImpBiblioteca();  //Instancia para crear los objetos - libros
           biblioteca.CrearAutor();
           biblioteca.CrearLibro();
           biblioteca.MostrarLibro();

           menu++;
                System.out.println(""); //Esto es un salto de linea

        }while (menu<=3); //Con esta condicion, creamos 3 libros

    }
}