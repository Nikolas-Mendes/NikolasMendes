package mendes.nikolas.Exercicio3tarde.model;

public class Animal {

    private String nome;

    public Animal(String nome) {
        this.nome = nome;
    }

    public Animal() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Animal: " + this.nome;
    }
}
