package classes;

abstract class Pessoa {
    protected String nome;
    protected String email;

    public Pessoa(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public abstract void apresentar();

    public String getNome() { return nome; }
    public String getEmail() { return email; }
}