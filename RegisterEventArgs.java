/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package courses;

/**
 *
 * @author Iwa Stojnowa
 */
public class RegisterEventArgs {
    private Student s;
    private String[] courses;

    public RegisterEventArgs(Student st, String[] c) {
        setS(st);
        setCourses(c);
    }

    public void setCourses(String[] c) {
        if (c == null) {
            this.courses = new String[10];
        } else {
            this.courses = c;
        }
    }

    public void setS(Student st) {
        if (st == null) {
            this.s = new Student();
        } else {
            this.s = st;
            //this.s = new Student(st);
        }
    }

    public String[] getCourses() {
        return courses;
    }

    public Student getS() {
        return s;
    }



}
