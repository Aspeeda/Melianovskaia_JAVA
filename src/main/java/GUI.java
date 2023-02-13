import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI extends JFrame {

    public JButton button1 = new JButton("Поиск");
    public JTextField input = new JTextField("", 3);
    public JTextField output = new JTextField("", 3);
    public JLabel inputLabel = new JLabel("Input");
    public JLabel outputLabel = new JLabel("Output");

    public GUI() {
        super("Task #2");
        {
            this.setBounds(20, 20, 500, 200);

            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            Container container = this.getContentPane();
            this.getContentPane().setBackground(Color.lightGray);
            container.setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

            container.add(inputLabel);
            container.add(input);
            container.add(outputLabel);
            container.add(output);

            container.add(button1);

            button1.addActionListener(new Search());

        }


    }

    public class Search implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == button1) {
                try {
                    output.setText(resultSearch(input.getText()));
                } catch (Exception except) {
                    output.setText("Пожалуйста, введите имя");
                }

                input.setText(null);


            }
        }

        public String resultSearch(String name) {
            String result = name.toLowerCase();
            if (result.equals("вячеслав")) {
                result = "Привет, Вячеслав";
            } else {
                result = "Нет такого имени";
            }
            return result;
        }
    }


}