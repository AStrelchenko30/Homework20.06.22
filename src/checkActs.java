public class checkActs extends User {

    public checkActs(String login, String password, String confirmPassword) {
        super(login, password, confirmPassword);
    }

    public static boolean checkLogin(User user) {
        try {
            return user.checkLogin();
        } catch (WrongLoginException e) {
            return user.checkLogin();
        }
    }

    public static boolean checkPassword(User user) {
        try {
            return user.checkPassword();
        } catch (WrongPasswordException e) {
            return user.checkPassword();
        }
    }
}

