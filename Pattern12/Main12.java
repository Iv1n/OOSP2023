package Pattern12;

public class Main12 {
    public static void main(String[] args){
        VideoComponent video1 = new VideoFile("v1.mp4");
        VideoComponent video2 = new VideoFile("v2.mp4");
        VideoComponent video3 = new VideoFile("aa.avi");
        VideoComponent folder1 = new VideoFolder("Folder1");
        VideoComponent folder2 = new VideoFolder("Folder2");

        ((VideoFolder) folder1).addComponent(video1);
        ((VideoFolder) folder1).addComponent(video3);
        ((VideoFolder) folder2).addComponent(video2);

        VideoComponent mainFolder = new VideoFolder("Video");
        ((VideoFolder) mainFolder).addComponent(folder1);
        ((VideoFolder) mainFolder).addComponent(folder2);
        mainFolder.play();
    }
}
