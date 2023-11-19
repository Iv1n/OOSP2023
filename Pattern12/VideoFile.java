package Pattern12;

public class VideoFile implements VideoComponent{
    private String name;

    public VideoFile(String name){
        this.name = name;
    }
    @Override
    public void play() {
        System.out.println("VideoPlay: " + name);
    }
}
