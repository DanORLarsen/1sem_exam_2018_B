public class Video extends Media{
    //Beskære fileName for at få de sidste 3 bogstaver, da alle typerne er på 3 bogstaver
private String filetype;
private String resolution;
private int lenght;
private String photographer;

    public String getFiletype() {
        filetype = this.getFileName().substring(this.getFileName().length()-3);
        return filetype;
    }

    public void setFiletype(String filetype) {
        this.filetype = filetype;
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public int getLenght() {
        return lenght;
    }

    public void setLenght(int lenght) {
        this.lenght = lenght;
    }

    public String getPhotographer() {
        return photographer;
    }

    public void setPhotographer(String photographer) {
        this.photographer = photographer;
    }

    @Override
    public void logToConsol() {
        //Kan nemt laves om til Filetype for at få Mp4 eller hvad det er.
        System.out.println(this.getName() + " is a video");
    }

}
