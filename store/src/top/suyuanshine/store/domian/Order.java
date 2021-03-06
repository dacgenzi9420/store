package top.suyuanshine.store.domian;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 订单对象
 */
public class Order {
    private String oid;//订单编号
    private Date ordertime;//订单时间
    private double total;//订单总计
    private int state;//订单状态 下单未付款:1,付款未发货:2,已发货:3,签收:4
    private String address;//收货人地址
    private String name;//收货人姓名
    private String telephone;//收货人电话


    private User user;//用于获取创建订单的用户id
    private List<OrderItem> list = new ArrayList<OrderItem>();//订单详情

    public String getOid() {
        return oid;
    }

    public void setOid(String oid) {
        this.oid = oid;
    }

    public Date getOrdertime() {
        return ordertime;
    }

    public void setOrdertime(Date ordertime) {
        this.ordertime = ordertime;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<OrderItem> getList() {
        return list;
    }

    public void setList(List<OrderItem> list) {
        this.list = list;
    }
}
