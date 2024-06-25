package structuralDP.proxyDP;

public class ProxyRunners {
    public static void main(String[] args) {
        ImageGenerator proxyImage1 = new ImageProxyClass("c//image1.png");
        ImageGenerator proxyImage2 = new ImageProxyClass("C//image2.png");
        proxyImage1.showImageName();
        proxyImage2.showImageName();

    }
}
