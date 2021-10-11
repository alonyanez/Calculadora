package ContarPalabras;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import us.lsi.math.Math2;

public class logaritmo extends JFrame{
	
	public Integer n1;
	public Integer n2;
	public Double r;
	
	
	public logaritmo() {
		//Título y tamaño de la ventana(frame)
	    setTitle("Logaritmo");
	    setSize(300, 200);
	    
	    JPanel panel = new JPanel();
	    this.getContentPane().add(panel);
	    setVisible(true);
	    	  
	    JButton button = new JButton("=");
	    JButton b = new JButton("Resetear");
	    
	    JLabel label1 = new JLabel("log");
	    JLabel label2 = new JLabel("Resultado");
	    
	    JTextField text1 = new JTextField("n");
	    JTextField text2 = new JTextField("b");
	    
	    
	    panel.add(label1); 
	    panel.add(text1); panel.add(text2);
	    panel.add(button); panel.add(label2);
	    panel.add(b);
	    
	    
	    button.addActionListener(new ActionListener() { 
	          public void actionPerformed(ActionEvent e) {
	        	  n1 = 0;
	        	  String v = "";
	        	  if(text1.getText().equals("e")) {
	        		  v = "e";
	        	  }else {
	        		  n1 = Integer.valueOf(text1.getText());
	        	  }
	        		  
	        	  n2 = Integer.valueOf(text2.getText());
	        	  r = 0.;

	        	  if(n1 == 10) {
	        	  	r = Math.log10(n2);
	        	  }else if(v.equals("e")) {
	        	  	r = Math.log(n2);
	        	  }else {
	        		  r = Math.log(n2)/Math.log(n1);
	        	  }
	        	  label2.setText("" + r);
	        		 
	          }
	        }); 
	    
	    b.addActionListener(new ActionListener() { 
	          public void actionPerformed(ActionEvent e) {
	        	  	  n1 = 0;
	        	  	  n2 = 0;
	        	  	  r = 0.;
	        		  
	        	  	  text1.setText("n");
	        	  	  text2.setText("b");
	        	  	  
	        		  label2.setText("Resultado");
	        		  
	          }
	        }); 
	    
	}
	
}
