package mendes.nikolas.Exercicio5.model;

/**
 * @author Nikolas
 * @since 16/04/2020 . 16:35
 * @version 1.0
 */
public class Marvel {

    private String hero;
    private int age;

    public Marvel(String hero, int age) {
        this.hero = hero;
        this.age = age;
    }

    public Marvel() {

    }

    public String getHero() {
        return hero;
    }

    public void setHero(String hero) {
        this.hero = hero;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Hero Name: " + this.hero
                + "\nAge Hero: " + this.age;
    }
}
