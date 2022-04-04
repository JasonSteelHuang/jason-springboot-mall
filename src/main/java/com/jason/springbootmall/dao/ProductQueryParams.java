package com.jason.springbootmall.dao;

import com.jason.springbootmall.constant.ProductCategory;

public class ProductQueryParams {
    private ProductCategory category;
    private String search;
    private Integer page;

    public ProductCategory getCategory() {
        return category;
    }

    public void setCategory(ProductCategory category) {
        this.category = category;
    }

    public String getSearch() {
        return search;
    }

    public void setSearch(String search) {
        this.search = search;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }
}
