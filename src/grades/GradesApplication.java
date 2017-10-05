package grades;

import util.Input;

import java.util.HashMap;

public class GradesApplication {
    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();
        HashMap<String, String> classes = new HashMap<>();
        Input input = new Input();
        Student raine = new Student("Raine Sage");
        Student rita = new Student("Rita Mordio");
        Student aria = new Student("Aria Stark");
        Student tear = new Student("Tear Grants");
        Student lloyd = new Student("Lloyd Irving");
        Student genis = new Student("Genis Sage");
        Student X = new Student("Mega Man");
        raine.addGrade(100);
        raine.addGrade(99);
        raine.addGrade(98);
        raine.addGrade(100);
        rita.addGrade(95);
        rita.addGrade(100);
        rita.addGrade(94);
        rita.addGrade(97);
        aria.addGrade(87);
        aria.addGrade(96);
        aria.addGrade(78);
        aria.addGrade(83);
        tear.addGrade(90);
        tear.addGrade(89);
        tear.addGrade(96);
        tear.addGrade(87);
        lloyd.addGrade(58);
        lloyd.addGrade(65);
        lloyd.addGrade(78);
        lloyd.addGrade(71);
        genis.addGrade(99);
        genis.addGrade(100);
        genis.addGrade(100);
        genis.addGrade(100);
        X.addGrade(100);
        X.addGrade(0);
        X.addGrade(59);
        X.addGrade(75);
        students.put("Prof_Raine", raine);
        students.put("TheMordio", rita);
        students.put("Faceless_gurl", aria);
        students.put("Tear.Grants", tear);
        students.put("Sword_master", lloyd);
        students.put("Genisage", genis);
        students.put("Rockman", X);
        classes.put("Healer", "Magic");
        classes.put("Mage", "Magic");
        classes.put("Phonist", "Magic");
        classes.put("Assassin", "Physical");
        classes.put("Swordsman", "Physical");
        classes.put("Ranger", "Physical");
        while (true) {
            System.out.println("Here are all the users:");
            for (String usernames : students.keySet()) {
                System.out.println(usernames);
            }
            while (true) {
                System.out.println("Select a Student to view");
                String userInput = input.getString();
                if (userInput.equals("Prof_Raine")){
                    System.out.println("Class: Healer" );
                    System.out.println("Style: "+classes.get("Healer"));
                } else if(userInput.equals("TheMordio")){
                    System.out.println("Class: Mage" );
                    System.out.println("Style: "+classes.get("Mage"));
                }else if(userInput.equals("Faceless_gurl")){
                    System.out.println("Class: Assassin" );
                    System.out.println("Style: "+classes.get("Assassin"));
                }else if(userInput.equals("Tear.Grants")){
                    System.out.println("Class: Phonist" );
                    System.out.println("Style: "+classes.get("Phonist"));
                }else if(userInput.equals("Sword_master")){
                    System.out.println("Class: Swordsman" );
                    System.out.println("Style: "+classes.get("Swordsman"));
                }else if(userInput.equals("Genisage")){
                    System.out.println("Class: Mage" );
                    System.out.println("Style: "+classes.get("Mage"));
                }else if(userInput.equals("Rockman")){
                    System.out.println("Class: Ranger" );
                    System.out.println("Style: "+classes.get("Ranger"));
                }
                if (students.get(userInput) == null) {
                    System.out.println("Make sure you type it EXACTLY how you see it.");
                } else {
                    System.out.println("Username: " + userInput );
                    getStudentInfo(students.get(userInput));

                    break;
                }
            }
            if (!input.yesOrNo("Would you like to select another?")) {
                System.out.println("Laterz!");
                break;
            }

        }

    }
    public static void getStudentInfo(Student student){
        System.out.println("Name: " + student.getName() + "\nGrade Average: " + student.getGradeAverage() + "%" );
        System.out.println("");
    }

}
