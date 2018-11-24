package structural.composite.items;

import structural.composite.*;

public class Shirt implements Component {

    @Override
    public void operation() {
        System.out.println("Shirt");
    }
}
