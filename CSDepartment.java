/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package courses;

import java.io.Serializable;

/**
 *
 * @author Iwa Stojnowa
 */
public class CSDepartment implements Serializable {

    private Mentor mentor;
    private Student[] students;

    public CSDepartment(Mentor men) {
        //this.mentor = mentor;
        students = new Student[30];
    }

    public void setMentor(Mentor men) {
        if (men == null) {
            this.mentor = new Mentor();
        } else {
            this.mentor = new Mentor(men);
        }
    }

    public void setStudents(Student[] studentArray) {
        if (studentArray == null) {
            this.students = new Student []{};
        } else {
            for (int i = 0; i < studentArray.length; i++) {
                this.students[i] = studentArray[i];

            }
        }
    }

    public Mentor getMentor() {
        //return mentor;
        return new Mentor(mentor);
    }

    public Student[] getStudents() {

        Student[] buffer = new Student[students.length];

        for (int i = 0; i < buffer.length; i++) {
            buffer[i] = new Student(students[i]);            
        }
        return buffer;
    }

    private class InnerClass implements RegisterEventHandler {

        public void registrationPerformed(RegisterEventArgs args) {
            throw new UnsupportedOperationException("Not supported yet.");
        }

    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        
        for (int i = 0; i < students.length; i++) {
            
            str.append(students[i].toString());
        }
        
        return String.format(mentor.toString(), new String(str));
    }



}
