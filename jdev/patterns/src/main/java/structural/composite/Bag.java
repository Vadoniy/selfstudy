package structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Bag implements Component {

    private List<Component> components = new ArrayList<>();

    @Override
    public void operation() {
        for (Component c : components){
            c.operation();
        }
    }

    public void addItem(Component c){
        components.add(c);
    }

    public void removeItem(Component c){
        components.remove(c);
    }
}
