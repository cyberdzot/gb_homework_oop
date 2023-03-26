package work_06;

import work_06.model.User;
import work_06.model.impl.UserSaver;

public class Main {
    public static void main(String[] args) {
        runProgram();
    }

    private static void runProgram() {
        User user = new User("Bob");
        user.report();
        UserSaver.save(user);
    }
}