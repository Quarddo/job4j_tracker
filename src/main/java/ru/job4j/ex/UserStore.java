package ru.job4j.ex;

public class UserStore {

    public static User findUser(User[] users, String login) throws UserNotFoundException {
        for (User user : users) {
            if (login.equals(user.getUsername())) {
                return user;
            }
        }
        throw new UserNotFoundException("Пользователь не найден");
    }

    public static boolean validate(User user) throws UserInvalidException {
        if (!user.isValid() || (user.getUsername().length() < 3)) {
            throw new UserInvalidException("Пользователь не действителен");
        }
        return false;
    }

    public static void main(String[] args) {
        User[] users = {
                new User("Maksim Teriushov", true)
        };
        try {
            User user = findUser(users, "Maksim Teriushov");
            if (validate(user)) {
                System.out.println("This user has an access");
            }
        } catch (UserInvalidException ui) {
            ui.printStackTrace();
        } catch (UserNotFoundException un) {
            un.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}