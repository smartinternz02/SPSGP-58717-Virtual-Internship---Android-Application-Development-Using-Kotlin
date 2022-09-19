package com.parth.GroceryApp.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\u0011\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0010J\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00162\u0006\u0010\u0017\u001a\u00020\u0010J\u0012\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u001a0\u0019J\u0012\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u001a0\u0019J\u0012\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u001a0\u0019J\u0012\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u001a0\u0019J\u001c\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00160\u00192\b\u0010 \u001a\u0004\u0018\u00010!J\u0016\u0010\"\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0010J\u0016\u0010#\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0010J\u0018\u0010$\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0010R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006%"}, d2 = {"Lcom/parth/GroceryApp/data/Repository;", "", "dummyDataSource", "Lcom/parth/GroceryApp/data/DummyDataSource;", "dataBase", "Lcom/parth/GroceryApp/model/DataBase;", "(Lcom/parth/GroceryApp/data/DummyDataSource;Lcom/parth/GroceryApp/model/DataBase;)V", "getDataBase", "()Lcom/parth/GroceryApp/model/DataBase;", "getDummyDataSource", "()Lcom/parth/GroceryApp/data/DummyDataSource;", "addToCart", "", "productEntity", "Lcom/parth/GroceryApp/model/product/ProductEntity;", "qty", "", "addToFav", "checkProduct", "", "id", "getAllDb", "", "type", "getBestSelling", "Lio/reactivex/Observable;", "Ljava/util/ArrayList;", "getBeverages", "getExclusive", "getGroceries", "Lcom/parth/GroceryApp/model/groceries/GroceriesData;", "getSearchData", "qword", "", "removeProductCart", "removeProductFav", "subtractCart", "app_debug"})
public final class Repository {
    @org.jetbrains.annotations.NotNull()
    private final com.parth.GroceryApp.data.DummyDataSource dummyDataSource = null;
    @org.jetbrains.annotations.NotNull()
    private final com.parth.GroceryApp.model.DataBase dataBase = null;
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Observable<java.util.ArrayList<com.parth.GroceryApp.model.product.ProductEntity>> getExclusive() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Observable<java.util.ArrayList<com.parth.GroceryApp.model.groceries.GroceriesData>> getGroceries() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Observable<java.util.ArrayList<com.parth.GroceryApp.model.product.ProductEntity>> getBestSelling() {
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
    
    public final void addToFav(@org.jetbrains.annotations.NotNull()
    com.parth.GroceryApp.model.product.ProductEntity productEntity) {
    }
    
    public final void addToCart(@org.jetbrains.annotations.NotNull()
    com.parth.GroceryApp.model.product.ProductEntity productEntity, int qty) {
    }
    
    public final void subtractCart(@org.jetbrains.annotations.NotNull()
    com.parth.GroceryApp.model.product.ProductEntity productEntity, int qty) {
    }
    
    public final void removeProductFav(int id, int type) {
    }
    
    public final void removeProductCart(int id, int type) {
    }
    
    public final boolean checkProduct(int id) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.parth.GroceryApp.model.product.ProductEntity> getAllDb(int type) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.parth.GroceryApp.data.DummyDataSource getDummyDataSource() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.parth.GroceryApp.model.DataBase getDataBase() {
        return null;
    }
    
    public Repository(@org.jetbrains.annotations.NotNull()
    com.parth.GroceryApp.data.DummyDataSource dummyDataSource, @org.jetbrains.annotations.NotNull()
    com.parth.GroceryApp.model.DataBase dataBase) {
        super();
    }
}