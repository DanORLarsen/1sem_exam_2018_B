import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;

public class Video extends Media{
    //Beskære fileName for at få de sidste 3 bogstaver, da alle typerne er på 3 bogstaver
private String filetype;
private String resolution;
private long lenght;
private String photographer;
//getResolution samt lenght virker ikke som forventet.
    public String getFiletype() {
        filetype = this.getFileName().substring(this.getFileName().length()-3);
        return filetype;
    }

    public String getResolution() throws IOException {
        BufferedImage bimg = (BufferedImage) ImageIO.read(new File("media\\\\" + getFileName()));
        resolution = bimg.getWidth() + "x" + bimg.getHeight();
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public long getLenght() {
        File file = new File("media\\\\" + getFileName());
        this.lenght = file.length();
        return lenght;
    }

    public String getPhotographer() {
        photographer = "ukendt";
        return photographer;
    }


    @Override
    public void logToConsol() {
        //Kan nemt laves om til Filetype for at få Mp4 eller hvad det er.
        System.out.println(this.getName() + " is a video");
    }

}
