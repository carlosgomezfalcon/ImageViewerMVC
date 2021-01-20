package app.mock;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import model.Image;
import view.ImageLoader;

public class MockImageLoader implements ImageLoader {
/*
    @Override
    public Map<Integer, Image> load() {
        Map<Integer, Image> map = new HashMap<>();
        map.put(0,new Image("hola"));
        map.put(1,new Image("mundo"));
        map.put(2,new Image("bienvenido"));
        return map;
    }
*/
    
    @Override
    public List<Image> load() {
        List<Image> list = new ArrayList<>();
        list.add(new Image("hola"));
        list.add(new Image("mundo"));
        list.add(new Image("bienvenido"));
        return list;
    }
    
    
}
