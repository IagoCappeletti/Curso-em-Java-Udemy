public class calculadora {

    public  static final double PI = 3.14159; //final = P/ sinalizar que é constante enão pode ser alterada.
    //Padrão de nomes de constante é tudo em MAIÚSCULO

    public static double circuferencia (double raio) {
        return 2.0 * PI * raio;
    }

    public static double volume (double raio){
        return 4.0 * PI * raio * raio / 3.0;
    }
}
