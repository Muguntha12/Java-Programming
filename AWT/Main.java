import java.awt.*;
class Sample extends Frame{
    Sample()
    {
        Frame F=new Frame("Login Page");
        Button B=new Button("Submit");
        TextField T=new TextField("name");
        F.add(T);
        T.setBounds(400,400,80,30);
       B.setBounds(400,400,80,25);
        F.add(B);
        F.setVisible(true);
        F.setSize(1000,1000);
        F.setLayout(null);

    }
}

class Main
{
    public static void main(String[] args) {
        Sample obj=new Sample();
    }
}