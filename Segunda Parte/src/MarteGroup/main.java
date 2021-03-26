package marteGroup;

public class main {
    public static void main(String[] args) {
        Evento evento = new Evento();

        // Fuegos Artificiales
        FuegoArtificial fuegoArtificial = new FuegoArtificial("Pium");

        Pack pack = new Pack();
        FuegoArtificial fuegoArtificial1 = new FuegoArtificial("Pafff");
        pack.agregarFuegoArtificial(fuegoArtificial1);
        pack.agregarFuegoArtificial(fuegoArtificial);

        Pack pack1 = new Pack();
        pack1.agregarFuegoArtificial(fuegoArtificial);
        pack1.agregarFuegoArtificial(pack);

        evento.agregarFuegosArtificiales(fuegoArtificial);
        evento.agregarFuegosArtificiales(pack);
        evento.agregarFuegosArtificiales(pack1);

        // Invitados
        Invitado invitado = new InvitadoStandard();
        Invitado invitado1 = new InvitadoMeli();
        Invitado invitado2 = new InvitadoMeli();

        evento.agregarInvitados(invitado);
        evento.agregarInvitados(invitado1);
        evento.agregarInvitados(invitado2);

        System.out.println(evento.toString());

        System.out.println("La Chiqui sopla las velas");
        evento.apagarVelas();
    }
}
