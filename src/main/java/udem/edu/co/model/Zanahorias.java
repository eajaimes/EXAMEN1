package udem.edu.co.model;

public class Zanahorias extends Planta {
    public Zanahorias(String nombre, String color, int edad) {
        super(nombre, color, edad);
    }
    @Override
    public String getTipo() {
        return "Zanahorias";
    }
}

