import java.util.ArrayList;
import java.util.List;


public class Draw implements Giftable {

    public List<Toys> addNewToy(List<Toys> toys) {
        List<Toys> addedToys = new ArrayList<>();
        for (Toys toy : toys) {
            while (toy.getQuantity() > 0) {
                addedToys.add(toy);
                toy.setQuantity(toy.getQuantity() - 1);
            }
        }
        return addedToys;
    }

    public void startDrawing(List<Toys> toys) {
        System.out.println("Attention! We're starting a toy giveaway!");
        Toys toy = chooseToy(toys);
        FileManager.writeFile(Constants.GIFTABLE_TOYS, toy.toString());
        toys.remove(toy);
        stopDrawing();
    }

    private void stopDrawing() {
        System.out.println("The toy giveaway is over. Take your prize.");
    }

    @Override
    public Toys chooseToy(List<Toys> toys) {
        Toys randomToy = null;
        if (!toys.isEmpty()) {
            Randomizer randomizer = new Randomizer();
            randomToy = randomizer.chooseOnWeight(toys);

        } else {
            System.out.println("All the toys are drawn");
            return null;
        }
        return randomToy;
    }
}


