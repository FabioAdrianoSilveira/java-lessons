package classroom.mavenProjectBhaskara;

public class Equacao {
	// Atributos
	private double a;
	private double b;
	private double c;
	private double x1;
	private double x2;
	
	
	// Construtores
	public Equacao() {}
	
	public Equacao(double pa, double pb, double pc) {
		this.a = pa;
		this.b = pb;
		this.c = pc;
	}

	// Getters, Setters e complementares
	public double getA() {
		return a;
	}

	public void setA(double pa) {
		this.a = pa;
	}

	public double getB() {
		return b;
	}

	public void setB(double pb) {
		this.b = pb;
	}

	public double getC() {
		return c;
	}

	public void setC(double pc) {
		this.c = pc;
	}

	public double getX1() {
		return x1;
	}

	public void setX1(double x1) {
		this.x1 = x1;
	}

	public double getX2() {
		return x2;
	}

	public void setX2(double x2) {
		this.x2 = x2;
	}
	
	private double getDelta() {
		return Math.pow(this.b, 2)-4*this.a*this.c;
	}
	
	public void setSolucao() {
		this.x1 = (-1*this.b + Math.sqrt(this.getDelta())) / 2*this.a;
		this.x2 = (1*this.b - Math.sqrt(this.getDelta())) / 2*this.a;
	}
	
}
