package lianxitx.pojo;

public class Account {
    private Integer id;
    private Double bankmon;
    private String bankname;

    public Account() {
    }

    public Account(Integer id, Double bankmon, String bankname) {
        this.id = id;
        this.bankmon = bankmon;
        this.bankname = bankname;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setBankmon(Double bankmon) {
        this.bankmon = bankmon;
    }

    public void setBankname(String bankname) {
        this.bankname = bankname;
    }

    public Integer getId() {
        return id;
    }

    public Double getBankmon() {
        return bankmon;
    }

    public String getBankname() {
        return bankname;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", bankmon=" + bankmon +
                ", bankname='" + bankname + '\'' +
                '}';
    }
}
