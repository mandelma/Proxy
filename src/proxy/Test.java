package proxy;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Image image1 = new ProxyImage("HiRes_10MB_Photo1", "jpg", "200x200");
        Image image2 = new ProxyImage("HiRes_10MB_Photo2", "png", "400x600");
        Image image3 = new ProxyImage("HiRes_10MB_Photo3", "jpg", "1000x1200");
        Image image4 = new ProxyImage("HiRes_10MB_Photo4", "jpg", "300x300");
        Image image5 = new ProxyImage("HiRes_10MB_Photo5", "jpg", "500x100");

        List<Image> imageList = new ArrayList<>();

        imageList.add(image1);
        imageList.add(image2);
        imageList.add(image3);
        imageList.add(image4);
        imageList.add(image5);

        for(Image img : imageList) {
            System.out.println(img.showData());
        }

    }
}
