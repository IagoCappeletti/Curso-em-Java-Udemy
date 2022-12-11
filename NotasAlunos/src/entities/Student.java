package entities;

public class Student {

	public String Name;
	public double Notas1;
	public double Notas2;
	public double Notas3;

	public double resultado() {
		return Notas1 + Notas2 + Notas3;
	}

	public double pontosFalntantes() {

		if (resultado() < 60.0) {
			return 60.0 - resultado();
		} else {
			return 0.0;
		}
	}
}
