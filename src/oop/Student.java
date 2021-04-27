package oop;

public class Student extends Person {

    private int grade;

    Student(boolean isStudent, String firstName, String lastName, int age, int grade) {
        super(isStudent, firstName, lastName, age);
        this.grade = grade;
    }


//    Student (String firstName, String lastName, int age, boolean isStudent, int grade) {
//        this.setFirstName(firstName);
//        this.setLastName(lastName);
//        this.setAge(age);
//        this.setIsStudent(isStudent);
//        this.setGrade(grade);
//
//    }
//
//
//
//
//
//        public void setFirstName(String firstName) {
//            if (firstName != "") {
//                this.firstName = firstName;
//            } else {
//                System.out.println("Not valid First Name");
//            }
//
//        this.firstName = firstName;
//        }
//
//        public void setLastName (String lastName) {
//            if (firstName != "") {
//                this.firstName = firstName;
//            } else {
//                System.out.println("Not valid last name");
//            }
//        }
//
//        public void setAge ( int age){
//            if (age >= 5 && age <= 18) {
//                this.age = age;
//            } else {
//                System.out.println("Not eligible age");
//                this.age = 0;
//            }
//        }
//
//        public void setIsStudent(boolean isStudent) {
//            if (age == 0) {
//                this.isStudent = false;
//            } else if (isStudent = false) {
//                this.isStudent = false;
//            } else {
//                this.isStudent = true;
//            }
//
//    }
//
//        public void setGrade(int grade) {
//            if (isStudent) {
//                this.grade = grade;
//            } else {
//                this.grade = -1;
//            }
//        }
//
//
//
//
//    public void printCard (String firstName, String lastName, int age, boolean isStudent, int grade) {
//        System.out.println("_____________________");
//        if(isStudent) {
//            System.out.println("Student:");
//        }
//
//        System.out.println(firstName + " " + lastName + ", " + age);
//        System.out.println("Grade " + grade);
//        System.out.println("_______________________");
//    }
//    public String getFirstName () {
//        return firstName;
//    }
//
//    public String getLastName () {
//        return lastName;
//    }
//
//    public int getAge () {
//        return age;
//    }
//
//    public int getGrade () {
//        return grade;
//    }
//
//    public boolean getIsStudent () {
//        return isStudent;
//    }
//



}
