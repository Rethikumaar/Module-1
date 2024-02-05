
import java.util.*;

interface Resume {
    void biodata();
}

class Teacher implements Resume {
    @Override
    public void biodata() {
        String name, dob, age, bg, qualifctn;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Name, Date of Birth (DD/MM/YYYY), Age, Blood Group of Teacher");
        name = s.nextLine();
        dob = s.nextLine();
        age = s.nextLine();
        bg = s.nextLine();
        System.out.println("Enter the qualifications, experience in years, achievements");
        qualifctn = s.nextLine();
        String exp = s.nextLine();
        String achievement = s.nextLine();
        System.out.println("\n\nResume of The Teacher");

        System.out.println(" Name: " + name + "\nDate of Birth: " + dob + "\nAge: " + age + " \nBlood Group: " + bg
                + "\nQualifications: " + qualifctn + "\nExperience in years: " + exp + "\nAchievements: "
                + achievement);
    }
}

class Student implements Resume {
    @Override
    public void biodata() {
        String name, dob, age, bg;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Name, Date of Birth (DD/MM/YYYY), Age, Blood Group of Student");
        name = s.nextLine();
        dob = s.nextLine();
        age = s.nextLine();
        bg = s.nextLine();
        System.out.println("Enter the Discipline i.Branch ii.Sem iii.Section");
        String branch = s.nextLine();
        String sem = s.nextLine();
        String sec = s.nextLine();
        System.out.println("Enter the Results i.percentage ii.CGPA");
        float p = s.nextFloat();
        float c = s.nextFloat();
        System.out.println("\n\nResume of The Student");
        System.out.println("Name: " + name + "\nDate of Birth: " + dob + "\nAge: " + age + " \nBlood Group: " +
                bg + "\nResults\nPercentage: " + p + "\nCGPA: " + c + "\nDiscipline Details:\nBranch: " + branch
                + "\nSemester: " + sem + "\nSection: " + sec);
    }
}

public class Bioclass {
    public static void main(String args[]) {
        Teacher t = new Teacher();
        Student s = new Student();
        t.biodata();
        s.biodata();
    }
}
