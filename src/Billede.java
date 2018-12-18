public class Billede extends Media {
    //Beskære fileName for at få de sidste 3 bogstaver, da alle typerne er på 3 bogstaver
    private String filetype = this.getFileName().substring(this.getFileName().length()-3);
    private int width;
    private int height;
    private String photographer;

    public String getFiletype() {
        return filetype;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getPhotographer() {
        return photographer;
    }

    public void setPhotographer(String photographer) {
        this.photographer = photographer;
    }

    @Override
    public void logToConsol() {
        //Kan nemt laves om for at få JPG eller hvad den er.
        System.out.println(this.getName() + " is a picture");
    }
}
