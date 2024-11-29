package user_order.pojo;

public class Goods {
    private Integer id;
    private String goodsname;
    private Double goodscost;

    public Goods() {
    }

    public Goods(Integer id, String goodsname, Double goodscost) {
        this.id = id;
        this.goodsname = goodsname;
        this.goodscost = goodscost;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "id=" + id +
                ", goodsname='" + goodsname + '\'' +
                ", goodscost=" + goodscost +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGoodsname() {
        return goodsname;
    }

    public void setGoodsname(String goodsname) {
        this.goodsname = goodsname;
    }

    public Double getGoodscost() {
        return goodscost;
    }

    public void setGoodscost(Double goodscost) {
        this.goodscost = goodscost;
    }
}
