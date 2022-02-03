public class Person {

    private String firstName, lastName;
    private int age;

    public Person() {
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public void setFirstName(String value) {
        firstName = value;
    }

    public void setLastName(String value) {
        lastName = value;
    }

    public void setAge(int value) {
        if (value < 0 || value > 100) {
            age = 0;
        } else age = value;
    }

    public boolean isTeen() {
        if (age > 12 && age < 20) {
            return true;
        } else return false;
    }

    public String getFullName() {
        if (firstName.isEmpty()) {
            if (lastName.isEmpty()) {
                return "";
            } else {
                return lastName;
            }
        } else {
            if (lastName.isEmpty()) {
                return firstName;
            } else {
                return (firstName + " " + lastName);
            }
        }
    }
}
