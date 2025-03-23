package classes;

import interfaces.Gerenciavel;

public class Evento implements Gerenciavel {
    private static int totalEventos = 0;
    private String nome;
    private String data;
    private Organizador organizador;

    public Evento(String nome, String data, Organizador organizador) {
        this.nome = nome;
        this.data = data;
        this.organizador = organizador;
        totalEventos++;
    }

    public static int getTotalEventos() { return totalEventos; }

    @Override
    public void iniciarEvento() {
        System.out.println("Evento " + nome + " iniciado!");
    }

    @Override
    public void encerrarEvento() {
        System.out.println("Evento " + nome + " encerrado!");
    }
}
