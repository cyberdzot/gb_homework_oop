package work_06.model.impl;

import work_06.model.Reportable;
import work_06.model.User;

public class UserReporter implements Reportable<User> {
    @Override
    public void report(User user) {
        System.out.println("Report for user: " + user.getName());
    }
}

