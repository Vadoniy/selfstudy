package fundamental.delegate;

public class Museum {

    private Exhibition exhibition;

    public void holdAnExhibition(){
        if (exhibition != null){
            exhibition.holdAnExhibition();
        } else {
            System.out.println("Exhibition is not ready");
        }
    }

    public void setExhibition(Exhibition exhibition) {
        this.exhibition = exhibition;
    }
}
