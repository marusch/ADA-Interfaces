package entidades;

public class EstudianteProfesor implements Estudiante, Profesor{

    @Override
    public void hablar() {
        System.out.println("Hola!");
    }

    @Override
    public void Estudiar() {
        System.out.println("Estudio Programacion");
    }

    @Override
    public void Presente() {
        System.out.println("Presente");
    }
}
