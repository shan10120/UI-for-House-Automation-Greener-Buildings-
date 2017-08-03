import java.applet.*;  
import java.awt.*;  
import java.util.*;  
import java.text.*;  
      
    public class newprog extends Applet implements Runnable {  
    	Label text = new Label("       ");
    	Label text1 = new Label("      ");
      
       /**
         * 
         */
        private static final long serialVersionUID = 1L;
        Thread t = null;  
        String timeString = "";  
      
       public void init() {  
    	   this.setSize(new Dimension(300,300));
    	   add(text);
    	   add(text1);
          setBackground( Color.cyan);  
       }  
      
       public void start() {  
            t = new Thread( this );  
            t.start();  
       }  
      
        
       public void run() {  
          try {  
             while (true) { 
            int arr[]={180,90,180,31,5,69,180,22,5};
             for(int i=0;i<10;++i)
             {
            	 String s = " ";
            	 String s1 = "Water Level: ";
            	 s = Integer.toString(arr[i]);
            	 text.setText(s1);
            	 text1.setText(s);
                 if(arr[i]==180)
                 {
                     timeString= "Water level high!! Turn off the motor";
                 }
                 
                 else if(arr[i]==5)
                 {
                	 timeString= "Water level low!! Turn on the motor";
                 }
                 else
                 {
                	 timeString= "Motor running!! Water level medium";
                 }
                  repaint();  
                  Thread.sleep( 1000 );
             }
             }  
          }  
          catch (Exception e) { }  
       }  
      
        
      public void paint( Graphics g ) {  
          g.setColor( Color.blue );  
          g.drawString( "Water level detection", 80, 50 ); 
          g.drawString( timeString, 60, 100 );  
       }  
    } 