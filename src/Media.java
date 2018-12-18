import java.io.File;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;

public class Media {

    //Starter med nogle forskellige privates, som får oprettet getters n setters.
    private int assetId;
    private String name;
    private Date created = new Date();
    private String fileName;

//No arg constructor, denne constructor giver Media objectet et assetID og en dato for skabelsen af objectet.
    public Media() {
        assetId = MediaID.generate();
        created = Date.from(Instant.now());
    }

    public int getAssetId() {
        return assetId;
    }

    public void setAssetId(int assetId) {
        this.assetId = assetId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public void logToConsol() {
        System.out.println(this.name + " is a Media");
    }

    public void logMediaFolder(String folderNavn) {
        File folder = new File(folderNavn+"\\\\\\\\");
        File[] fileList = folder.listFiles();
        for (int i = 0; i < fileList.length ; i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(fileList[i]);
            sb.delete(0,6);
            //Så skriver den ikke media\ foran alle sammen.
            System.out.println(sb);
        }
    }

    public ArrayList readMediaFolder(String folderNavn) {
        int billedeCount = 0;
        int artikelCount = 0;
        File folder = new File(folderNavn + "\\\\\\\\");
        ArrayList fileArray = new ArrayList();
        File[] fileList = folder.listFiles();
        for (int i = 0; i < fileList.length; i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(fileList[i]);
            sb.delete(0,6);
            fileArray.add(sb.toString());
            String navn = sb.toString();
            sb.delete(0,sb.length()-3);
            if (sb.toString().equalsIgnoreCase("jpg")){
                if (billedeCount == 0) {
                    Billede b5 = new Billede();
                    b5.setFileName(navn);
                    billedeCount++;
                }
                if (billedeCount == 1){
                    Billede b6 = new Billede();
                    b6.setFileName(navn);
                    billedeCount++;
                 }
                 if (billedeCount == 2) {
                     Billede b7 = new Billede();
                     b7.setFileName(navn);
                 }
            }
            if (sb.toString().equalsIgnoreCase("txt")){
                if (artikelCount == 0){
                    Artikel a5 = new Artikel();
                    a5.setFileName(navn);
                    artikelCount++;
                }
                if (artikelCount == 1){
                    Artikel a6 = new Artikel();
                    a6.setFileName(navn);
                    artikelCount++;
                }
                if (artikelCount == 2){
                    Artikel a7 = new Artikel();
                    a7.setFileName(navn);
                }
            }
        }
        return fileArray;
    }
    //Override object classens to string metode, med selv lavet metode.
    @Override
    public String toString() {
        return "Media{" +
                "assetId=" + assetId +
                ", name='" + name + '\'' +
                ", created=" + created +
                ", fileName='" + fileName + '\'' +
                '}';
    }
}