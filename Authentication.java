public interface Authentication
{
    boolean login(String username, String password);
    void logout();
    boolean resetPassword(String username, String oldPassword, String newPassword);
}
class UserAuthentication implements Authentication
{
    @Override
    public boolean login(String username, String password)
    {
        System.out.println("Zalogowano uzytkownika: " + username);
        return true;
    }
    @Override
    public void logout()
    {
        System.out.println("Wylogowano użytkownika.");
    }
    @Override
    public boolean resetPassword(String username, String oldPassword, String newPassword)
    {
        System.out.println("Zresetowano haslo uzytkownika: " + username);
        return true;
    }
}
class  AdminAuthentication implements Authentication
{
    @Override
    public boolean login(String username, String password)
    {
        System.out.println("zalogowano admina" + username);
        return true;
    }
    @Override
    public void logout()
    {
        System.out.println("Wylogowano admina");
    }
    @Override
    public boolean resetPassword(String username, String oldPassword, String newPassword)
    {
        System.out.println("Zresetowano haslo admina" + username);
        return true;
    }
}
