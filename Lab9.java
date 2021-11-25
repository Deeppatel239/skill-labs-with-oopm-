package shape;

abstract class shape {
	int a=5,b=2;
	abstract public void PrintArea();
	}

class rectangle extends shape {
	public int area_rectangle;
	public void PrintArea() {
		area_rectangle=a*b;
		System.out.println("The area of rectangle is:"+area_rectangle);
		}
	}

class circle extends shape {
	int area_circle;
	public void PrintArea() {
		area_circle=(int) (3.14*a*a);
		System.out.println("The area of circle is:"+area_circle);
		}
}

class triangle extends shape {
	int area_triangle;
	public void PrintArea() {
		area_triangle=(int) (0.5*a*b);
		System.out.println("The area of triangle is:"+area_triangle);
		}
	}

public class javashape {
    public static void main(String[] args) {
        rectangle r=new rectangle();
        r.PrintArea();
        circle r1=new circle();
        r1.PrintArea();
        triangle t=new triangle();
        t.PrintArea();
        }
    }
