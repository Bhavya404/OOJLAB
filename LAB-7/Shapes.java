interface Shapess
{
	default public void getperi(int n, int l)
	{
		System.out.println("Perimeter of the regular polygon having "+n+" sides is "+(n*l));
	}
	public void getarea();
}
class Rect implements Shapess
{
	private int a;
	private int b;
	public Rect(int a, int b)
	{
		this.a=a;
		this.b=b;
	}
	@Override
	public void getarea(int a,int b)
	{
		System.out.println("The area is "+(a*b));
	}
}
class Square implements Shapess
{
	private int a;
	private int b;
	public Square(int a, int b)
	{
		this.a=a;
		this.b=b;
	}
	@Override
	public void getarea()
	{
		System.out.println("The area is "+(a*b));
	}
}
class Triangle implements Shapess
{
	private double l;
	private double b;
	public Triangle(int l, int b){
		this.l=l;
		this.b=b;
	}
	@Override
	public void getarea(){
		System.out.println("The area is "+(0.5*l*b));
	}
}
class Shapes
{
	public static void main(String args[])
	{
		Shapess sq= new Square(4 ,4);
		sq.getperi(2, 4);
		sq.getarea();
    Shapess t = new Triangle(3,6);
    t.getperi(3, 6);
    t.getper();
    Shapess rt = new Rectangle(4,8);
    rt.getperi(4, 8);
    rt.getper();
	}
}
		
		
