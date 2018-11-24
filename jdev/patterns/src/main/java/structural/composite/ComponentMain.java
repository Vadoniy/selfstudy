package structural.composite;

import structural.composite.items.*;

public class ComponentMain {
    public static void main(String[] args) {
        Bag toolsBag = new Bag();
        Bag privateBag = new Bag();
        Bag suitcase = new Bag();

        toolsBag.addItem(new Cables());
        toolsBag.addItem(new Multimeter());
        toolsBag.addItem(new Tools());

        privateBag.addItem(new Suit());
        privateBag.addItem(new Boots());
        privateBag.addItem(new Shirt());

        suitcase.addItem(toolsBag);
        suitcase.addItem(privateBag);

        suitcase.operation();
    }
}
