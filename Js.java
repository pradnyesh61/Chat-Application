import javax.swing.*;
import java.awt.*;
import java.awt.Color;
import java.awt.event.*;
import javax.swing.border.Border;
import javax.swing.text.Style;
import javax.swing.text.StyleConstants;

//import javax.swing.border.LineBorder;

public class Js extends JFrame
{
    JButton encrypt,decrypt,send;
    JTextField capital,small,number;
    JTextArea t;
    JTextField all;
    JPanel p,p1;
    JLabel l1;

    Js()
    {
        t=new JTextArea();
        t.setBounds(10,40,410,300);
      //  t.setEditable(false);
        t.setLineWrap(true);
        t.setWrapStyleWord(true);

        String setmsg="hello akjdvadv madoersadvkasld vas";
        String GO="helloe";
        t.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        t.setText(setmsg);
        t.setText("\n\t\t\t"+GO);

        all=new JTextField();
        all.setBounds(10,500,330,50);
        

        p=new JPanel();
        p.setBounds(100,360,200,40);

        p1=new JPanel();
        p1.setBounds(50,420,300,50);

        l1=new JLabel("KEY");
        l1.setBounds(60,365,30,30);
        
        capital=new JTextField();
        small=new JTextField();
        number=new JTextField();


        capital.setHorizontalAlignment(JTextField.CENTER);
        small.setHorizontalAlignment(JTextField.CENTER);
        number.setHorizontalAlignment(JTextField.CENTER);

        encrypt=new JButton("ENCRYPT");
        decrypt=new JButton("DECRYPT");

        send=new JButton("SEND");
        send.setBounds(350,500,70,50);

        p.setLayout(new GridLayout(1,6));
        p1.setLayout(new GridLayout(1,2,10,10));

        p.add(capital);
        p.add(small);
        p.add(number);
        p1.add(encrypt);
        p1.add(decrypt);
        
        add(send);
        add(l1);
        add(all);
        add(t);
        add(p);
        add(p1);

  
        Border border = BorderFactory.createLineBorder(Color.BLUE);

    send.setBorder(BorderFactory.createCompoundBorder(border,BorderFactory.createEmptyBorder(10, 10, 10, 10)));
    all.setBorder(BorderFactory.createCompoundBorder(border,BorderFactory.createEmptyBorder(10, 10, 10, 10)));
    t.setBorder(BorderFactory.createCompoundBorder(border,BorderFactory.createEmptyBorder(10, 10, 10, 10)));
    small.setBorder(BorderFactory.createCompoundBorder(border,BorderFactory.createEmptyBorder(10, 10, 10, 10)));
    number.setBorder(BorderFactory.createCompoundBorder(border,BorderFactory.createEmptyBorder(10, 10, 10, 10)));
    capital.setBorder(BorderFactory.createCompoundBorder(border,BorderFactory.createEmptyBorder(10, 10, 10, 10)));
    encrypt.setBorder(BorderFactory.createCompoundBorder(border,BorderFactory.createEmptyBorder(10, 10, 10, 10)));
    decrypt.setBorder(BorderFactory.createCompoundBorder(border,BorderFactory.createEmptyBorder(10, 10, 10, 10)));
   
        send.setForeground(Color.GREEN); 
        all.setForeground(Color.GREEN);
        capital.setForeground(Color.GREEN);
        small.setForeground(Color.GREEN);
        number.setForeground(Color.GREEN);
        l1.setForeground(Color.GREEN);
        t.setForeground(Color.GREEN);
        decrypt.setForeground(Color.GREEN);
        encrypt.setForeground(Color.GREEN);
       
        send.setBackground(Color.BLACK);
        all.setBackground(Color.BLACK);
        small.setBackground(Color.BLACK);
        number.setBackground(Color.BLACK);
        capital.setBackground(Color.BLACK);
        decrypt.setBackground(Color.BLACK);
        encrypt.setBackground(Color.BLACK);
        p1.setBackground(Color.BLACK);
        p.setBackground(Color.BLACK);
        t.setBackground(Color.BLACK);
        getContentPane().setBackground(Color.BLACK);

        setLayout(null);
        setSize(450,625);
        setLocation(1100,400);
        setVisible(true);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String []args)
    {
        new Js();
    }
}