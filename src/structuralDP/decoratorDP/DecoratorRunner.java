package structuralDP.decoratorDP;

public class DecoratorRunner {
    public static void main(String[] args) {
        Phone iphone11ProMax = new Iphone11ProMax(new Iphone());
        System.out.println("name: " + iphone11ProMax.getName());
        System.out.println("Number of camera : " + iphone11ProMax.cameraCount());
        System.out.println("Price : " + iphone11ProMax.getPrice());

    }
}
