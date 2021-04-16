package fa.training.lambdademo;

import fa.training.model.User;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortingLambdaExample {
    /**
     * Get users
     *
     * @return a list of user
     */
    private static List<User> getUsers() {
        List<User> users = new ArrayList<>();
        users.add(new User("Peter", 5000, 33));
        users.add(new User("Mary", 2000, 20));
        users.add(new User("John", 1500, 10));
        users.add(new User("Ivan", 2300, 55));
        return users;
    }

    /**
     * Sort data and display user info
     */
    public void showUserInfoSortByName() {
        List<User> users = getUsers();
        System.out.println("Before Sort");
        for (User user : users) {
            System.out.println(user);
        }

        System.out.println("After Sort");
        //Sort by age
        //users.sort((User user1, User user2) -> user1.getAge() - user2.getAge());
        System.out.println("Sort by name");
        users.sort((user1, user2) -> user1.getName().compareTo(user2.getName()));
        //display data
        users.forEach(System.out::println);
    }

    /**
     * Sort data by salary
     */
    public void showUserInfoSortBySalary(){
        List<User> users = getUsers();
        System.out.println("Before Sort");
        for (User user : users) {
            System.out.println(user);
        }

        System.out.println("After Sort");
        //Sort by salary
        Comparator<User> salaryComparator = ((o1, o2) ->
                (int) (o1.getSalary() - o2.getSalary()));
        users.sort(salaryComparator);
        //display data
        System.out.println("Sort by salary");
        users.forEach(System.out::println);
    }

    /**
     * Sort data by salary and reverse order
     */
    public void showUserInfoSortBySalaryReverse(){
        List<User> users = getUsers();
        System.out.println("Before Sort");
        for (User user : users) {
            System.out.println(user);
        }

        System.out.println("After Sort");
        //Sort by salary
        Comparator<User> salaryComparator = ((o1, o2) ->
                (int) (o1.getSalary() - o2.getSalary()));
        users.sort(salaryComparator.reversed());
        //display data
        System.out.println("Sort by salary, reverse order");
        users.forEach(System.out::println);
    }
}
