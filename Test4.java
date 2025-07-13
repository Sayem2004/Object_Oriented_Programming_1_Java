import javax.swing.JOptionPane;
import javax.swing.ImageIcon;


public class Test4{
	public static void main(String[]args){
		ImageIcon img= new ImageIcon("sayem2.JPG");
		String name1= JOptionPane.showInputDialog("Enter your first name");
		String name2= JOptionPane.showInputDialog("Enter your Last name");
		String name = name1+name2;
		JOptionPane.showMessageDialog(null,name+" WElcome ","This is title",3,img);
		
		
		
		
	}
}