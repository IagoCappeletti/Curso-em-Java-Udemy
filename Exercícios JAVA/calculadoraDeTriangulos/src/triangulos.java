public class triangulos {
    public double A; //Atributos da classe triangulos
    public double B; //Atributos da classe triangulos
    public double C; //Atributos da classe triangulos

    public double area (/*n preciso colocar os atributos A,B,C pq já estão dentro da classe triangulo*/) {

        double p = (A + B + C) / 2;
        return Math.sqrt(p * (p - A) * (p - B) * (p - C));
    }
}
