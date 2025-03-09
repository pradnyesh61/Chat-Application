import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.Border;
import java.net.*;  
import java.io.*; 

public class ROTOClient2 extends JFrame implements ActionListener
{
    JButton encrypt,decrypt,send;
    JTextField capital,small,number;
    static JTextField tf;
    static JTextArea ta;
    JPanel p,p1;
    JLabel l1;

    static DataOutputStream dout;
    
    ROTOClient2()
    {
        ta=new JTextArea();
        ta.setBounds(10,40,410,300);
        ta.setEditable(false);
        ta.setLineWrap(true);
        ta.setWrapStyleWord(true);

        tf=new JTextField();
        tf.setBounds(10,500,330,50);

        p=new JPanel();
        p.setBounds(100,360,200,40);

        p1=new JPanel();
        p1.setBounds(50,430,300,50);

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

        encrypt.addActionListener(this);
        decrypt.addActionListener(this);
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
        add(tf);
        add(ta);
        add(p);
        add(p1);

  
        Border border = BorderFactory.createLineBorder(Color.BLUE);

    send.setBorder(BorderFactory.createCompoundBorder(border,BorderFactory.createEmptyBorder(10, 10, 10, 10)));
    tf.setBorder(BorderFactory.createCompoundBorder(border,BorderFactory.createEmptyBorder(10, 10, 10, 10)));
    ta.setBorder(BorderFactory.createCompoundBorder(border,BorderFactory.createEmptyBorder(10, 10, 10, 10)));
    small.setBorder(BorderFactory.createCompoundBorder(border,BorderFactory.createEmptyBorder(10, 10, 10, 10)));
    number.setBorder(BorderFactory.createCompoundBorder(border,BorderFactory.createEmptyBorder(10, 10, 10, 10)));
    capital.setBorder(BorderFactory.createCompoundBorder(border,BorderFactory.createEmptyBorder(10, 10, 10, 10)));
    encrypt.setBorder(BorderFactory.createCompoundBorder(border,BorderFactory.createEmptyBorder(10, 10, 10, 10)));
    decrypt.setBorder(BorderFactory.createCompoundBorder(border,BorderFactory.createEmptyBorder(10, 10, 10, 10)));
   
        send.setForeground(Color.GREEN); 
        tf.setForeground(Color.GREEN);
        capital.setForeground(Color.GREEN);
        small.setForeground(Color.GREEN);
        number.setForeground(Color.GREEN);
        l1.setForeground(Color.GREEN);
        ta.setForeground(Color.GREEN);
        decrypt.setForeground(Color.GREEN);
        encrypt.setForeground(Color.GREEN);
       
        send.setBackground(Color.BLACK);
        tf.setBackground(Color.BLACK);
        small.setBackground(Color.BLACK);
        number.setBackground(Color.BLACK);
        capital.setBackground(Color.BLACK);
        decrypt.setBackground(Color.BLACK);
        encrypt.setBackground(Color.BLACK);
        p1.setBackground(Color.BLACK);
        p.setBackground(Color.BLACK);
        ta.setBackground(Color.BLACK);
        getContentPane().setBackground(Color.BLACK);

        setLayout(null);
        setLocation(400,200);
        setSize(450,625);
        setVisible(true);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==encrypt)
        {
            String input,output="";    
            char c,c1;
            int i,l,a;
            int remain,start;
            int start1=0;
            int n,cap,s;

            n=Integer.parseInt(number.getText());
            cap=Integer.parseInt(capital.getText());
            s=Integer.parseInt(small.getText());

            input=tf.getText();
            l=input.length();


            for(i=0;i<l;i++)
            {
                c=input.charAt(i);
                a=(int)c;
    
                if(a>=65 && a<=90)
                {
                    a=a+cap;
    
                    if(a>90)
                    {
                        remain=a-90;
                        start=remain+64;
    
                        c1=(char)start;
                        output=output+c1;
                    }
                    else
                    {
                        c1=(char)a;
                        output=output+c1;
                    }
                }
    
                if(a>=97 && a<=122)
                {
                    a=a+s;
                 
                    if(a>122)
                    {
                        remain=a-122;
                        start=remain+96;
    
                        c1=(char)start;
                        output=output+c1;
                    }
                    else
                    {
                        c1=(char)a;
                        output=output+c1;
                    }
                }
    
                if(a>=48 && a<=56)
                {
                    a=a+n;
                    
                    c1=(char)a;
                    output=output+c1;
                }
    
                if(a==32)
                {
                    c1=(char)a;
                    output=output+c1;
                }
                
            }
            tf.setText(output);
        }

        if(e.getSource()==decrypt)
        {
            String input;
            String output="";
            char c,c1;
            int i,l,a;
            int remain,start;
            int start1=0;
            int n,cap,s;
    
            n=Integer.parseInt(number.getText());
            cap=Integer.parseInt(capital.getText());
            s=Integer.parseInt(small.getText());

            input=tf.getText();
            l=input.length();
            
    
            for(i=0;i<l;i++)
            {
                c=input.charAt(i);
                a=(int)c;
    
                if(a>=65 && a<=90)
                {
                    a=a-cap;
    
                    if(a<65)
                    {
                        remain=65-a;
                        start=91-remain;
    
                        c1=(char)start;
                        output=output+c1;
                    }
                    else
                    {
                        c1=(char)a;
                        output=output+c1;
                    }
                }
    
                if(a>=97 && a<=122)
                {
                    a=a-s;
                 
                    if(a>122)
                    {
                        remain=97-a;
                        start=123-remain;
    
                        c1=(char)start;
                        output=output+c1;
                    }
                    else
                    {
                        c1=(char)a;
                        output=output+c1;
                    }
                }
    
                if(a>=48 && a<=56)
                {
                    a=a-n;
    
                    c1=(char)a;
                    output=output+c1;
                }
    
                if(a==32)
                {
                    c1=(char)a;
                    output=output+c1;
                }
                
            }
            tf.setText(output);
        }

        if(e.getSource()==send)
        {
            try
        {
            String msg1="";
            if(e.getSource()==send)
            {

                msg1=(String)tf.getText();
                String msg="server : "+msg1;
                dout.writeUTF(msg);
                ta.append("\n\t\t\t"+msg1);
                tf.setText("");
                 
            }
        }
        catch(Exception r)
        {

        }
        }
    
    }
   
    public static void main(String []args)
    {
        new ROTOClient2().setVisible(true);


        try
        {      
         Socket s=new Socket("localhost",12);  
         
         DataInputStream din=new DataInputStream(s.getInputStream());
         dout=new DataOutputStream(s.getOutputStream());  
        
         while(true)
         {
         String  str=(String)din.readUTF();
         ta.append(tf.getText()+"\n"+str); 
         }
        
        }
        catch(Exception e){System.out.println(e);}  
        }  
    
}