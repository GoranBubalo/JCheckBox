import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//We made the Class MyFrame behave like JFrame class, we do that by adding the keyword extends and then
// Class JFrame, we also implement ActionListener
public class MyFrame extends JFrame implements ActionListener {

    //We made this object button global
    JButton button;
    JCheckBox checkBox;
    ImageIcon xIcon;
    ImageIcon checkIcon;

    public  MyFrame(){
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setLayout( new FlowLayout());

    //change the appearance of the checkbox
    xIcon = new ImageIcon("close.png");
    checkIcon = new ImageIcon("rgb.png");

    button = new JButton();
    button.setText("Submit");
    button.addActionListener(this);

     checkBox = new JCheckBox();

    checkBox.setText("I am not a robot");
    checkBox.setFocusable(false); // removes the text border
    checkBox.setFont(new Font("Consolas",Font.PLAIN,35));
    checkBox.setIcon(xIcon);
    checkBox.setSelectedIcon(checkIcon);



    this.add(button);
    this.add(checkBox);
    this.pack();// automatically re-sizes the component to fit
    this.setVisible(true);



    }


    //This method listens to events
    @Override
    public void actionPerformed(ActionEvent e) {
    if (e.getSource() == button){
        System.out.println(checkBox.isSelected());
    }
    }
}
