/*
 * Extends to JButton
 * make it a button
 * Buttons dont work
 */
package Shapes;

import javax.swing.*;

public class Button extends JButton
{
private InterfaceShape shape;
public InterfaceShape getInterfaceShape()
{
	return shape;
}
	public Button(InterfaceShape shape)
	{
		this.shape = shape;
	}
	
// Wasn't able to get the images of the shapes 
	
}
