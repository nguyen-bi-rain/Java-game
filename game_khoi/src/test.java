import java.awt.*;

import javax.swing.*;

public class test extends JFrame {
    JTextArea ta;
    JTextField tf;
    JButton b1, b2;

    CheckboxGroup cbg;
    Checkbox cb1;
    Checkbox cb4;
    Checkbox cb3;
    Checkbox cb2;
    GridBagLayout gb;
    GridBagConstraints gbc;

    public test(String title){
        super(title);
        gb = new GridBagLayout();
        setLayout(gb);
        gbc =  new GridBagConstraints();
        ta = new JTextArea("textarea",5,10);
        tf = new JTextField("enter your name");
        b1 = new JButton();
        b2 = new JButton();
        cbg = new CheckboxGroup();
        cb1=new Checkbox("Bold", cbg,false); 
        cb2=new Checkbox("Italic", cbg,false); 
        cb3=new Checkbox("Plain", cbg,false); 
        cb4=new Checkbox("Bold/Italic", cbg,true); 
        gbc.fill=GridBagConstraints.BOTH; 
        addComponent(ta,0,0,4,1); 
        gbc.fill=GridBagConstraints.HORIZONTAL; 
        addComponent(b1,0,1,1,1); 
        gbc.fill=GridBagConstraints.HORIZONTAL; 
        addComponent(b2,0,2,1,1);
        gbc.fill=GridBagConstraints.HORIZONTAL; 
        addComponent(cb1,2,1,1,1); 
 
        gbc.fill=GridBagConstraints.HORIZONTAL; 
        addComponent(cb2,2,2,1,1); 
        gbc.fill=GridBagConstraints.HORIZONTAL; 
        addComponent(cb3,3,1,1,1); 
        gbc.fill=GridBagConstraints.HORIZONTAL; 
        addComponent(cb4,3,2,1,1); 
 
        gbc.fill=GridBagConstraints.HORIZONTAL; 
        addComponent(tf,4,0,1,3); 
    }

    private void addComponent(Component c, int row, int col, int nrow, int ncol) {
        gbc.gridx=col;
        gbc.gridy = row;
        gbc.gridwidth=ncol; 
        gbc.gridheight=ncol; 
        gb.setConstraints(c,gbc); 
        add(c);
    }
    public static void main(String[] args) {
        test t  = new test("GriBag Layout");
        t.setSize(300,200);
        t.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        t.show();
    }

}