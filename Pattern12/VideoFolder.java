package Pattern12;

import java.util.ArrayList;
import java.util.List;

public class VideoFolder implements VideoComponent{
    private  String name;
    private List<VideoComponent> components = new ArrayList<>();

    public VideoFolder(String name){
        this.name = name;
    }
    public void addComponent(VideoComponent component){
        components.add(component);

    }
    @Override
    public void play() {
        System.out.println("Open Folder: " + name);
        for (VideoComponent component : components){
            component.play();
        }
    }
}
