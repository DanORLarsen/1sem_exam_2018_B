public class Billede extends Media {

    private String filetype;
    private int width;
    private int height;
    private String photographer;

    @Override
    public void logToConsol() {
        //Kan nemt laves om for at få JPG eller hvad den er.
        System.out.println(this.getName() + " is a picture");
    }
}
