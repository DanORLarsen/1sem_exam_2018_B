import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Database {
    public static void main(String[] args) throws SQLException, IOException {
        try {
            //Finder class Driver i den importede mappe (Mysql-connector-java (External Libaries))
            Class.forName("com.mysql.cj.jdbc.Driver");

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/tv2?useUnicode=true&useJDBCCompliantTimezooneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "");


        Statement statement = connection.createStatement();
//Initialisere en masse objecter og putter dem i ArrayList
        Artikel art1 = new Artikel();
        art1.setName("Julemand");
        art1.setFileName("julemand.txt");
        Artikel art2 = new Artikel();
        art2.setFileName("julekalender.txt");
        art2.setName("julekalender");
        Artikel art3 = new Artikel();
        art3.setName("mosemanden");
        art3.setFileName("mosemanden.txt");
        Billede b1 = new Billede();
        b1.setFileName("julemand.jpg");
        Billede b2 = new Billede();
        b2.setFileName("julekalender.jpg");
        Billede b3 = new Billede();
        b3.setFileName("mosemanden.jpg");

        ArrayList<Object> medias = new ArrayList<Object>();
        medias.add(art1);
        medias.add(art2);
        medias.add(art3);
        medias.add(b1);
        medias.add(b2);
        medias.add(b3);
//Her anvender jeg en masse IF statements, ville gerne kunne bruge IF = artikel, men kunne ikke få det til at fungere.
        for (int i = 0; i < medias.size(); i++) {
            if (medias.get(i) == art1)
            { String sql = "INSERT INTO `artikler` (`Navn`, `Forfatter`, `FileType`) VALUES ('"+art1.getName()+"', '"+ art1.getAuthor() +"', 'txt');";
            statement.executeUpdate(sql);}
            if (medias.get(i) == art2)
            { String sql = "INSERT INTO `artikler` (`Navn`, `Forfatter`, `FileType`) VALUES ('"+art2.getName()+"', '"+ art2.getAuthor() +"', 'txt');";
                statement.executeUpdate(sql);}
            if (medias.get(i) == art3)
            { String sql = "INSERT INTO `artikler` (`Navn`, `Forfatter`, `FileType`) VALUES ('"+art3.getName()+"', '"+ art3.getAuthor() +"', 'txt');";
                statement.executeUpdate(sql);}
            if (medias.get(i)==b1){
                String sql = "INSERT INTO `billeder` (`Navn`, `fileType`, `Width`, `Height`) VALUES ('"+b1.getName()+"', '"+b1.getFiletype()+"', '"+b1.getWidth()+"', '"+b1.getHeight()+"');";
                statement.executeUpdate(sql);
            }
            if (medias.get(i)==b2){
                String sql = "INSERT INTO `billeder` (`Navn`, `fileType`, `Width`, `Height`) VALUES ('"+b2.getName()+"', '"+b2.getFiletype()+"', '"+b2.getWidth()+"', '"+b2.getHeight()+"');";
                statement.executeUpdate(sql);
            }
            if (medias.get(i)==b3){
                String sql = "INSERT INTO `billeder` (`Navn`, `fileType`, `Width`, `Height`) VALUES ('"+b3.getName()+"', '"+b3.getFiletype()+"', '"+b3.getWidth()+"', '"+b3.getHeight()+"');";
                statement.executeUpdate(sql);
            }

        }


    }
}