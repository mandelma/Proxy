package proxy;

public class ProxyImage implements Image {
    private final String filename;
    private final String filetype;
    private final String filesize;
    private RealImage image;

    public ProxyImage(String filename, String type, String size) {
        this.filename = filename;
        this.filetype = type;
        this.filesize = size;
    }

    @Override
    public void displayImage() {
        if (image == null) {
            image = new RealImage(filename);
        }
        image.displayImage();
    }

    @Override
    public String showData() {
        if (image == null) {
            image = new RealImage(filename);
        }
        image.showData();
        return "Filename: " + filename + ", Type: " + filetype + ", Size: " + filesize;
    }
}
