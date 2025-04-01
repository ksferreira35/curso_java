// Programa que analisa duas Strings, observa-se que ao compara-las fica como false, mas utilizando o equals ele analisa o conteúdo e diz ser o mesmo conteúdo
public class ex026 {
    @SuppressWarnings("StringEquality")
    public static void main(String[] args) {
        String parte1 = "Curso";
        String parte2 = "Video";  
        String parte3 = parte1 + parte2;    
        String parte4 = "CursoVideo";
          
        System.out.println(parte3 == parte4);
        System.out.println(parte3.equals(parte4));
        System.out.println(parte3);
    }
}
// Desenvolvido por Kaiky - 2025
