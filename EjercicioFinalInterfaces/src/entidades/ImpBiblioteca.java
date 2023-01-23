package entidades;

import java.util.Scanner;

public class ImpBiblioteca implements Biblioteca{
    Scanner input = new Scanner(System.in).useDelimiter("\n");
    String nombre, apellido, titulo;
    int paginas;

    @Override
    public void CrearAutor() {
        System.out.println("Ingrese el nombre del autor");
        nombre = input.nextLine();

        System.out.println("Ingrese el apellido del autor");
        apellido = input.nextLine();
    }

    @Override
    public void CrearLibro() {
        System.out.println("Ingrese el titulo del libro");
        titulo = input.nextLine();

        System.out.println("Ingrese la cantidad de paginas del libro");
        paginas = input.nextInt();
    }

    public void MostrarLibro(){
        System.out.println("El nombre del autor es: " + nombre + "" + apellido + "\n"
        + "Titulo del libro: " + titulo + "\n" + "Cantidad de paginas: " + paginas);
    }
}
