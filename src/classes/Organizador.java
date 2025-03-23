package classes;

public class Organizador extends Pessoa {
    private String cargo;

    public Organizador(String nome, String email, String cargo) {
        super(nome, email);
        this.cargo = cargo;
    }

    @Override
    public void apresentar() {
        System.out.println("Sou um organizador: " + nome + ", Cargo: " + cargo);
    }
}