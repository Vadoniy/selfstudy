package structural.adapter.composition;

import structural.adapter.RasterGraphics;
import structural.adapter.TargetGraphicsInterface;

public class AdapterComp implements TargetGraphicsInterface {

    RasterGraphics rg;

    public AdapterComp(RasterGraphics rg){
        this.rg = rg;
    }

    @Override
    public void drawLine() {
        rg.drawRasterLine();
    }

    @Override
    public void drawSquare() {
        rg.drawRasterSquare();
    }
}
