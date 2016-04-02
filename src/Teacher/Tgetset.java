/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Teacher;

/**
 *
 * @author Adil
 */
public class Tgetset {
    private String name,email,course,collage,password,repassword;
    private int courseno;
    Tgetset()
    {
    this("","","","","","",0);
    }
    
    Tgetset(String name,String email,String course,String collage,String password,String repassword,int courseno)
    {
    this.name=name;
    this.email=email;
    this.course=course;
    this.collage=collage;
    this.password=password;
    this.repassword=repassword;
    this.courseno=courseno;           
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getCollage() {
        return collage;
    }

    public void setCollage(String collage) {
        this.collage = collage;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRepassword() {
        return repassword;
    }

    public void setRepassword(String repassword) {
        this.repassword = repassword;
    }

    public int getCourseno() {
        return courseno;
    }

    public void setCourseno(int courseno) {
        this.courseno = courseno;
    }


}
