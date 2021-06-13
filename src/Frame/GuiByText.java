package Frame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuiByText extends JFrame {

    JButton btn1 = new JButton("Tombol");

    public GuiByText() {
        setSize(640,480);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void meletakkanKomponen(){
        getContentPane().setLayout(null);

        getContentPane().add(btn1);

        btn1.setBounds(16,16,100,35);
    }

    public void menambahkanListener(){
        btn1.addActionListener(e -> {
            String nama = "Hasanurrahman";
            JOptionPane.showMessageDialog(null,nama);
        });
    }

    public static void main(String[] args) {
        GuiByText g = new GuiByText();
        g.meletakkanKomponen();
        g.menambahkanListener();
        g.setVisible(true);
    }
}
