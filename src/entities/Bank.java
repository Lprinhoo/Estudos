package entities;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Bank {

    protected static ArrayList<User> users = new ArrayList<>();
    protected static ArrayList<Integer> idList = getUsersID();

    public static ArrayList<Integer> getUsersID() {

        ArrayList<Integer> idList = users.stream().map(User::getId).collect(Collectors.toCollection(ArrayList::new));

        return idList;
    }
}
