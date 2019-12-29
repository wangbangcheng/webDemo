package com.hutaotao.webdemo.domain;

public class Product {

  private int id;
  private String productNo;
  private String productName;
  private double productPrice;
  private long productNum;
  private String productFirstType;
  private String productSecondType;
  private String productStatus;


  public long getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }


  public String getProductNo() {
    return productNo;
  }

  public void setProductNo(String productNo) {
    this.productNo = productNo;
  }


  public String getProductName() {
    return productName;
  }

  public void setProductName(String productName) {
    this.productName = productName;
  }


  public double getProductPrice() {
    return productPrice;
  }

  public void setProductPrice(double productPrice) {
    this.productPrice = productPrice;
  }


  public long getProductNum() {
    return productNum;
  }

  public void setProductNum(long productNum) {
    this.productNum = productNum;
  }


  public String getProductFirstType() {
    return productFirstType;
  }

  public void setProductFirstType(String productFirstType) {
    this.productFirstType = productFirstType;
  }


  public String getProductSecondType() {
    return productSecondType;
  }

  public void setProductSecondType(String productSecondType) {
    this.productSecondType = productSecondType;
  }


  public String getProductStatus() {
    return productStatus;
  }

  public void setProductStatus(String productStatus) {
    this.productStatus = productStatus;
  }

}
