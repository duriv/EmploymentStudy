package com.itheima.i_class_var;
/*
  身份证
 */
public class IDCard {
    private String id;//身份证号
    private String address;//地址

    public IDCard() {
    }

    public IDCard(String id, String address) {
        this.id = id;
        this.address = address;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "IDCard{" +
                "id='" + id + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
