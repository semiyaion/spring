package user_order.pojo;

public class User {
    private Integer id;
    private String username;
    private Double checking;
    private String userorder;

    public User() {
    }

    public User(Integer id, String username, Double checking, String order) {
        this.id = id;
        this.username = username;
        this.checking = checking;
        this.userorder = order;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", checking=" + checking +
                ", userorder='" + userorder + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Double getChecking() {
        return checking;
    }

    public void setChecking(Double checking) {
        this.checking = checking;
    }

    public String getOrder() {
        return userorder;
    }

    public void setOrder(String order) {
        this.userorder = order;
    }
}
