package work_06.model.impl;

import work_06.model.User;

public class UserSaver {
    public static void save(User user) {
        System.out.println("Save user: " + user.getName());
    }
}
