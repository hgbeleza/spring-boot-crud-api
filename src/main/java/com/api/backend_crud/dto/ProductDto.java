package com.api.backend_crud.dto;

public class ProductDto {
    private String productName;
    private String productDescription;
    private int productQtd;

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public int getProductQtd() {
        return productQtd;
    }

    public void setProductQtd(int productQtd) {
        this.productQtd = productQtd;
    }
}
