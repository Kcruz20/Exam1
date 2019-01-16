/*
 * Rectangle Class
 * extends to Interface Shape
 */
package Shapes;

public class Rectangle extends InterfaceShape
{
	String Side;
	String ID;
	String Color;
	String Kind;
	String Perimeter;
	
	//splits the information of Rectangle
	public Rectangle(String line)
	{
			String split[]= line.split("\\s+");
			for (int i = 0; i < split.length; i++)
			{
				if( i == 0 )
				{
					setKind(split[i]);
					getKind();
				}
				else if (i == 1)
				{
					setID(split[i]);
				}
			}
	}
	
	public void setSide(String side)
	{
		this.Side = side;
	}
	
	public void setColor(String color)
	{
		this.Color = color;
	}
	
	public void setKind(String kind)
	{
		super.setKind(kind);
	}
	
	public void setID(String ID){
		super.setID(ID);
	}
	
}
