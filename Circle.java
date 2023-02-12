class Circle
{
private float radius, area;
public void accept(float x)
{
radius=x;
}
public void calculate()
{
area=3.14f*radius*radius;
}
public void display()
{
System.out.println(“Area=“+area);
}
public static void main(String[] args)
{
float radius;
Circle c=new Circle();
c.accept(4);
c.calculate();
c.display();
}
}

