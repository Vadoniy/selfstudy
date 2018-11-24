package fundamental.delegate.exhibitionTypes;

import fundamental.delegate.Museum;

public class DelegateMain {

    public static void main(String[] args) {
        Museum museum = new Museum();

        museum.holdAnExhibition();

        museum.setExhibition(new PhotoEx());
        museum.holdAnExhibition();

        museum.setExhibition(new ModernArtEx());
        museum.holdAnExhibition();

        museum.setExhibition(new HistoricalEx());
        museum.holdAnExhibition();
    }
}
