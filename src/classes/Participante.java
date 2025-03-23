package classes;

class Participante extends Pessoa {
    private String categoria;

    public Participante(String nome, String email, String categoria) {
        super(nome, email);
        this.categoria = categoria;
    }

    @Override
    public void apresentar() {
        System.out.println("Sou um participante: " + nome + ", Categoria: " + categoria);
    }
}