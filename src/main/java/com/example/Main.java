package com.example;
import Pizza.Especialidades.PizzaItaliana;
import Pizza.Base.Pizza;
import Pizza.Base.Topping;
import Pizza.Interfaces.PizzaBase;

public class Main {

        public static void main(String[] args)
        {

            Pizza pizza = new Pizza("Pizza Margherita");
            pizza.addTopping(new Topping("Tomato", 5));
            pizza.addTopping(new Topping("Mozzarella", 4));
            pizza.addTopping(new Topping("Basil", 3));
            pizza.prepare();
            System.out.println(pizza.getPizzaPrice());



           /* PizzaItaliana pizza1 = new PizzaItaliana("Pizza Italiana",50, "salsa tomate");
            pizza1.addTopping(new Topping("Mozzarella"));
            pizza1.addTopping(new Topping("Cebolla"));
            pizza1.addTopping(new Topping ("Aceituna"));
            pizza1.prepare();
            System.out.println("salsa: "+ pizza1.getSalsa());*/

            //PizzaBase pizza = new PizzaBase("peperoni", 5);

        }
    }
