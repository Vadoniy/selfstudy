package structural.composite.items;

import structural.composite.*;

public class Suit implements Component {
    @Override
    public void operation() {
        System.out.println("Suit");
    }
}
