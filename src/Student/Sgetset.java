/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Student;

/**
 *
 * @author Adil
 */
public class Sgetset {
    String name,user,university,email,dept,clas,section,teacher,course,pass,repass,roll,nam;
public Sgetset()
{
this("","","","","","","","","","","","");

}
    
    public Sgetset(String nam,String use,String uni,String ema,String dep,String cla,String sec,String tea,String cou,String rep,String pas,String rol)
{
this.name=nam;
this.user=use;
this.university=uni;
this.teacher=tea;
this.dept=dep;
this.clas=cla;
this.section=sec;
this.course=cou;
this.repass=rep;
this.pass=pas;
this.email=ema;
this.roll=rol;
}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getClas() {
        return clas;
    }

    public void setClas(String clas) {
        this.clas = clas;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getRepass() {
        return repass;
    }

    public void setRepass(String repass) {
        this.repass = repass;
    }

    public String getRoll() {
        return roll;
    }

    public void setRoll(String roll) {
        this.roll = roll;
    }
    public String getnam() {
        return this.nam;
    }

    public void setnam(String na) {
        this.nam = na;
    }
public static boolean validateuniversity(String uni)
{
return uni.matches("[a-zA-Z]{3-30}");
}
public static boolean validatedepartment(String dep)
{
return dep.matches("[a-zA-Z]{3-20}");
}
public static boolean validateclass(String cla)
{
return cla.matches("[a-zA-Z]{3-20}");
}
public static boolean validatesection(String sec)
{
return sec.matches("[a-zA-Z]{1-5}");
}
public static boolean validateroll(String rol)
{
return rol.matches("[0-9]{2-20}");
}
public static boolean validatename(String nam)
{
return nam.matches("[a-zA-Z]{3-20}");
}
public static boolean validateuser(String usr)
{
return usr.matches("[a-zA-Z]{3-20}");
}
public static boolean validateemail(String ema)
{
return ema.matches("[a-zA-Z]{3-20}");
}
public static boolean validatepassword(String tea)
{
return tea.matches("[a-zA-Z]{3-20}");
}

}
