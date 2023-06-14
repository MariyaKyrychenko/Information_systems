import java.io.File;

public class Main {
    public static void main(String[] args) {
        Facade converter = new Facade();
        File mp4Video = converter.convertVideo("video.avi", "mp4");
    }
}