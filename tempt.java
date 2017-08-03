import java.applet.*;  
import java.awt.*;  
import java.util.*;  
import java.text.*; 
public class tempt extends Applet implements Runnable
{
private static final long serialVersionUID = 1L;
Button b1,b2,b3;
Thread tt = null; 
Graphics g1;
String s1,s,s2;
int x,i;
Label gre = new Label("SMART GREEN BUILDING");
Label pow = new Label("     POWER      ");

Label t=new Label("       ");
Label text1=new Label("    ");
Label text2=new Label("     ");

Font fntHeader = new Font("Arial", Font.BOLD, 16);
Font fntpow = new Font("Arial", Font.BOLD, 12);

Calendar cal = Calendar.getInstance();
DateFormat sdf = new SimpleDateFormat("hh:mm a");

public void init()
{			this.setSize(new Dimension(500,500));
			gre.setFont(fntHeader);
			add(gre);
			gre.setFont(fntpow);
			add(pow);
			add(text1);	
            add(t);
            add(text2);
            s2=sdf.format(cal.getTime());
            text2.setText(s2);
            this.b1=new Button("hot");
       		this.b2=new Button("moderate");
       		this.b3=new Button("cold");
       		this.add(b1);
       		this.add(b2);
       		this.add(b3);
       		b1.setBackground(Color.red);
       		b2.setBackground(Color.green);
        	b3.setBackground(Color.blue);
        	setBackground(Color.lightGray);
        	//repaint();
       }

public void start() {  
    tt = new Thread(this);  
    tt.start();  
} 

public void run() {
	
	while(true){
	    try
	     {
	    	int arr[]={38,24,21,44,33,11,66,88,99,23,45,67};
	    		int r = (int)((Math.random()*100)%arr.length); 
		     	x=arr[r];
			    if(x>32)
			   	s="hot";
			    else if(x>22&&x<=32)
			   	s="moderate";
			    else s="cold";
			    
			    if(s.equals("hot"))
				{	showStatus("It's Hot");
					text1.setText(String.valueOf(x));
					t.setBackground(Color.red);
					pow.setText("POWER ON");
					}
			    else if(s.equals("cold"))
			 	{	showStatus("It's Cold");
			 		text1.setText(String.valueOf(x));
			 		t.setBackground(Color.blue);
			 		pow.setText("POWER OFF");
			 		}
			    else if(s.equals("moderate"))
			 	{	showStatus("It's Pleasant");
			 		text1.setText(String.valueOf(x));
			 		t.setBackground(Color.green);
			 		pow.setText("POWER ON/OFF");
		 		}
			    repaint();  
		        Thread.sleep(1000);
	     }catch (Exception e) { }
	}
	
}


public void paint(Graphics g)
{	this.b1.setLocation(210, 180);
	this.b1.setSize(80, 40);
	this.b2.setLocation(210, 240);
	this.b2.setSize(80, 40);
	this.b3.setLocation(210, 300);
	this.b3.setSize(80, 40);
	g.drawString("(TEMPERATURE IN CELSIUS) ",180,100);
    g.drawString("HOME-AC",225,155);
    }
}