package mendes.nikolas.Exercicio4.model;

/**
 * @author nikolas
 * @since 16/04/2020 . 16:32
 * @version 1.0
 */
public class Games {

    private String name;
    private double cost;

    public Games(String name, double cost) {
        this.name = name;
        this.cost = cost;
    }

    public Games() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Nome: " + this.name
                + "\nCost: $" + this.cost;
    }
}
