public class Toys {

    private int id;
    private String name;
    private int quantity;
    private double frequencyOfDrawing;

    Randomizer randomizer = new Randomizer();

    public Toys(int id, String name) {
        new Toys(id, name, randomizer.getRandomFrequencyOfDrawing());
    }

    public Toys(int id, String name, double frequencyOfDrawing) {
        new Toys(id, name, 5, frequencyOfDrawing);
    }

    public Toys(int id, String name, int quantity, double frequencyOfDrawing) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.frequencyOfDrawing = frequencyOfDrawing;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getFrequencyOfDrawing() {
        return frequencyOfDrawing;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void changeFrequency(byte frequency) {
        this.frequencyOfDrawing = frequency;
    }

    @Override
    public String toString() {
        return "Your toy is " + name + '}';
    }
}

