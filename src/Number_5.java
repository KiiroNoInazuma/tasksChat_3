public class Number_5 {
    static final String fullName = "Ivanov Ivan Ivanovich";

    public static void main(String[] args) {
        String lastName = fullName.substring(0, fullName.indexOf(' '));
        String firstName = fullName.substring(fullName.indexOf(' '), fullName.lastIndexOf(' '));
        String middleName = fullName.substring(fullName.lastIndexOf(' '));
        System.out.println("Имя сотрудника - " + firstName);
        System.out.println("Фамилия сотрудника - " + lastName);
        System.out.println("Отчество сотрудника - " + middleName);


    }
}
