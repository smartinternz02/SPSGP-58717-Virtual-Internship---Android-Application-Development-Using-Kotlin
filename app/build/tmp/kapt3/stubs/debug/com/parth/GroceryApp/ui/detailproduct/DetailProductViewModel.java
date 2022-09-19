package com.parth.GroceryApp.ui.detailproduct;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u001dJ\u000e\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\bJ\u0006\u0010\u001f\u001a\u00020\u001aJ\u000e\u0010 \u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\bJ\u000e\u0010!\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\bR\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\b0\u000ej\b\u0012\u0004\u0012\u00020\b`\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\n0\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\f0\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018\u00a8\u0006\""}, d2 = {"Lcom/parth/GroceryApp/ui/detailproduct/DetailProductViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/parth/GroceryApp/data/Repository;", "(Lcom/parth/GroceryApp/data/Repository;)V", "_detailProduct", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/parth/GroceryApp/model/product/ProductEntity;", "_errorMessage", "", "_isfavorited", "", "dataFavorite", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "detailProduct", "Landroidx/lifecycle/LiveData;", "getDetailProduct", "()Landroidx/lifecycle/LiveData;", "errorMessage", "getErrorMessage", "isFavorited", "getRepository", "()Lcom/parth/GroceryApp/data/Repository;", "addToCahar", "", "productEntity", "cart", "", "checkProduct", "loadDataDetail", "removeProduct", "saveProduct", "app_debug"})
public final class DetailProductViewModel extends androidx.lifecycle.ViewModel {
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.parth.GroceryApp.model.product.ProductEntity>> _detailProduct = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.parth.GroceryApp.model.product.ProductEntity>> detailProduct = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> _isfavorited = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.Boolean> isFavorited = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.String> _errorMessage = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.String> errorMessage = null;
    private java.util.ArrayList<com.parth.GroceryApp.model.product.ProductEntity> dataFavorite;
    @org.jetbrains.annotations.NotNull()
    private final com.parth.GroceryApp.data.Repository repository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.parth.GroceryApp.model.product.ProductEntity>> getDetailProduct() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> isFavorited() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> getErrorMessage() {
        return null;
    }
    
    public final void loadDataDetail() {
    }
    
    public final void saveProduct(@org.jetbrains.annotations.NotNull()
    com.parth.GroceryApp.model.product.ProductEntity productEntity) {
    }
    
    public final void removeProduct(@org.jetbrains.annotations.NotNull()
    com.parth.GroceryApp.model.product.ProductEntity productEntity) {
    }
    
    public final void checkProduct(@org.jetbrains.annotations.NotNull()
    com.parth.GroceryApp.model.product.ProductEntity productEntity) {
    }
    
    public final void addToCahar(@org.jetbrains.annotations.NotNull()
    com.parth.GroceryApp.model.product.ProductEntity productEntity, int cart) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.parth.GroceryApp.data.Repository getRepository() {
        return null;
    }
    
    public DetailProductViewModel(@org.jetbrains.annotations.NotNull()
    com.parth.GroceryApp.data.Repository repository) {
        super();
    }
}