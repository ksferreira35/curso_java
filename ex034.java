// Programa que mostra a forma condicional e o operador ternário mostrando o mesmo resultado.
public class ex034 {
    public static void main(String[] args) {
       int a = 5, b = 5;
       
       String c;
       if (a > b) {
        c = "Primeiro é Maior";
       } else {
        c = "Segundo é Maior";
       }
       System.out.println(c);

       c = (a<=b)?"Segundo é Maior":"Primeiro é Maior";
       System.out.println(c);
    }
}
// Desenvolvido por Kaiky - 2025
