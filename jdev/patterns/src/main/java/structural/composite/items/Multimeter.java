package structural.composite.items;

import structural.composite.*;

public class Multimeter implements Component {
    @Override
    public void operation() {
        System.out.println("Multimeter");
    }
}
