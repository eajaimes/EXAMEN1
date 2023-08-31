package udem.edu.co.model;

public class Moras extends Planta {
    public Moras(String nombre, String color, int edad) {
        super(nombre, color, edad);
    }
    @Override
    public String getTipo() {
        return "Moras";
    }
}

