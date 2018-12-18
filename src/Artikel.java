import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import java.io.File;
import java.util.stream.Stream;

public class Artikel extends Media {
    public Artikel() {
    }

    private String author;
    private String articelText;
    private File picture;

    public String getAuthor() {
        //Dette er meget specifikt i forhold til mit indhold, så derfor bliver det Alexander hvis det ikke er julemand artiklen.
        if(getName()=="julemand")
            author = "Beata Lux";
        else
            author = "Alexander Klemp";
        return author;
    }

//Getter metode er samtidig også min setter metode.
    public String getArticelText() throws IOException {
        StringBuilder contentBuilder = new StringBuilder();
        try (Stream<String> stream = Files.lines( Paths.get("media\\\\" + getFileName()), StandardCharsets.UTF_8))
        {
            stream.forEach(s -> contentBuilder.append(s).append("\n"));
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        articelText = contentBuilder.toString();
        return articelText;
    }

    public File getPicture() {
        return picture;
    }

    public void setPicture(File picture) {
        this.picture = picture;
    }

    @Override
    public void logToConsol() {
        System.out.println(this.getName() + " is an article");
    }
}
