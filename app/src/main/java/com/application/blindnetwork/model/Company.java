package com.application.blindnetwork.model;

public class Company {

    private String company_name;
    private String rate;
    private String des;
    private String imageUrl;
    private String id;

    public Company() {
    }

    public Company(String company_name, String rate, String des, String imageUrl, String id) {
        this.company_name = company_name;
        this.rate = rate;
        this.des = des;
        this.imageUrl = imageUrl;
        this.id = id;
    }

    public String getCompany_name() {
        return company_name;
    }

    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
