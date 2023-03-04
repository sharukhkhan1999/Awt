
package javaawtprogram;
import java.awt.*;
public class Javaawtprogram {
    public static void main(String[] args) {

         Frame f=new Frame("Calculator");
        TextField b= new TextField();
        Button b1=new Button("1");
        Button b2=new Button("2");
        Button b3=new Button("3");
        Button b4=new Button("+");
        
        Button b5=new Button("4");
        Button b6=new Button("5");
        Button b7=new Button("6");
        Button b8=new Button("-");
        Button b9=new Button("7");
        Button b10=new Button("8");
        Button b11=new Button("9");
        Button b12=new Button("X");
        Button b13=new Button("0");
        Button b14=new Button("/");
        Button b15=new Button("=");
        Button b16=new Button("*");
        
        
       // TextField t=new TextField();
        b.setBounds(100,100, 207, 45);
        b1.setBounds(100,150,55,40);
        b2.setBounds(150,150,55,40);
        b3.setBounds(200,150,55,40);
        b4.setBounds(250,150,55,40);
        b5.setBounds(100,200,55,40);
        b6.setBounds(150,200,55,40);
        b7.setBounds(200,200,55,40);
        b8.setBounds(250,200,55,40);
        b9.setBounds(100,250,55,40);
        b10.setBounds(150,250,55,40);
        b11.setBounds(200,250,55,40);
        b12.setBounds(250,250,55,40);
        b13.setBounds(150,300,55,40);
        b14.setBounds(250,300,55,40);
        b15.setBounds(200,300,55,40);
        b16.setBounds(100,300,55,40);
      
    //  b8.setBackground(Color.blue);
      //b4.setBackground(Color.blue);
      //b12.setBackground(Color.blue);
      //b14.setBackground(Color.blue);
      b15.setBackground(Color.yellow);
      //b16.setBackground(Color.blue);
    b.setBackground(Color.green);
        f.add(b);
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(b5);
        f.add(b6);
        f.add(b7);
        f.add(b8);
        f.add(b9);
        f.add(b10);
        f.add(b11);
        f.add(b12);
        f.add(b13);
        f.add(b14);
        f.add(b15);
        f.add(b16);
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
        
    }
    
}
