public class Teacher extends Person {
    private String department;
    private String[] courses;

    public Teacher(String firstName, String lastName, String gender,
                   String department, String[] courses) {
        super(firstName, lastName, gender);
        this.department = department;
        this.courses = courses;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String[] getCourses() {
        return courses;
    }

    public void setCourses(String[] courses) {
        this.courses = courses;
    }

    public String toString() {
        String courseList = String.join(", ", courses);

        return "Teacher [firstName=" + getFirstName() +
                ", lastName=" + getLastName() +
                ", gender=" + getGender() +
                ", department=" + department +
                ", courses=" + courseList + "]";
    }

    public boolean equals(Teacher t) {
        if (t == null) return false;
        if (!super.equals(t)) return false;
        if (!department.equals(t.department)) return false;
        if (courses.length != t.courses.length) return false;

        for (int i = 0; i < courses.length; i++) {
            if (!courses[i].equals(t.courses[i])) return false;
        }

        return true;
    }
}