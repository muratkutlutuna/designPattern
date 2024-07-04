package structuralDP.compositeDP;

import java.util.List;
import java.util.stream.Collectors;

public class HRDepartment extends Department{

    //We want to reach out all child classes using field
    List<Department>childDepartments;

    //constructor
    public HRDepartment(List<Department> childDepartments) {
        this.childDepartments = childDepartments;
    }

    //return names of child departments
    @Override
    String getName() {
        return childDepartments.stream() //List(Sales, Finance)
                .map(Department::getName) //List("Sales", "Finance")
                .collect(Collectors.joining(", ")); //"Sales, Finance"
    }

    @Override
    List<String> getEmployee() {
        return childDepartments.stream()
                //flatMap() = map()+flatten
                //flatMap() applies a function that returns a stream and flattens
                //the resulting streams into single stream
                .flatMap(d->d.getEmployee().stream())
                .collect(Collectors.toList());
    }
}
