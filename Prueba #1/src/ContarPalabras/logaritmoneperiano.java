package ContarPalabras;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class logaritmoneperiano extends JFrame{
	
	public Integer n1;
	public Double r;
	
	
	public logaritmoneperiano() {
		//Título y tamaño de la ventana(frame)
	    setTitle("Logaritmo Neperiano");
	    setSize(300, 200);
	    
	    JPanel panel = new JPanel();
	    this.getContentPane().add(panel);
	    setVisible(true);
	    	  
	    JButton button = new JButton("=");
	    JButton b = new JButton("Resetear");
	    
	    JLabel label1 = new JLabel("ln");
	    JLabel label2 = new JLabel("Resultado");
	    
	    JTextField text1 = new JTextField("b");
	    
	    
	    panel.add(label1); 
	    panel.add(text1);
	    panel.add(button); panel.add(label2);
	    panel.add(b);
	    
	    
	    button.addActionListener(new ActionListener() { 
	          public void actionPerformed(ActionEvent e) { 
	        	  n1 = Integer.valueOf(text1.getText());
	        	  r = Math.log(n1);
	        	  label2.setText("" + r);
	        	 
	          }
	        }); 
	    
	    b.addActionListener(new ActionListener() { 
	          public void actionPerformed(ActionEvent e) {
	        	  	  n1 = 0;
	        	  	  r = 0.;
	        		  
	        	  	  text1.setText("n");
	        	  	  
	        		  label2.setText("Resultado");
	        		  
	          }
	        }); 
	    
	}
	
}