package ContarPalabras;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import us.lsi.common.Files2;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Contardor extends JFrame{
	
	private JButton button0;
	private JButton button1;
	private JButton button2;
	private JButton button3;
	private JButton button4;
	private JButton button5;
	private JButton button6;
	private JButton button7;
	private JButton button8;
	private JButton button9;	
	private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JLabel label4;
    private JLabel label5;
	
	public Double i;
	public Double o;
	public Double r;
	public int p;
	public int b;
	public int n;
	
	public String v;
	public String n0;
	public String n1;
	public String n2;
	
	
	public Contardor() {
		
		//Título y tamaño de la ventana(frame)
	    setTitle("Contador");
	    setSize(400, 400);

	    
	    //Símbolos de operaciones
	    JButton b1 = new JButton("+");
	    JButton b2 = new JButton("-");
	    JButton b5 = new JButton("x");
	    JButton b6 = new JButton("/");
	    JButton b7 = new JButton("^");
	    JButton b8 = new JButton("logn b");
	    JButton b9 = new JButton("ln b");
	    JButton b3 = new JButton("=");
	    JButton b4 = new JButton("Resetear");
	    
	    //Asignación de numeros
	    button0 = new JButton("0");
	    button1 = new JButton("1");
	    button2 = new JButton("2");
	    button3 = new JButton("3");
	    button4 = new JButton("4");
	    button5 = new JButton("5");
	    button6 = new JButton("6");
	    button7 = new JButton("7");
	    button8 = new JButton("8");
	    button9 = new JButton("9");
	    
	    //Lista de tipo string donde se guardan los símbolos operacionales
	    List<String> simbolos = new ArrayList<>();
	    simbolos.add("+"); simbolos.add("-"); simbolos.add("x"); simbolos.add("/"); simbolos.add("^");
	    simbolos.add("logn b"); simbolos.add("ln b");
	    
	    //Valor inicial para las variables a usar
	    b = 0;
	    n = 0;
	    v = "uwu";
	    n0 = "owo";
	    n1 = "Valor x";
	    n2 = "Valor y";
	    
	    //Creación del panel
	    JPanel panel = new JPanel();

	    //Creación de las etiquetas
	    label1 = new JLabel();
	    label2 = new JLabel();
	    label3 = new JLabel();
	    label4 = new JLabel();
	    label5 = new JLabel();
	    	    
	    //Asignación de valores iniciales para las etiquetas
	    label1.setText("Operación");
	    label2.setText("Resultado");
	    label3.setText("Valor x");
	    label4.setText("Valor y");
	    label5.setText("Logaritmo");
	    
	    
	    //Para ajustar los botones
	    button0.setLayout(null); button1.setLayout(null); button2.setLayout(null);
	    button3.setLayout(null); button4.setLayout(null); button5.setLayout(null);
	    button6.setLayout(null); button7.setLayout(null); button9.setLayout(null);
	    b1.setLayout(null); b2.setLayout(null); b3.setLayout(null); b4.setLayout(null);
	    b5.setLayout(null); b6.setLayout(null); b7.setLayout(null); b8.setLayout(null);
	    b9.setLayout(null);
	    
	    //Para ajustar los textos
	    label1.setLayout(null); label2.setLayout(null); label3.setLayout(null);
	    label4.setLayout(null);

	    //Se añaden los componentes al panel
	    panel.add(button0); add(button0); panel.add(button1); add(button1); 
	    panel.add(button2); add(button2); panel.add(button3); add(button3);
	    panel.add(button4); add(button4); panel.add(button5); add(button5);
	    panel.add(button6); add(button6); panel.add(button7); add(button7);
	    panel.add(button8); add(button8); panel.add(button9); add(button9);
	    panel.add(b1); add(b1); panel.add(b2); add(b2); panel.add(b5); add(b5);
	    panel.add(b6); add(b6); panel.add(b7); add(b7); panel.add(b8); add(b8);
	    panel.add(b9); add(b9); panel.add(b3); add(b3); panel.add(b4); add(b4);
	    panel.add(label3); add(label3); panel.add(label1); add(label1);
	    panel.add(label4); add(label4); panel.add(label2); add(label2);
	    //panel.add(label5);
	    
	    this.getContentPane().add(panel);
	    setVisible(true);
	    setDefaultCloseOperation(EXIT_ON_CLOSE);
	    
	    //Para terminar de ajustar la posición de los componentes
	    
	    button0.setBounds(65, 250, 45, 20); b3.setBounds(115, 250, 45, 20); b4.setBounds(165, 250, 95, 20);
	    button1.setBounds(65, 225, 45, 20); button2.setBounds(115, 225, 45, 20); button3.setBounds(165, 225, 45, 20); 
	    button4.setBounds(65, 200, 45, 20); button5.setBounds(115, 200, 45, 20); button6.setBounds(165, 200, 45, 20);
	    button7.setBounds(65, 175, 45, 20); button8.setBounds(115, 175, 45, 20); button9.setBounds(165, 175, 45, 20);
	    
	    b1.setBounds(215, 225, 45, 20); b2.setBounds(265, 225, 45, 20);
	    b5.setBounds(215, 200, 45, 20); b6.setBounds(265, 200, 45, 20);
	    b7.setBounds(215, 175, 45, 20); 
	    b8.setBounds(65, 150, 95, 20); b9.setBounds(165, 150, 95, 20);
	    
	    label3.setBounds(45, 50, 80, 45); label1.setBounds(145, 50, 95, 45); label4.setBounds(225, 50, 95, 45);
	    label2.setBounds(45, 95, 80, 45);
	    
//------------------------------------------------------------------------------------------------------------------------------//    
	    b1.addActionListener(new ActionListener() { 
	          public void actionPerformed(ActionEvent e) {
	        	  	 v = "+";
	        		 label1.setText(" + ");
	        		 System.out.println(i + "," + o);
	        		 System.out.println(v);
	          }
	        }); 
	    
	    b2.addActionListener(new ActionListener() { 
	          public void actionPerformed(ActionEvent e) {
	        	  	 v = "-";
	        		 label1.setText(" - ");
	        		 System.out.println(i + "," + o);
	          }
	        }); 
	    
	    b5.addActionListener(new ActionListener() { 
	          public void actionPerformed(ActionEvent e) {
	        	  	 v = "x";
	        		 label1.setText(" x ");
	        		 System.out.println(i + "," + o);
	          }
	        });
	    
	    b6.addActionListener(new ActionListener() { 
	          public void actionPerformed(ActionEvent e) {
	        	  	 v = "/";
	        		 label1.setText(" / ");
	        		 System.out.println(i + "," + o);
	          }
	        });
	    
	    b7.addActionListener(new ActionListener() { 
	          public void actionPerformed(ActionEvent e) {
	        	  	 v = "^";
	        		 label1.setText(" ^ ");
	        		 System.out.println(i + "," + o);
	          }
	        });
	    
	    b8.addActionListener(new ActionListener() { 
	          public void actionPerformed(ActionEvent e) {
	        	  new logaritmo();
	             
	          }
	        });
	    
	    b9.addActionListener(new ActionListener() { 
	          public void actionPerformed(ActionEvent e) {
	        	  new logaritmoneperiano();
	          }
	        });
	    
	    
	    b3.addActionListener(new ActionListener() { 
	          public void actionPerformed(ActionEvent e) {  
	        	  if(v.equals("+")) {
	        		  r = i + o;
	        	  }else if(v.equals("-")) {
	        		  r = i - o;
	        	  }else if(v.equals("x")) {
	        		  r = i * o;
	        	  }else if(v.equals("/")) {
	        		  r = i / o;
	        	  }else if(v.equals("^")) {	  
	        		  for(int f = 0; f<o; f++) {
	        			  if(f == 0) {
	        				  r = i;
	        			  }else {
	        				  r = r * i;
	        			  }
	        		  }
	        	  }
	        	  	 v = "uwu";
	        		 label2.setText(" =  " + r);
	        		 System.out.println(i + "," + o);
	          }
	        }); 
	    
	    b4.addActionListener(new ActionListener() { 
	          public void actionPerformed(ActionEvent e) {
	        	  	  v = "uwu";
	        	  	  n0 = "owo";
	        	  	  n1 = "Valor x";
	        	  	  n2 = "Valor y";
	        		  i = 0.;
	        		  o = 0.;
	        		  r = 0.;
	        		  b = 0;
	        		  n = 0;
	        		  
	        		  label1.setText("Operación");
	        		  label2.setText("Resultado");
	        		  label3.setText("Valor x");
	        		  label4.setText("Valor y");
	        		  label5.setText("Logaritmo");
	        		  System.out.println(i + "," + o + "," + r);
	          }
	        }); 
	    
	    	button0.addActionListener(new ActionListener() { 
	          public void actionPerformed(ActionEvent e) {
	        	  if(!simbolos.contains(v)) {
	        		  if(!n1.equals("Valor x")) {
	        			  p = n1.indexOf(".");
	        			  n0 = n1.substring(0, p) + "0" + n1.substring(p, n1.length());
	        			  n1 = n0;
	        			  i = Double.valueOf(n0);
	        			  label3.setText(i + "");
	        		  }else {
	        			  i = 0.;
	        			  n1 = String.valueOf(i);
	        			  label3.setText(i + "");
	        			  System.out.println("" + (i) + "");
	        		  }
	        	  }else {
	        		  if(!n2.equals("Valor y")) {
	        			  p = n2.indexOf(".");
	        			  n0 = n2.substring(0, p) + "0" + n2.substring(p, n2.length());
	        			  n2 = n0;
	        			  o = Double.valueOf(n0);
	        			  label4.setText(o + "");
	        		  }else {
	        			  o = 0.;
	        			  n2 = String.valueOf(o);
	        			  label4.setText(o + "");
	        			  System.out.println("" + (o) + "");
	        		  }
	        	  }
	          }
	        }); 
	    		    
	    	button1.addActionListener(new ActionListener() { 
		          public void actionPerformed(ActionEvent e) {
		        	  if(!simbolos.contains(v)) {
		        		  if(!n1.equals("Valor x")) {
		        			  p = n1.indexOf(".");
		        			  n0 = n1.substring(0, p) + "1" + n1.substring(p, n1.length());
		        			  n1 = n0;
		        			  i = Double.valueOf(n0);
		        			  label3.setText(i + "");
		        		  }else {
		        			  i = 1.;
		        			  n1 = String.valueOf(i);
		        			  label3.setText(i + "");
		        			  System.out.println("" + (i) + "");
		        		  }
		        	  }else {
		        		  if(!n2.equals("Valor y")) {
		        			  p = n2.indexOf(".");
		        			  n0 = n2.substring(0, p) + "1" + n2.substring(p, n2.length());
		        			  n2 = n0;
		        			  o = Double.valueOf(n0);
		        			  label4.setText(o + "");
		        		  }else {
		        			  o = 1.;
		        			  n2 = String.valueOf(o);
		        			  label4.setText(o + "");
		        			  System.out.println("" + (o) + "");
		        		  }
		        	  }
		          }
		        }); 
	    	
	    	button2.addActionListener(new ActionListener() { 
		          public void actionPerformed(ActionEvent e) {
		        	  if(!simbolos.contains(v)) {
		        		  if(!n1.equals("Valor x")) {
		        			  p = n1.indexOf(".");
		        			  n0 = n1.substring(0, p) + "2" + n1.substring(p, n1.length());
		        			  n1 = n0;
		        			  i = Double.valueOf(n0);
		        			  label3.setText(i + "");
		        		  }else {
		        			  i = 2.;
		        			  n1 = String.valueOf(i);
		        			  label3.setText(i + "");
		        			  System.out.println("" + (i) + "");
		        		  }
		        	  }else {
		        		  if(!n2.equals("Valor y")) {
		        			  p = n2.indexOf(".");
		        			  n0 = n2.substring(0, p) + "2" + n2.substring(p, n2.length());
		        			  n2 = n0;
		        			  o = Double.valueOf(n0);
		        			  label4.setText(o + "");
		        		  }else {
		        			  o = 2.;
		        			  n2 = String.valueOf(o);
		        			  label4.setText(o + "");
		        			  System.out.println("" + (o) + "");
		        		  }
		        	  }
		          }
		        }); 
	    	
	    	button3.addActionListener(new ActionListener() { 
		          public void actionPerformed(ActionEvent e) {
		        	  if(!simbolos.contains(v)) {
		        		  if(!n1.equals("Valor x")) {
		        			  p = n1.indexOf(".");
		        			  n0 = n1.substring(0, p) + "3" + n1.substring(p, n1.length());
		        			  n1 = n0;
		        			  i = Double.valueOf(n0);
		        			  label3.setText(i + "");
		        		  }else {
		        			  i = 3.;
		        			  n1 = String.valueOf(i);
		        			  label3.setText(i + "");
		        			  System.out.println("" + (i) + "");
		        		  }
		        	  }else {
		        		  if(!n2.equals("Valor y")) {
		        			  p = n2.indexOf(".");
		        			  n0 = n2.substring(0, p) + "3" + n2.substring(p, n2.length());
		        			  n2 = n0;
		        			  o = Double.valueOf(n0);
		        			  label4.setText(o + "");
		        		  }else {
		        			  o = 3.;
		        			  n2 = String.valueOf(o);
		        			  label4.setText(o + "");
		        			  System.out.println("" + (o) + "");
		        		  }
		        	  }
		          }
		        }); 
	    	
	    	button4.addActionListener(new ActionListener() { 
		          public void actionPerformed(ActionEvent e) {
		        	  if(!simbolos.contains(v)) {
		        		  if(!n1.equals("Valor x")) {
		        			  p = n1.indexOf(".");
		        			  n0 = n1.substring(0, p) + "4" + n1.substring(p, n1.length());
		        			  n1 = n0;
		        			  i = Double.valueOf(n0);
		        			  label3.setText(i + "");
		        		  }else {
		        			  i = 4.;
		        			  n1 = String.valueOf(i);
		        			  label3.setText(i + "");
		        			  System.out.println("" + (i) + "");
		        		  }
		        	  }else {
		        		  if(!n2.equals("Valor y")) {
		        			  p = n2.indexOf(".");
		        			  n0 = n2.substring(0, p) + "4" + n2.substring(p, n2.length());
		        			  n2 = n0;
		        			  o = Double.valueOf(n0);
		        			  label4.setText(o + "");
		        		  }else {
		        			  o = 4.;
		        			  n2 = String.valueOf(o);
		        			  label4.setText(o + "");
		        			  System.out.println("" + (o) + "");
		        		  }
		        	  }
		          }
		        }); 
	    	
	    	button5.addActionListener(new ActionListener() { 
		          public void actionPerformed(ActionEvent e) {
		        	  if(!simbolos.contains(v)) {
		        		  if(!n1.equals("Valor x")) {
		        			  p = n1.indexOf(".");
		        			  n0 = n1.substring(0, p) + "5" + n1.substring(p, n1.length());
		        			  n1 = n0;
		        			  i = Double.valueOf(n0);
		        			  label3.setText(i + "");
		        		  }else {
		        			  i = 5.;
		        			  n1 = String.valueOf(i);
		        			  label3.setText(i + "");
		        			  System.out.println("" + (i) + "");
		        		  }
		        	  }else {
		        		  if(!n2.equals("Valor y")) {
		        			  p = n2.indexOf(".");
		        			  n0 = n2.substring(0, p) + "5" + n2.substring(p, n2.length());
		        			  n2 = n0;
		        			  o = Double.valueOf(n0);
		        			  label4.setText(o + "");
		        		  }else {
		        			  o = 5.;
		        			  n2 = String.valueOf(o);
		        			  label4.setText(o + "");
		        			  System.out.println("" + (o) + "");
		        		  }
		        	  }
		        	  
		          }
		        }); 
	    	
	    	button6.addActionListener(new ActionListener() { 
		          public void actionPerformed(ActionEvent e) {
		        	  if(!simbolos.contains(v)) {
		        		  if(!n1.equals("Valor x")) {
		        			  p = n1.indexOf(".");
		        			  n0 = n1.substring(0, p) + "6" + n1.substring(p, n1.length());
		        			  n1 = n0;
		        			  i = Double.valueOf(n0);
		        			  label3.setText(i + "");
		        		  }else {
		        			  i = 6.;
		        			  n1 = String.valueOf(i);
		        			  label3.setText(i + "");
		        			  System.out.println("" + (i) + "");
		        		  }
		        	  }else {
		        		  if(!n2.equals("Valor y")) {
		        			  p = n2.indexOf(".");
		        			  n0 = n2.substring(0, p) + "6" + n2.substring(p, n2.length());
		        			  n2 = n0;
		        			  o = Double.valueOf(n0);
		        			  label4.setText(o + "");
		        		  }else {
		        			  o = 6.;
		        			  n2 = String.valueOf(o);
		        			  label4.setText(o + "");
		        			  System.out.println("" + (o) + "");
		        		  }
		        	  }
		        	  
		          }
		        }); 
	    	
	    	button7.addActionListener(new ActionListener() { 
		          public void actionPerformed(ActionEvent e) {
		        	  if(!simbolos.contains(v)) {
		        		  if(!n1.equals("Valor x")) {
		        			  p = n1.indexOf(".");
		        			  n0 = n1.substring(0, p) + "7" + n1.substring(p, n1.length());
		        			  n1 = n0;
		        			  i = Double.valueOf(n0);
		        			  label3.setText(i + "");
		        		  }else {
		        			  i = 7.;
		        			  n1 = String.valueOf(i);
		        			  label3.setText(i + "");
		        			  System.out.println("" + (i) + "");
		        		  }
		        	  }else {
		        		  if(!n2.equals("Valor y")) {
		        			  p = n2.indexOf(".");
		        			  n0 = n2.substring(0, p) + "7" + n2.substring(p, n2.length());
		        			  n2 = n0;
		        			  o = Double.valueOf(n0);
		        			  label4.setText(o + "");
		        		  }else {
		        			  o = 7.;
		        			  n2 = String.valueOf(o);
		        			  label4.setText(o + "");
		        			  System.out.println("" + (o) + "");
		        		  }
		        	  }
		       
		          }
		        });
	    	
	    	button8.addActionListener(new ActionListener() { 
		          public void actionPerformed(ActionEvent e) {
		        	  if(!simbolos.contains(v)) {
		        		  if(!n1.equals("Valor x")) {
		        			  p = n1.indexOf(".");
		        			  n0 = n1.substring(0, p) + "8" + n1.substring(p, n1.length());
		        			  n1 = n0;
		        			  i = Double.valueOf(n0);
		        			  label3.setText(i + "");
		        		  }else {
		        			  i = 8.;
		        			  n1 = String.valueOf(i);
		        			  label3.setText(i + "");
		        			  System.out.println("" + (i) + "");
		        		  }
		        	  }else {
		        		  if(!n2.equals("Valor y")) {
		        			  p = n2.indexOf(".");
		        			  n0 = n2.substring(0, p) + "8" + n2.substring(p, n2.length());
		        			  n2 = n0;
		        			  o = Double.valueOf(n0);
		        			  label4.setText(o + "");
		        		  }else {
		        			  o = 8.;
		        			  n2 = String.valueOf(o);
		        			  label4.setText(o + "");
		        			  System.out.println("" + (o) + "");
		        		  }
		        	  }      	  
		        	  
		          }
		        });
	    	
	    	button9.addActionListener(new ActionListener() { 
		          public void actionPerformed(ActionEvent e) {
		        	  if(!simbolos.contains(v)) {
		        		  if(!n1.equals("Valor x")) {
		        			  p = n1.indexOf(".");
		        			  n0 = n1.substring(0, p) + "9" + n1.substring(p, n1.length());
		        			  n1 = n0;
		        			  i = Double.valueOf(n0);
		        			  label3.setText(i + "");
		        		  }else {
		        			  i = 9.;
		        			  n1 = String.valueOf(i);
		        			  label3.setText(i + "");
		        			  System.out.println("" + (i) + "");
		        		  }
		        	  }else {
		        		  if(!n2.equals("Valor y")) {
		        			  p = n2.indexOf(".");
		        			  n0 = n2.substring(0, p) + "9" + n2.substring(p, n2.length());
		        			  n2 = n0;
		        			  o = Double.valueOf(n0);
		        			  label4.setText(o + "");
		        		  }else {
		        			  o = 9.;
		        			  n2 = String.valueOf(o);
		        			  label4.setText(o + "");
		        			  System.out.println("" + (o) + "");
		        		  }
		        	  }
		        	  
		          }
		        });  
	    
	}
	
	public static void main(String[] args) {
		
		Contardor c = new Contardor();
		
		
	}
	
}


/*
//		// Create frame with specific title 
//		Frame frame = new Frame("Contador de Letras"); 
//		
//		// Create a component to add to the frame; in this case a text area with sample text	 
//		Component textArea = new TextArea("Introducir palabra");
//		 
//		// Create a component to add to the frame; in this case a button 
//		Component button = new Button("Pulsar");
//		 
//		Component b1 = new Button("Añadir");
//		// Add the components to the frame; by default, the frame has a border layout
//		frame.add(textArea, BorderLayout.NORTH);	 
//		frame.add(button, BorderLayout.SOUTH);
//		frame.add(b1, BorderLayout.CENTER);
//		int f = 0;
//		// Show the frame
//		 
//		int width = 300; 
//		int height = 300;
//		 
//		frame.setSize(width, height); 
//		frame.setVisible(true);
//		 
 * 
b1.addActionListener(new ActionListener() { 
	          public void actionPerformed(ActionEvent e) {
	        	  i = 1 + i;
	        	  label1.setText("+ 1");
	        	  label2.setText("" + (i) + "");
	        	  System.out.println("" + (i) + "");
	          }
	        }); 
	    
	    b2.addActionListener(new ActionListener() { 
	          public void actionPerformed(ActionEvent e) {
	        	  i = i - 1;
	        	  label1.setText("- 1");
	        	  label2.setText("" + (i) + "");
	        	  System.out.println("" + (i) + "");
	          }
	        });
	    
	    b3.addActionListener(new ActionListener() { 
	          public void actionPerformed(ActionEvent e) {
	        	  i = 0;
	        	  label1.setText("Reseteado");
	        	  label2.setText("" + (i) + "");
	        	  System.out.println("" + (i) + "");
	          }
	        });
	    

	    b3.addActionListener(new ActionListener() { 
	          public void actionPerformed(ActionEvent e) {
	        	  i = 0;
	        	  o = 0;
	        	  label1.setText("Reseteado");
	        	  label2.setText("" + (i) + o +"");
	        	  System.out.println("" + (i) + "");
	          }
	        });
    
	    if(o == 0) {
	    	
	    	if(i == 0) {
	    	button1.addActionListener(new ActionListener() { 
		          public void actionPerformed(ActionEvent e) {
		        	  i = 1;
		        	  label1.setText(i + "");
		        	  label2.setText(i + "");
		        	  System.out.println("" + (i) + "");
		          }
		        }); 
	    	
	    	button2.addActionListener(new ActionListener() { 
		          public void actionPerformed(ActionEvent e) {
		        	  i = 2;
		        	  label1.setText(i + "");
		        	  label2.setText(i + "");
		        	  System.out.println("" + (i) + "");
		          }
		        }); 
	    	
	    	button3.addActionListener(new ActionListener() { 
		          public void actionPerformed(ActionEvent e) {
		        	  i = 3;
		        	  label1.setText(i + "");
		        	  label2.setText(i + "");
		        	  System.out.println("" + (i) + "");
		          }
		        }); 
	    	
	    	button4.addActionListener(new ActionListener() { 
		          public void actionPerformed(ActionEvent e) {
		        	  i = 4;
		        	  label1.setText(i + "");
		        	  label2.setText(i + "");
		        	  System.out.println("" + (i) + "");
		          }
		        }); 
	    	
	    	button5.addActionListener(new ActionListener() { 
		          public void actionPerformed(ActionEvent e) {
		        	  i = 5;
		        	  label1.setText(i + "");
		        	  label2.setText(i + "");
		        	  System.out.println("" + (i) + "");
		          }
		        }); 
	    	
	    	button6.addActionListener(new ActionListener() { 
		          public void actionPerformed(ActionEvent e) {
		        	  i = 6;
		        	  label1.setText(i + "");
		        	  label2.setText(i + "");
		        	  System.out.println("" + (i) + "");
		          }
		        }); 
	    	
	    	button7.addActionListener(new ActionListener() { 
		          public void actionPerformed(ActionEvent e) {
		        	  i = 7;
		        	  label1.setText(i + "");
		        	  label2.setText(i + "");
		        	  System.out.println("" + (i) + "");
		          }
		        });
	    	
	    	button8.addActionListener(new ActionListener() { 
		          public void actionPerformed(ActionEvent e) {
		        	  i = 8;
		        	  label1.setText(i + "");
		        	  label2.setText(i + "");
		        	  System.out.println("" + (i) + "");
		          }
		        });
	    	
	    	button9.addActionListener(new ActionListener() { 
		          public void actionPerformed(ActionEvent e) {
		        	  i = 9;
		        	  label1.setText(i + "");
		        	  label2.setText(i + "");
		        	  System.out.println("" + (i) + "");
		          }
		        });
	    	
	    	b1.addActionListener(new ActionListener() { 
		          public void actionPerformed(ActionEvent e) {
		        	  
		        	  label1.setText(i + "");
		        	  label2.setText(i + " +");
		        	  System.out.println("" + (i) + "");
		          }
		        });
	    	}else {
	    		button1.addActionListener(new ActionListener() { 
		    		public void actionPerformed(ActionEvent e) {
		    			o = 1;
		    			r = i + o;
		    			label1.setText(o + "");
		    			label2.setText(r + "");
		    			System.out.println("owo");
		    		}
		        });
		    	
		    	button2.addActionListener(new ActionListener() { 
		    		public void actionPerformed(ActionEvent e) {
		    			o = 2;
		    			r = i + o;
		    			label1.setText(o + "");
		    			label2.setText(r + "");
		    			System.out.println("owo");
		    		}
		        });
		    	
		    	button3.addActionListener(new ActionListener() { 
		    		public void actionPerformed(ActionEvent e) {
		    			o = 3;
		    			r = i + o;
		    			label1.setText(o + "");
		    			label2.setText(r + "");
		    			System.out.println("owo");
		    		}
		        });
		    	
		    	button4.addActionListener(new ActionListener() { 
		    		public void actionPerformed(ActionEvent e) {
		    			o = 4;
		    			r = i + o;
		    			label1.setText(o + "");
		    			label2.setText(r + "");
		    			System.out.println("owo");
		    		}
		        });
		    	
		    	button5.addActionListener(new ActionListener() { 
		    		public void actionPerformed(ActionEvent e) {
		    			o = 5;
		    			r = i + o;
		    			label1.setText(o + "");
		    			label2.setText(r + "");
		    			System.out.println("owo");
		    		}
		        });
		    	
		    	button6.addActionListener(new ActionListener() { 
		    		public void actionPerformed(ActionEvent e) {
		    			o = 6;
		    			r = i + o;
		    			label1.setText(o + "");
		    			label2.setText(r + "");
		    			System.out.println("owo");
		    		}
		        });
		    	
		    	button7.addActionListener(new ActionListener() { 
		    		public void actionPerformed(ActionEvent e) {
		    			o = 7;
		    			r = i + o;
		    			label1.setText(o + "");
		    			label2.setText(r + "");
		    			System.out.println("r");
		    		}
		        });
		    	
		    	button8.addActionListener(new ActionListener() { 
		    		public void actionPerformed(ActionEvent e) {
		    			o = 8;
		    			r = i + o;
		    			label1.setText(o + "");
		    			label2.setText(r + "");
		    			System.out.println("owo");
		    		}
		        });
		    
		    	button9.addActionListener(new ActionListener() { 
		    		public void actionPerformed(ActionEvent e) {
		    			o = 9;
		    			label1.setText(o + "");
		    			label2.setText(r + "");
			  	  		System.out.println("owo");
			  	  		System.out.println("" + r);
		    		}
			     });
	    		
	    	}
	    }
	    JLabel label3 = new JLabel(i + " +");
	    
	    	
//	    while(o == 0) {
//	    	button1.addActionListener(new ActionListener() { 
//	    		public void actionPerformed(ActionEvent e) {
//	    			o = 1;
//	    			r = i + o;
//	    			label1.setText(o + "");
//	    			label2.setText(r + "");
//	    			System.out.println("owo");
//	    		}
//	        });
//	    	
//	    	button2.addActionListener(new ActionListener() { 
//	    		public void actionPerformed(ActionEvent e) {
//	    			o = 2;
//	    			r = i + o;
//	    			label1.setText(o + "");
//	    			label2.setText(r + "");
//	    			System.out.println("owo");
//	    		}
//	        });
//	    	
//	    	button3.addActionListener(new ActionListener() { 
//	    		public void actionPerformed(ActionEvent e) {
//	    			o = 3;
//	    			r = i + o;
//	    			label1.setText(o + "");
//	    			label2.setText(r + "");
//	    			System.out.println("owo");
//	    		}
//	        });
//	    	
//	    	button4.addActionListener(new ActionListener() { 
//	    		public void actionPerformed(ActionEvent e) {
//	    			o = 4;
//	    			r = i + o;
//	    			label1.setText(o + "");
//	    			label2.setText(r + "");
//	    			System.out.println("owo");
//	    		}
//	        });
//	    	
//	    	button5.addActionListener(new ActionListener() { 
//	    		public void actionPerformed(ActionEvent e) {
//	    			o = 5;
//	    			r = i + o;
//	    			label1.setText(o + "");
//	    			label2.setText(r + "");
//	    			System.out.println("owo");
//	    		}
//	        });
//	    	
//	    	button6.addActionListener(new ActionListener() { 
//	    		public void actionPerformed(ActionEvent e) {
//	    			o = 6;
//	    			r = i + o;
//	    			label1.setText(o + "");
//	    			label2.setText(r + "");
//	    			System.out.println("owo");
//	    		}
//	        });
//	    	
//	    	button7.addActionListener(new ActionListener() { 
//	    		public void actionPerformed(ActionEvent e) {
//	    			o = 7;
//	    			r = i + o;
//	    			label1.setText(o + "");
//	    			label2.setText(r + "");
//	    			System.out.println("owo");
//	    		}
//	        });
//	    	
//	    	button8.addActionListener(new ActionListener() { 
//	    		public void actionPerformed(ActionEvent e) {
//	    			o = 8;
//	    			r = i + o;
//	    			label1.setText(o + "");
//	    			label2.setText(r + "");
//	    			System.out.println("owo");
//	    		}
//	        });
//	    
//	    	button9.addActionListener(new ActionListener() { 
//	    		public void actionPerformed(ActionEvent e) {
//	    			o = 9;
//	    			label1.setText(o + "");
//	    			label2.setText(r + "");
//		  	  		System.out.println("owo");
//		  	  		System.out.println("" + r);
//	    		}
//		     });
//	    }
 */
