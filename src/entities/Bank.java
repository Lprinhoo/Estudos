package entities;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Bank {

    public static ArrayList<User> users = new ArrayList<>();
    public static ArrayList<Integer> idList = getUsersID();

    public static ArrayList<Integer> getUsersID() {

        ArrayList<Integer> idList = users.stream().map(User::getId).collect(Collectors.toCollection(ArrayList::new));

        return idList;
    }
}
