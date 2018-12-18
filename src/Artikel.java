import java.io.File;

public class Artikel extends Media {

    private String author;
    private String articelText;
    private File picture;

@Override
    public void logToConsol() {
        System.out.println(this.getName() + " is an article");
    }
}
