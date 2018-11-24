package structural.adapter.inheritance;

import structural.adapter.RasterGraphics;
import structural.adapter.TargetGraphicsInterface;

public class AdapterInh extends RasterGraphics implements TargetGraphicsInterface {

    @Override
    public void drawLine() {
        drawRasterLine();
    }

    @Override
    public void drawSquare() {
        drawRasterSquare();
    }
}
