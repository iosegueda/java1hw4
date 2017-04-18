//Iris Osegueda
import javax.swing.*;
 
public class Hw4 {
 
    public static void main(String[] args)
    {
		int option;
		Rectangle rec1 = new Rectangle();
		String menu = "1 - to set the length\n" +
					"2 - to set the width\n" +
					"3 - to get the length\n" +
					"4 - to get the width\n" +
					"5 - to get the perimeter\n" +
					"6 - to get the area\n" +
					"7 - to print the object as string\n" +
					"0 - to quit\n";
		String message = "";
		
		option = Integer.parseInt( JOptionPane.showInputDialog( menu ));
		
		while(option != 0)
		{
			switch ( option )
            {
                case 1:
                    rec1.setLen(Integer.parseInt(JOptionPane.showInputDialog("Please enter the length:") ));
                    break;
 
                case 2:
                    rec1.setWidth(Integer.parseInt(JOptionPane.showInputDialog("Please enter the width:") ) );
                    break;
 
                case 3:
                    message = "Length: " + rec1.getLen() ;
					JOptionPane.showMessageDialog( null, message );
                    break;
 
                case 4:
                    message = "Width: " + rec1.getWidth();
					JOptionPane.showMessageDialog( null, message );
                    break;
 
                case 5:
                    message = "Perimeter: " + rec1.getPerimiter() ;
					JOptionPane.showMessageDialog( null, message );
                    break;
 
                case 6:
					message = "Area: " + rec1.getArea();
					JOptionPane.showMessageDialog( null, message );
                    break;
 
                case 7:
					message = rec1.toString();
					JOptionPane.showMessageDialog( null, message );
                    break;
			}
			
			option = Integer.parseInt( JOptionPane.showInputDialog( menu ));
		}
        System.exit ( 0 );
    }
}