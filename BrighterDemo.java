
package brighterdemo;

import java.awt.Color;
import javax.swing.JFrame;

public class BrighterDemo {
    public static void main(String[] args) {
        
    
    Color v = new Color(50,100,150);//حتى اتحقق من صحة الدالة ما تنسي ضعط على كترل ومسطرة 
    v.brighter();
    //System.out.println(v);//لأتحقق ان الأوبجكيت متواجد وانو لو عملت الو رن مش هيظهرلي المطلوب 
          JFrame frame = new JFrame();     
          frame.setSize(200, 200);    
          Color myColor = v;      
          frame.getContentPane().setBackground(myColor); 
          frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          frame.setVisible(true); 

    
    }
}

    
    