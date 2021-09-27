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
    private static long telephone;
    private static long faxNumber;
    private static String emailAddresses;
    private static long socialSecurityNumber;
    private static long medicalRecordNumber;
    private static long bankAccountNumbers;
    private static long licenseNumber;
    private static long vehicleIdentifiersAndSerialNumbersIncludingLicensePlates;
    private static String LinkedIn;
    private static String internetProtocolAddresses;
    private static long nuID;
    private static  JLabel picLabel;
    private static  JLabel identifierLabel;
    private static boolean initFlag = true;

    public static void main(String[] args) {
        JFrame frame = new JFrame("personal files");

        frame.setSize(850, 1000);

        JPanel panel = new JPanel();

        frame.add(panel);
        placeComponents(panel);

        frame.setVisible(true);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private static void placeComponents(JPanel panel) {
        panel.setLayout(null);

        JLabel emailLabel = new JLabel("Email:");
        emailLabel.setBounds(10, 20, 80, 25);
        panel.add(emailLabel);

        JTextField emailText = new JTextField(20);
        emailText.setBounds(200, 20, 165, 25);
        emailText.addFocusListener(new FocusAdapter() {
            @Override
            public void focusLost(FocusEvent e) {
                if (initFlag) {
                    initFlag = false;
                    return;
                }
                String check = "\\w[-\\w.+]*@([A-Za-z0-9][-A-Za-z0-9]+\\.)+[A-Za-z]{2,14}";
                Pattern re = Pattern.compile(check);
                String email = emailText.getText();
                Matcher matcher = re.matcher(email);
                boolean isMatch = matcher.matches();
                if (!isMatch) {
                    JOptionPane.showMessageDialog(panel, "???");
                } else {
                    emailAddresses = emailText.getText();
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
                String check_3="^[a-zA-Z]+\\s?[\\.·\\-()a-zA-Z]*[a-zA-Z]+$";
                Pattern re_3=Pattern.compile(check_3);
                String name_1=nameText.getText();
                Matcher matcher=re_3.matcher(name_1);
                boolean isMatch= matcher.matches();
                if (!isMatch){
                    JOptionPane.showMessageDialog(panel,"???");
                }
                else {
                    name = name_1;
                }
            }
        });
        panel.add(nameText);

        JLabel birthday = new JLabel("Birthday(layout:yy-mm-dd):");
        birthday.setBounds(10,80,180,25);
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
                geographicData=geographicText.getText();
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

        JLabel faxLabel = new JLabel("FAX number:");
        faxLabel.setBounds(10,170,120,25);
        panel.add(faxLabel);


        JTextField faxText = new JTextField(20);
        faxText.setBounds(200,170,165,25);
        faxText.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {

            }

            @Override
            public void focusLost(FocusEvent e) {
                String check_fax="^([0-9]{8})$";
                Pattern re_fax=Pattern.compile(check_fax);
                String fax=faxText.getText();
                Matcher matcher=re_fax.matcher(fax);
                boolean isMatch= matcher.matches();
                long r = 0;
                if (!isMatch){
                    JOptionPane.showMessageDialog(panel,"???");
                }
                else {
                      if ( null != fax) {
                            r = Long.parseLong(fax);
                      }
                      else{
                          JOptionPane.showMessageDialog(panel,"???");
                      }
                        faxNumber = r;
                }
            }
        });
        panel.add(faxText);


        JLabel teleLabel = new JLabel("telephone number:");
        teleLabel.setBounds(10,200,120,25);
        panel.add(teleLabel);


        JTextField teleText = new JTextField(20);
        teleText.setBounds(200,200,165,25);
        teleText.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {

            }

            @Override
            public void focusLost(FocusEvent e) {
                String check_tele="^([4-6][0-9]{9})$";
                Pattern re_tele=Pattern.compile(check_tele);
                String tele=teleText.getText();
                Matcher matcher=re_tele.matcher(tele);
                boolean isMatch= matcher.matches();
                long r = 0;
                if (!isMatch){
                    JOptionPane.showMessageDialog(panel,"???");
                }
                else {
                    if ( null != tele) {
                        r = Long.parseLong(tele);
                    }
                    else{
                        JOptionPane.showMessageDialog(panel,"???");
                    }
                    telephone = r;
                }
            }
        });
        panel.add(teleText);

        JLabel socialLabel = new JLabel("social security number:");
        socialLabel.setBounds(410,20,160,25);
        panel.add(socialLabel);


        JTextField socialText = new JTextField(20);
        socialText.setBounds(600,20,165,25);
        socialText.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {

            }

            @Override
            public void focusLost(FocusEvent e) {
                String check_social="^([0-9]{9})$";
                Pattern re_social=Pattern.compile(check_social);
                String social=socialText.getText();
                Matcher matcher=re_social.matcher(social);
                boolean isMatch= matcher.matches();
                long r = 0;
                if (!isMatch){
                    JOptionPane.showMessageDialog(panel,"???");
                }
                else {
                    if ( null != social) {
                        r = Long.parseLong(social);
                    }
                    else{
                        JOptionPane.showMessageDialog(panel,"???");
                    }
                    socialSecurityNumber = r;
                }
            }
        });
        panel.add(socialText);

        JLabel medicalLabel = new JLabel("medical record number:");
        medicalLabel.setBounds(410,50,160,25);
        panel.add(medicalLabel);


        JTextField medicalText = new JTextField(20);
        medicalText.setBounds(600,50,165,25);
        medicalText.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {

            }

            @Override
            public void focusLost(FocusEvent e) {
                String check_medical="^([0-9]{9})$";
                Pattern re_medical=Pattern.compile(check_medical);
                String medical=socialText.getText();
                Matcher matcher=re_medical.matcher(medical);
                boolean isMatch= matcher.matches();
                long r = 0;
                if (!isMatch){
                    JOptionPane.showMessageDialog(panel,"???");
                }
                else {
                    if ( null != medical) {
                        r = Long.parseLong(medical);
                    }
                    else{
                        JOptionPane.showMessageDialog(panel,"???");
                    }
                    medicalRecordNumber = r;
                }
            }
        });
        panel.add(medicalText);


        JLabel nuLabel = new JLabel("NUID:");
        nuLabel.setBounds(410,80,160,25);
        panel.add(nuLabel);


        JTextField nuText = new JTextField(20);
        nuText.setBounds(600,80,165,25);
        nuText.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {

            }

            @Override
            public void focusLost(FocusEvent e) {
                String check_nu="^([0-9]{9})$";
                Pattern re_nu=Pattern.compile(check_nu);
                String nu=nuText.getText();
                Matcher matcher=re_nu.matcher(nu);
                boolean isMatch= matcher.matches();
                long r = 0;
                if (!isMatch){
                    JOptionPane.showMessageDialog(panel,"???");
                }
                else {
                    if ( null != nu) {
                        r = Long.parseLong(nu);
                    }
                    else{
                        JOptionPane.showMessageDialog(panel,"???");
                    }
                    nuID = r;
                }
            }
        });
        panel.add(nuText);


        JLabel bankLabel = new JLabel("bank account number:");
        bankLabel.setBounds(410,140,120,25);
        panel.add(bankLabel);


        JTextField bankText = new JTextField(20);
        bankText.setBounds(600,140,165,25);
        bankText.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {

            }

            @Override
            public void focusLost(FocusEvent e) {
                String check_bank="^([0-9]{10})$";
                Pattern re_bank=Pattern.compile(check_bank);
                String bank=bankText.getText();
                Matcher matcher=re_bank.matcher(bank);
                boolean isMatch= matcher.matches();
                long r = 0;
                if (!isMatch){
                    JOptionPane.showMessageDialog(panel,"???");
                }
                else {
                    if ( null != bank) {
                        r = Long.parseLong(bank);
                    }
                    else{
                        JOptionPane.showMessageDialog(panel,"???");
                    }
                    bankAccountNumbers = r;
                }
            }
        });
        panel.add(bankText);

        JLabel licenseLabel = new JLabel("license numberr:");
        licenseLabel.setBounds(410,170,120,25);
        panel.add(licenseLabel);


        JTextField licenseText = new JTextField(20);
        licenseText.setBounds(600,170,165,25);
        licenseText.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {

            }

            @Override
            public void focusLost(FocusEvent e) {
                String check_license="^([0-9]{10})$";
                Pattern re_license=Pattern.compile(check_license);
                String license=licenseText.getText();
                Matcher matcher=re_license.matcher(bank);
                boolean isMatch= matcher.matches();
                long r = 0;
                if (!isMatch){
                    JOptionPane.showMessageDialog(panel,"???");
                }
                else {
                    if ( null != license) {
                        r = Long.parseLong(bank);
                    }
                    else{
                        JOptionPane.showMessageDialog(panel,"???");
                    }
                    licenseNumber = r;
                }
            }
        });
        panel.add(licenseText);


        JLabel carLabel = new JLabel("Vehicle license plates:");
        carLabel.setBounds(410,110,160,25);
        panel.add(carLabel);


        JTextField carText = new JTextField(20);
        carText.setBounds(600,110,165,25);
        carText.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {

            }

            @Override
            public void focusLost(FocusEvent e) {
                String check_car="^[A-Z]{1,3}-[A-Z]{1,2}-[0-9]{1,4}$";
                Pattern re_car=Pattern.compile(check_car);
                String car=carText.getText();
                Matcher matcher=re_car.matcher(car);
                boolean isMatch= matcher.matches();
                long r = 0;
                if (!isMatch){
                    JOptionPane.showMessageDialog(panel,"???");
                }
                else {
                    if ( null != car) {
                        r = Long.parseLong(car);
                    }
                    else{
                        JOptionPane.showMessageDialog(panel,"???");
                    }
                    vehicleIdentifiersAndSerialNumbersIncludingLicensePlates = r;
                }
            }
        });
        panel.add(carText);

        JLabel linLabel = new JLabel("LinkedIn:");
        linLabel.setBounds(10,80,80,25);
        panel.add(linLabel);


        JTextField linText = new JTextField(20);
        linText.setBounds(200,80,165,25);
        linText.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {

            }

            @Override
            public void focusLost(FocusEvent e) {
                String check_lin="^[a-zA-Z]+\\s?[\\.·\\-()a-zA-Z]*[a-zA-Z]+$";
                Pattern re_lin=Pattern.compile(check_lin);
                String name_lin=linText.getText();
                Matcher matcher=re_lin.matcher(name_lin);
                boolean isMatch= matcher.matches();
                if (!isMatch){
                    JOptionPane.showMessageDialog(panel,"???");
                }
                else {
                    LinkedIn = name_lin;
                }
            }
        });
        panel.add(linText);



        picLabel= new JLabel();
        picLabel.setBounds(200,230,180,180);
        panel.add(picLabel);

        JButton imagesButton = new JButton("personal images");
        imagesButton.setBounds(10,230,120,25);
        imagesButton.addActionListener(l->{
            JFileChooser jf=new JFileChooser();
            jf.setFileSelectionMode(JFileChooser.FILES_ONLY);
            jf.showDialog(new JLabel(),"选择");
            File file=jf.getSelectedFile();
            picLabel.setIcon(new ImageIcon(file.getAbsolutePath()));
            panel.add(picLabel);
        });
        panel.add(imagesButton);

        identifierLabel= new JLabel();
        identifierLabel.setBounds(20,450,180,180);
        panel.add(identifierLabel);

        JButton identifiersButton = new JButton("Biometric identifiers (i.e. retinal scan, fingerprints)");
        identifiersButton.setBounds(10,430,420,25);
        identifiersButton.addActionListener(l->{
            JFileChooser jf=new JFileChooser();
            jf.setFileSelectionMode(JFileChooser.FILES_ONLY);
            jf.showDialog(new JLabel(),"选择");
            File file=jf.getSelectedFile();
            identifierLabel.setIcon(new ImageIcon(file.getAbsolutePath()));
            panel.add(identifierLabel);
        });
        panel.add(identifiersButton);


        JButton saveButton = new JButton("save");
        saveButton.setBounds(10, 630, 130, 25);
        saveButton.addActionListener(l->{
            nameText.setText("");
            emailText.setText("");
            internetText.setText("");
            birthText.setText("");
            geographicText.setText("");
            teleText.setText("");
            faxText.setText("");
            medicalText.setText("");
            socialText.setText("");
            nuLabel.setText("");
            carLabel.setText("");
            linLabel.setText("");
            bankLabel.setText("");
            licenseLabel.setText("");
        });
        panel.add(saveButton);

        JButton showButton = new JButton("show");
        showButton.setBounds(150, 630, 130, 25);
        showButton.addActionListener(l->{
            emailText.setText(emailAddresses);
            nameText.setText(name);
            internetText.setText(internetProtocolAddresses);
            birthText.setText(dateOfBirth);
            geographicText.setText(geographicData);
            teleText.setText(String.valueOf(telephone));
            faxText.setText(String.valueOf(faxNumber));
            medicalText.setText(String.valueOf(medicalRecordNumber));
            socialText.setText(String.valueOf(socialSecurityNumber));
            nuLabel.setText(String.valueOf(nuID));
            carLabel.setText(String.valueOf(vehicleIdentifiersAndSerialNumbersIncludingLicensePlates));
            linLabel.setText(LinkedIn);
            bankLabel.setText(String.valueOf(bankAccountNumbers));
            licenseLabel.setText(String.valueOf(licenseNumber));
        });
        panel.add(showButton);
    }
}
