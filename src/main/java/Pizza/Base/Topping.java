package Pizza.Base;

import java.util.ArrayList;

public class Topping {




    private String nombre; // Nombre del topping
    private ArrayList<String> ingredientes = new ArrayList<>(); // Ingredientes del topping
    private double priceItem; //precio por topping
    public void agregarIngrediente(String ingrediente) {
        this.ingredientes.add(ingrediente);
    }

    public Topping(String nombre, double priceItem) {
        this.nombre = nombre; this.priceItem = priceItem;
    }

    @Override
    public String toString() {
        return "Topping{" + "nombre='" + nombre + '\'' + ", ingredientes=" + ingredientes + '}';
    }


    //getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<String> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(ArrayList<String> ingredientes) {
        this.ingredientes = ingredientes;
    }

    public double getPriceItem() {
        return priceItem;
    }

    public void setPriceItem(double priceItem) {
        this.priceItem = priceItem;
    }
}

