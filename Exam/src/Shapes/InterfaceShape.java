//chooses the shape and id and outputs it
package Shapes;


import java.util.*;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.io.*;
import java.awt.event.*;
import javax.swing.*;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.HashMap;
import javax.swing.border.BevelBorder;


public class InterfaceShape 
{
	//int CircleX = 50, CircleY= 50;
	//int x,y;
	String sID;
	String sKind;
	JFrame frame;
	InterfaceShape shape;
	//JList options;
	//Image imageCircle;
	//public InterfaceShape  (Image circle)
	//{
	//	imageCircle = circle;
	//	addMouseListener(this);
	//}


	public ArrayList<InterfaceShape> ShapeList = new ArrayList<InterfaceShape>();
	private static Map<String, InterfaceShape> shapeMap = new HashMap<String, InterfaceShape>();
	
	
	//tried to put in some words but doesnt work
	/*
	public void paint(Graphics C) 
	{   
		//Graphics Shapes = (Graphics)C;
		Graphics2D C2 = (Graphics2D)C;
		
		//Shapes.drawImage(imageCircle, CircleX, CircleY, this);
		
	    //  super.paint(C);
	      Font font = new Font("Tahoma", Font.BOLD+Font.PLAIN,15);
	      C2.setFont(font);
	      C2.drawString("Here is the type of shape and their ID", x, y);

	}
	*/
	
	public InterfaceShape(String line){}
	public InterfaceShape(){}
	
	public void shapeui(){
		
		frame = new JFrame("Exam-Shapes!");
		frame.setBounds(300, 50, 850, 750);
		frame.setVisible(true);
		//frame.setLayout(new BorderLayout());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//tried to do a scroll display. not working
		/*
		 * splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, scroll, display); 
		splitPane.setDividerLocation(150);
		
		splitPane.setPreferredSize(new Dimension(400, 220)); 
		renderDisplay(options.getShapes); 
		
		frame.add(splitPane); 
		frame.pack(); 
		frame.setVisible(true);
		 */
		
		
		//displays list as buttons
		//ID and name of circle,square, rectangle, and triangle
		JPanel b = new JPanel();
		Button right = new Button(ShapeList.get(0));
		for (int i = 0; i < ShapeList.size(); i++)
		{
		 if (ShapeList.get(i) instanceof Circle)
		{	
			String text = ( ShapeList.get(i).getKind() + " ID:" + ShapeList.get(i).getID() );
			right.setText(text);
			b.add(right);
			right = new Button(ShapeList.get(i));
		}
		 
		 
		  if(ShapeList.get(i) instanceof Square)
		{	
			String text = (ShapeList.get(i).getKind() + " ID:" + ShapeList.get(i).getID());
			right.setText(text);
			b.add(right);
			right = new Button(ShapeList.get(i));
			
		}
		 if (ShapeList.get(i) instanceof Rectangle)
		{
			String text = (ShapeList.get(i).getKind() + " ID:" + ShapeList.get(i).getID());
			right.setText(text);
			b.add(right);
			right = new Button(ShapeList.get(i));
		}
		 if (ShapeList.get(i) instanceof Triangle)
		{	
			String text = (ShapeList.get(i).getKind() + " ID:" + ShapeList.get(i).getID());
			right.setText(text);
			b.add(right);
			right = new Button(ShapeList.get(i));
		}
	
		}
		
		b.add(right);
		frame.add(b, BorderLayout.CENTER);
		frame.revalidate();
		
		//Didnt finish to show the shapes
		
		/*String circle = "Circle.png";
		
	    Image imageC = Toolkit.getDefaultToolkit().getImage(UI.class.getResource(circle));
	       imageC = imageC.getScaledInstance(300, 200, Image.SCALE_SMOOTH);
	       
	     String square = "Square.png";
	    
	    Image imageS = Toolkit.getDefaultToolkit().getImage(UI.class.getResource(square));
	       imageS = imageS.getScaledInstance(300, 200, Image.SCALE_SMOOTH);
	      */

	}
	
	public String toString(String s)
	{
		return s;
	}
	
	public void setKind(String kind)
	{
		this.sKind = kind;
	}
	
	public String getKind()
	{
		return sKind;	
	}

	public void setID(String id)
	{
		sID = id;
	}
	

	public String getID()
	{
		return sID;
	}
	
	//find the shape
	public void addNewShape(String l)
	{
		if(l.toLowerCase().contains("circle"))
		{
			Circle c = new Circle(l);
			shapeMap.put(c.getID(), c);
			ShapeList.add(c);
			
		}
		else if (l.toLowerCase().contains("rectangle"))
		{
			Rectangle r = new Rectangle(l);
			shapeMap.put(r.getID(), r);	
			ShapeList.add(r);
		}
		
		else if (l.toLowerCase().contains("square"))
		{
			Square s = new Square(l);
			shapeMap.put(s.getID(), s);	
			ShapeList.add(s);
		}
		
		else if(l.toLowerCase().contains("triangle"))
		{
			Triangle t = new Triangle(l);
			shapeMap.put(t.getID(), t);
			ShapeList.add(t);
		}
	}
		
	


}

