public class Main {
    public static void main(String[] args) {
        Human czlek = new Human(1992, new Car("ferrari", "192", 2000));
        Car fiat1 = new Car("Fiat", "fiat1", 150.0);
        Car fiat2 = new Car("Fiat", "fiat1", 300.0);

        // Zadanie 3 i 4
        // Sprawdzenie czy wypisuje date poprzedniego pobrania wyplaty
        czlek.setSalary(200.0);
        czlek.getSalary();
        czlek.getSalary();
        System.out.println();

        // Zadanie 5
        // Kupno auta
        czlek.setCar(fiat2);
        czlek.setCar(fiat1);
        System.out.println();

        // Zadania zrobione na cwiczeniach
        // Sprawdzenie czy funkcje w klasie Animal dzialaja
        Animal dog = new Animal("canis");
        dog.feed();
        dog.takeForAWalk();
        for (int i = 0; i < 13; i++) {
            dog.takeForAWalk();
        }

    }
}