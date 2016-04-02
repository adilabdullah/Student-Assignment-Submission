/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Student;

import Database.Connections;
import Front.Front;
import static Front.Front.name;
import Front.View;
import Front.assignment_view;
import Operation.ExtensionFileFilter;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import static javax.management.remote.JMXConnectorFactory.connect;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.sql.*;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Saad Shaikh
 */
public class Spage extends javax.swing.JFrame implements ActionListener{
Connection con;
Statement st;
PreparedStatement pst;
ResultSet rs;
private JPanel pns[]=new JPanel[10];
private JLabel tlabel[]=new JLabel[10];JLabel dlabel[]=new JLabel[10];
private JLabel topics[]=new JLabel[10];JLabel[] dopp=new JLabel[10];JLabel[] topp=new JLabel[10];
JLabel[] doee=new JLabel[10];JLabel[] toee=new JLabel[10];JLabel[] length=new JLabel[10];JTextArea[] detai=new JTextArea[10];JLabel[] limit=new JLabel[10];   
public JLabel[] alength=new JLabel[10];JLabel[] fpss=new JLabel[10];
private JTextField[] ttitle=new  JTextField[10];
Date ldate,cdate;Time ltime;
private JButton[] bts=new JButton[10];JButton[] btv=new JButton[10],add;
private JButton[] bta=new JButton[10];
Font fons=new Font("Candara",Font.BOLD,17);
Font fond=new Font("Candara",Font.BOLD,15);
String classs,section,path,minutes,hours,days;int c=0;
 Calendar cal = Calendar.getInstance();
      SimpleDateFormat fd = new SimpleDateFormat ("yyyy-MM-dd");
SimpleDateFormat ft = new SimpleDateFormat ("HH:mm:ss");
SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
long diffSeconds;
long diffMinutes;
long diffHours ;
long diffDays ;
int courseno;
    Connections connect=new Connections();
    /**
     * Creates new form Spage
     */
    public Spage() {
  // show.setEnabled(false);
        int si;
        initComponents();
if(filepath.getText().equalsIgnoreCase(""))
{show.setEnabled(false);}
else
{show.setEnabled(true);}
pnl2.setVisible(false);
pnl3.setVisible(false);
//con=connect.Conn();
 Front fors=new Front();
assign(); 
submission();
footer();
approve();
teacher();
enddates();
no_status();
//pane2.add(scrl);
// JScrollPane scpane=new JScrollPane(pane2);
// this.add(scpane);
// try{
//String query="SELECT * FROM assignment";
//pst=connect.Conn().prepareStatement(query);
//            rs=pst.executeQuery(query);
//            while(rs.next())
//            {//si=Integer.parseInt(rs.getString("sno"));
//                addidas(j++,60+fi,rs.getString("assign_topic"),rs.getString("assign_detail"),rs.getString("st_date"),rs.getString("st_time"),rs.getString("end_date"),rs.getString("end_time"),rs.getString("assign_length"),datediff(rs.getDate(st_date),fd.format(cal.getTime())));
//         fi+=110;
//            submission(rs.getString("assign_topic"),rs.getInt("sno"));
//            }
//}
//////            //if(rs.next()){
////////            //addidas(245,rs.getString("assign_topic"),rs.getString("assign_detail"),rs.getString("st_date"),rs.getString("end_date"),rs.getString("st_time"),rs.getString("end_time"),rs.getString("assign_length"),"Time");} 
//////////addidas(245);
//////////addidas(380,"Bilal");
//////}
// catch(Exception ex)
// {ex.printStackTrace();
// JOptionPane.showMessageDialog(null,ex.getMessage());}
//submission();
//addidas(0,60,"adil","bilal","salman","noman","imran","asasda","sdasd","dsdsad");
//addidas(1,165,"adil","bilal","salman","noman","imran","asasda","sdasd","dsdsad");
//addidas(2,270,"adil","bilal","salman","noman","imran","asasda","sdasd","dsdsad");
//addidas(3,375,"adil","bilal","salman","noman","imran","asasda","sdasd","dsdsad");
//addidas(4,480,"adil","bilal","salman","noman","imran","asasda","sdasd","dsdsad");
//addidas(5,585,"adil","bilal","salman","noman","imran","asasda","sdasd","dsdsad");

//addidas(380,"saad");
//addidas(530,"arif");
//try{String query="SELECT limits FROM assignment_submission";
//pst=connect.Conn().prepareStatement(query);
//            rs=pst.executeQuery(query);
//            while(rs.next())
//            {
//            
//            }
//}
//catch(Exception ex)
//{ex.printStackTrace();
//JOptionPane.showMessageDialog(null,ex.getMessage());}
try{
        String query="SELECT * FROM project_proposal where (select max(sno) from project_proposal)";
         pst=connect.Conn().prepareStatement(query);
            rs=pst.executeQuery(query);
            while(rs.next())
            {
            tile.setText(rs.getString("title"));
            dtl.setText(rs.getString("detail"));
            st_date.setText(rs.getString("st_date"));
            st_time.setText(rs.getString("st_time"));
            end_date.setText(rs.getString("end_date"));
            end_time.setText(rs.getString("end_time"));
            }
        }
        catch(Exception ex)
        {ex.printStackTrace();
        JOptionPane.showMessageDialog(null,ex.getMessage());}
Sgetset set=new Sgetset(); 
//try{
//      String sql="SELECT name,roll,teacher,course,class,section,courseno FROM student_info WHERE name='"+Front.name.getText()+"'";
// pst=connect.Conn().prepareStatement(sql);
//            rs=pst.executeQuery(sql);
//  while(rs.next())
//  {
//  studentname.setText(rs.getString("name").toString());
// teachername.setText(rs.getString("teacher").toString());
//  rollno.setText(rs.getString("roll").toString());
//  course.setText(rs.getString("course").toString());
//classs=rs.getString("class").toString();
//section=rs.getString("section").toString();
//courseno=rs.getInt("courseno");
//  }
//  }
//  catch(Exception ex)
//  {ex.printStackTrace();
//          JOptionPane.showMessageDialog(null,ex.getMessage());
//  }

//  try{
//  String sql="SELECT assign_topic,assign_detail,assign_length,st_date,st_time,end_date,end_time FROM assignment WHERE sno=2";
//  pst=connect.Conn().prepareStatement(sql);
//            rs=pst.executeQuery(sql);
//  while(rs.next())
//  {
//  topics.setText(rs.getString("assign_topic").toString());
// detai.setText(rs.getString("assign_detail").toString());
//  alength.setText(rs.getString("assign_length").toString());
//  dopp.setText(rs.getString("st_date").toString());
//  topp.setText(rs.getString("st_time").toString());
//  doee.setText(rs.getString("end_date").toString());
//  toee.setText(rs.getString("end_time").toString());
//  ldate=rs.getDate("end_date");
//  ltime=rs.getTime("end_time");
//  cdate=rs.getDate("st_date");
//  } 
//  }
//  catch(Exception ee)
//  {ee.printStackTrace();
//  JOptionPane.showMessageDialog(null, ee.getMessage());}
 // limit.setText(""+ldate+""+ltime);
//long diff = cdate.getDate()-ldate.getDate(); 
//  diffSeconds = diff / 1000 % 60;
//diffMinutes = diff / (60 * 1000) % 60;
//diffHours = diff / (60 * 60 * 1000) % 24;
//diffDays = diff / (24 * 60 * 60 * 1000);
    }
    public void footer()
    {
      try{
      String query="SELECT name,roll,teacher,course,class,section FROM student_info WHERE name=(SELECT name FROM login_table ORDER BY sno DESC limit 1)";
 pst=connect.Conn().prepareStatement(query);
            rs=pst.executeQuery(query);
  while(rs.next())
  {
  studentname.setText(rs.getString("name"));
 teachername.setText(rs.getString("teacher"));
  rollno.setText(rs.getString("roll"));
  course.setText(rs.getString("course"));
classs=rs.getString("class");
section=rs.getString("section");
  }
  }
  catch(Exception ex)
  {ex.printStackTrace();
          JOptionPane.showMessageDialog(null,ex.getMessage());
  }
    }
    public void assign()
    {int fi=0,j=0,c=0;
        try{
        String query="SELECT * FROM assignment";
pst=connect.Conn().prepareStatement(query);
            rs=pst.executeQuery(query);
            while(rs.next())
            {//si=Integer.parseInt(rs.getString("sno"));
                addidas(j,60+fi,rs.getString("assign_topic"),rs.getString("assign_detail"),rs.getString("st_date"),rs.getString("st_time"),rs.getString("end_date"),rs.getString("end_time"),rs.getString("assign_length"),datediff(rs.getDate("end_date").toString(),fd.format(cal.getTime())));
         fi+=110;
           if(limit[j].getText().equalsIgnoreCase("Date Over"))
         {
         ttitle[j].setEnabled(false);
         btv[j].setEnabled(false);
         bts[j].setEnabled(false);
         bta[j].setEnabled(false);
         }
         j++;
            }
}
       
 catch(Exception ex)
 {ex.printStackTrace();
 JOptionPane.showMessageDialog(null,ex.getMessage());}
    }
    private void endsubmission()
    {
    }
    public void submission()
    {
    int j=0;
try{String query="SELECT limits FROM assignment_submission WHERE name='"+studentname.getText()+"'";
pst=connect.Conn().prepareStatement(query);
            rs=pst.executeQuery(query);
while(rs.next())
{
if(rs.getString("limits").equalsIgnoreCase("upload"))
{bts[j].setEnabled(false);
           bta[j].setEnabled(false);
           ttitle[j].setEnabled(false);
           btv[j].setEnabled(true);}
           else{bts[j].setEnabled(true);
           bta[j].setEnabled(true);
           ttitle[j].setEnabled(true);
           btv[j].setEnabled(false);}
j++;
}
}
catch(Exception ec)
{ec.printStackTrace();
JOptionPane.showMessageDialog(null,ec.getMessage());}
    }
//    public void propos()
//    {
//    try{String query="SELECT title FROM assignment_submission";
//rs=st.executeQuery(query);
//while(rs.next())
//{
//fpss[j].setText(rs.getString("title"));
//j++;
//}
//}
//catch(Exception ec)
//{ec.printStackTrace();
//JOptionPane.showMessageDialog(null,ec.getMessage());}
//    }
    private void approve()
    {
    try{String sql="SELECT * FROM status WHERE name='"+studentname.getText()+"'";
    pst=connect.Conn().prepareStatement(sql);
            rs=pst.executeQuery(sql);
            while(rs.next())
            {tte.setText(rs.getString("title"));
            dte.setText(rs.getString("detail"));
            dae.setText(rs.getString("date").toString());
            tme.setText(rs.getString("time").toString());
            ste.setText(rs.getString("status"));
            }
    }
    catch(Exception ee)
    {}
    }
private void addidas(int j,int val,String topic,String detail,String start,String star,String end,String tend,String length,String left)
{
pns[j]=new JPanel();
    pns[j].setLayout(null);
    pns[j].setBackground(Color.gray);
    pns[j].setBounds(1,val, 1330, 100);
    tlabel[j]=new JLabel("Topic:");
    tlabel[j].setFont(fons);
    tlabel[j].setBounds(5, 10, 50, 20);
    dlabel[j]=new JLabel("Detail:");
    dlabel[j].setFont(fons);
  dlabel[j].setBounds(5, 40, 50, 20);
   topics[j]=new JLabel(topic);
    topics[j].setFont(fond);
    topics[j].setBounds(60, 10, 240, 20);
    detai[j]=new JTextArea(""+detail);
    detai[j].setFont(fond);
    detai[j].setBounds(60, 40, 240, 40);
    detai[j].setEnabled(false);
    detai[j].setForeground(Color.black);
    dopp[j]=new JLabel(""+start);
    dopp[j].setFont(fond);
    dopp[j].setBounds(305, 10, 100, 30);
    topp[j]=new JLabel(""+star);
    topp[j].setFont(fond);
    topp[j].setBounds(305, 50, 100, 30);
   doee[j]=new JLabel(""+end);
    doee[j].setFont(fond);
    doee[j].setBounds(410, 10, 100, 30);
    toee[j]=new JLabel(""+tend);
    toee[j].setFont(fond);
  toee[j].setBounds(410, 50, 100, 30);
  alength[j]=new JLabel(length);
   alength[j].setFont(fond);
    alength[j].setBounds(515, 10, 160, 90);
   // limit=new JLabel("Time Left To Submit\nDays:"+diffDays+"Hours\n"+diffHours+"Minute\n"+diffMinutes);
    limit[j]=new JLabel(left);
    limit[j].setFont(fond);
    limit[j].setBounds(680, 10, 200, 90);
   ttitle[j]=new JTextField("");
ttitle[j].setBounds(1100, 10, 190, 30);
    bts[j]=new JButton("Attach");
    bts[j].setFont(fond);
    bts[j].setBounds(1005, 10, 90, 20); 
   bts[j].addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
    JFileChooser chooser=new JFileChooser();
chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
chooser.showOpenDialog(null);
ExtensionFileFilter filter1 = new ExtensionFileFilter("JPG and JPEG", new String[] { "txt", "docx" });
      chooser.setFileFilter(filter1);
     chooser.showOpenDialog(null); 
        File fel=chooser.getSelectedFile();
       path=fel.getAbsolutePath();
        fpss[j].setText(fel.getAbsolutePath());
    }
}
   );
    btv[j]=new JButton("View");
    btv[j].setFont(fond);
    btv[j].setBounds(1005, 40, 90, 20);
    btv[j].setEnabled(false);
       btv[j].addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
//    assignment_view vi=new assignment_view(fpss[j].getText());
//    vi.setVisible(true);
//    vi.pack();
        try{
            File pdfFile = new File(fpss[j].getText());
		if (pdfFile.exists()) {
 
			if (Desktop.isDesktopSupported()) {
				Desktop.getDesktop().open(pdfFile);
			} else {
				JOptionPane.showMessageDialog(null,"Awt Desktop is not supported!");
			}
		} else {
			JOptionPane.showMessageDialog(null,"File is not exists!");
		}
		JOptionPane.showMessageDialog(null,"Done");}
        catch(Exception ee)
        {ee.printStackTrace();
        JOptionPane.showMessageDialog(null,ee.getMessage());}
    }
}
   );
       bta[j]=new JButton("Submit");
    bta[j].setFont(fond);
    bta[j].setBounds(1005, 70, 90, 20);
    bta[j].addActionListener(new ActionListener(){
    public void actionPerformed(ActionEvent e) {
      if(ttitle[j].getText().equalsIgnoreCase(""))
      {JOptionPane.showMessageDialog(null,"Not Uploaded Without Title");}
      else{
      try{
       String sql="INSERT INTO assignment_submission(name,roll,assign_topic_roll,class,section,course,courseno,teacher,title,file_path,file,limits,date,time) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";  
       pst=connect.Conn().prepareStatement(sql);
       pst.setString(1,studentname.getText());
       pst.setString(2,rollno.getText());
       pst.setString(3,topics[j].getText()+"-"+rollno.getText());
       pst.setString(4,classs);
       pst.setString(5,section);
       pst.setString(6,course.getText());
       pst.setInt(7,courseno);
       pst.setString(8,teachername.getText());
       pst.setString(9,ttitle[j].getText());
     pst.setString(10,fpss[j].getText());
       File thefile=new File(path);
 FileInputStream input=new FileInputStream(thefile);
     pst.setBinaryStream(11,input); 
     pst.setString(12,"upload");
     pst.setString(13,fd.format(cal.getTime()));
     pst.setString(14,ft.format(cal.getTime()));
      //st=connect.Conn().createStatement();
      pst.execute();
JOptionPane.showMessageDialog(null,"Upload Succefully");
        btv[j].setEnabled(true);
        bta[j].setEnabled(false);
        bts[j].setEnabled(false);
        limit[j].setText("Uploaded");
        }
       catch(Exception ex)
       {
 ex.printStackTrace();
           JOptionPane.showMessageDialog(null,ex.getMessage());}
       }
    }
    });
    fpss[j]=new JLabel("");
    fpss[j].setFont(fond);
    fpss[j].setBounds(1100, 50, 190, 30);
//add=new JButton("+");
    //add.setFont(fond);
    //add.setBounds(780, 100, 90, 30);
    //add.addActionListener(
    //new ActionListener()
      //      {public void actionPerformed(ActionEvent e){
          //  int si=140,j=1;
        //        addidas(245+si*j);
            //j++;
            //}});
pns[j].add(fpss[j]);
pns[j].add(ttitle[j]);
pns[j].add(bta[j]);
//pns.add(title);
pns[j].add(tlabel[j]);
    pns[j].add(dlabel[j]);
   pns[j].add(topics[j]);
   pns[j].add(detai[j]);
 pns[j].add(dopp[j]);
   pns[j].add(doee[j]);
    pns[j].add(topp[j]);
    pns[j].add(toee[j]);
    pns[j].add(detai[j]);
    pns[j].add(bts[j]);
    pns[j].add(btv[j]);
    pns[j].add(alength[j]);
    pns[j].add(limit[j]);
    pane2.add(pns[j]);
}
//    public String datediff(String ds,String de)
//    {
//      Date d1=null;
//   Date d2=null;
//      try{
//       d1=(Date) fd.parse(ds);
//       d2=(Date) fd.parse(de);
//          long diff = d1.getTime()-d2.getTime();
//			long diffDays = diff / (24 * 60 * 60 * 1000);
//			days=diffDays + " days";
//                        return days;
//      }
//      catch(Exception ex)
//      {ex.printStackTrace();
//      JOptionPane.showMessageDialog(null,ex.getMessage());return null;}
//    }
public void enddates()
{
try{
String query="SELECT end_date FROM project_proposal ORDER BY sno DESC LIMIT 1";
pst=connect.Conn().prepareStatement(query);
   rs=pst.executeQuery(query);
   while(rs.next())
   {
enddate.setText(datediff(rs.getDate("end_date").toString(),fd.format(cal.getTime())));
if(enddate.getText().equalsIgnoreCase("Date Over"))
{
tile.setText("");
dtl.setText("Your Project Proposal submission time is over");
end_date.setText("");
end_time.setText("");
pnl1.setVisible(false);
}
else{}
   }
}
catch(Exception ex)
{ex.printStackTrace();
JOptionPane.showMessageDialog(null,ex.getMessage());}

}
public String datediff(String ds,String de)
    {
    String days=null;
        java.util.Date d1=null;
   java.util.Date d2=null;
      try{
       d1=fd.parse(ds);
       d2=fd.parse(de);
          long diff = d1.getTime()-d2.getTime();
			long diffDays = diff / (24 * 60 * 60 * 1000);
			//days=diffDays + " days";	
                        if(diffDays > 1)
                        {return "You Have "+diffDays+"Days To Submit";}
                        else
                        {return "Date Over";
                        }
      }
      catch(Exception ex)
      {ex.printStackTrace();
      JOptionPane.showMessageDialog(null,ex.getMessage());return null;}
    }
    public String Timediff(String ti,String te)
    {
     Date d1=null;
   Date d2=null;
      try{
       d1=(Date) fd.parse(ti);
       d2=(Date) fd.parse(te);
          long diff = d1.getTime()-d2.getTime();

 long diffMinutes = diff / (60 * 1000) % 60;
			long diffHours = diff / (60 * 60 * 1000) % 24;
			hours=diffHours + " hours";
			minutes=diffMinutes + " minutes";
                        return hours+":"+minutes;
      }
      catch(Exception ex)
      {ex.printStackTrace();
      JOptionPane.showMessageDialog(null,ex.getMessage());return null;}
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton9 = new javax.swing.JButton();
        pnl = new javax.swing.JPanel();
        ssss = new javax.swing.JLabel();
        fdfd = new javax.swing.JLabel();
        studentname = new javax.swing.JLabel();
        rollno = new javax.swing.JLabel();
        ttt = new javax.swing.JLabel();
        teachername = new javax.swing.JLabel();
        course = new javax.swing.JLabel();
        sdfd = new javax.swing.JLabel();
        llbm = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tabbed = new javax.swing.JTabbedPane();
        pane2 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        dfsdf6 = new javax.swing.JLabel();
        pro = new javax.swing.JLabel();
        dfsdf8 = new javax.swing.JLabel();
        dfsdf9 = new javax.swing.JLabel();
        pro1 = new javax.swing.JLabel();
        pro2 = new javax.swing.JLabel();
        pane1 = new javax.swing.JPanel();
        pnl3 = new javax.swing.JPanel();
        title3 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        detail3 = new javax.swing.JTextArea();
        show2 = new javax.swing.JButton();
        attach2 = new javax.swing.JButton();
        submit2 = new javax.swing.JButton();
        filepath3 = new javax.swing.JLabel();
        pnl1 = new javax.swing.JPanel();
        title = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        detail = new javax.swing.JTextArea();
        jButton8 = new javax.swing.JButton();
        attach = new javax.swing.JButton();
        filepath = new javax.swing.JLabel();
        submit = new javax.swing.JButton();
        show = new javax.swing.JButton();
        pnl2 = new javax.swing.JPanel();
        title2 = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        detail2 = new javax.swing.JTextArea();
        show1 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        attach1 = new javax.swing.JButton();
        submit1 = new javax.swing.JButton();
        filepath2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        enddate = new javax.swing.JLabel();
        dfsdf2 = new javax.swing.JLabel();
        dfsdf7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tile = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        dtl = new javax.swing.JEditorPane();
        st_time = new javax.swing.JLabel();
        end_date = new javax.swing.JLabel();
        end_time = new javax.swing.JLabel();
        st_date = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        pnel = new javax.swing.JPanel();
        tte = new javax.swing.JLabel();
        dae = new javax.swing.JLabel();
        vve = new javax.swing.JButton();
        ste = new javax.swing.JLabel();
        tme = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        dte = new javax.swing.JTextPane();
        jPanel4 = new javax.swing.JPanel();
        ttl2 = new javax.swing.JLabel();
        ttl3 = new javax.swing.JLabel();
        ttl4 = new javax.swing.JLabel();
        ttl5 = new javax.swing.JLabel();
        ttl8 = new javax.swing.JLabel();
        ttl9 = new javax.swing.JLabel();
        file_paths = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel7 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        teacom = new javax.swing.JComboBox();
        jScrollPane10 = new javax.swing.JScrollPane();
        message = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        inbox = new javax.swing.JTable();
        jScrollPane6 = new javax.swing.JScrollPane();
        receive = new javax.swing.JTextArea();
        vvv = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        outbox = new javax.swing.JTable();
        jScrollPane11 = new javax.swing.JScrollPane();
        sent = new javax.swing.JTextArea();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        jButton9.setText("jButton9");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Project Proposal Submission");

        ssss.setFont(new java.awt.Font("Candara", 1, 24)); // NOI18N
        ssss.setForeground(new java.awt.Color(255, 255, 0));
        ssss.setText("Welcome :");

        fdfd.setFont(new java.awt.Font("Candara", 1, 24)); // NOI18N
        fdfd.setForeground(new java.awt.Color(255, 255, 0));
        fdfd.setText("Roll # :");

        studentname.setFont(new java.awt.Font("Candara", 1, 24)); // NOI18N
        studentname.setForeground(new java.awt.Color(255, 255, 51));

        rollno.setFont(new java.awt.Font("Candara", 1, 24)); // NOI18N
        rollno.setForeground(new java.awt.Color(255, 255, 0));

        ttt.setFont(new java.awt.Font("Candara", 1, 24)); // NOI18N
        ttt.setForeground(new java.awt.Color(255, 255, 51));
        ttt.setText("Teacher:");

        teachername.setFont(new java.awt.Font("Candara", 1, 24)); // NOI18N
        teachername.setForeground(new java.awt.Color(255, 255, 0));

        course.setFont(new java.awt.Font("Candara", 1, 24)); // NOI18N
        course.setForeground(new java.awt.Color(255, 255, 51));

        sdfd.setFont(new java.awt.Font("Candara", 1, 24)); // NOI18N
        sdfd.setForeground(new java.awt.Color(255, 255, 51));
        sdfd.setText("Course:");

        llbm.setIcon(new javax.swing.ImageIcon("C:\\Netbeans Projects\\ProjectSubmission\\ProjectSubmission\\frn (1).jpg")); // NOI18N

        javax.swing.GroupLayout pnlLayout = new javax.swing.GroupLayout(pnl);
        pnl.setLayout(pnlLayout);
        pnlLayout.setHorizontalGroup(
            pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlLayout.createSequentialGroup()
                        .addComponent(ssss, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(studentname, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65)
                        .addComponent(ttt, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(teachername, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(fdfd, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(rollno, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(68, 68, 68)
                        .addComponent(sdfd, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(course, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(llbm, javax.swing.GroupLayout.PREFERRED_SIZE, 1363, Short.MAX_VALUE)
        );
        pnlLayout.setVerticalGroup(
            pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ssss)
                    .addComponent(studentname, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ttt)
                    .addComponent(teachername, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rollno, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sdfd)
                            .addComponent(course, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fdfd)))))
            .addComponent(llbm, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jScrollPane5.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        jPanel6.setBackground(new java.awt.Color(0, 0, 255));
        jPanel6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel6.setPreferredSize(new java.awt.Dimension(930, 60));
        jPanel6.setLayout(null);

        dfsdf6.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        dfsdf6.setForeground(new java.awt.Color(255, 255, 255));
        dfsdf6.setText("Project Detail");
        jPanel6.add(dfsdf6);
        dfsdf6.setBounds(10, 10, 160, 30);

        pro.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        pro.setForeground(new java.awt.Color(255, 255, 255));
        pro.setText("Length");
        jPanel6.add(pro);
        pro.setBounds(560, 10, 70, 30);

        dfsdf8.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        dfsdf8.setForeground(new java.awt.Color(255, 255, 255));
        dfsdf8.setText("Title");
        jPanel6.add(dfsdf8);
        dfsdf8.setBounds(1130, 10, 90, 30);

        dfsdf9.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        dfsdf9.setForeground(new java.awt.Color(255, 255, 255));
        dfsdf9.setText("Upload Date");
        jPanel6.add(dfsdf9);
        dfsdf9.setBounds(270, 10, 120, 30);

        pro1.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        pro1.setForeground(new java.awt.Color(255, 255, 255));
        pro1.setText("End Date");
        jPanel6.add(pro1);
        pro1.setBounds(430, 10, 110, 30);

        pro2.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        pro2.setForeground(new java.awt.Color(255, 255, 255));
        pro2.setText("Limit");
        jPanel6.add(pro2);
        pro2.setBounds(730, 10, 70, 30);

        javax.swing.GroupLayout pane2Layout = new javax.swing.GroupLayout(pane2);
        pane2.setLayout(pane2Layout);
        pane2Layout.setHorizontalGroup(
            pane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pane2Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 1331, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 481, Short.MAX_VALUE))
        );
        pane2Layout.setVerticalGroup(
            pane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        tabbed.addTab("Assignment", pane2);
        pane2.getAccessibleContext().setAccessibleName("");

        pnl3.setBackground(new java.awt.Color(204, 204, 204));
        pnl3.setLayout(null);
        pnl3.add(title3);
        title3.setBounds(10, 50, 250, 29);

        detail3.setColumns(20);
        detail3.setRows(5);
        jScrollPane1.setViewportView(detail3);

        pnl3.add(jScrollPane1);
        jScrollPane1.setBounds(270, 10, 270, 110);

        show2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        show2.setText("View");
        show2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                show2ActionPerformed(evt);
            }
        });
        pnl3.add(show2);
        show2.setBounds(550, 90, 170, 30);

        attach2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        attach2.setText("Attach");
        attach2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                attach2ActionPerformed(evt);
            }
        });
        pnl3.add(attach2);
        attach2.setBounds(550, 10, 170, 30);

        submit2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        submit2.setText("Submit");
        submit2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submit2ActionPerformed(evt);
            }
        });
        pnl3.add(submit2);
        submit2.setBounds(550, 50, 170, 30);

        filepath3.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        pnl3.add(filepath3);
        filepath3.setBounds(750, 10, 190, 30);

        pnl1.setBackground(new java.awt.Color(204, 204, 204));
        pnl1.setLayout(null);

        title.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                titleActionPerformed(evt);
            }
        });
        pnl1.add(title);
        title.setBounds(10, 40, 250, 29);

        detail.setColumns(20);
        detail.setRows(5);
        jScrollPane2.setViewportView(detail);

        pnl1.add(jScrollPane2);
        jScrollPane2.setBounds(270, 10, 270, 110);

        jButton8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton8.setText("Add more");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        pnl1.add(jButton8);
        jButton8.setBounds(730, 60, 130, 60);

        attach.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        attach.setText("Attach");
        attach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                attachActionPerformed(evt);
            }
        });
        pnl1.add(attach);
        attach.setBounds(550, 10, 170, 30);

        filepath.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        pnl1.add(filepath);
        filepath.setBounds(740, 10, 200, 30);

        submit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        submit.setText("Submit");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });
        pnl1.add(submit);
        submit.setBounds(550, 50, 170, 30);

        show.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        show.setText("View");
        show.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showActionPerformed(evt);
            }
        });
        pnl1.add(show);
        show.setBounds(550, 90, 170, 30);

        pnl2.setBackground(new java.awt.Color(204, 204, 204));
        pnl2.setLayout(null);
        pnl2.add(title2);
        title2.setBounds(10, 50, 250, 29);

        detail2.setColumns(20);
        detail2.setRows(5);
        jScrollPane3.setViewportView(detail2);

        pnl2.add(jScrollPane3);
        jScrollPane3.setBounds(270, 10, 270, 110);

        show1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        show1.setText("View");
        show1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                show1ActionPerformed(evt);
            }
        });
        pnl2.add(show1);
        show1.setBounds(550, 90, 170, 30);

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton6.setText("Add More");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        pnl2.add(jButton6);
        jButton6.setBounds(730, 60, 130, 60);

        attach1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        attach1.setText("Attach");
        attach1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                attach1ActionPerformed(evt);
            }
        });
        pnl2.add(attach1);
        attach1.setBounds(550, 10, 170, 30);

        submit1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        submit1.setText("Submit");
        submit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submit1ActionPerformed(evt);
            }
        });
        pnl2.add(submit1);
        submit1.setBounds(550, 50, 170, 30);

        filepath2.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        pnl2.add(filepath2);
        filepath2.setBounds(740, 10, 200, 30);

        jPanel3.setBackground(new java.awt.Color(0, 51, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(930, 60));
        jPanel3.setLayout(null);

        enddate.setFont(new java.awt.Font("Candara", 1, 22)); // NOI18N
        enddate.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.add(enddate);
        enddate.setBounds(510, 20, 390, 30);

        dfsdf2.setFont(new java.awt.Font("Candara", 1, 22)); // NOI18N
        dfsdf2.setForeground(new java.awt.Color(255, 255, 255));
        dfsdf2.setText("Project Name");
        jPanel3.add(dfsdf2);
        dfsdf2.setBounds(40, 20, 140, 30);

        dfsdf7.setFont(new java.awt.Font("Candara", 1, 22)); // NOI18N
        dfsdf7.setForeground(new java.awt.Color(255, 255, 255));
        dfsdf7.setText("Project Detail");
        jPanel3.add(dfsdf7);
        dfsdf7.setBounds(300, 20, 160, 30);

        jPanel1.setBackground(new java.awt.Color(0, 51, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Title:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Detail:");

        tile.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tile.setForeground(new java.awt.Color(255, 255, 255));
        tile.setText("Detail:");

        dtl.setEditable(false);
        dtl.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jScrollPane4.setViewportView(dtl);

        st_time.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        st_time.setForeground(new java.awt.Color(255, 255, 255));

        end_date.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        end_date.setForeground(new java.awt.Color(255, 255, 255));
        end_date.setText("Title:");

        end_time.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        end_time.setForeground(new java.awt.Color(255, 255, 255));
        end_time.setText("Title:");

        st_date.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        st_date.setForeground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Upload Date:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Upload Time:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("End Date:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("End Time:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 712, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(st_date, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(st_time, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(end_date, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(78, 78, 78)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(end_time, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(689, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tile, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(st_date, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(st_time, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(end_date, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(end_time, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pane1Layout = new javax.swing.GroupLayout(pane1);
        pane1.setLayout(pane1Layout);
        pane1Layout.setHorizontalGroup(
            pane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pane1Layout.createSequentialGroup()
                .addGroup(pane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pnl3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnl2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnl1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 1802, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pane1Layout.setVerticalGroup(
            pane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pane1Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pnl1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnl2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnl3, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        tabbed.addTab("Submit Propsal", pane1);

        pnel.setBackground(new java.awt.Color(204, 204, 204));

        tte.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tte.setText("Detail:");

        dae.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        vve.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        vve.setText("View");
        vve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vveActionPerformed(evt);
            }
        });

        ste.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        tme.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        dte.setEditable(false);
        jScrollPane7.setViewportView(dte);

        javax.swing.GroupLayout pnelLayout = new javax.swing.GroupLayout(pnel);
        pnel.setLayout(pnelLayout);
        pnelLayout.setHorizontalGroup(
            pnelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tte, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(vve, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ste, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dae, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(tme, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(517, Short.MAX_VALUE))
        );
        pnelLayout.setVerticalGroup(
            pnelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnelLayout.createSequentialGroup()
                .addGroup(pnelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnelLayout.createSequentialGroup()
                        .addGroup(pnelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnelLayout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(tte, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnelLayout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addGroup(pnelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(vve, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dae, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ste, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tme, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 41, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(0, 0, 204));

        ttl2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ttl2.setForeground(new java.awt.Color(255, 255, 0));
        ttl2.setText("Detail");

        ttl3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ttl3.setForeground(new java.awt.Color(255, 255, 0));
        ttl3.setText("Proposal");

        ttl4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ttl4.setForeground(new java.awt.Color(255, 255, 0));
        ttl4.setText("Title");

        ttl5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ttl5.setForeground(new java.awt.Color(255, 255, 0));
        ttl5.setText("Status");

        ttl8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ttl8.setForeground(new java.awt.Color(255, 255, 0));
        ttl8.setText("Date");

        ttl9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ttl9.setForeground(new java.awt.Color(255, 255, 0));
        ttl9.setText("Time");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(ttl4, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(165, 165, 165)
                .addComponent(ttl2, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(238, 238, 238)
                .addComponent(ttl3, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(ttl5, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(ttl8, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(ttl9, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ttl2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ttl3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ttl4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ttl5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ttl8, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ttl9, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(514, 514, 514)
                .addComponent(file_paths, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(file_paths, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(470, Short.MAX_VALUE))
        );

        tabbed.addTab("Proposal Approved", jPanel2);

        jPanel5.setLayout(null);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel9.setText("Message");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel10.setText("To");

        jScrollPane10.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        message.setColumns(20);
        message.setRows(5);
        jScrollPane10.setViewportView(message);

        jButton2.setText("Clear");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton4.setText("Send");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(teacom, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 507, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(148, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(teacom, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Compose", jPanel7);

        inbox.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Sno", "Name", "Date", "Time"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        inbox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                inboxMouseClicked(evt);
            }
        });
        jScrollPane8.setViewportView(inbox);
        if (inbox.getColumnModel().getColumnCount() > 0) {
            inbox.getColumnModel().getColumn(0).setResizable(false);
            inbox.getColumnModel().getColumn(1).setResizable(false);
            inbox.getColumnModel().getColumn(2).setResizable(false);
            inbox.getColumnModel().getColumn(3).setResizable(false);
        }

        jScrollPane6.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        receive.setColumns(20);
        receive.setRows(5);
        jScrollPane6.setViewportView(receive);

        vvv.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        vvv.setText("View");
        vvv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vvvActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(vvv, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(291, 291, 291))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane6)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(vvv)
                .addGap(32, 32, 32))
        );

        jTabbedPane1.addTab("Inbox", jPanel8);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel8.setText("To");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel3.setText("Message");

        outbox.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Sno", "Name", "Date", "Time"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        outbox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                outboxMouseClicked(evt);
            }
        });
        jScrollPane9.setViewportView(outbox);
        if (outbox.getColumnModel().getColumnCount() > 0) {
            outbox.getColumnModel().getColumn(0).setResizable(false);
            outbox.getColumnModel().getColumn(1).setResizable(false);
            outbox.getColumnModel().getColumn(2).setResizable(false);
            outbox.getColumnModel().getColumn(3).setResizable(false);
        }

        jScrollPane11.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        sent.setColumns(20);
        sent.setRows(5);
        jScrollPane11.setViewportView(sent);

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setText("Clear");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton5.setText("View");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane11, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80))
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane11, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton5))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Outbox", jPanel9);

        jPanel5.add(jTabbedPane1);
        jTabbedPane1.setBounds(30, 30, 770, 310);

        tabbed.addTab("Messages", jPanel5);

        jScrollPane5.setViewportView(tabbed);

        jMenu1.setText("File");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("Logout");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setText("Quit");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 590, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void show2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_show2ActionPerformed
//      View ve=new View(title3.getText());
//ve.setVisible(true);
//ve.pack();
        try{
            File pdfFile = new File(filepath3.getText());
		if (pdfFile.exists()) {
 
			if (Desktop.isDesktopSupported()) {
				Desktop.getDesktop().open(pdfFile);
			} else {
				JOptionPane.showMessageDialog(null,"Awt Desktop is not supported!");
			}
		} else {
			JOptionPane.showMessageDialog(null,"File is not exists!");
		}
		JOptionPane.showMessageDialog(null,"Done");}
        catch(Exception ee)
        {ee.printStackTrace();
        JOptionPane.showMessageDialog(null,ee.getMessage());}
    }//GEN-LAST:event_show2ActionPerformed
public void message()
{
try{
String query="INSERT INTO send(name,roll,class,section,course,teacher,message,date,time) VALUES(?,?,?,?,?,?,?,?,?)";
pst=connect.Conn().prepareStatement(query);
       pst.setString(1,studentname.getText());
       pst.setString(2,rollno.getText());
       pst.setString(3,classs);
       pst.setString(4,section);
       pst.setString(5,course.getText());
       pst.setString(6,(String)teacom.getSelectedItem());
       pst.setString(7,receive.getText());
     pst.setString(8,fd.format(cal.getTime()));
     pst.setString(9,ft.format(cal.getTime()));
      pst.execute();
      JOptionPane.showMessageDialog(null,"Message send successfully");
}
catch(Exception ex)
{ex.printStackTrace();
JOptionPane.showMessageDialog(null,ex.getMessage());}
}
public void teacher()
{
try{
String query="SELECT * FROM student_info WHERE name='"+studentname.getText()+"'";
pst=connect.Conn().prepareStatement(query);
   rs=pst.executeQuery(query);
   while(rs.next())
   {
   teacom.addItem(rs.getString("teacher"));
   }
}
catch(Exception ex)
{ex.printStackTrace();
JOptionPane.showMessageDialog(null,ex.getMessage());}
}
    private void showActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showActionPerformed

        //file_upload fle=new file_upload();
        //fle.show();
        //dispose();
//View ve=new View(title.getText());
//ve.setVisible(true);
//ve.pack();
        try{
            File pdfFile = new File(filepath.getText());
		if (pdfFile.exists()) {
 
			if (Desktop.isDesktopSupported()) {
				Desktop.getDesktop().open(pdfFile);
			} else {
				JOptionPane.showMessageDialog(null,"Awt Desktop is not supported!");
			}
		} else {
			JOptionPane.showMessageDialog(null,"File is not exists!");
		}
		JOptionPane.showMessageDialog(null,"Done");}
        catch(Exception ee)
        {ee.printStackTrace();
        JOptionPane.showMessageDialog(null,ee.getMessage());}
//view.setVisible(true);
        //view.setSize(800, 800);
//        try{
//          String query="SELECT files FROM proposal_submision WHERE assign_title='"+title.getText()+"'";
//          pst=connect.Conn().prepareStatement(query);
//        rs=pst.executeQuery(query);
//        File fle=new File("C:\\Users\\pc\\Desktop\\aaa"+c+".txt");
//        FileOutputStream fout=new FileOutputStream(fle);
//        while(rs.next())
//        {
//        InputStream input=rs.getBinaryStream("files");
//        byte[] buffer=new byte[1024];
//while(input.read(buffer)>0)
//        {
//            //BufferedReader buff=new BufferedReader(buffer);
////StringBuilder sb=new StringBuilder();
////sb.append(buffer);
//            fout.write(buffer);
//            FileReader fr=new FileReader(fle);
//            BufferedReader br=new BufferedReader(fr);
//            vew.read(br,null);
//        }
//        }
//        JOptionPane.showMessageDialog(null,"File Readed");
//      }
//      catch(Exception ex)
//      {ex.printStackTrace();
//      JOptionPane.showMessageDialog(null, ex.getMessage());}
    }//GEN-LAST:event_showActionPerformed

    private void show1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_show1ActionPerformed
//       View ve=new View(title2.getText());
//ve.setVisible(true);
//ve.pack();
        try{
            File pdfFile = new File(filepath2.getText());
		if (pdfFile.exists()) {
 
			if (Desktop.isDesktopSupported()) {
				Desktop.getDesktop().open(pdfFile);
			} else {
				JOptionPane.showMessageDialog(null,"Awt Desktop is not supported!");
			}
		} else {
			JOptionPane.showMessageDialog(null,"File is not exists!");
		}
		JOptionPane.showMessageDialog(null,"Done");}
        catch(Exception ee)
        {ee.printStackTrace();
        JOptionPane.showMessageDialog(null,ee.getMessage());}
    }//GEN-LAST:event_show1ActionPerformed

public void proposals_limit()
{
try{
String query="select count(assign_title) project_title from proposal_submission where student_name='"+studentname.getText()+"' and project_title='"+tile.getText()+"'";
pst=connect.Conn().prepareStatement(query);
            rs=pst.executeQuery(query);
            while(rs.next())
            {
            if(rs.getInt("count(assign_title)")>=3)
            {
            JOptionPane.showMessageDialog(null,"You Have Already Submitted 3 Proposals");
            title.setEditable(false);
            title3.setEditable(false);
            title2.setEditable(false);
            detail.setEditable(false);
            detail2.setEditable(false);
            detail3.setEditable(false);
            }
            else{
            
            }
            }
}
catch(Exception ex)
{ex.printStackTrace();
JOptionPane.showMessageDialog(null,ex.getMessage());}
}

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
//       XWPFDocument document= new XWPFDocument(); 
//   FileOutputStream out;
//    try {
//        out = new FileOutputStream(
//                new File("C:\\Users\\pc\\Desktop\\create.docx"));
//         document.write(out);
//   out.close();
//   JOptionPane.showMessageDialog(null,"Successfully");
//    } catch (FileNotFoundException ex) {
//        JOptionPane.showMessageDialog(null, ex.getMessage());
//    } catch (IOException ev) {
//         JOptionPane.showMessageDialog(null, ev.getMessage());
//    }
//        JFileChooser chooser=new JFileChooser();
//        chooser.showOpenDialog(null);
//        File fel=chooser.getSelectedFile();
//        fname=fel.getAbsolutePath();
//       // path.setText(fname);
//        try{
//       File image=new File(fname);
//       FileInputStream fis=new FileInputStream(image);
//       ByteArrayOutputStream bos=new ByteArrayOutputStream();
//       byte[] buf=new byte[1024]; 
//       for(int readnum; (readnum=fis.read(buf))!=-1; )
//       {
//bos.write(buf,0, readnum);
//       }
//       imagefile=bos.toByteArray();
//        
//        }
//        catch(Exception ex)
//        {
//        JOptionPane.showMessageDialog(null,ex.getMessage());
//        }
            
       // try{
//String sql="INSERT INTO file(files) VALUES (?)";
// pst=connect.Conn().prepareStatement(sql);
// File thefile=new File("C:\\Users\\pc\\Desktop\\Adil CV.docx");
// FileInputStream input=new FileInputStream(thefile);
// pst.setBinaryStream(1, input);
// pst.execute();
// JOptionPane.showMessageDialog(null,"Inserted Successfully");
//}
//catch(Exception ex)
//{ex.printStackTrace();
//JOptionPane.showMessageDialog(null, ex.getMessage());}
       // proposals_limit();
        if(title.getText().equalsIgnoreCase("") || title.getText().isEmpty()==true)
  {
  JOptionPane.showMessageDialog(null,"Not Saved Without Title");
  }
  else{      
  try{
       String sql="INSERT INTO proposal_submission(student_name,roll,class,section,course,teacher,project_title,assign_title,assign_detail,file_path,file,date,time) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";  
       pst=connect.Conn().prepareStatement(sql);
       pst.setString(1,studentname.getText());
       pst.setString(2,rollno.getText());
       pst.setString(3,classs);
       pst.setString(4,section);
       pst.setString(5,course.getText());
       pst.setString(6,teachername.getText());
       pst.setString(7,tile.getText());
       pst.setString(8,title.getText());
       pst.setString(9,detail.getText());
     pst.setString(10,filepath.getText());
     File thefile=new File(path);
 FileInputStream input=new FileInputStream(thefile);
     pst.setBinaryStream(11,input); 
     pst.setString(12,fd.format(cal.getTime()));
     pst.setString(13,ft.format(cal.getTime()));
      //st=connect.Conn().createStatement();
      pst.execute();
JOptionPane.showMessageDialog(null,"Insert Succefully");
  show.setEnabled(true);
 attach.setEnabled(false);
 submit.setEnabled(false);
 title.setEnabled(false);
 detail.setEnabled(false);
  }
       catch(Exception ex)
       {
 ex.printStackTrace();
           JOptionPane.showMessageDialog(null,ex.getMessage());
       }
  }
//   title.setText("");
//   detail.setText("");
//   submit.setEnabled(false);
//   show.setEnabled(true);
    }//GEN-LAST:event_submitActionPerformed

    private void attach1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_attach1ActionPerformed
       int res;
        JFileChooser chooser=new JFileChooser();
chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
res=chooser.showOpenDialog(null);
if(res==JFileChooser.CANCEL_OPTION)
{}
else{
ExtensionFileFilter filter1 = new ExtensionFileFilter("JPG and JPEG", new String[] { "txt", "docx" });
      chooser.setFileFilter(filter1);
     chooser.showOpenDialog(null); 
        File fel=chooser.getSelectedFile();
        path=fel.getAbsolutePath();}
        filepath2.setText(path);
    }//GEN-LAST:event_attach1ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
       pnl3.setVisible(true);
       show2.setEnabled(false);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
//       JFileChooser chooser=new JFileChooser();
//        chooser.showOpenDialog(null);
//        File fel=chooser.getSelectedFile();
//        fname=fel.getAbsolutePath();
//        title.setText(fname);
//        try{
//       File image=new File(fname);
//       FileInputStream fis=new FileInputStream(image);
//       ByteArrayOutputStream bos=new ByteArrayOutputStream();
//       byte[] buf=new byte[1024]; 
//       for(int readnum; (readnum=fis.read(buf))!=-1; )
//       {
//bos.write(buf,0, readnum);
//       }
//       doc_file=bos.toByteArray();
//        
//        }
//        catch(Exception ex)
//        {
//        JOptionPane.showMessageDialog(null,ex.getMessage());
//        }    
        pnl2.setVisible(true);
show1.setEnabled(false);
        
    }//GEN-LAST:event_jButton8ActionPerformed

    private void titleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_titleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_titleActionPerformed

    private void attachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_attachActionPerformed
int res;
        JFileChooser chooser=new JFileChooser();
chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
res=chooser.showOpenDialog(null);
if(res==JFileChooser.CANCEL_OPTION)
{}
else{
ExtensionFileFilter filter1 = new ExtensionFileFilter("JPG and JPEG", new String[] { "txt", "docx" });
      chooser.setFileFilter(filter1);
     chooser.showOpenDialog(null); 
        File fel=chooser.getSelectedFile();
        path=fel.getAbsolutePath();}
        filepath.setText(path);
//        try{
//        BufferedReader br=new BufferedReader(new FileReader(fname));
//        String line;
//        while((line=br.readLine())!=null)
//        {String[] value=line.split("\n");
//        String sql="INSERT INTO assignment_submission(student_name,roll,class,section,course,teacher,assign_title,assign_detail,file_path,file) VALUES (?,?,?,?,?,?,?,?,?,?)";
//              pst=con.prepareStatement(sql);
//       pst.setString(1,studentname.getText());
//       pst.setString(2,rollno.getText());
//       pst.setString(3,classs);
//       pst.setString(4,section);
//       pst.setString(5,course.getText());
//       pst.setString(6,teachername.getText());
//       pst.setString(7,"avl tree");
//       pst.setString(8,detail.getText());
//     pst.setString(9,fname);
//       pst.setBytes(10,doc_file); 
//pst.executeQuery();
//        }
//        br.close();
//        }
//        catch(Exception e)
//        {}
    }//GEN-LAST:event_attachActionPerformed

    private void submit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submit1ActionPerformed

       // proposals_limit();
        if(title.getText().equalsIgnoreCase("") || title.getText().isEmpty()==true)
  {
  JOptionPane.showMessageDialog(null,"Not Saved Without Title");
  }
        else{
        try{
       String sql="INSERT INTO proposal_submission(student_name,roll,class,section,course,teacher,project_title,assign_title,assign_detail,file_path,file,date,time) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";  
       pst=connect.Conn().prepareStatement(sql);
       pst.setString(1,studentname.getText());
       pst.setString(2,rollno.getText());
       pst.setString(3,classs);
       pst.setString(4,section);
       pst.setString(5,course.getText());
       pst.setString(6,teachername.getText());
       pst.setString(7,tile.getText());
       pst.setString(8,title2.getText());
       pst.setString(9,detail2.getText());
     pst.setString(10,filepath2.getText());
     File thefile=new File(path);
 FileInputStream input=new FileInputStream(thefile);
     pst.setBinaryStream(11,input); 
     pst.setString(12,fd.format(cal.getTime()));
     pst.setString(13,ft.format(cal.getTime()));
      //st=connect.Conn().createStatement();
      pst.execute();
JOptionPane.showMessageDialog(null,"Insert Succefully");
submit1.setEnabled(false);
attach1.setEnabled(false);     
show1.setEnabled(true);
       title2.setEnabled(false);
 detail2.setEnabled(false);
         }
       catch(Exception ex)
       {
 ex.printStackTrace();
           JOptionPane.showMessageDialog(null,ex.getMessage());
       }
        }
    }//GEN-LAST:event_submit1ActionPerformed

    private void submit2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submit2ActionPerformed
 //proposals_limit();
        if(title.getText().equalsIgnoreCase("") || title.getText().isEmpty()==true)
  {
  JOptionPane.showMessageDialog(null,"Not Saved Without Title");
  }else{
        try{
       String sql="INSERT INTO proposal_submission(student_name,roll,class,section,course,teacher,project_title,assign_title,assign_detail,file_path,file,date,time) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";  
       pst=connect.Conn().prepareStatement(sql);
       pst.setString(1,studentname.getText());
       pst.setString(2,rollno.getText());
       pst.setString(3,classs);
       pst.setString(4,section);
       pst.setString(5,course.getText());
       pst.setString(6,teachername.getText());
       pst.setString(7,tile.getText());
       pst.setString(8,title3.getText());
       pst.setString(9,detail3.getText());
     pst.setString(10,filepath3.getText());
     File thefile=new File(path);
 FileInputStream input=new FileInputStream(thefile);
     pst.setBinaryStream(11,input); 
     pst.setString(12,fd.format(cal.getTime()));
     pst.setString(13,ft.format(cal.getTime()));
      //st=connect.Conn().createStatement();
      pst.execute();
JOptionPane.showMessageDialog(null,"Insert Succefully");
submit2.setEnabled(false);
attach2.setEnabled(false);
show2.setEnabled(true);
    title3.setEnabled(false);
 detail3.setEnabled(false);
    }
       catch(Exception ex)
       {
 ex.printStackTrace();
           JOptionPane.showMessageDialog(null,ex.getMessage());
       }
        }
    }//GEN-LAST:event_submit2ActionPerformed

    private void attach2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_attach2ActionPerformed
       int res;
        JFileChooser chooser=new JFileChooser();
chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
res=chooser.showOpenDialog(null);
if(res==JFileChooser.CANCEL_OPTION)
{}
else{
ExtensionFileFilter filter1 = new ExtensionFileFilter("JPG and JPEG", new String[] { "txt", "docx" });
      chooser.setFileFilter(filter1);
     chooser.showOpenDialog(null); 
        File fel=chooser.getSelectedFile();
        path=fel.getAbsolutePath();}
        filepath3.setText(path);
    }//GEN-LAST:event_attach2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        Front fr=new Front();
        fr.show();
        dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        System.exit(1);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void vveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vveActionPerformed
//    View vi=new View(tte.getText());
//    vi.setVisible(true);
        try{
            String query="SELECT file_path FROM proposal_submission WHERE title='"+tte.getText()+"'";
pst=connect.Conn().prepareStatement(query);
   rs=pst.executeQuery(query);
   while(rs.next()){      
   File pdfFile = new File(rs.getString("file_path"));
		if (pdfFile.exists()) {
 
			if (Desktop.isDesktopSupported()) {
				Desktop.getDesktop().open(pdfFile);
			} else {
				JOptionPane.showMessageDialog(null,"Awt Desktop is not supported!");
			}
		} else {
			JOptionPane.showMessageDialog(null,"File is not exists!");
		}}
		JOptionPane.showMessageDialog(null,"Done");}
        catch(Exception ee)
        {ee.printStackTrace();
        JOptionPane.showMessageDialog(null,ee.getMessage());}
    }//GEN-LAST:event_vveActionPerformed

    private void outboxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_outboxMouseClicked
            int row =outbox.getSelectedRow();
        String click=outbox.getModel().getValueAt(row,0).toString();
          try{
        String query="SELECT message FROM send WHERE sno='"+click+"'";
        pst=con.prepareStatement(query);
        rs=pst.executeQuery(query);
        while(rs.next())
        {
        sent.setText(rs.getString("message").toString());
        }
        }
        catch(Exception ex)
        {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(null,ex.getMessage());
        }    
    }//GEN-LAST:event_outboxMouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
      try{
            String sql="INSERT INTO send(name,roll,class,section,course,teacher,message,date,time) VALUES (?,?,?,?,?,?,?,?,?)";
            pst=connect.Conn().prepareStatement(sql);
            pst.setString(1,studentname.getText());
            pst.setString(2,rollno.getText());
            pst.setString(3,classs);
            pst.setString(4,section);
           pst.setString(5,course.getText());
            pst.setString(6,(String)teacom.getSelectedItem());
            pst.setString(7,message.getText());
            pst.setString(8,fd.format(cal.getTime()));
            pst.setString(9,ft.format(cal.getTime()));
            //st=connect.Conn().createStatement();
            pst.execute();
            JOptionPane.showMessageDialog(null,"Your Message Send Succefully");
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null,ex.getMessage());
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
       try{
      String query="SELECT sno,teacher,date,time FROM send";
      pst=connect.Conn().prepareStatement(query);
            rs=pst.executeQuery(query);
            outbox.setModel(DbUtils.resultSetToTableModel(rs));

      }
      catch(Exception e)
      {e.printStackTrace();
      JOptionPane.showMessageDialog(null,e.getMessage());}
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       sent.setText("");
    }//GEN-LAST:event_jButton3ActionPerformed
private void no_status()
{
if(ste.getText().equalsIgnoreCase(""))
{
vve.setEnabled(false);
dte.setText("There is no any proposal to approve");
}
}
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      message.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void vvvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vvvActionPerformed
        try{
      String query="SELECT sno,name,date,time FROM teacher_send WHERE name='"+studentname.getText()+"' AND roll='"+rollno.getText()+"'";
      pst=connect.Conn().prepareStatement(query);
            rs=pst.executeQuery(query);
            inbox.setModel(DbUtils.resultSetToTableModel(rs));
      }
      catch(Exception e)
      {e.printStackTrace();
      JOptionPane.showMessageDialog(null,e.getMessage());}
    }//GEN-LAST:event_vvvActionPerformed

    private void inboxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inboxMouseClicked
               int row =inbox.getSelectedRow();
        String click=inbox.getModel().getValueAt(row,0).toString();
          try{
        String query="SELECT message FROM teacher_send WHERE sno='"+click+"'";
        pst=con.prepareStatement(query);
        rs=pst.executeQuery(query);
        while(rs.next())
        {
        receive.setText(rs.getString("message").toString());
        }
        }
        catch(Exception ex)
        {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(null,ex.getMessage());
        }    
    }//GEN-LAST:event_inboxMouseClicked

    /**
     * @param args the command line arguments
     */
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton attach;
    private javax.swing.JButton attach1;
    private javax.swing.JButton attach2;
    public javax.swing.JLabel course;
    private javax.swing.JLabel dae;
    private javax.swing.JTextArea detail;
    private javax.swing.JTextArea detail2;
    private javax.swing.JTextArea detail3;
    private javax.swing.JLabel dfsdf2;
    private javax.swing.JLabel dfsdf6;
    private javax.swing.JLabel dfsdf7;
    private javax.swing.JLabel dfsdf8;
    private javax.swing.JLabel dfsdf9;
    private javax.swing.JTextPane dte;
    private javax.swing.JEditorPane dtl;
    private javax.swing.JLabel end_date;
    private javax.swing.JLabel end_time;
    private javax.swing.JLabel enddate;
    private javax.swing.JLabel fdfd;
    private javax.swing.JLabel file_paths;
    private javax.swing.JLabel filepath;
    private javax.swing.JLabel filepath2;
    private javax.swing.JLabel filepath3;
    private javax.swing.JTable inbox;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel llbm;
    private javax.swing.JTextArea message;
    private javax.swing.JTable outbox;
    private javax.swing.JPanel pane1;
    private javax.swing.JPanel pane2;
    private javax.swing.JPanel pnel;
    private javax.swing.JPanel pnl;
    private javax.swing.JPanel pnl1;
    private javax.swing.JPanel pnl2;
    private javax.swing.JPanel pnl3;
    private javax.swing.JLabel pro;
    private javax.swing.JLabel pro1;
    private javax.swing.JLabel pro2;
    private javax.swing.JTextArea receive;
    public javax.swing.JLabel rollno;
    private javax.swing.JLabel sdfd;
    private javax.swing.JTextArea sent;
    private javax.swing.JButton show;
    private javax.swing.JButton show1;
    private javax.swing.JButton show2;
    private javax.swing.JLabel ssss;
    private javax.swing.JLabel st_date;
    private javax.swing.JLabel st_time;
    private javax.swing.JLabel ste;
    public javax.swing.JLabel studentname;
    private javax.swing.JButton submit;
    private javax.swing.JButton submit1;
    private javax.swing.JButton submit2;
    private javax.swing.JTabbedPane tabbed;
    public javax.swing.JLabel teachername;
    private javax.swing.JComboBox teacom;
    private javax.swing.JLabel tile;
    public static javax.swing.JTextField title;
    public static javax.swing.JTextField title2;
    public static javax.swing.JTextField title3;
    private javax.swing.JLabel tme;
    private javax.swing.JLabel tte;
    private javax.swing.JLabel ttl2;
    private javax.swing.JLabel ttl3;
    private javax.swing.JLabel ttl4;
    private javax.swing.JLabel ttl5;
    private javax.swing.JLabel ttl8;
    private javax.swing.JLabel ttl9;
    private javax.swing.JLabel ttt;
    private javax.swing.JButton vve;
    private javax.swing.JButton vvv;
    // End of variables declaration//GEN-END:variables
String fname=null;
int nums=0;
byte[] doc_file=null;

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
//class submission implements ActionListener
//{
//public void actionPerformed(ActionEvent e)
//{
//String path;
//    JFileChooser chooser=new JFileChooser();
//chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
//chooser.showOpenDialog(null);
//ExtensionFileFilter filter1 = new ExtensionFileFilter("JPG and JPEG", new String[] { "txt", "docx" });
//      chooser.setFileFilter(filter1);
//     chooser.showOpenDialog(null); 
//        File fel=chooser.getSelectedFile();
//        path=fel.getAbsolutePath();
//        
//}
//}