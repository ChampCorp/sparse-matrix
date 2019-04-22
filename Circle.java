package inheritance;

public class Circle extends Shape {
	
	void draw()
	{
		System.out.println("Drawing Circle");
	}
	void erase()
	{
		System.out.println("Erasing Circle");
	}
	
	public static void main(String[] args) {
		
		Shape c=new Circle();
		c.draw();
		c.erase();
	}


}
