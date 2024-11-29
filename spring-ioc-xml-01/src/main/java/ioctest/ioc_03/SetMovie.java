package ioctest.ioc_03;

public class SetMovie {
    private Moive moive;
    private String name;
    private  Integer cost;

    public void setMoive(Moive moive) {
        this.moive = moive;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "SetMovie{" +
                "moive=" + moive +
                ", name='" + name + '\'' +
                ", cost=" + cost +
                '}';
    }
}
