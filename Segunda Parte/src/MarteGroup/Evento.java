package MarteGroup;

import java.util.ArrayList;

public class Evento {
    private ArrayList<Invitado> invitados;
    private ArrayList<Explotable> fuegosArtificiales;

    public Evento() {
        this.invitados = new ArrayList<>();
        this.fuegosArtificiales = new ArrayList<>();
    }

    public void agregarFuegosArtificiales(Explotable explotable){
        fuegosArtificiales.add(explotable);
    }

    public void agregarInvitados(Invitado invitado){
        invitados.add(invitado);
    }


    // Determina dos eventos:
    // - Explosion Fuegos Artificiales
    // - Comer torta
    public void apagarVelas(){
        reventarFuegosArtificiales();
        comerTorta();

    }

    private void comerTorta() {
        for (int i = 0; i < invitados.size(); i++) {
            invitados.get(i).comerTorta();
        }
    }


    private void reventarFuegosArtificiales() {
        for (Explotable fuegosArtificiale : fuegosArtificiales) {
            fuegosArtificiale.explotar();
        }
    }

    @Override
    public String toString() {
        return "Evento{" +
                "invitados=" + invitados +
                ", fuegosArtificiales=" + fuegosArtificiales +
                '}';
    }
}
