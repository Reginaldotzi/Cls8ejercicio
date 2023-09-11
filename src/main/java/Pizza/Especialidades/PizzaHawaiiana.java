package Pizza.Especialidades;


import Pizza.Base.Pizza;

public class PizzaHawaiiana extends Pizza {
        public PizzaHawaiiana(String nombre, Pizza.Tamaño tamaño) {
            super(nombre, tamaño);
        }

        @Override
        public void preparar() {
            super.preparar();
            System.out.println("Agregando los ingredientes necesarios para tu pizza Hawaiiana");
        }
    }

