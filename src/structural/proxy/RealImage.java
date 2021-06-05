package structural.proxy;

public class RealImage implements Image{
    private String file;
    public RealImage(String file){
        this.file = file;
        load(file);
    }
    private void load(String file){
        System.out.println("Downloading " + file);
    }

    @Override
    public void display() {
        System.out.println("Viewing " + file);
    }
}
