package structural.adapter;

public class Client {

    void request(TargetGraphicsInterface graphicsInterface){
        graphicsInterface.drawLine();
        graphicsInterface.drawSquare();
    }
}
