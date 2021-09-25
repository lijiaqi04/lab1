import javax.lang.model.type.NullType;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.CancellationException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.ImageIcon;

public class SwingLoginExample {

    private static String name;
    private static String dateOfBirth;
    private static String geographicData;
    private static int telephone;
    private static String faxNumber;
    private static String emailAddresses;
    private static String socialSecurityNumber;
    private static long medicalRecordNumber;
    private static String healthPlanBeneficiaryNumber;
    private static long bankAccountNumbers;
    private static String licenseNumber;
    private static String vehicleIdentifiersAndSerialNumbersIncludingLicensePlates;
    private static String deviceIdentifiersAndSerialNumbers;
    private static String LinkedIn;
    private static String internetProtocolAddresses;
    private static String anyUniqueIdentifyingNumberCharacteristicOrCode;
    private static Icon personImage;
    private static Icon geoCharacterize;
    private static  JLabel picLabel;
    private static boolean initFlag = true;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Login Example");

        frame.setSize(550, 200);

        JPanel panel = new JPanel();

        frame.add(panel);
        placeComponents(panel);

        frame.setVisible(true);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private static void placeComponents(JPanel panel) {
        panel.setLayout(null);

        JLabel emailLabel = new JLabel("Email:");
        emailLabel.setBounds(10,20,80,25);
        panel.add(emailLabel);

        JTextField emailText = new JTextField(20);
        emailText.setBounds(200,20,165,25);
        emailText.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {

            }

            @Override
            public void focusLost(FocusEvent e) {

                if(initFlag){
                    initFlag = false;
                    return;
                }
                String check="\\w[-\\w.+]*@([A-Za-z0-9][-A-Za-z0-9]+\\.)+[A-Za-z]{2,14}";
                Pattern re=Pattern.compile(check);
                String email=emailText.getText();
                Matcher matcher=re.matcher(email);
                boolean isMatch= matcher.matches();
                if (!isMatch){
                    JOptionPane.showMessageDialog(panel,"???");
                }
                else{
                   emailAddresses=email;
                }
            }
        });
        panel.add(emailText);

        JLabel nameLabel = new JLabel("Name:");
        nameLabel.setBounds(10,50,80,25);
        panel.add(nameLabel);


        JTextField nameText = new JTextField(20);
        nameText.setBounds(200,50,165,25);
        nameText.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {

            }

            @Override
            public void focusLost(FocusEvent e) {
                name=nameText.getText();
            }
        });
        panel.add(nameText);

        JLabel birthday = new JLabel("Birthday(layout:yy-mm-dd):");
        birthday.setBounds(10,80,160,25);
        panel.add(birthday);


        JTextField birthText = new JTextField(20);
        birthText.setBounds(200,80,165,25);
        birthText.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {

            }

            @Override
            public void focusLost(FocusEvent e) {
                String check_1="(([0-9]{3}[1-9]|[0-9]{2}[1-9][0-9]{1}|[0-9]{1}[1-9][0-9]{2}|[1-9][0-9]{3})-(((0[13578]|1[02])-(0[1-9]|[12][0-9]|3[01]))|((0[469]|11)-(0[1-9]|[12][0-9]|30))|(02-(0[1-9]|[1][0-9]|2[0-8]))))|((([0-9]{2})(0[48]|[2468][048]|[13579][26])|((0[48]|[2468][048]|[3579][26])00))-02-29)";
                Pattern re_1=Pattern.compile(check_1);
                String birth=birthText.getText();
                Matcher matcher=re_1.matcher(birth);
                boolean isMatch= matcher.matches();
                if (!isMatch){
                    JOptionPane.showMessageDialog(panel,"???");
                }
                else{
                    dateOfBirth=birth;
                }
            }
        });
        panel.add(birthText);

        JLabel geographicLabel = new JLabel("Geographic data:");
        geographicLabel.setBounds(10,110,130,25);
        panel.add(geographicLabel);


        JTextField geographicText = new JTextField(20);
        geographicText.setBounds(200,110,165,25);
        geographicText.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {

            }

            @Override
            public void focusLost(FocusEvent e) {
                geographicData=nameText.getText();
            }
        });
        panel.add(geographicText);



        JTextField socialText = new JTextField(20);
        socialText.setBounds(200,110,165,25);
        socialText.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {

            }

            @Override
            public void focusLost(FocusEvent e) {
                socialSecurityNumber=nameText.getText();
            }
        });
        panel.add(geographicText);

        JLabel internetLabel = new JLabel("Internet Protocol Addresses:");
        internetLabel.setBounds(10,140,120,25);
        panel.add(internetLabel);

        JTextField internetText = new JTextField(20);
        internetText.setBounds(200,140,165,25);
        internetText.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {

            }

            @Override
            public void focusLost(FocusEvent e) {

                if(initFlag){
                    initFlag = false;
                    return;
                }
                String check_2="([1-9]|[1-9]\\d|1\\d{2}|2[0-4]\\d|25[0-5])(\\.(\\d|[1-9]\\d|1\\d{2}|2[0-4]\\d|25[0-5])){3}";
                Pattern re_2=Pattern.compile(check_2);
                String internet=internetText.getText();
                Matcher matcher=re_2.matcher(internet);
                boolean isMatch= matcher.matches();
                if (!isMatch){
                    JOptionPane.showMessageDialog(panel,"???");
                }
                else{
                    internetProtocolAddresses=internet;
                }
            }
        });
        panel.add(internetText);

        JLabel personLabel = new JLabel("personal images:");
        personLabel.setBounds(10,170,120,25);
        panel.add(personLabel);

        picLabel= new JLabel(new ImageIcon("/Users/lijiaqi/Desktop/java/lab1/untitled/1401.jpg"));
        picLabel.setBounds(200,170,80,80);
        panel.add(picLabel);

        picLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                JFileChooser jf=new JFileChooser();
                jf.setFileSelectionMode(JFileChooser.FILES_ONLY);
                jf.showDialog(new JLabel(),"选择");
                File file=jf.getSelectedFile();
                picLabel.setIcon(new ImageIcon(file.getAbsolutePath()));
                panel.add(picLabel);
            }
        });

        JButton loginButton = new JButton("login");
        loginButton.setBounds(10, 260, 130, 25);
        loginButton.addActionListener(l->{

        });
        panel.add(loginButton);

    }
}



