package App;

import java.awt.*;
import javax.swing.*;

public class myJPanel extends JPanel {
    public myJPanel(){
        super();
        setBackground(Color.white);
         JLabel l1 = new JLabel("Money Manager");
        add(l1);
        JButton b1 = new JButton("Current Balance");
        add(b1);
        
         JButton b2 = new JButton("Chat");
        add(b2);
         JButton b3 = new JButton("Finances");
        add(b3);
    }
		
	
        
    }
    
		
