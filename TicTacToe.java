import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;
import java.util.Queue;

public class Main implements ActionListener {
    JFrame frame=new JFrame("Tic Tac Toe");
    JButton button1=new JButton();
    JButton button2=new JButton();
    JButton button3=new JButton();
    JButton button4=new JButton();
    JButton button5=new JButton();
    JButton button6=new JButton();
    JButton button7=new JButton();
    JButton button8=new JButton();
    JButton button9=new JButton();
    JButton replayButton=new JButton("Replay");
    JButton clearButton = new JButton("Clear");
    JButton [] buttons=new JButton[]{button1,button2,button3,button4,button5,button6,button7,button8,button9};
    JPanel panel=new JPanel();
    JPanel panel1=new JPanel();
    JLabel label=new JLabel("X turn");

    Main () {
        panel1.setBounds(100,50,300,50);
        panel.setBounds(100,100,300,300);
        for (int i = 0; i < buttons.length; i++) {
            buttons[i].addActionListener(this);
            panel.add(buttons[i]);
            buttons[i].setFont(new Font("MV Boli",Font.BOLD,50));
            buttons[i].setForeground(Color.red);
            buttons[i].setBackground(Color.black);

        }
        replayButton.setBounds(130,420,120,30);
        clearButton.setBounds(250,420,120,30);
        clearButton.addActionListener(this);
        replayButton.addActionListener(this);
        panel1.setBackground(Color.blue);
        panel.setBackground(Color.blue);
        panel.setLayout(new GridLayout(3,3,5,5));

        label.setFont(new Font("MV Boli",Font.BOLD,30));
        label.setForeground(Color.green);
/*        label.setVerticalAlignment(JLabel.TOP);
        label.setHorizontalAlignment(JLabel.CENTER);*/

        panel1.add(label);
        frame.add(replayButton);
        frame.add(clearButton);
        frame.add(panel);
        frame.add(panel1);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLayout(null);
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        Main main=new Main();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for (int i = 0; i < buttons.length; i++) {
            if (e.getSource() == buttons[i] && label.getText().equals("X turn") && buttons[i].getText().equals("")) {
                buttons[i].setText("X");
                label.setText("O turn");
                if (buttons[0].getText().equals("X") && buttons[1].getText().equals("X") && buttons[2].getText().equals("X")) {
                    label.setText("X won");
                    break;
                }
                if (buttons[3].getText().equals("X") && buttons[4].getText().equals("X") && buttons[5].getText().equals("X")) {
                    label.setText("X won");
                    break;
                }
                if (buttons[6].getText().equals("X") && buttons[7].getText().equals("X") && buttons[8].getText().equals("X")) {
                    label.setText("X won");
                    break;
                }
                if (buttons[0].getText().equals("X") && buttons[4].getText().equals("X") && buttons[8].getText().equals("X")) {
                    label.setText("X won");
                    break;
                }
                if (buttons[2].getText().equals("X") && buttons[4].getText().equals("X") && buttons[6].getText().equals("X")) {
                    label.setText("X won");
                    break;
                }
                if (buttons[0].getText().equals("X") && buttons[3].getText().equals("X") && buttons[6].getText().equals("X")) {
                    label.setText("X won");
                    break;
                }
                if (buttons[1].getText().equals("X") && buttons[4].getText().equals("X") && buttons[7].getText().equals("X")) {
                    label.setText("X won");
                    break;
                }
                if (buttons[2].getText().equals("X") && buttons[5].getText().equals("X") && buttons[8].getText().equals("X")) {
                    label.setText("X won");
                    break;
                }
               else if (!buttons[i].getText().equals("") && buttons[i].equals("O") && label.getText().equals("X turn")) {
                    buttons[i].setText("X");
                    label.setText("O turn");
                }
            }
            else if (e.getSource()==buttons[i] && label.getText().equals("O turn") && buttons[i].getText().equals("")) {
                buttons[i].setText("O");
                label.setText("X turn");
                if (buttons[0].getText().equals("O") && buttons[1].getText().equals("O") && buttons[2].getText().equals("O")) {
                    label.setText("O won");
                    break;
                }
                if (buttons[3].getText().equals("O") && buttons[4].getText().equals("O") && buttons[5].getText().equals("O")) {
                    label.setText("O won");
                    break;
                }
                if (buttons[6].getText().equals("O") && buttons[7].getText().equals("O") && buttons[8].getText().equals("O")) {
                    label.setText("O won");
                    break;
                }
                if (buttons[0].getText().equals("O") && buttons[4].getText().equals("O") && buttons[8].getText().equals("O")) {
                    label.setText("O won");
                    break;
                }
                if (buttons[2].getText().equals("O") && buttons[4].getText().equals("O") && buttons[6].getText().equals("O")) {
                    label.setText("O won");
                    break;
                }
                if (buttons[0].getText().equals("O") && buttons[3].getText().equals("O") && buttons[6].getText().equals("O")) {
                    label.setText("O won");
                    break;
                }
                if (buttons[1].getText().equals("O") && buttons[4].getText().equals("O") && buttons[7].getText().equals("O")) {
                    label.setText("O won");
                    break;
                }
                if (buttons[2].getText().equals("O") && buttons[5].getText().equals("O") && buttons[8].getText().equals("O")) {
                    label.setText("O won");
                    break;
                }
                else if (!buttons[i].getText().equals("") && buttons[i].equals("X") && label.getText().equals("O turn")) {
                    buttons[i].setText("O");
                    label.setText("X turn");
                }
            }
        }
        if (e.getSource() == replayButton && (label.getText().equals("X won") || label.getText().equals("O won"))) {
            for (int i=0;i< buttons.length;i++) {
                buttons[i].setText("");
            }
            label.setText("X turn");
        }
        for (int i = 0; i < buttons.length; i++) {
            if (e.getSource()==clearButton && !buttons[i].getText().equals("")) {
                buttons[i].setText("");
            }
        }
    }
}
