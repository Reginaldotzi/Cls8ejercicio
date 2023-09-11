package Pizza.Especialidades;

import Pizza.Base.Pizza;
import Pizza.Base.Topping;

public class PizzaItaliana extends Pizza {
    public PizzaItaliana(String nombre, Tamaño tamaño) {
        super(nombre, tamaño);
    }

    @Override
    public void preparar() {
        super.preparar();
        System.out.println("Agregandos los ingredientes necesarios para tu pizza italiana");
    }
}