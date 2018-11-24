package fundamental.delegate.exhibitionTypes;

import fundamental.delegate.Exhibition;

public class PhotoEx implements Exhibition {

    @Override
    public void holdAnExhibition() {
        System.out.println("Exhibition of photos");
    }
}
