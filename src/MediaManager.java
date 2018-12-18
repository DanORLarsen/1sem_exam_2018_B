import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class MediaManager {
    public static void main(String[] args) throws IOException {
//Denne class er brugt til at kontrollere at det jeg ville havde var det jeg fik.
        Artikel art1 = new Artikel();
        art1.setName("Julemand");
        art1.setFileName("julemand.txt");
        System.out.println(art1.getArticelText());

      Billede b1 = new Billede();
      b1.setFileName("julemand.jpg");
      b1.setName("julemand");
        System.out.println(b1.getFiletype());
        System.out.println(b1.getHeight());
        System.out.println(b1.getWidth());

        Video v1 = new Video();
        v1.setFileName("video1.mp4");
        v1.setName("video1");

        //Her udskriver jeg alle fra readMediaFolder, samt initialisere alle Artikler og Billeder. (Tilføjer video hvis det lykkes)
        for (int i = 0; i < v1.readMediaFolder("media").size() ; i++) {
            System.out.println(v1.readMediaFolder("media").get(i));
        }
    }
}
