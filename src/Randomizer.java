import java.util.*;

public class Randomizer {
    public Toys chooseOnWeight(List<Toys> toys) {
        double weight = 0.0;
        double completeWeight = 0.0;
        Toys myToy = null;

        for (Toys toy : toys)
            completeWeight += toy.getFrequencyOfDrawing();

        Map<Toys, Double> mapOfToys = new HashMap<>();
        for (Toys toy : toys) {
            weight = toy.getFrequencyOfDrawing() * 100 / completeWeight;
            mapOfToys.put(toy, weight);
            weight = 0.0;
        }
        Double maxValueInMap = ((Collections.max(mapOfToys.values())));

        for (Map.Entry<Toys, Double> entry : mapOfToys.entrySet()) {
            if (entry.getValue().equals(maxValueInMap)) {
                myToy = entry.getKey();
            }
        }
        return myToy;
    }

    public double getRandomFrequencyOfDrawing() {
        return Math.random() * 100;
    }
}


