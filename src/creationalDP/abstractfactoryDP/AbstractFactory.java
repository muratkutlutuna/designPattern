package creationalDP.abstractfactoryDP;

/**
 * When to use Abstract Factory DP?
 * The client should be independent of how objects are created and for which class object is created. This is helpful when
 * an object needs to be created from a family of classes
 *
 * Example: If there's a medical representative and I am the customer. I ask that medical representative about the
 * medicines for fever and cold problems. Based on the requirements, it will try to choose the "Light Fever"
 * factory or "Heavy Fever" factory. The "Light Fever" factory will return the appropriate medicine, in this case.
 */
public abstract class AbstractFactory {
    abstract Shape getShape(String shapeType);

    abstract Color getColor(String colorType);
}
