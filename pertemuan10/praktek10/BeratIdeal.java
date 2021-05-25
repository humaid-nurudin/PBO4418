import java.awt.*;
import java.awt.event.*;

public class BeratIdeal extends Frame implements ActionListener{
    TextField tf1,tf2,tf3,tf4,tf5;  
    Button b1,b2;
    Label l1,l2,l3,l4,l5;
    BeratIdeal(){
        // System.out.print("Nama ");
        l1=new Label("Nama: ");
        l1.setBounds(30,50,150,20);
        l2=new Label("NIM: ");
        l2.setBounds(30,100,150,20);
        l3=new Label("Berat(kg): ");
        l3.setBounds(30,150,150,20);
        l4=new Label("Tinggi(m): ");
        l4.setBounds(30,200,150,20);
        l5=new Label("Hasil: ");
        l5.setBounds(30,310,150,20);

        
        tf1=new TextField();
        tf1.setBounds(90,50,150,20);
        // System.out.print("NIM ");
        tf2=new TextField();
        tf2.setBounds(90,100,150,20);
        // System.out.print("Berat ");
        tf3=new TextField();
        tf3.setBounds(90,150,150,20);
        // System.out.print("Tinggi ");
        tf4=new TextField();
        tf4.setBounds(90,200,150,20);
        tf5=new TextField();
        tf5.setBounds(90,310,350,20);
        tf5.setEditable(false); 
        b1=new Button("Hitung");  
        b1.setBounds(90,250,50,50);
        b1.addActionListener(this);
        add(tf1);add(tf2);add(tf3);add(tf4);add(tf5);add(b1);add(l1);add(l2);add(l3);add(l4);add(l5);
        setSize(400,400);
        
        setLayout(null);  
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e) {  
        String s1=tf3.getText();  
        String s2=tf4.getText(); 
        String s3=tf1.getText();
        String s4=tf2.getText();
        float a=Float.parseFloat(s1);  
        float b=Float.parseFloat(s2);  
        float c=0;  
        if(e.getSource()==b1){  
            c=a/(b*b);
        }
        String result=String.valueOf(c);
        float d=Float.parseFloat(result);
        if(d>=18.5 && d<=24.9){
            tf5.setText("NIM: "+s4+ ",Nama: "+s3+" berat anda: "+c+" kg, Berat anda sudah ideal");
        }else{
            tf5.setText(" berat anda: "+c+" kg, Berat anda tidak ideal");
        }}


        
    public static void main(String[] args){
        new BeratIdeal();
    }
}
