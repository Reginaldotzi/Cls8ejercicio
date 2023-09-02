package Pizza.Especialidades;

import Pizza.Base.Pizza;
import Pizza.Base.Topping;

public class PizzaItaliana  extends Pizza {

    private String salsa;

    public PizzaItaliana(String name, double price, String salsa, Topping... toppings) {
        super(name, toppings);
        this.salsa = salsa;
    }

    public String getSalsa() {
        return salsa;
    }

    public void setSalsa(String salsa) {
        this.salsa = salsa;
    }
}
