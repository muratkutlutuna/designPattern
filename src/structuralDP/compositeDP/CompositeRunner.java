package structuralDP.compositeDP;

import java.util.Arrays;

public class CompositeRunner {
    public static void main(String[] args) {
        CompositeRunner runner = new CompositeRunner();
        runner.compositeDemo();
    }

    public void compositeDemo(){
        Department financeDepartment = new Finance();
        Department salesDepartment = new Sales();
        Department rndDepartment = new RnD();
        Department hrDepartment = new HRDepartment(Arrays.asList(salesDepartment,financeDepartment,rndDepartment));

        System.out.println(hrDepartment.getName());
        System.out.println("****************************");
        System.out.println(hrDepartment.getEmployee());
    }
}
