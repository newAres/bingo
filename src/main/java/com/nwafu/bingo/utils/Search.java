package com.nwafu.bingo.utils;

import java.util.List;

/**
 * order: desc, asc
 * sort: discount, new, score, price
 * category: 类别
 * tag: presale, newsale, promotion
 * minPrice: Float
 * maxPrice: Float
 */
public class Search {
    private String order;
    private String sort;
    private List<String> category;
    private List<String> tag;
    private Float minPrice;
    private Float maxPrice;

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public List<String> getCategory() {
        return category;
    }

    public void setCategory(List<String> category) {
        this.category = category;
    }

    public List<String> getTag() {
        return tag;
    }

    public void setTag(List<String> tag) {
        this.tag = tag;
    }

    public Float getMinPrice() {
        return minPrice;
    }

    public void setMinPrice(Float minPrice) {
        this.minPrice = minPrice;
    }

    public Float getMaxPrice() {
        return maxPrice;
    }

    public void setMaxPrice(Float maxPrice) {
        this.maxPrice = maxPrice;
    }
}
