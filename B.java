import java.io.*;  
import java.net.*;  
import javax.swing.*;
import java.awt.*;
import java.awt.Color;
import java.awt.event.*;
import javax.swing.border.Border;

public class B extends JFrame implements ActionListener
{  

    JButton encrypt,decrypt,send;
    JTextField capital,small,number;
    static JTextArea t;
    JTextField all;
    JPanel p,p1;
    JLabel l1;

   static DataOutputStream dout;

    B()
    {
        t=new JTextArea();
        t.setBounds(40,40,350,200);

        all=new JTextField();
        all.setBounds(40,270,350,50);

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
        send.setBounds(150,500,100,50);

        send.addActionListener(this);

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
        setVisible(true);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e)
    {
        try
        {
            String msg1="";
            if(e.getSource()==send)
            {

                msg1=(String)all.getText();
                String msg="hello server"+msg1;
                dout.writeUTF(msg);
                all.setText("");
                 
            }
        }
        catch(Exception r)
        {

        }
    }

public static void main(String[] args) 
{
    new B();  
try
{      
 Socket s=new Socket("localhost",12);  
 
 DataInputStream din=new DataInputStream(s.getInputStream());
 dout=new DataOutputStream(s.getOutputStream());  

 while(true)
 {
 String  str=(String)din.readUTF();
 t.append("message= "+str); 
 }

}
catch(Exception e){System.out.println(e);}  
}  
}