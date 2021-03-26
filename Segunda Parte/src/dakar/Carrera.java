package dakar;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class Carrera {
    private double distancia;
    private double premioEnDolares;
    private String nombre;
    private int cantidadDeVehiculosPermitidos;
    private ArrayList<Vehiculo> listaDeVehiculos;
    private SocorristaAuto socorristaAuto;
    private SocorristaMoto socorristaMoto;

    public Carrera(double distancia, double premioEnDolares, String nombre, int cantidadDeVehiculosPermitidos) {
        this.distancia = distancia;
        this.premioEnDolares = premioEnDolares;
        this.nombre = nombre;
        this.cantidadDeVehiculosPermitidos = cantidadDeVehiculosPermitidos;
        this.listaDeVehiculos = new ArrayList<>();
        this.socorristaAuto = new SocorristaAuto();
        this.socorristaMoto = new SocorristaMoto();
    }

    public void darDeAltaAuto(double velocidad, double aceleracion, double AnguloDeGiro, String patente){
        if (listaDeVehiculos.size() < cantidadDeVehiculosPermitidos)
            listaDeVehiculos.add(new Auto(velocidad, aceleracion, AnguloDeGiro, patente));
    }

    public void darDeAltaMoto(double velocidad, double aceleracion, double AnguloDeGiro, String patente){
        if (listaDeVehiculos.size() < cantidadDeVehiculosPermitidos) listaDeVehiculos.add(new Moto(velocidad, aceleracion, AnguloDeGiro, patente));
    }

    public void eliminarVehiculo(Vehiculo vehículo){
        listaDeVehiculos.remove(vehículo);
    }
    
    public void eliminarVehiculoConPatente(String unaPatente){
        for (Vehiculo vehiculo:listaDeVehiculos) {
            if (vehiculo.getPatente().equals(unaPatente)) {
                listaDeVehiculos.remove(vehiculo);
                return;
            }
        }
    }

    public Vehiculo definirGanador(){
        Comparator<Vehiculo> c = (a,b) -> (int) (a.definirRanking() - b.definirRanking());
        Collections.sort(listaDeVehiculos, c);
        return listaDeVehiculos.get(listaDeVehiculos.size() - 1);
    }

    @Override
    public String toString() {
        return "Carrera{" +
                "distancia=" + distancia +
                ", premioEnDolares=" + premioEnDolares +
                ", nombre='" + nombre + '\'' +
                ", cantidadDeVehiculosPermitidos=" + cantidadDeVehiculosPermitidos +
                ", listaDeVehiculos=" + listaDeVehiculos +
                '}';
    }

    public void socorrerAuto(String patente){
        for (Vehiculo vehiculo : listaDeVehiculos) {
            if (vehiculo.getPatente().equals(patente)) {
                socorristaAuto.socorrer((Auto) vehiculo);
            }
        }
    }

    public void socorrerMoto(String patente){
        for (Vehiculo vehiculo : listaDeVehiculos) {
            if (vehiculo.getPatente().equals(patente)) {
                socorristaMoto.socorrer((Moto) vehiculo);
            }
        }
    }
}
