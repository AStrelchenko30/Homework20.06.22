public class User {
    public String login;
    public String password;
    public String confirmPassword;

    public User(String login, String password, String confirmPassword) {
        this.login = login;
        this.password = password;
        this.confirmPassword = confirmPassword;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    public boolean checkLogin() {
        int needCountLogin = 20;
        String pattern = "^[A-Za-z0-9+_.-]+(.+)$";
        boolean resultCheck=login.length() <= needCountLogin && login.matches(pattern);
        return resultCheck;
    }

    public boolean checkPassword() {
        int needCountPassword = 20;
        String pattern = "^[A-Za-z0-9+_.-]+(.+)$";
            boolean resultCheck=password.length() <= needCountPassword && password.matches(pattern)&&password.equals(confirmPassword);
            if(!password.equals(confirmPassword)){
                throw new WrongPasswordException(password);
            }
            return resultCheck;

    }
}
