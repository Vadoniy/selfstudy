package fundamental.delegate.exhibitionTypes;

import fundamental.delegate.Exhibition;

/**
 * Created by Vadoniy on 11.11.2018.
 */
public class HistoricalEx implements Exhibition {
    @Override
    public void holdAnExhibition() {
        System.out.println("Exhibition of history of NAME_PAERIOD");
    }
}
