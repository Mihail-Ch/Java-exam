package Game;

import java.io.IOException;
import java.io.FileWriter;
import java.util.List;

public class DataBase {

    private List<Toy> toys;

    public DataBase(List<Toy> toys) {
        this.toys = toys;
    }

    public Toy getToyForPrice() {
        RandomChoice randomChoice = new RandomChoice();
        Toy toy = randomChoice.chooseOnWeight(toys);
        return toy;
    }

    public void saveToy() {
        Toy toy = getToyForPrice();
        String text = toy.toPrint();
        try(FileWriter writer = new FileWriter("Toys.txt", true))
        {
            writer.write(text);
            writer.append('\n');
            writer.flush();
        }
        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        toys.remove(toy);
    }
}
