package inheritance;

public class Box {
	
	int width,height,depth;
	
	Box(int w,int h,int d)
	{
		width=w;
		height=h;
		depth=d;
	}
	int vol()
	{
		return width*height*depth;
	}
	
	public static void main(String[] args) {
		Box b=new Box(10,11,10);
		System.out.println("Volume: "+b.vol());
	}

}
