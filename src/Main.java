import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Toys toy1 = new Toys(1, "Doll", 2, 2.0);
        Toys toy2 = new Toys(2, "Bunny", 3, 26.0);
        Toys toy3 = new Toys(3, "Teddy", 1, 3.0);

        List<Toys> listOfToys = new ArrayList<>();
        listOfToys.add(toy1);
        listOfToys.add(toy2);
        listOfToys.add(toy3);

        Draw draw = new Draw();
        List<Toys> toys1 = draw.addNewToy(listOfToys);
        System.out.println(toys1);

        draw.startDrawing(toys1);
    }
}
