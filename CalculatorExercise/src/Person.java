public class Person {


    private String firstName;
    private String lastName;
    private int age;


    public int getAge() {
        return age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setAge(int age) {
        if (age > 100 || age < 0) {
            age = 0;
        }

        this.age = age;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public boolean isTeen() {
        if ((getAge() > 12) && (getAge() < 20)) {
            return true;
        }else if (getAge() <= 0){
            return false;
        }

        return false;
    }


    public String getFullName() {
        if ((getFirstName().isEmpty()) && (getLastName().isEmpty())) {
            return "";
        }
        if (getLastName().isEmpty()) {
            return getFirstName();
        }
        if (getFirstName().isEmpty()) {
            return getLastName();


        }
        return getFirstName() + " " + getLastName();
    }

}
