package cap9.Encapsulation;

public class Client {
    
    // String name;
    String firstName;
    String lastName;
    String phone;

    String getName() {
        return firstName + " " + lastName;
    }

    void setName(String name) {
        String[] fullName = name.split(" ");
        firstName = fullName[0];
        lastName = fullName[1];
    }

    String getPhone() {
        return phone;
    }

    void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
