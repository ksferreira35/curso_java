package cap9.InstanceMethod;

public class Cliente {
    
    String primeiroNome;

    String ultimoNome;

    String telefone;

    String email;
    
    String getFullName() {
        return primeiroNome + " " + ultimoNome;
    }

    String getDDD() {
        return telefone.substring(0, 2);
    }
}
