package classroom.mavenProjectGeometry;

public class Trapezio {
	private double bMaior;
	private double bMenor;
	private double altura;
	
	public Trapezio() {}
	
	public Trapezio(double pBMenor, double pBMaior, double pAltura) {
		this.bMaior = pBMaior;
		this.bMenor = pBMenor;
		this.altura = pAltura;
	}
	
	public double getBMaior() {
		return this.bMaior;
	}
	
	public void setBMaior(double pBMaior) {
		this.bMaior = pBMaior;
	}
	
	public double getBMenor() {
		return this.bMenor;
	}
	
	public void setBMenor(double pBMenor) {
		this.bMenor = pBMenor;
	}
	
	public double getAltura() {
		return this.altura;
	}
	
	public void setAltura(double pAltura) {
		this.altura = pAltura;
	}
	
	public double getArea() {
		return ((this.bMenor + this.bMaior) * this.altura) / 2;
	}
}
