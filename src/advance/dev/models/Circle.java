package advance.dev.models;

public class Circle extends Shape {
	private double radius;

	public Circle(String name, double radius) {
		super(name);
		this.radius = radius;
	}

	@Override
	public double chuVi() {
		// TODO Auto-generated method stub
		return 2 * Math.PI * radius;
	}

	@Override
	public double dienTich() {
		// TODO Auto-generated method stub
		return Math.PI * radius * radius;
	}

}