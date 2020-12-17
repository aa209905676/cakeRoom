package com.company.project.Bean;

import javax.persistence.*;

public class Iteminfo {
    @Id
    private Integer iid;

    private String title;

    private String subtitle;

    private String descr;

    private Long price;

    @Column(name = "oldPrice")
    private Long oldprice;

    @Column(name = "discountDesc")
    private String discountdesc;

    /**
     * @return iid
     */
    public Integer getIid() {
        return iid;
    }

    /**
     * @param iid
     */
    public void setIid(Integer iid) {
        this.iid = iid;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return subtitle
     */
    public String getSubtitle() {
        return subtitle;
    }

    /**
     * @param subtitle
     */
    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    /**
     * @return descr
     */
    public String getDescr() {
        return descr;
    }

    /**
     * @param descr
     */
    public void setDescr(String descr) {
        this.descr = descr;
    }

    /**
     * @return price
     */
    public Long getPrice() {
        return price;
    }

    /**
     * @param price
     */
    public void setPrice(Long price) {
        this.price = price;
    }

    /**
     * @return oldPrice
     */
    public Long getOldprice() {
        return oldprice;
    }

    /**
     * @param oldprice
     */
    public void setOldprice(Long oldprice) {
        this.oldprice = oldprice;
    }

    /**
     * @return discountDesc
     */
    public String getDiscountdesc() {
        return discountdesc;
    }

    /**
     * @param discountdesc
     */
    public void setDiscountdesc(String discountdesc) {
        this.discountdesc = discountdesc;
    }
}