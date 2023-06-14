public class CodecFactory {
    public static Codec extract(VideoFile file) {
        String type = file.getCodecType();
        if (type.equals("mp4")) {
            System.out.println("Extracting mpeg audio...");
            return new MPEG4Codec();
        }
        else {
            System.out.println("Extracting avi audio...");
            return new AVICodec();
        }
    }
}