class Circle
{
private float r, area;
public void accept(float x)
{
r=x;
}
public void calculate()
{
area=3.14f*r*r;
}
public void display()
{
System.out.println(“Area=“+area);
}
public static void main(String[] args)
{
float x;
Scanner sc=new Scanner(System.in);
System.out.println("Enter radius:");
x=sc.nextInt();
Circle c=new Circle();
c.accept(x);
c.calculate();
c.display();
}
}

