package oskerko.simpleObjects.task07;

import oskerko.scans.ScanInts;

/*7. Описать класс, представляющий треугольник. 
Предусмотреть методы для создания объектов, вычисления площади, периметра и точки пересечения медиан.*/

public class Task07 {

	public static void main(String[] args) {

		int ax;
		int ay;
		int bx;
		int by;
		int cx;
		int cy;

		int[] a;
		int[] b;
		int[] c;

		ax = ScanInts.scanInts("A(x)");
		ay = ScanInts.scanInts("A(y)");
		bx = ScanInts.scanInts("B(x)");
		by = ScanInts.scanInts("B(y)");
		cx = ScanInts.scanInts("C(x)");
		cy = ScanInts.scanInts("C(y)");

		a = new int[] { ax, ay };
		b = new int[] { bx, by };
		c = new int[] { cx, cy };

		Triangle tr = new Triangle(a, b, c);

		System.out.println("AB=" + tr.ab());
		System.out.println("BC=" + tr.bc());
		System.out.println("CA=" + tr.ca());
		System.out.println("Периметр=" + tr.perimetr());
		System.out.println("Площадь=" + tr.square());
		System.out.println("Точка пересечения медиан = (" + tr.medianItersectionPoint()[0] + "; " + 
				tr.medianItersectionPoint()[1] + ")");
	}

}
