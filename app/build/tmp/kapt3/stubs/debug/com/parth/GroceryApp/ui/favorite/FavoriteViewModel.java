package com.parth.GroceryApp.ui.favorite;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0015R\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\'\u0010\u000b\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\n0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006\u0016"}, d2 = {"Lcom/parth/GroceryApp/ui/favorite/FavoriteViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/parth/GroceryApp/data/Repository;", "(Lcom/parth/GroceryApp/data/Repository;)V", "_favoriteProduct", "Landroidx/lifecycle/MutableLiveData;", "Ljava/util/ArrayList;", "Lcom/parth/GroceryApp/model/product/ProductEntity;", "dataFavorite", "Lkotlin/collections/ArrayList;", "favoriteProduct", "Landroidx/lifecycle/LiveData;", "getFavoriteProduct", "()Landroidx/lifecycle/LiveData;", "getRepository", "()Lcom/parth/GroceryApp/data/Repository;", "loadDataFavorite", "", "removeProduct", "pos", "", "app_debug"})
public final class FavoriteViewModel extends androidx.lifecycle.ViewModel {
    private final androidx.lifecycle.MutableLiveData<java.util.ArrayList<com.parth.GroceryApp.model.product.ProductEntity>> _favoriteProduct = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.ArrayList<com.parth.GroceryApp.model.product.ProductEntity>> favoriteProduct = null;
    private java.util.ArrayList<com.parth.GroceryApp.model.product.ProductEntity> dataFavorite;
    @org.jetbrains.annotations.NotNull()
    private final com.parth.GroceryApp.data.Repository repository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.ArrayList<com.parth.GroceryApp.model.product.ProductEntity>> getFavoriteProduct() {
        return null;
    }
    
    public final void loadDataFavorite() {
    }
    
    public final void removeProduct(int pos) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.parth.GroceryApp.data.Repository getRepository() {
        return null;
    }
    
    public FavoriteViewModel(@org.jetbrains.annotations.NotNull()
    com.parth.GroceryApp.data.Repository repository) {
        super();
    }
}