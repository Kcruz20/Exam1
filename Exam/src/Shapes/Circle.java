/*
 * Circle Class
 * extends to Interface Shape
 */
package Shapes;

public class Circle extends InterfaceShape
{
	String Radius;
	String ID;
	String color;
	String kind;
	
	//splits the information of circle
	public Circle(String line){
		String split[]= line.split("\\s+");
		for (int i = 0; i < split.length; i++){
			if( i == 0 ){
				setKind(split[i]);
				getKind();
			}
			else if (i == 1){
				setID(split[i]);
			}
		}
	}
	
	public void setID(String ID)
	{
		super.setID(ID);
	}
	
	public void setKind(String kind)
	{
		super.setKind(kind);
	}
	
	public void setRadius(String radius)
	{
		this.Radius = radius;
	}
	
	public void setColor(String color)
	{
		this.color = color;
	}

}
