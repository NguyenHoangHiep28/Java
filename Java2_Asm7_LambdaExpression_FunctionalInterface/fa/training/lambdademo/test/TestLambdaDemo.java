package fa.training.lambdademo.test;

import fa.training.lambdademo.FunctionalInterfaceExample;
import fa.training.lambdademo.SortingLambdaExample;

public class TestLambdaDemo {
    public static void main(String[] args) {
        SortingLambdaExample sortLambda = new SortingLambdaExample();
        FunctionalInterfaceExample funcIterface = new FunctionalInterfaceExample();
        sortLambda.showUserInfoSortByName();
        sortLambda.showUserInfoSortBySalary();
        sortLambda.showUserInfoSortBySalaryReverse();
        funcIterface.calculateSquare();
    }
}
