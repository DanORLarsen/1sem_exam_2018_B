import java.io.IOException;

public class Main {

    //Intialisere final for disse 2 strings
    public static final String SOFTWARE_VERSION = "TV2 Media Manager";
    public static final String MEDIA_MAPPE = "media/";

    public static void main(String[] args) throws IOException {
//Eksekvere Test classens static metode som hedder test.
        Test.test();

      /*  Artikel art1 = new Artikel();
        art1.setName("Julemand");
        art1.setFileName("julemand.txt");
        System.out.println(art1.getArticelText());

      Billede b1 = new Billede();
      b1.setFileName("julemand.jpg");
      b1.setName("julemand");
        System.out.println(b1.getFiletype());
        System.out.println(b1.getHeight());
        System.out.println(b1.getWidth()); */

      Video v1 = new Video();
      v1.setFileName("video1.mp4");
      v1.setName("video1");
        System.out.println(v1.getResolution());
    }
}

