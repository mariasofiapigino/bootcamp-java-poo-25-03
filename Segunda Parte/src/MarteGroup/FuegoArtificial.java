package marteGroup;

public class FuegoArtificial implements Explotable{
    private String ruido;

    public FuegoArtificial() {
    }

    public FuegoArtificial(String ruido) {
        this.ruido = ruido;
    }

    public String getRuido() {
        return ruido;
    }

    public void setRuido(String ruido) {
        this.ruido = ruido;
    }

    @Override
    public void explotar() {
        System.out.println(this.ruido);
    }

    @Override
    public String toString() {
        return "FuegoArtificial{" +
                "ruido='" + ruido + '\'' +
                '}';
    }
}
