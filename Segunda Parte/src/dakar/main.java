package dakar;

public class main {
    public static void main(String[] args) {
        Carrera carrera = new Carrera(1000, 90000, "Carrera Marzo", 10);
        carrera.darDeAltaAuto(500, 200, 30, "AA 456 DD");
        carrera.darDeAltaAuto(900, 100, 40, "AE 326 FD");
        carrera.darDeAltaMoto(400, 300, 30, "AZ 543");
        carrera.darDeAltaMoto(400, 200, 30, "AZ 456");
        carrera.eliminarVehiculoConPatente("AZ 456");
        Vehiculo ganador = carrera.definirGanador();

        System.out.println("Carrera " + carrera);
        carrera.socorrerAuto("AA 456 DD");
        carrera.socorrerMoto("AZ 543");

        System.out.println("Ganador: " + ganador.definirRanking());
    }


}
