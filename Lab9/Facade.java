import java.io.File;

public class Facade {
    public File convertVideo(String file_name, String extension) {
        System.out.println("Conversion started.");
        VideoFile file = new VideoFile(file_name);
        Codec origin_codec = CodecFactory.extract(file);
        Codec destination_codec;
        
        if (extension.equals("mp4")) {
            destination_codec = new MPEG4Codec();
        } 
        
        else {
            destination_codec = new AVICodec();
        }
        
        VideoFile buffer = BitrateReader.read(file, origin_codec);
        VideoFile middleResult = BitrateReader.convert(buffer, destination_codec);
        File result = (new FixAudio()).fix(middleResult);
        System.out.println("Conversion completed.");
        return result;
    }
}