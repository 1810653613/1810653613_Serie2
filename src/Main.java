import javax.swing.*;

public class Main {

    public static void main(String[] args)
    {
        String name=JOptionPane.showInputDialog("Bitte geben sie einen Namen ein");
        System.out.println(name);
        int alter=Integer.parseInt (JOptionPane.showInputDialog("Bitte geben sie eine ganze Zahle ein"));
        System.out.println(alter);
        if(alter>=18)
        {
            JOptionPane.showMessageDialog(null, "Die Person ist bereits volljährig") ;
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Die Person ist noch nicht volljährig");
        }
    }
}
