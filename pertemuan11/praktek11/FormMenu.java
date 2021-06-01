import java.awt.*;
import java.awt.event.*;
public class FormMenu extends Frame implements ActionListener{

    Button b1;
    Button b2;
    FormMenu(){
        b1=new Button("Berat");
        b1.setBounds(90,100,50,50);
        b1.addActionListener(this);
        b2=new Button("Exit");
        b2.setBounds(150,100,50,50);
        b2.addActionListener(this);
        add(b1);add(b2);
        setSize(400,400);
        setLayout(null);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource()==b1){
            BeratIdeal bi = new BeratIdeal();
            bi.setVisible(true);
            this.dispose();
        }
        if(e.getSource()==b2){
            dispose();
        }
    }
    public static void main(String[] args){
        new FormMenu();
    }
}
