package behavirolDP.chainOfResponsibilityDP;

import java.util.Arrays;

public abstract class Approver {
    Approver chief;

    //when we create bj we need to set the manager of class
    public Approver(Approver chief) {
        this.chief = chief;
    }

    abstract boolean approveLoan(int amount);
}
