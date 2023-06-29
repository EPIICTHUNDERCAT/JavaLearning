public class Main {
    public static void main(String[] args) {

        String currentYear = "2023";
        String usersDateOfBirth = "1999";
        int dateofBirth = Integer.parseInt(usersDateOfBirth);
        int dateofBirth2 = Integer.parseInt(currentYear);
        System.out.println("Age = " + (dateofBirth - dateofBirth2));
    }
}