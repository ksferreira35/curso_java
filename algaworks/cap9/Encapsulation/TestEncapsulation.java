package cap9.Encapsulation;

public class TestEncapsulation {
    public static void main(String[] args) {
        // Client client = new Client();
        // client.name = "Roberto Carlos";
        // client.phone = "61 9 9483-9419";

        // System.out.println("Nome cliente: " + client.name);

        Client client = new Client();

        client.setName("John Doe");
        client.setPhone("46 9 2391-9321");

        System.out.println("Client name: " + client.getName() + "\nClient phone: " + client.getPhone());

        System.out.println("First Name: " + client.getFirstName());
        System.out.println("Last Name: " + client.getLastName());
    }
}