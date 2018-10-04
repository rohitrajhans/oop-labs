package pkg;

class Subject {

    private String subject;
    private int marks;

    Subject( String subject, int marks) {
        this.subject = subject;
        this.marks = marks;
    }

    int getMarks() {
        return this.marks;
    }

    String getSubject() {
        return this.subject;
    }

    void setMarks( int i) {
        this.marks = i;
    }

    void setSubName( String name) {
        this.subject = name;
    }

    public String toString() {
        return "Subject: " + this.subject + " Marks: " + this.marks;
    }

}