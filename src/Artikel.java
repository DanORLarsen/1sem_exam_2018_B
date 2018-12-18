import java.io.File;

public class Artikel extends Media {
    public Artikel() {
    }

    private String author;
    private String articelText;
    private File picture;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getArticelText() {
        return articelText;
    }

    public void setArticelText(String articelText) {
        this.articelText = articelText;
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
