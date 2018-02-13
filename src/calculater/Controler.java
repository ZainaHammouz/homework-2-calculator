package calculater;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class Controler implements ActionListener {
	static view v1;
	static model m1;
     String array[] = new String[4];

	
	public static void main(String[] args) {
		v1 = new view();
		v1.setVisible(true);
		m1 = new model();

	}// main 

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if ( ((AbstractButton) e.getSource()).getText() == "C") {
		v1.setjTextField1(""); return;}
    	
			v1.setjTextField1(v1.getjTextField1() + ((JButton)e.getSource()).getText());
			
		if ( ((AbstractButton) e.getSource()).getText() == " = ") {
			
			array= v1.getjTextField1().split(" ", 4);
			work(array, m1 ,v1);
			
		}
			
		}
	
		public double work(String[] arr, model m , view v){
			 double n1=0,n2=0;
			 boolean flag = false;
			try {
				n2= Double.parseDouble(arr[2]);
			if(!(arr[2].equals("="))) {n2= Double.parseDouble(arr[2]);}
		       n1= Double.parseDouble(arr[0]);
			}
			catch (Exception ee) {				
				  n1= Double.parseDouble(arr[0]);

				if (arr[1].equals("s")) {
					
					if (n1 < 0) {
						
						v.setjTextField1("");
						JOptionPane.showMessageDialog(null, " Error !!! cant take sqr for negative num" ," ERROR " ,JOptionPane.ERROR_MESSAGE);
						
						 flag = true;
						 }
					
					else
					n1= m.sqrroot(n1);	
				 }
			}
			
			 if (arr[1].equals("+")) {
				n1=	m.add(n1,n2);	
			 }
		
			 else if (arr[1].equals("_")) {
					n1= m.sub(n1, n2);
				 }
			 else if (arr[1].equals("*")) {
					n1= m.mul(n1, n2);
				 }
			 else if (arr[1].equals("/")) {
				 if (n2 == 0) {					 
				 v.setjTextField1("");
					JOptionPane.showMessageDialog(null, " Error !!! cant divide on zero " ," ERROR " ,JOptionPane.ERROR_MESSAGE);

				 return 1;}
				 else
					n1= m.div(n1, n2);	
				 }
			 else if (arr[1].equals("%")) {
				 if (n2 == 0) {
					 v.setjTextField1("");
						JOptionPane.showMessageDialog(null, " Error !!! cant take mod on zero " ," ERROR " ,JOptionPane.ERROR_MESSAGE);

								return 1  ;} 
				 else 
					n1= m.mod(n1, n2);	
				 }
			 if(flag) {
				 flag = false;
				 return 1;
				 	}
			 else {  v.setjTextField1(""+ n1);
			 return n1;}   
		}		
	}

