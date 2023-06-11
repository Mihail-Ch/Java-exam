package Game;

import java.util.ArrayList;
import java.util.List;

public class Program {

    public static void main(String[] args) {

        Toy toy1 = new Toy(0, "Doll", 12);
        Toy toy2 = new Toy(1, "Car", 35);
        Toy toy3 = new Toy(2, "Robot", 40);

        List<Toy> toys = new ArrayList<Toy>();
        toys.add(toy1);
        toys.add(toy2);
        toys.add(toy3);

        DataBase dataBase = new DataBase(toys);
        dataBase.saveToy();
        dataBase.saveToy();
        dataBase.saveToy();

    }


}
