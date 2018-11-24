package structural.adapter;

import structural.adapter.composition.AdapterComp;
import structural.adapter.inheritance.AdapterInh;

public class AdapterMain {
    public static void main(String[] args) {
        Client client = new Client();

        client.request(new AdapterComp(new RasterGraphics()));

        client.request(new AdapterInh());
    }
}
