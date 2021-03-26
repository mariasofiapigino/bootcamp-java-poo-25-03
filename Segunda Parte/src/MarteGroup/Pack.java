package marteGroup;

import java.util.ArrayList;

public class Pack implements Explotable{
    private ArrayList<Explotable> fuegosArtificiales;

    public Pack(){
        this.fuegosArtificiales = new ArrayList<>();
    }

    public void agregarFuegoArtificial(Explotable explotable){
        fuegosArtificiales.add(explotable);
    }

    @Override
    public String toString() {
        return "Pack{" +
                "fuegosArtificiales=" + fuegosArtificiales +
                '}';
    }

    @Override
    public void explotar() {
        for (Explotable fuegosArtificiale : fuegosArtificiales) {
            fuegosArtificiale.explotar();
        }

    }
}
