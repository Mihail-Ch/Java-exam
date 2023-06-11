package Game;

public class Toy {

    int id;
    String title;
    double weight;

    public Toy(int id, String title, double weight) {
        this.id = id;
        this.title = title;
        this.weight = weight;
    }

    public  void  setWeight(float weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return  weight;
    }


    public  String toPrint() {
        return  "Toy [id=" + id + ", title=" + title + ", weight=" + weight + "]";
    }
}
