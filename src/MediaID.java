import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


/**
 *  Hver mediefil hos TV2 skal have et unikt ID, og denne klasse hjælper med at genrere unikke ID'er
 */
public class MediaID {
    //Giver latestID værdien 100. (Bliver 1 højere for hvergang metoden bliver brugt)
    private static int latestId = 100;


    public static int generate() {

        File file = new File("media_id.txt");

        // Låser filen op før adgang
        // file.setWritable(true);

        try {


            //Hvis filen exisitere laver den en filereader, samt en scanner og giver den det næste kommende int
            if (file.exists()) {
                FileReader fileReader = new FileReader(file);
                Scanner scanner = new Scanner(file);
                latestId = (int) scanner.nextInt();
            }

            //Incrementer latest id, så den får en højere hver gang. og nu får latestID en værdi, som i første omgang er 101.
            latestId++;

            //Her åbnes filen så den kan skrives i, og der bliver sat lastID ind.
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write(Integer.toString(latestId));
            fileWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        // Låser filen ned for at den ikke redigeres ved en fejl
        // file.setReadOnly();

        //Så generate får dannet et nyt ID til filen.
        return latestId;
    }

}