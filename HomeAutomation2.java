import java.applet.*;  
import java.awt.*;  
import java.util.*;  
import java.text.*;  
      
    public class newprogram extends Applet implements Runnable {
    	Label text = new Label("       ");
    	Label text1 = new Label("      ");
      
       /**
         * 
         */
        private static final long serialVersionUID = 1L;
    Thread t = null;  
     
       String timeString = "";  
      
       public void init() {  
          setBackground( Color.LIGHT_GRAY);
          add(text);
          add(text1);
       }  
      
       public void start() {  
            t = new Thread( this );  
            t.start();  
       }  
      
        
       public void run() {  
          try {  
             while (true) { 
          
          
          
            int arr[]={0322,2230,1645,2230,1900,1335,2015,1725};
             for(int i=1;i<8;++i)
             {
            	 String s = " ";
            	 String s1 = "Time :";
            	 s = Integer.toString(arr[i]);
            	 text.setText(s1);
            	 text1.setText(s);
                 if(arr[i]>0000 && arr[i]<1800)
                 {
                     
                     
                 
                     timeString= "turned off";
                     
                 }
                 
                 else {
            
                 timeString= "turned on";
                 
                 
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
          g.drawString( "Light status", 70, 50 ); 
          g.drawString( timeString, 70, 70 );  
       }  
    } 