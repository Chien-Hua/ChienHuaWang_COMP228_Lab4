package exercise1;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.border.EmptyBorder;

public class StudentGUI extends JFrame{
    private JPanel contentPane;
    private JTextField textField;
    private JTextField textField_1;
    private JTextField textField_2;
    private JTextField textField_3;
    private JTextField textField_4;
    private JTextField textField_5;
    private JTextField textField_6;
    private JTextArea textArea;
    private JComboBox comboBox;
    private JRadioButton rdbtnNewRadioButton;
    private JRadioButton rdbtnBusiness;
    private ButtonGroup radioGroup;
    private JTextArea textArea_1;
    private JCheckBox checkBox_1;
    private JCheckBox chckbxVolunteerWork;
// end of variables

    // for Driver Test
    public static void main(String[] args) {
            EventQueue.invokeLater(new Runnable() {
                @Override
                public void run() {
                    try {
                        StudentGUI area = new StudentGUI();
                        area.setVisible(true);
                    } catch (Exception e){
                        e.printStackTrace();
                    }
                }
            });
    }
    // create the frame
    public StudentGUI(){
        super("Student Information");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 550, 362);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JPanel panel = new JPanel();
        panel.setBounds(10, 11, 92, 180);
        contentPane.add(panel);
        panel.setLayout(new GridLayout(0, 1, 0, 0));

        //** This label Name
        JLabel label = new JLabel("Name");
        panel.add(label);

        JLabel lblNewLabel = new JLabel("Address  ");
        panel.add(lblNewLabel);

        JLabel label_1 = new JLabel("Province  ");
        panel.add(label_1);

        JLabel label_2 = new JLabel("Your City   ");
        panel.add(label_2);

        JLabel lblNewLabel_1 = new JLabel("Postal Code");
        panel.add(lblNewLabel_1);

        JLabel lblNewLabel_3 = new JLabel("Phone Number");
        panel.add(lblNewLabel_3);

        JLabel lblNewLabel_2 = new JLabel("Email");
        panel.add(lblNewLabel_2);// end of label

        JPanel panel_1 = new JPanel();
        panel_1.setBounds(94, 11, 125, 180);// set panel borad
        contentPane.add(panel_1);

        textField_1 = new JTextField();
        panel_1.add(textField_1);
        textField_1.setColumns(10);

        textField_2 = new JTextField();
        panel_1.add(textField_2);
        textField_2.setColumns(10);

        textField_3 = new JTextField();
        panel_1.add(textField_3);
        textField_3.setColumns(10);

        textField_4 = new JTextField();
        panel_1.add(textField_4);
        textField_4.setColumns(10);

        textField_5 = new JTextField();
        panel_1.add(textField_5);
        textField_5.setColumns(10);

        textField_6 = new JTextField();
        panel_1.add(textField_6);

        textField_6.setColumns(10);

        textField = new JTextField();
        panel_1.add(textField);
        textField.setColumns(10);

        JPanel panel_2 = new JPanel();
        panel_2.setBounds(298, 11, 226, 33);
        contentPane.add(panel_2);

        rdbtnNewRadioButton = new JRadioButton("Computer Science");

        panel_2.add(rdbtnNewRadioButton);

        rdbtnBusiness = new JRadioButton("Business");

        panel_2.add(rdbtnBusiness);

        radioGroup = new ButtonGroup();
        radioGroup.add(rdbtnNewRadioButton);
        radioGroup.add(rdbtnBusiness);

        JPanel panel_3 = new JPanel();
        panel_3.setBounds(218, 133, 112, 59);
        contentPane.add(panel_3);

        chckbxVolunteerWork = new JCheckBox("Volunteer Work");
        panel_3.add(chckbxVolunteerWork);

        JPanel panel_4 = new JPanel();
        panel_4.setBounds(10, 188, 514, 33);
        contentPane.add(panel_4);

        JButton btnNewButton = new JButton("Display");
        btnNewButton.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent arg0)
            {
                String names = textField_1.getText();
                String address = textField_2.getText();
                String province = textField_3.getText();
                String city = textField_4.getText();
                String postal = textField_5.getText();
                String phone = textField_6.getText();
                String email = textField.getText();
                String courses = textArea_1.getText();
                textArea.setText("Student Name# "+ names + ",  "+ " Address# " + address + ",  " + province + ",  " + city + ",   " + postal + ",  " +
                        "\n Contact Number# "+phone + ",  " + " Email " + email  + "\nCourses:\n"  + courses);

                if(checkBox_1.isSelected() && chckbxVolunteerWork.isSelected())
                {
                    textArea.append("Member of student Council & Involved in volunteer Work");
                }
                else if(chckbxVolunteerWork.isSelected())
                {
                    textArea.append(" Involved in volunteer Work");
                }
                else if(checkBox_1.isSelected())
                {
                    textArea.append("Member of student Council");
                }
            }
        });
        panel_4.add(btnNewButton);

        JPanel panel_5 = new JPanel();
        panel_5.setBounds(218, 32, 125, 42);
        contentPane.add(panel_5);

        checkBox_1 = new JCheckBox("Student Council     ");
        panel_5.add(checkBox_1);

        JPanel panel_6 = new JPanel();
        panel_6.setBounds(374, 55, 125, 42);
        contentPane.add(panel_6);



    }
}
