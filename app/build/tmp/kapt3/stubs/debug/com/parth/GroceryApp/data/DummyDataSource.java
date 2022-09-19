package com.parth.GroceryApp.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u00070\u0004J\u001c\u0010\b\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u00070\u0004J\u001c\u0010\t\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u00070\u0004J\u001c\u0010\n\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u000b0\u0005j\b\u0012\u0004\u0012\u00020\u000b`\u00070\u0004J\u001c\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\r0\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u00a8\u0006\u0010"}, d2 = {"Lcom/parth/GroceryApp/data/DummyDataSource;", "", "()V", "getBestSelling", "Lio/reactivex/Observable;", "Ljava/util/ArrayList;", "Lcom/parth/GroceryApp/model/product/ProductEntity;", "Lkotlin/collections/ArrayList;", "getBeverages", "getExclusive", "getGroceries", "Lcom/parth/GroceryApp/model/groceries/GroceriesData;", "getSearchData", "", "qword", "", "app_debug"})
public final class DummyDataSource {
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Observable<java.util.ArrayList<com.parth.GroceryApp.model.product.ProductEntity>> getExclusive() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Observable<java.util.ArrayList<com.parth.GroceryApp.model.product.ProductEntity>> getBestSelling() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Observable<java.util.ArrayList<com.parth.GroceryApp.model.groceries.GroceriesData>> getGroceries() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Observable<java.util.ArrayList<com.parth.GroceryApp.model.product.ProductEntity>> getBeverages() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Observable<java.util.List<com.parth.GroceryApp.model.product.ProductEntity>> getSearchData(@org.jetbrains.annotations.Nullable()
    java.lang.String qword) {
        return null;
    }
    
    public DummyDataSource() {
        super();
    }
}