package cap7;
public class Recursion {
    public static void main(String[] args) {
        String[] alunos = new String[] {"Kaiky", "Mateus", "Lucas", "Mike"};

        iterarNomes(alunos, 0);
    }
    static void iterarNomes(String[] nomes, Integer i) {
        System.out.println("Aluno: " + nomes[i]);

        if (++i < nomes.length) {
            iterarNomes(nomes, i);
        }
        
    }
}
