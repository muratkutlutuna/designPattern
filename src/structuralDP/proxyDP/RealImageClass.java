package structuralDP.proxyDP;

public class RealImageClass implements ImageGenerator{

    private String fullPath;

    //Constructor


    public RealImageClass(String fullPath) {
        this.fullPath = fullPath;
    }

    @Override
    public void showImageName() {
        System.out.println("Image name displayed ... "+fullPath);
    }

    public void loadImage(){
        System.out.println("image is loading");
    }

    public void changeImage(){
        System.out.println("image is changed");
    }

}
