package saveTheRopa;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        List<Prenda> prendas = new ArrayList<>();
        prendas.add(new Prenda("Pull&Bear", "Buzo"));
        prendas.add(new Prenda("Wanama", "Campera"));
        List<Prenda> prendas2 = new ArrayList<>();
        prendas2.add(new Prenda("Vans", "Zapatillas"));
        prendas2.add(new Prenda("Prune", "Cartera"));

        GuardaRopa guardaRopa = new GuardaRopa();
        int codigo = guardaRopa.guardarPrendas(prendas);
        int codigo2 = guardaRopa.guardarPrendas(prendas2);

        System.out.println("\nGuardaRopa");
        guardaRopa.mostrarPrendas();
        List<Prenda> prendasDevueltas = guardaRopa.devolverPrendas(codigo);
        System.out.println("\nDevueltas");
        for (int i = 0; i < prendasDevueltas.size(); i++) {
            System.out.println(prendasDevueltas.get(i));
        }

        System.out.println("\nGuardaRopa");
        guardaRopa.mostrarPrendas();

    }
}
