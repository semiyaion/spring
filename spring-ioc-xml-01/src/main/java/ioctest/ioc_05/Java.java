package ioctest.ioc_05;

public class Java {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Java{" +
                "name='" + name + '\'' +
                '}';
    }

    public Java() {

    }
}
