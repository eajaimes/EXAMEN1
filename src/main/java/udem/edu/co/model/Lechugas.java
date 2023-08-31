package udem.edu.co.model;

public class Lechugas extends Planta{
    public Lechugas(String nombre, String color, int edad) {
        super(nombre, color, edad);
    }
    @Override
    public String getTipo() {
        return "Lechugas";
    }
}

