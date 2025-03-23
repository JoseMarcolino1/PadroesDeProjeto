import classes.Evento;
import classes.Organizador;
import classes.Participante;

public class Main {
    public static void main(String[] args) {
        Organizador org = new Organizador("Carlos Silva", "carlos@email.com", "Gerente de Eventos");
        Participante part = new Participante("Mariana Souza", "mariana@email.com", "Palestrante");

        Evento evento = new Evento("Tech Conference", "12/12/2025", org);

        org.apresentar();
        part.apresentar();
        evento.iniciarEvento();
        evento.encerrarEvento();

        System.out.println("Total de eventos criados: " + Evento.getTotalEventos());
    }
}