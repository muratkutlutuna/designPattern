package structuralDP.decoratorDP;

public class Iphone11 extends IphoneDecorator {

    public Iphone11(Phone basicPhone) {
        super(basicPhone);
    }
    @Override
    public String getName() {
        return super.getName()+"11";
    }
    //TODO: 1:57:07 second video of the design pattern
}
