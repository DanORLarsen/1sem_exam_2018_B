import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

import static java.nio.charset.StandardCharsets.UTF_8;

public class Billede extends Media {
    //Beskære fileName for at få de sidste 3 bogstaver, da alle typerne er på 3 bogstaver
    private String filetype;
    private int width;
    private int height;
    private String photographer;

    public String getFiletype() {
        filetype = this.getFileName().substring(this.getFileName().length()-3);
        return filetype;
    }

    public int getWidth() throws IOException {
        BufferedImage bimg = (BufferedImage) ImageIO.read(new File("media\\\\" + getFileName()));
        width = bimg.getWidth();
        return width;
    }

    public int getHeight() throws IOException {
        BufferedImage bimg = (BufferedImage) ImageIO.read(new File("media\\\\" + getFileName()));
        height = bimg.getHeight();
        return height;
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
