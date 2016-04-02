/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Student;
import java.io.File;
import javax.swing.JFileChooser.*;
import javax.swing.filechooser.FileFilter;
/**
 *
 * @author pc
 */
public class Filefilter extends javax.swing.filechooser.FileFilter{
private String format1="txt";
private String format2="docx";
private char dot= '.';

public boolean accept(File f)
{
if(f.isDirectory())
{
return true;
}
if(extension(f).equalsIgnoreCase(format1))
{
return true;
}
if(extension(f).equalsIgnoreCase(format2))
{return true;}
//return f.isDirectory() || f.getName().toLowerCase().endsWith(".txt");
else{    
return false;}
}
public String getdescription()
{
return "Docx and Txt Format Only";
}


public String extension(File f)
{
String fname=f.getName();
int index=fname.lastIndexOf(dot);
if(index>0 && index<fname.length()-1)   
{
return fname.substring(index+1);
}
else{
return "";
}
}


    @Override
    public String getDescription() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
}