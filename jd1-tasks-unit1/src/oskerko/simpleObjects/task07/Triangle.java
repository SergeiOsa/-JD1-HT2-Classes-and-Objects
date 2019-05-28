package oskerko.simpleObjects.task07;

/*7. Описать класс, представляющий треугольник. 
Предусмотреть методы для создания объектов, вычисления площади, периметра и точки пересечения медиан.*/

public class Triangle {

	private int[] a;
	private int[] b;
	private int[] c;

	{
		a = new int[] { 0, 0 };
		b = new int[] { 0, 1 };
		c = new int[] { 1, 0 };
	}

	public Triangle() {}

	public Triangle(int[] a, int[] b, int[] c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public double ab() {
		double ab;
		ab = Math.sqrt(((b[0] - a[0]) * (b[0] - a[0])) + ((b[1] - a[1]) * (b[1] - a[1])));
		return ab;
	}

	public double bc() {
		double bc;
		bc = Math.sqrt(((c[0] - b[0]) * (c[0] - b[0])) + ((c[1] - b[1]) * (c[1] - b[1])));
		return bc;
	}

	public double ca() {
		double ca;
		ca = Math.sqrt(((a[0] - c[0]) * (a[0] - c[0])) + ((a[1] - c[1]) * (a[1] - c[1])));
		return ca;
	}

	public double perimetr() {
		double perimetr;
		perimetr = ab() + bc() + ca();
		return perimetr;
	}

	public double square() {
		double square;
		double hp;

		hp = (double) perimetr() / 2;
		square = Math.sqrt(hp * (hp - ab()) * (hp - bc()) * (hp - ca()));

		return square;
	}

	// точка пересечения медиан:
	public double[] medianItersectionPoint() { 
		double[] point = new double[2];
		double[] n = new double[2]; 
	  
		n[0] = (b[0]+c[0])/2;
		n[1] = (b[1]+c[1])/2; 
	 		  
		point[0] = (n[0]-a[0]) * ((double)2 / 3);
		point[1] = (n[1]-a[1]) * ((double)2 / 3);
		
		return point; 
		}

	public int[] getA() {
		return a;
	}

	public void setA(int[] a) {
		this.a = a;
	}

	public int[] getB() {
		return b;
	}

	public void setB(int[] b) {
		this.b = b;
	}

	public int[] getC() {
		return c;
	}

	public void setC(int[] c) {
		this.c = c;
	}

}
