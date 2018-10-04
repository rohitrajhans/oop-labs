package pkg;
import java.util.*;

class Student {
    private Subject[] subs;
    private String name;
    private int id;
    
    Student( String name, int id, String sub1, int marks1, String sub2, int marks2) {
        Subject[] subs = new Subject[2];
        subs[0] = new Subject(sub1, marks1);
        System.out.println(subs[0]);
        subs[1] = new Subject(sub2, marks2);
        System.out.println(subs[1]);
        this.name = name;
        this.id = id;
    }

    String getStudentName() {
        return this.name;
    }

    int getId() {
        return this.id;
    }

    class CompareMarks implements Comparator<Student> {
        public int compare( Student s1, Student s2) {
            int m1 = s1.subs[0].getMarks() + s1.subs[1].getMarks();
            int m2 = s2.subs[0].getMarks() + s2.subs[1].getMarks();
            int d = m1 - m2;
            if( d==0 )
                return 0;
            else if( d>0 )
                return 1;
            else
                return -1;
        }
    }

    class CompareId implements Comparator<Student> {
        public int compare( Student s1, Student s2) {
            int d = s1.getId() - s2.getId();
            if( d==0 )
                return 0;
            else if( d>0 )
                return 1;
            else
                return -1;
        }
    }

    class compareNames implements Comparator<Student> {
        public int compare( Student s1, Student s2) {
            int d = (s1.getStudentName()).compareTo((s2.getStudentName()));
            if( d==0 )
                return 0;
            if( d>0 )
                return 1;
            else
                return -1;
        }
    }

    public String toString() {
        String s1 = this.subs[0].getSubject() + " : " + this.subs[0].getMarks();
        String s2 = this.subs[1].getSubject() + " : " + this.subs[1].getMarks();
        return "Name: " + this.name + " ID: " + this.id + " " + s1 + " " + s2;
    }

    public static void main(String[] args) {

        ArrayList<Student> studList = new ArrayList<Student>();
        studList.add( new Student( "Rohit", 105, "Maths", 80,  "Science", 75));
        studList.add( new Student( "Aditya", 157, "Maths", 65,  "Science", 97));
        studList.add( new Student( "Lucky", 260, "Maths", 69,  "Science", 84));
        studList.add( new Student( "Kamal", 48, "Maths", 95,  "Science", 87));
        studList.add( new Student( "Nirav", 452, "Maths", 78,  "Science", 56));

        
        // Collection.sort(studList, new Student("",0,"",0,"",0).new CompareId());
        for( Student s: studList)
            System.out.println(s);
    }


}