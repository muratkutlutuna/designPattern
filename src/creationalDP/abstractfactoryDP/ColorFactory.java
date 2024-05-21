package creationalDP.abstractfactoryDP;

public class ColorFactory extends AbstractFactory{
    @Override
    Shape getShape(String shapeType) {
        return null;
    }

    public Color getColor(String colorType) {
        if (colorType == null) {
            return null;
        }
        if (colorType.equalsIgnoreCase("Red")) {
            return new Red();
        } else if (colorType.equalsIgnoreCase("Green")) {
            return new Green();
        } else if (colorType.equalsIgnoreCase("Blue")) {
            return new Blue();
        }
        return null;
    }
}
