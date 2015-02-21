/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package courses;

import java.util.Random;

/**
 *
 * @author Iwa Stojnowa
 */
public class Mentor {
    private String name;
    private RegisterEventHandler register;

    public Mentor() {
        this(""); //this.name = "";
    }

    public Mentor(String nameMenStr) {
        setName(nameMenStr);
    }

    public Mentor(Mentor m) {
        this(m.getName());
    }

    public void setName(String nameMenStr) {
        if (nameMenStr == null) {
            this.name = "";
        } else {
            this.name = nameMenStr;
        }
    }

    public String getName() {
        return name;
    }


    public void addRegisterListener(RegisterEventHandler registerA){
        this.register = registerA;
    }

    public void registerStudent(Student student, String[] suggestedCourses){

        if(register != null) {

            register.registrationPerformed(new RegisterEventArgs(student,suggestedCourses));
        }
    }
    @Override
    public String toString() {

        StringBuffer result = new StringBuffer();

        result.append("name: ");
        result.append(this.getName());

        return result.toString(); 
    }

    public String[] prepareCoursesToTake(int courseNumber) {

        String[] result = new String[courseNumber];

        for (int i = 0; i < courseNumber; i++) {

            StringBuffer courseName = new StringBuffer();

            courseName.append("CS");

            Random randomGenerator = new Random();

            int courseNum = randomGenerator.nextInt(2) + 1;
            courseName.append(courseNum);
            char ch = (char)(randomGenerator.nextInt('Z' - 'A' +1) + 'A');
            courseName.append(ch);

            result[i] = courseName.toString();
        }
        return result;
    }

}
