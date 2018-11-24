package fundamental.delegate.exhibitionTypes;

import fundamental.delegate.Exhibition;

public class ModernArtEx implements Exhibition {
    @Override
    public void holdAnExhibition() {
        System.out.println("Exhibition of modern art");
    }
}
