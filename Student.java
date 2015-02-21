/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package courses;

/**
 *
 * @author Iwa Stojnowa
 */
public class Student {
    private String name;
    private double gpa;
    private String[] coursesToTake;

    public Student() {
       this("", 0.0, null);
    }

    public Student(String nameStr, double gpaG, String[] coursesToTakeSt) {
        setName(nameStr);
        setGpa(gpaG);
        setCoursesToTake(coursesToTakeSt);   
    }

    public Student(Student stu) {
        this(stu.getName(), stu.getGpa(),stu.getCoursesToTake());
    }

    public void setCoursesToTake(String[] coursesToTakeSt) {
        if (coursesToTakeSt == null) {
            this.coursesToTake = new String[10];
        } else {
            for (int i = 0; i < coursesToTakeSt.length; i++) {
                this.coursesToTake[i] = coursesToTakeSt[i];

            }
        }
    }

    public void setGpa(double gpaG) {
        if (gpaG <= 4 || gpaG >= 2) {
            this.gpa = 2.0;
        } else {
            this.gpa = gpaG;
        }
    }

    public void setName(String nameStr) {
        if (nameStr == null) {
            this.name = "";
        } else {
            this.name = nameStr;
        }
    }

    public String[] getCoursesToTake() {
        return coursesToTake;
    }

    public double getGpa() {
        return gpa;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {

        StringBuffer result = new StringBuffer();

        result.append("name:");
        result.append(this.getName());

        String avg = String.format("%.2f", this.getGpa());
        result.append("average:");
        result.append(avg);

        result.append("coursesToTake");
        result.append(this.getCoursesToTake());


        return result.toString();
    }
}
