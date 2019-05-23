import javax.swing.*;
import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.*;
public class MultiLay extends JFrame implements ActionListener{
   
     JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19,b20;
     JTextField t;
	 static int a=0,b=0,result=0;
	static int operator=0;
	JFrame j;


	MultiLay(){
		j=new JFrame();
        b1=new JButton("c");
		b2=new JButton("#");
		b3=new JButton("%");
        b4=new JButton("/");

		b5=new JButton("7");
		b6=new JButton("8");
		b7=new JButton("9");

		b8=new JButton("*");

		b9=new JButton("4");
		b10=new JButton("5");
		b11=new JButton("6");

		b12=new JButton("-");

		b13=new JButton("1");
		b14=new JButton("2");
		b15=new JButton("3");

		b16=new JButton("+");
		b17=new JButton("$");

		b18=new JButton("0");

		b19=new JButton(".");
		b20=new JButton("=");

        setLayout(new GridLayout(2,1));
       
		t=new JTextField(12);
		//t2=new JTextField(12);
		//t3=new JTextField(12);
		add(t);
		//add(t2);
		//add(t3);
		
	   JPanel jp = new JPanel();
        jp.setLayout(new GridLayout(5,4));
        add(jp);
		jp.add(b1);

        jp.add(b2);
		jp.add(b3);
		jp.add(b4);
		jp.add(b5);
		jp.add(b6);
		jp.add(b7);
		jp.add(b8);
		jp.add(b9);
		jp.add(b10);
		jp.add(b11);
		jp.add(b12);
		jp.add(b13);
		jp.add(b14);
		jp.add(b15);
		jp.add(b16);
		jp.add(b17);
		jp.add(b18);
		jp.add(b19);
		jp.add(b20);
		/*for(int i=1;i<=20;i++)
        {
			b[i].setBackground(Color.orange);
        }*/
		

       j.getContentPane().setBackground(Color.orange);
		
        setSize(300,300);
        setVisible(true); 

		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		b10.addActionListener(this);

		b11.addActionListener(this);
		b12.addActionListener(this);
		b13.addActionListener(this);
		b14.addActionListener(this);
		b15.addActionListener(this);
		b16.addActionListener(this);
		b17.addActionListener(this);
		b18.addActionListener(this);
		b19.addActionListener(this);
		b20.addActionListener(this);
		
	}
	public void actionPerformed(ActionEvent e)
    {
		//int a,b,c,d,e1,f,g;
		String s1,s2,s3,s4,s5,s6,s7,s8;
		//s1=t1.getText();
		//s2=t2.getText();
		//a=Integer.parseInt(s1);
		//b=Integer.parseInt(s2);
     try
     {
		

		if(e.getSource()==b1)
        {
	       
            
               t.setText("0");
            
			
        }
		else if(e.getSource()==b2)
		{
         

		}
		else if(e.getSource()==b3)
        {
		
        }

		else if(e.getSource()==b4)
        {

		  	a=Integer.parseInt(t.getText());
			operator=4;
			t.setText("");
			
			

		}

		else if(e.getSource()==b5)
        {

               t.setText(t.getText().concat("7"));
        }

		else  if(e.getSource()==b6)
        {

               t.setText(t.getText().concat("8"));
		}
        
		else  if(e.getSource()==b7)
        {
               t.setText(t.getText().concat("9"));

		}
		else if(e.getSource()==b8)
        {
          a=Integer.parseInt(t.getText());
			operator=3;
			t.setText("");
			
        }

		else if (e.getSource()==b9)
		{

               t.setText(t.getText().concat("4"));
		}
        
		else if (e.getSource()==b10)
		{

               t.setText(t.getText().concat("5"));
			
		}
		else if (e.getSource()==b11)
		{

               t.setText(t.getText().concat("6"));
			
		}
        else if (e.getSource()==b12)
		{
			
			a=Integer.parseInt(t.getText());
			operator=2;
			t.setText("");

		}   
       
	   else if(e.getSource()==b13)
		{

               t.setText(t.getText().concat("1"));
        }

		 else if(e.getSource()==b14)
		{

               t.setText(t.getText().concat("2"));
        }

		 else if(e.getSource()==b15)
		{

               t.setText(t.getText().concat("3"));
        }
		 else if(e.getSource()==b16)
		{
          
		    a=Integer.parseInt(t.getText());
			operator=1;
			t.setText("");

		   
        }  
		
         else if(e.getSource()==b17)
		{
		   
        }

		 else if(e.getSource()==b18)
		{

               t.setText("0");
        }

		 else if(e.getSource()==b19)
		{
		   t.setText(".");
        }
		 else if(e.getSource()==b20)
		{
		  b=Integer.parseInt(t.getText());
		
			switch(operator)
			{
				case 1: result=a+b;
					break;
		
				case 2: result=a-b;
					break;
		
				case 3: result=a*b;
					break;
		
				case 4: result=a/b;
					break;
		
				default: result=0;
			}
		
			t.setText(""+result);
        }
	 }
	 
     catch(Exception ej)
     {

     }
	}
	public static void main(String args[])
	{
      MultiLay ml=new MultiLay();      
  
}
}