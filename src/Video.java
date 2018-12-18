public class Video extends Media{

private String filetype;
private String resolution;
private int lenght;
private String photographer;

    @Override
    public void logToConsol() {
        //Kan nemt laves om til Filetype for at få Mp4 eller hvad det er.
        System.out.println(this.getName() + " is a video");
    }

}
