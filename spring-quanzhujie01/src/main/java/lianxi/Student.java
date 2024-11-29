package lianxi;

public class Student {
    private Integer id;
    private  String name;
    private String gender;
    private String classes;
    private Integer age;

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", classes='" + classes + '\'' +
                ", age=" + age +
                '}';
    }
}
