package cap9.InstanceMethod;

public class Instance {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.primeiroNome = "Alexandre";
        cliente.ultimoNome = "Afonso";
        cliente.telefone = "61 9 9999-1111";
        cliente.email = "alexandre.afonso@email.com";

        Cliente cliente2 = new Cliente();
        cliente2.primeiroNome = "Lucas";
        cliente2.ultimoNome = "Rodrigues";
        cliente2.telefone = "31 9 8888-0000";
        cliente2.email = "lucas.rodrigues@email.com";

        System.out.println("Nome do cliente: " + cliente.getFullName() + "\nDDD: " + cliente.getDDD());

        System.out.println("=".repeat(33));
        
        System.out.println("Nome do cliente: " + cliente2.getFullName() + "\nDDD: " + cliente2.getDDD());
    }
}
