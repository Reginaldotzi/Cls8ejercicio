package Pizza.Base;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Pizza {
    public enum Tamaño { pequeña, mediana, grande}

    private String nombre;
    private Tamaño tamaño;
    private List<Topping> ingredientes = new ArrayList<>();
    private double precioBase;

    public Pizza(String nombre, Tamaño tamaño) {
        this.nombre = nombre;
        this.tamaño = tamaño;
        // Establecer el precio base dependiendo del tamaño
        switch (tamaño) {
            case mediana:
                precioBase = 59.;
                break;
            case grande:
                precioBase = 98.;
                break;
            default:
                precioBase = 40;
                break;
        }
    }

    public void agregarIngrediente(Topping ingrediente) {
        this.ingredientes.add(ingrediente);
    }

    public List<Topping> getIngredientes() {
        return Collections.unmodifiableList(new ArrayList<>(ingredientes));
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecioPizza() {

        double precioTotal = precioBase;
        for (Topping ingrediente : ingredientes) {
            precioTotal += ingrediente.getPrecioItem();
        }
        return precioTotal;
    }

    public void preparar() {
        System.out.println("Se esta Preparando " + tamaño.toString() + " " + nombre);
        System.out.println("Agregando ingredientes:");
        for (Topping ingrediente : ingredientes) {
            System.out.println("- " + ingrediente.getNombre());

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("¡La pizza está lista!");
    }
}
