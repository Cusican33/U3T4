public class Student
{
    private String name;
    private int gradeLevel;
    private String school;

    public Student(String name, int gradeLevel, String school)
    {
        this.name = name;
        this.gradeLevel = gradeLevel;
        this.school = school;
    }
    public Student(String name, int gradeLevel)
    {
        this.name = name;
        this.gradeLevel = gradeLevel;
        if (gradeLevel < 1) school = "unknown";
        else if (gradeLevel < 6) school = "elementary school";
        else if (gradeLevel < 9) school = "middle school";
        else if (gradeLevel < 13) school = "high school";
        else school = "unknown";
    }

    public String studentInfo()
    {
        return name + " is in grade " + gradeLevel + " and goes to " + school;
    }
}
