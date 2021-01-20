package view;

import java.util.List;
//import java.util.Map;
import model.Image;

public interface ImageLoader {
    List<Image> load();
    //Map<Integer, Image> load();
}
