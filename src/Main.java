import java.util.List;
import java.util.ArrayList;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        List<Animal> zoo = new ArrayList<>();

        Leao leao = new Leao("leao", 5);
        Elefante elefante = new Elefante("elefante", 5);

        zoo.add(leao);
        zoo.add(elefante);

        for(Animal animal : zoo){
            animal.fazerSom();
        }

    }
}