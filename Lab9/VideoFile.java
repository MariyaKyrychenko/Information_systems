public class VideoFile {
    private String name;
    private String codec_type;

    public VideoFile(String name) {
        this.name = name;
        this.codec_type = name.substring(name.indexOf(".") + 1);
    }

    public String getCodecType() {
        return codec_type;
    }

    public String getName() {
        return name;
    }
}