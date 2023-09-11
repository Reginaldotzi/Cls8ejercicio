package com.example;
import Pizza.Especialidades.PizzaHawaiiana;
import Pizza.Especialidades.PizzaItaliana;
import Pizza.Base.Pizza;
import Pizza.Base.Topping;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Pizzeria Martinez, bienvenido!");
        System.out.println("Elija una opción por favor:");
        System.out.println("1. Pizza A su gusto");
        System.out.println("2. Pizza Italiana");
        System.out.println("3. Pizza Hawaiana");

        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:

                Pizza.Tamaño tamañoPizzaAlGusto = seleccionarTamaño(scanner);
                Pizza pizzaPersonalizada = crearPizzaPersonalizada(tamañoPizzaAlGusto, scanner);
                prepararYMostrarPizza(pizzaPersonalizada);
                break;
            case 2:
                // Pizza Italiana
                Pizza.Tamaño tamañoPizzaItaliana = seleccionarTamaño(scanner);
                Pizza pizzaItaliana = new PizzaItaliana("Pizza Italiana", tamañoPizzaItaliana);
                prepararYMostrarPizza(pizzaItaliana);
                break;
            case 3:
                // Pizza Hawaiana
                Pizza.Tamaño tamañoPizzaHawaiana = seleccionarTamaño(scanner);
                Pizza pizzaHawaiana = new PizzaHawaiiana("Pizza Hawaiana", tamañoPizzaHawaiana);
                prepararYMostrarPizza(pizzaHawaiana);
                break;
            default:
                System.out.println("Selección no válida. Saliendo del programa.");
                break;
        }

        scanner.close();
    }

    private static Pizza.Tamaño seleccionarTamaño(Scanner scanner) {
        System.out.println("Por favor, seleccione el tamaño de la pizza (escriba el numero y luego presione enter):");
        System.out.println("1. Pequeña");
        System.out.println("2. Mediana");
        System.out.println("3. Grande");

        int tamañoSeleccionado = scanner.nextInt();

        switch (tamañoSeleccionado) {
            case 1:
                return Pizza.Tamaño.pequeña;
            case 2:
                return Pizza.Tamaño.mediana;
            case 3:
                return Pizza.Tamaño.grande;
            default:
                System.out.println("Selección de tamaño no válida, se usará tamaño predeterminado (Pequeña).");
                return Pizza.Tamaño.grande;
        }
    }

    private static Pizza crearPizzaPersonalizada(Pizza.Tamaño tamañoPizza, Scanner scanner) {
        Pizza pizza = new Pizza("Pizza Personalizada", tamañoPizza);
        boolean continuarAñadiendoIngredientes = true;

        while (continuarAñadiendoIngredientes) {
            System.out.println("Por favor, seleccione un ingrediente para agregar (escriba el numero) y luego presione enter:");
            System.out.println("1. Mozzarella");
            System.out.println("2. Peperoni");
            System.out.println("3. Tomate");
            System.out.println("4. Albahaca");
            System.out.println("5. Jamón");
            System.out.println("6. Aceitunas");
            System.out.println("7. Piña");
            System.out.println("8. Champiñones");
            System.out.println("9. Salchichas");
            System.out.println("10. Cebolla");
            System.out.println("Escriba 11 cuando haya terminado de agregar sus ingredientes favoritos");

            int opcionIngrediente = scanner.nextInt();

            switch (opcionIngrediente) {
                case 1:
                    pizza.agregarIngrediente(new Topping("Mozzarella", 6));
                    break;
                case 2:
                    pizza.agregarIngrediente(new Topping("Peperoni", 5));
                    break;
                case 3:
                    pizza.agregarIngrediente(new Topping("Tomate", 3));
                    break;
                case 4:
                    pizza.agregarIngrediente(new Topping("Albahaca", 2));
                    break;
                case 5:
                    pizza.agregarIngrediente(new Topping("Jamón", 7));
                    break;
                case 6:
                    pizza.agregarIngrediente(new Topping("Aceitunas", 3));
                    break;
                case 7:
                    pizza.agregarIngrediente(new Topping("Piña", 4));
                    break;
                case 8:
                    pizza.agregarIngrediente(new Topping("Champiñones", 4));
                    break;
                case 9:
                    pizza.agregarIngrediente(new Topping("Salchichas", 5));
                    break;
                case 10:
                    pizza.agregarIngrediente(new Topping("Cebolla", 3));
                    break;
                case 11:
                    continuarAñadiendoIngredientes = false;
                    break;
                default:
                    System.out.println("Ingrese una seleccion valida");
                    break;
            }
        }
        return pizza;
    }

    private static void prepararYMostrarPizza(Pizza pizza) {
        System.out.println("Su pizza se está preparando");
        pizza.preparar();
        System.out.println("Su total es de: Q" + pizza.getPrecioPizza());
    }
}
