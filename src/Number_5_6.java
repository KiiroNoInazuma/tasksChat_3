public class Number_5_6 {
    static final String fullName = "ivanov ivan ivanovich";

    public static void main(String[] args) {
        String lastName = fullName.substring(0, fullName.indexOf(' ')).replace(" ", "");
        String firstName = fullName.substring(fullName.indexOf(' '), fullName.lastIndexOf(' ')).replace(" ", "");
        String middleName = fullName.substring(fullName.lastIndexOf(' ')).replace(" ", "");
        System.out.println("Имя сотрудника - " + firstName);
        System.out.println("Фамилия сотрудника - " + lastName);
        System.out.println("Отчество сотрудника - " + middleName);

        /*---------------------------------------------------------------------------------------------------------------------------*/

        String text = "Верное написание Ф.И.О. сотрудника с заглавных букв - ";

        char[] correctFullName = fullName.toCharArray();
        for (int i = 0; i < correctFullName.length; i++) {
            if (i == 0 || i == fullName.indexOf(' ') + 1 || i == fullName.lastIndexOf(' ') + 1) {
                correctFullName[i] = fullName.toUpperCase().charAt(i);
            }
        }

        text = (text + String.valueOf(correctFullName));
        System.out.println(text);
    }
}

