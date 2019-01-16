package Shapes;

public class Triangle extends InterfaceShape
{

	String ID;
	String color;
	String kind;
	String side1;
	String side2;
	String side3;
	
	//splits the information of Triangle
	public Triangle(String line)
	{
				String split[]= line.split("\\s+");
				for (int i = 0; i < split.length; i++)
				{
					if( i == 0 ){
						setKind(split[i]);
						getKind();
					}
					else if (i == 1)
					{
						setID(split[i]);
					}
					
				}
		}
	
	public void setSide1(String side1)
	{
		this.side1 = side1;
	}
	public void setSide2(String side2)
	{
		this.side2 = side2;
	}
	public void setSide3(String side3)
	{
		this.side3 = side3;
	}
	
	public void setColor(String color)
	{
		this.color = color;
	}
	
	public void setKind(String kind)
	{
		super.setKind(kind);
	}
	
	public void setID(String ID)
	{
		super.setID(ID);
	}
	
}
