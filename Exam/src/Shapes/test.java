/*
FEEDBACK

Read from the file correctly: 17/20%
Implement class hierarchy correctly: 20/20%
Populate appropriate data structures with shape data: 13/15%
Show list of shapes correctly: 15/15%
Show specific shape properties correctly: 8/15%
Well-structured, well-commented code: 10/15%


Comments:
  InterfaceShape should be an interface, not a class. No implementation here.
  Null pointer exception reading the file (InterfaceShape.java:172)
  No images shown, no shape details shown
  
*/


/**
 * Exam_Java_Shapes
 * @author katherinne cruz
* @param args
* Test class
* 
* connects the shape.txt file
*/
package Shapes;

import java.awt.BorderLayout;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import javax.swing.JFrame;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class test
{
public static void main(String[] args)
{
	JFrame frame;

	//gets the file 
	//if file connects then it will show shapes and ID's 
	
	String curdir = System.getProperty("user.dir") ;
	
    File cd = new File(curdir);
    InterfaceShape shape = new InterfaceShape(); 
   
    File[] files = cd.listFiles();
    for (File f: files)
    {
        if (f.getName().endsWith(".txt")) 
        {
        	try (BufferedReader br = new BufferedReader(new FileReader(f.getAbsolutePath()))) 
        	{
                String line = br.readLine();
             
                while (line != null)
                { 
                    line = br.readLine();
                    String l = line;                      
                    shape.addNewShape(l);
                }              
            }
            catch (Exception ex) { System.out.printf("Didn't work: error");
            }
        }
       
    }
    shape.shapeui();
}
}
