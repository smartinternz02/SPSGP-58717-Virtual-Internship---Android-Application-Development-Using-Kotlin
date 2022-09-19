package com.parth.GroceryApp.ui.shop;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\b2\u0006\u0010$\u001a\u00020%J\u0006\u0010&\u001a\u00020\"J\u0006\u0010\'\u001a\u00020\"J\u0006\u0010(\u001a\u00020\"R\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\'\u0010\u000e\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\u00100\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0013\u001a\u00020\u00148BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\n0\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0012R\'\u0010\u001b\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\u00100\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0012R\'\u0010\u001d\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\r0\u0007j\b\u0012\u0004\u0012\u00020\r`\u00100\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0012R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 \u00a8\u0006)"}, d2 = {"Lcom/parth/GroceryApp/ui/shop/ShopViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/parth/GroceryApp/data/Repository;", "(Lcom/parth/GroceryApp/data/Repository;)V", "_bestsSelling", "Landroidx/lifecycle/MutableLiveData;", "Ljava/util/ArrayList;", "Lcom/parth/GroceryApp/model/product/ProductEntity;", "_errorMessage", "", "_exclusiveOffer", "_groceries", "Lcom/parth/GroceryApp/model/groceries/GroceriesData;", "bestsSelling", "Landroidx/lifecycle/LiveData;", "Lkotlin/collections/ArrayList;", "getBestsSelling", "()Landroidx/lifecycle/LiveData;", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "getCompositeDisposable", "()Lio/reactivex/disposables/CompositeDisposable;", "compositeDisposable$delegate", "Lkotlin/Lazy;", "errorMessage", "getErrorMessage", "exclusiveOffer", "getExclusiveOffer", "groceries", "getGroceries", "getRepository", "()Lcom/parth/GroceryApp/data/Repository;", "addToCahar", "", "productEntity", "cart", "", "showDataBestSelling", "showDataExclusiveOffer", "showDataGroceries", "app_debug"})
public final class ShopViewModel extends androidx.lifecycle.ViewModel {
    private final androidx.lifecycle.MutableLiveData<java.util.ArrayList<com.parth.GroceryApp.model.product.ProductEntity>> _exclusiveOffer = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.ArrayList<com.parth.GroceryApp.model.product.ProductEntity>> exclusiveOffer = null;
    private final androidx.lifecycle.MutableLiveData<java.util.ArrayList<com.parth.GroceryApp.model.product.ProductEntity>> _bestsSelling = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.ArrayList<com.parth.GroceryApp.model.product.ProductEntity>> bestsSelling = null;
    private final androidx.lifecycle.MutableLiveData<java.util.ArrayList<com.parth.GroceryApp.model.groceries.GroceriesData>> _groceries = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.ArrayList<com.parth.GroceryApp.model.groceries.GroceriesData>> groceries = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.String> _errorMessage = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.String> errorMessage = null;
    private final kotlin.Lazy compositeDisposable$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final com.parth.GroceryApp.data.Repository repository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.ArrayList<com.parth.GroceryApp.model.product.ProductEntity>> getExclusiveOffer() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.ArrayList<com.parth.GroceryApp.model.product.ProductEntity>> getBestsSelling() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.ArrayList<com.parth.GroceryApp.model.groceries.GroceriesData>> getGroceries() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> getErrorMessage() {
        return null;
    }
    
    private final io.reactivex.disposables.CompositeDisposable getCompositeDisposable() {
        return null;
    }
    
    public final void showDataExclusiveOffer() {
    }
    
    public final void showDataGroceries() {
    }
    
    public final void showDataBestSelling() {
    }
    
    public final void addToCahar(@org.jetbrains.annotations.NotNull()
    com.parth.GroceryApp.model.product.ProductEntity productEntity, int cart) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.parth.GroceryApp.data.Repository getRepository() {
        return null;
    }
    
    public ShopViewModel(@org.jetbrains.annotations.NotNull()
    com.parth.GroceryApp.data.Repository repository) {
        super();
    }
}