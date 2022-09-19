package com.parth.GroceryApp.ui.product;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\bJ\u000e\u0010\u001d\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\bJ\u0006\u0010\u001e\u001a\u00020\u001bR\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\'\u0010\u000b\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\r0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\n0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019\u00a8\u0006\u001f"}, d2 = {"Lcom/parth/GroceryApp/ui/product/ProductViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/parth/GroceryApp/data/Repository;", "(Lcom/parth/GroceryApp/data/Repository;)V", "_beverages", "Landroidx/lifecycle/MutableLiveData;", "Ljava/util/ArrayList;", "Lcom/parth/GroceryApp/model/product/ProductEntity;", "_errorMessage", "", "beverages", "Landroidx/lifecycle/LiveData;", "Lkotlin/collections/ArrayList;", "getBeverages", "()Landroidx/lifecycle/LiveData;", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "getCompositeDisposable", "()Lio/reactivex/disposables/CompositeDisposable;", "compositeDisposable$delegate", "Lkotlin/Lazy;", "errorMessage", "getErrorMessage", "getRepository", "()Lcom/parth/GroceryApp/data/Repository;", "addToCahar", "", "productEntity", "removeProduct", "showDataBeverages", "app_debug"})
public final class ProductViewModel extends androidx.lifecycle.ViewModel {
    private final androidx.lifecycle.MutableLiveData<java.util.ArrayList<com.parth.GroceryApp.model.product.ProductEntity>> _beverages = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.ArrayList<com.parth.GroceryApp.model.product.ProductEntity>> beverages = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.String> _errorMessage = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.String> errorMessage = null;
    private final kotlin.Lazy compositeDisposable$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final com.parth.GroceryApp.data.Repository repository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.ArrayList<com.parth.GroceryApp.model.product.ProductEntity>> getBeverages() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> getErrorMessage() {
        return null;
    }
    
    private final io.reactivex.disposables.CompositeDisposable getCompositeDisposable() {
        return null;
    }
    
    public final void showDataBeverages() {
    }
    
    public final void addToCahar(@org.jetbrains.annotations.NotNull()
    com.parth.GroceryApp.model.product.ProductEntity productEntity) {
    }
    
    public final void removeProduct(@org.jetbrains.annotations.NotNull()
    com.parth.GroceryApp.model.product.ProductEntity productEntity) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.parth.GroceryApp.data.Repository getRepository() {
        return null;
    }
    
    public ProductViewModel(@org.jetbrains.annotations.NotNull()
    com.parth.GroceryApp.data.Repository repository) {
        super();
    }
}