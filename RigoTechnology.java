
import javax.swing.JFrame;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;


/**
 * Rigo Technology is a project to make a GUI for our first coursework.
 *
 * @author Axhillex
 * @version 1.1
 */
public class RigoTechnology implements ActionListener{
    private JFrame devFrame, senFrame, junFrame;    
    private JLabel joinDateLabel, staffRoomNumLabel, salarySenLabel, contrPerLabel, advSalaryLabel, intViewNameLabel, platformLabel, workHoursLabel, salaryJunLabel, termiDateJun, appointedByLabel;
    private JTextField devJunField, devSenField, joinDateField, staffRoomNumField, salarySenField, contrPerField, advSalaryField, intViewSenField, platformSenField, workHourSenField, intViewJunField, 
            platformJunField, workHourJunField, appointDateField, evaPerField, salaryJunField, termiDateAddField, termiDateAppointField, specializeField, appointedByField;
    private JButton seniorDev, juniorDev, addSen, addJun, appointSen, appointJun, display, displayJun, displaySen, terminate, clearJun, clearSen;
    private JComboBox platSen, platJun;
    
    private Font f1 = new Font("Arial",Font.BOLD,25);
    
    private Color drkBlue = new Color(0,0,153);
    
    private Object[] inputSenFields;
    private Object[] inputJunFields;
    
    private ArrayList<Developer> developer = new ArrayList<Developer>();
    private ArrayList<String> platformJun = new ArrayList<String>();
    private ArrayList<String> platformSen = new ArrayList<String>();
    //Main method of UI
    public static void main(String[] args){
        new RigoTechnology().RigoTechnology();
    }
    //Login UI
    public void RigoTechnology(){
        JTextField username = new JTextField();
        JTextField password = new JPasswordField();
        
        HashMap<String, String> loginData = new HashMap<>(); 
        
        loginData.put("Axhillex","islington2018");
        loginData.put("Teacher","islington");
        loginData.put("a","a");
       
        Object[] message = {
            "Username:", username,
            "Password:", password};
           
        int option = JOptionPane.showConfirmDialog(null, message, "Login", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
        if (option == JOptionPane.OK_OPTION){
            if (loginData.containsKey(username.getText())){
                if(loginData.get(username.getText()).equals(password.getText())) {
                    JOptionPane.showMessageDialog(devFrame,"Login successful");
                    mainUI();
                }else{
                    JOptionPane.showMessageDialog(devFrame,"Incorrect Passowrd.", "Error", JOptionPane.INFORMATION_MESSAGE);
                    RigoTechnology();
                }
            } else {
                JOptionPane.showMessageDialog(devFrame,"Incorrect Username", "Error", JOptionPane.INFORMATION_MESSAGE);
                RigoTechnology();
            }
        } else {
            JOptionPane.showMessageDialog(devFrame,"Login canceled");
            System.exit(0);
        }
    }
    //Main Rigo Tech Framework
    public void mainUI(){
        devFrame = new JFrame("Rigo Technology");
        
        devFrame.setLayout(null);
        
        Font f2 = new Font("Arial", Font.BOLD, 30);
        Font f3 = new Font("Arial", Font.BOLD, 18);
        
        JLabel tech = new JLabel("Welcome to Rigo Technology!");
        JLabel info = new JLabel("Who do you want to add?");
        
        tech.setFont(f2);
        tech.setForeground(drkBlue);
        info.setFont(f3);
        
        seniorDev = new JButton("Senior Developer");
        juniorDev = new JButton("Junior Developer");
        
        tech.setBounds(100,30,450,50);
        info.setBounds(30,100,250,25);
        
        seniorDev.setBounds(30,150,150,25);
        juniorDev.setBounds(200,150,150,25);
        
        devFrame.add(seniorDev);
        devFrame.add(juniorDev);
        devFrame.add(tech);
        devFrame.add(info);
        
        seniorDev.addActionListener(this);
        juniorDev.addActionListener(this);
        
        devFrame.setSize(650,250);
        devFrame.setVisible(true);
    }
    //Senior Framework
    public void seniorDeveloperUI(){
        senFrame = new JFrame("Rigo Technology");
        senFrame.setLayout(null);
                            
        contrPerLabel = new JLabel("Contract Period:");
        workHoursLabel = new JLabel("Working Hours:"); 
        platformLabel = new JLabel("Platform:"); 
        salarySenLabel = new JLabel("Salary:"); 
        intViewNameLabel = new JLabel("Interviewer Name:");
        JLabel senDev = new JLabel("Senior Developer");
        
        senDev.setFont(f1);
        senDev.setForeground(drkBlue);
        
        intViewSenField = new JTextField();
        workHourSenField = new JTextField();
        salarySenField   = new JTextField();
        contrPerField   = new JTextField();
        platformSenField = new JTextField();
        devSenField = new JTextField();
        joinDateField = new JTextField();
        advSalaryField = new JTextField();
        staffRoomNumField = new JTextField();
               
        displaySen  = new JButton("Details");
        appointSen = new JButton("Appoint");
        clearSen = new JButton("Clear");
        addSen = new JButton("Add");
        terminate = new JButton("Terminate");
        
        intViewNameLabel.setBounds(30,70,120,25);
        workHoursLabel.setBounds(370,70,100,25);
        platformLabel.setBounds(30,110,160,25);
        contrPerLabel.setBounds(30,150,120,25);
        salarySenLabel.setBounds(370,150,120,25);
        senDev.setBounds(220,30,250,25);
        
        intViewSenField.setBounds(160,70,200,25);
        workHourSenField.setBounds(500,70,120,25);
        platformSenField.setBounds(160,110,200,25);
        contrPerField.setBounds(160,150,200,25);
        salarySenField.setBounds(500,150,120,25);
        
        displaySen.setBounds(300,230,150,25);
        appointSen.setBounds(30,190,150,25);
        clearSen.setBounds(470,230,150,25);
        addSen.setBounds(470,190,150,25);
        terminate.setBounds(30,230,150,25);
        
        senFrame.add(intViewSenField);
        senFrame.add(workHourSenField);
        senFrame.add(salarySenLabel);
        senFrame.add(platformSenField);        
        senFrame.add(intViewNameLabel);
        senFrame.add(workHoursLabel);
        senFrame.add(salarySenField);
        senFrame.add(platformLabel);
        senFrame.add(displaySen);
        senFrame.add(appointSen);
        senFrame.add(clearSen);
        senFrame.add(contrPerLabel);
        senFrame.add(contrPerField);
        senFrame.add(senDev);
        senFrame.add(addSen);
        senFrame.add(terminate);
        
        senFrame.setVisible(true);
        senFrame.setSize(650,330);
        
        senFrame.addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent we){
                devFrame.setVisible(true);
            }
        });
       
        clearSen.addActionListener(this);
        addSen.addActionListener(this);
        appointSen.addActionListener(this);
        displaySen.addActionListener(this);
        terminate.addActionListener(this);
        
        displaySen.setVisible(false);
        appointSen.setVisible(false);
        terminate.setVisible(false);
    }
    //Junior Framework
    public void juniorDeveloperUI(){
        junFrame = new JFrame("Rigo Technology");
        junFrame.setLayout(null);
        
        termiDateJun = new JLabel("Termination Date:");
        workHoursLabel = new JLabel("Working Hours:"); 
        platformLabel = new JLabel("Platform:"); 
        salaryJunLabel = new JLabel("Salary:");
        intViewNameLabel = new JLabel("Interviewer Name:");
        appointedByLabel = new JLabel("Appointed By:");
        JLabel junDev = new JLabel("Junior Developer");
        
        junDev.setFont(f1);
        junDev.setForeground(drkBlue);
       
        intViewJunField = new JTextField();
        workHourJunField = new JTextField();
        salaryJunField = new JTextField();
        termiDateAddField = new JTextField();
        platformJunField = new JTextField();
        appointedByField = new JTextField();
        devJunField = new JTextField();
        appointDateField = new JTextField();
        specializeField = new JTextField();
        evaPerField = new JTextField();   
        termiDateAppointField = new JTextField();
        
        displayJun = new JButton("Details");
        appointJun = new JButton("Appoint");
        clearJun = new JButton("Clear");
        addJun = new JButton("Add");
        
        intViewNameLabel.setBounds(30,70,120,25);
        workHoursLabel.setBounds(370,70,100,25);
        platformLabel.setBounds(30,110,160,25);
        appointedByLabel.setBounds(30,150,120,25);
        salaryJunLabel.setBounds(370,150,120,25);
        junDev.setBounds(220,30,250,25);
        termiDateJun.setBounds(370,110,100,25);
        
        intViewJunField.setBounds(160,70,200,25);
        workHourJunField.setBounds(500,70,120,25);
        platformJunField.setBounds(160,110,200,25);
        appointedByField.setBounds(160,150,200,25);
        salaryJunField.setBounds(500,150,120,25);
        termiDateAddField.setBounds(500,110,120,25);
        
        displayJun.setBounds(300,230,150,25);
        appointJun.setBounds(30,190,150,25);
        clearJun.setBounds(470,230,150,25);
        addJun.setBounds(470,190,150,25);
        
        junFrame.add(intViewJunField);
        junFrame.add(workHourJunField);
        junFrame.add(salaryJunLabel);
        junFrame.add(platformJunField);
        junFrame.add(appointedByLabel);
        junFrame.add(appointedByField);
        junFrame.add(intViewNameLabel);
        junFrame.add(workHoursLabel);
        junFrame.add(salaryJunField);
        junFrame.add(platformLabel);
        junFrame.add(displayJun);
        junFrame.add(appointJun);
        junFrame.add(clearJun);
        junFrame.add(termiDateJun);
        junFrame.add(termiDateAddField);
        junFrame.add(junDev);
        junFrame.add(addJun);
        
        junFrame.setVisible(true);
        junFrame.setSize(650,330);
        
        junFrame.addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent we){
                devFrame.setVisible(true);
            }
        });
        
        clearJun.addActionListener(this);
        addJun.addActionListener(this);
        appointJun.addActionListener(this);
        displayJun.addActionListener(this);
        
        appointJun.setVisible(false);
        displayJun.setVisible(false);
    }
    //Method to add platform in Platform Name of senior UI
    public void junPlatVal(){
        for(Developer tempJun: developer)
        {
            if(!platformJun.contains(tempJun.platform)){
                platformJun.add(tempJun.platform);
            }
        }
        
        platJun = new JComboBox(platformJun.toArray());
                
        Object[] inputJunFields = {"Developer Name:", devJunField,
                            "Appointed Date:", appointDateField, 
                            "Termination Date:",termiDateAppointField,
                            "Specialization:",specializeField,
                            "Evaluation Period", evaPerField,
                            "Platform:", platJun};   
                            
        this.inputJunFields=inputJunFields;
    }
    //Method to add platform in Platform Name of junior UI
    public void senPlatVal(){
        for(Developer tempSen: developer)
        {
            if(!platformSen.contains(tempSen.platform)){
                platformSen.add(tempSen.platform);
            }
        }
        
        platSen = new JComboBox(platformSen.toArray());
        
        Object[] inputSenFields = {"Developer Name:", devSenField,
                            "Joining Date:", joinDateField, 
                            "Advance Salary:",advSalaryField,
                            "Staff Room Number:",staffRoomNumField,
                            "Platform:", platSen};
                            
        this.inputSenFields=inputSenFields;
    }
    //Action Button trigger method
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==seniorDev){
            seniorUiEnable();
        }
        if(ae.getSource()==juniorDev){
            juniorUiEnable();
        }
        if(ae.getSource()==displaySen){
            toDisplaySenior();
        }
        if(ae.getSource()==displayJun){
            toDisplayJunior();
        }
        if(ae.getSource()==clearJun){
            toClearJunior();
        }
        if(ae.getSource()==clearSen){
            toClearSenior();
        }
        if(ae.getSource()==addJun){
            toAddJunior();
        }
        if(ae.getSource()==addSen){
            toAddSenior();
        }
        if(ae.getSource()==appointSen){
            toAppointSenior();
        }
        if(ae.getSource()==appointJun){
            toAppointJunior();
        }
        if(ae.getSource()==terminate){
            toTerminate();
        }
    }
    public void seniorUiEnable(){
        seniorDeveloperUI();
        devFrame.setVisible(false);
    }
    public void juniorUiEnable(){
        juniorDeveloperUI();
        devFrame.setVisible(false);
    }
    public void toDisplaySenior(){
        String platformSenName = platSen.getSelectedItem().toString();
            for(Developer senObj:developer){
                if(senObj instanceof SeniorDeveloper){
                    if(((SeniorDeveloper)senObj).platform.equals(platformSenName)){
                        ((SeniorDeveloper)senObj).displayDevInfo();
                        ((SeniorDeveloper)senObj).display();
                        System.out.println("********************************");
                        break;
                    }
                }
            }
    }
    public void toDisplayJunior(){
        String platformJunName = platJun.getSelectedItem().toString();
            for(Developer junObj:developer){
                if(junObj instanceof JuniorDeveloper){
                    if(((JuniorDeveloper)junObj).platform.equals(platformJunName)){
                        ((JuniorDeveloper)junObj).display();
                        System.out.println("********************************");
                        break;
                    }
                }
            }
    }
    public void toClearJunior(){
        intViewJunField.setText("");
        platformJunField.setText("");
        salaryJunField.setText("");
        termiDateAddField.setText("");
        workHourJunField.setText("");
        appointedByField.setText("");
    }
    public void toClearSenior(){
        contrPerField.setText("");
        intViewSenField.setText("");
        platformSenField.setText("");
        salarySenField.setText("");
        workHourSenField.setText("");
    }
    public void toAddJunior(){
        try{
            String intViewNameJun = intViewJunField.getText();
            String platfJun = platformJunField.getText();
            String workHourJun = workHourJunField.getText();
            String salaryJun = salaryJunField.getText();
            String appoint = appointedByField.getText();
            String termi = termiDateAddField.getText();
            float salaryInt = 0.0f;
            int workHourInt = 0;
            try{
                salaryInt = Float.parseFloat(salaryJun);
                try{
                    workHourInt = Integer.parseInt(workHourJun);
                    if(intViewJunField.equals("") || platformJunField.equals("") || workHourJunField.equals("") || salaryJunField.equals("") || appointedByField.equals("") || termiDateAddField.equals("")){
                        JOptionPane.showMessageDialog(junFrame, "Field is empty", "Error", JOptionPane.ERROR_MESSAGE);
                    }else{
                        JuniorDeveloper j = new JuniorDeveloper(platfJun, intViewNameJun, workHourInt, salaryInt, appoint, termi);
                
                        developer.add(j);
                
                        junPlatVal();
                
                        JOptionPane.showMessageDialog(junFrame,"The platform has been added.", "Congratulations!", JOptionPane.INFORMATION_MESSAGE);
                        try{
                            appointJun.setVisible(true);
                            displayJun.setVisible(true);
                        }catch(Exception exp){
                            
                        }
                    }
                }catch(Exception e){
                    JOptionPane.showMessageDialog(junFrame, "The value in work hour is incorrect", "Incorrect Input", JOptionPane.INFORMATION_MESSAGE);
                }
            }catch(Exception e){
                JOptionPane.showMessageDialog(junFrame, "The value in salary is incorrect", "Incorrect Input", JOptionPane.INFORMATION_MESSAGE);
            }

        }catch(Exception exp){
            JOptionPane.showMessageDialog(junFrame, exp, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    public void toAddSenior(){
        try{
            String intViewNameSen = intViewSenField.getText();
            String platfSen = platformSenField.getText();
            String workHourSen = workHourSenField.getText();
            String salarySen = salarySenField.getText();
            String contract = contrPerField.getText();
            
            float salaryInt = 0.0f;
            int workHourInt = 0;
            int contractInt = 0;
            try{
                salaryInt = Float.parseFloat(salarySen);
                try{
                    workHourInt = Integer.parseInt(workHourSen);
                    try{
                        contractInt = Integer.parseInt(contract);
                        if(intViewSenField.equals("") || platformSenField.equals("") || workHourSenField.equals("") || salarySenField.equals("") || contrPerField.equals("")){
                            JOptionPane.showMessageDialog(senFrame, "Field is empty", "Error", JOptionPane.ERROR_MESSAGE);
                        }else{
                            SeniorDeveloper s = new SeniorDeveloper(intViewNameSen, contractInt, salaryInt, platfSen , workHourInt);
                
                            developer.add(s);
                
                            senPlatVal();
                
                            JOptionPane.showMessageDialog(senFrame,"The platform has been added.", "Congratulations!", JOptionPane.INFORMATION_MESSAGE);
                            try{
                                appointSen.setVisible(true);
                                displaySen.setVisible(true);
                            }catch(Exception e){  
                    
                            }
                        }
                    }catch(Exception e){
                        JOptionPane.showMessageDialog(senFrame, "The value in contract period  is incorrect", "Incorrect Input", JOptionPane.INFORMATION_MESSAGE);
                    }
                }catch(Exception e){
                    JOptionPane.showMessageDialog(senFrame, "The value in work hour is incorrect", "Incorrect Input", JOptionPane.INFORMATION_MESSAGE);
                }
            }catch(Exception e){
                JOptionPane.showMessageDialog(senFrame, "The value in salary is incorrect", "Incorrect Input", JOptionPane.INFORMATION_MESSAGE);
            }
        }catch(Exception exp){
            JOptionPane.showMessageDialog(senFrame, exp, "Error", JOptionPane.ERROR_MESSAGE);
        }    
    }
    public void toAppointSenior(){
        int value = JOptionPane.showConfirmDialog(senFrame, inputSenFields, "Appoint Developer", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
            if(value==JOptionPane.OK_OPTION){
                String senDevText = devSenField.getText();
                String joinSenText = joinDateField.getText();
                String advSenText = advSalaryField.getText();
                String staffSenText = staffRoomNumField.getText();
                String platformSenName = platSen.getSelectedItem().toString();
                float advSenFloat = 0.0f;
                try{
                    advSenFloat = Float.parseFloat(advSenText);
                    if(devSenField.equals("") || joinDateField.equals("") || advSalaryField.equals("") || staffRoomNumField.equals("") || platformSenName.equals("")){
                        JOptionPane.showMessageDialog(senFrame, "Fields are empty", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                    else
                    {
                        for(Developer sobj:developer){
                            if(sobj instanceof SeniorDeveloper){
                                if(((SeniorDeveloper)sobj).platform.equals(platformSenName)){
                                    if(((SeniorDeveloper)sobj).isAppointed()){
                                        JOptionPane.showMessageDialog(senFrame, "The developer was already hired!", "Error", JOptionPane.INFORMATION_MESSAGE);                              
                                    }else{
                                        ((SeniorDeveloper)sobj).hireDev(senDevText, joinSenText, advSenFloat, staffSenText);
                                        JOptionPane.showMessageDialog(senFrame, "The developer was hired!", "Congratulations", JOptionPane.INFORMATION_MESSAGE);
                                        terminate.setVisible(true);
                                    }
                                    break;
                                }
                            }else{
                                JOptionPane.showMessageDialog(senFrame, "The platform is not to appoint Senior DEveloepr!", "Error", JOptionPane.INFORMATION_MESSAGE);
                            }
                        }
                    }
                }catch(Exception e){
                    JOptionPane.showMessageDialog(senFrame, "The value in advance salary is incorrect", "Incorrect Input", JOptionPane.INFORMATION_MESSAGE);
                }
            }else{
                JOptionPane.showMessageDialog(senFrame, "Appointment Canceled", "Canceled", JOptionPane.INFORMATION_MESSAGE);
            }
    }
    public void toAppointJunior(){
        int value = JOptionPane.showConfirmDialog(junFrame, inputJunFields, "Appoint Developer", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
            if(value==JOptionPane.OK_OPTION){
                String junDevText = devJunField.getText();
                String appointText = appointDateField.getText();
                String termiText = termiDateAppointField.getText();
                String specialText = specializeField.getText();
                String evaPerText = evaPerField.getText();
                String platformJunName = platJun.getSelectedItem().toString();
                if(junDevText.equals("") || appointText.equals("") || termiText.equals("") || specialText.equals("") || evaPerText.equals("")){
                    JOptionPane.showMessageDialog(junFrame, "Field is empty", "Error", JOptionPane.ERROR_MESSAGE);
                }else{
                    for(Developer jobj:developer){
                        if(jobj instanceof JuniorDeveloper){
                            if(((JuniorDeveloper)jobj).platform.equals(platformJunName)){
                                if(((JuniorDeveloper)jobj).getJoined()){
                                    JOptionPane.showMessageDialog(junFrame, "The developer was already hired!", "Error", JOptionPane.INFORMATION_MESSAGE);                         
                                }else{
                                    ((JuniorDeveloper)jobj).appointNewDev(junDevText, appointText, termiText, specialText, evaPerText);
                                    JOptionPane.showMessageDialog(junFrame, "The developer was hired!", "Congratulations", JOptionPane.INFORMATION_MESSAGE);
                                }
                                break;
                            }
                        }else{
                            JOptionPane.showMessageDialog(junFrame, "The platform is not to appoint Junior Developer!", "Error", JOptionPane.INFORMATION_MESSAGE);
                        }
                    }
                }
            }else{
                JOptionPane.showMessageDialog(junFrame, "Appointment Canceled", "Canceled", JOptionPane.INFORMATION_MESSAGE);
            }
    }
    public void toTerminate(){
        String platformSenName = platSen.getSelectedItem().toString();
            for(Developer senObj:developer){
                if(senObj instanceof SeniorDeveloper){
                    if(((SeniorDeveloper)senObj).platform.equals(platformSenName)){
                        ((SeniorDeveloper)senObj).termination();
                        JOptionPane.showMessageDialog(senFrame, "Contract Terminated", "Termination", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    }
                }
            }
    }
}