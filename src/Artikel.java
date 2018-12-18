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
        if(getName().equalsIgnoreCase("julemand"))
            author = "Beata Lux";
        else
            author = "Alexander Klemp";
        return author;
    }

//Getter metode er samtidig også min setter metode.
    public String getArticelText() throws IOException {
        StringBuilder text = new StringBuilder();
        try (Stream<String> stream = Files.lines( Paths.get("media\\\\" + getFileName()), StandardCharsets.UTF_8))
        {
            stream.forEach(s -> text.append(s).append("\n"));
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        articelText = text.toString();
        return articelText;
    }

    public File getPicture() {
        picture = new File("media\\\\\\\\"+ getName() +"jpg");
        return picture;
    }


    @Override
    public void logToConsol() {
        System.out.println(this.getName() + " is an article");
    }
}
