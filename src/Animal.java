import java.sql.SQLOutput;
import java.util.Objects;

public class Animal {
    private static final Double DEFAULT_DOG_WEIGHT = 10.5;
    private static final Double DEFAULT_CAT_WEIGHT = 4.0;
    private static final Double DEFAULT_ELEPHANT_WEIGHT = 700.0;
    private static final Double DEFAULT_ANIMAL_WEIGHT = 1.0;
    final String species;
    String name;
    Boolean isAlive;
    private Double weight;

    public String toString(){
        return "Name: " + name + " Species: " + species + " Weight: " + weight;
    }

    public Animal(String species){
        this.isAlive = true;
        this.species = species;
        switch (species) {
            case "canis" : this.weight = DEFAULT_DOG_WEIGHT; break;
            case "felis" : this.weight = DEFAULT_CAT_WEIGHT; break;
            case "elephant" : this.weight = DEFAULT_ELEPHANT_WEIGHT; break;
            default : this.weight = DEFAULT_ANIMAL_WEIGHT;
        }

    }
    public void feed(){
        if(this.isAlive == false){
            System.out.println("It can't eat because it is not alive");
            return;
        }
        this.weight += 1.0;
    }
    public void takeForAWalk(){
        if(this.isAlive == false){
            System.out.println("You can't take a dead animal for a walk");
            return;
        }
        this.weight -= 1.0;
        if(this.weight <= 0){
            this.isAlive = false;
            System.out.println("Your pet died because you didn't feed him enough");
        }


    }

    public Double getWeight(){
        return this.weight;
    }
}
