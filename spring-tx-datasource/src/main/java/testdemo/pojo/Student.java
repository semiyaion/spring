package testdemo.pojo;

public class Student {
    private String name;
    private String gender;
    private Integer id;
    private Integer age;
    private String classes;

    public Student() {
    }

    public Student(String name, String gender, Integer id, Integer age, String classes) {
        this.name = name;
        this.gender = gender;
        this.id = id;
        this.age = age;
        this.classes = classes;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", id=" + id +
                ", age=" + age +
                ", classes='" + classes + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }
}
