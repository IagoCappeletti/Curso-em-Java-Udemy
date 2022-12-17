public class Calculadora {

    public double cotacaoDolar;
    public double quantidadeDolar;

    public  double total () {
        return cotacaoDolar * quantidadeDolar;
    }

    public  double iof (double total) {
        return total * 6/100;
    }

    public  double totIof (double iof, double total) {
        return total + iof;
    }
}
