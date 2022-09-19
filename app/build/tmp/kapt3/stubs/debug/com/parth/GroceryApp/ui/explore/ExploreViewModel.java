package com.parth.GroceryApp.ui.explore;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\nJ\u000e\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\nJ\u0010\u0010\u001d\u001a\u00020\u001a2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0007R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0014\u00a8\u0006\u001f"}, d2 = {"Lcom/parth/GroceryApp/ui/explore/ExploreViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/parth/GroceryApp/data/Repository;", "(Lcom/parth/GroceryApp/data/Repository;)V", "_errorMessage", "Landroidx/lifecycle/MutableLiveData;", "", "_searchProduct", "", "Lcom/parth/GroceryApp/model/product/ProductEntity;", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "getCompositeDisposable", "()Lio/reactivex/disposables/CompositeDisposable;", "compositeDisposable$delegate", "Lkotlin/Lazy;", "errorMessage", "Landroidx/lifecycle/LiveData;", "getErrorMessage", "()Landroidx/lifecycle/LiveData;", "getRepository", "()Lcom/parth/GroceryApp/data/Repository;", "searchProduct", "getSearchProduct", "addToCahar", "", "productEntity", "removeProductCart", "requestProductQuery", "qword", "app_debug"})
public final class ExploreViewModel extends androidx.lifecycle.ViewModel {
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.parth.GroceryApp.model.product.ProductEntity>> _searchProduct = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.parth.GroceryApp.model.product.ProductEntity>> searchProduct = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.String> _errorMessage = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.String> errorMessage = null;
    private final kotlin.Lazy compositeDisposable$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final com.parth.GroceryApp.data.Repository repository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.parth.GroceryApp.model.product.ProductEntity>> getSearchProduct() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> getErrorMessage() {
        return null;
    }
    
    private final io.reactivex.disposables.CompositeDisposable getCompositeDisposable() {
        return null;
    }
    
    public final void requestProductQuery(@org.jetbrains.annotations.Nullable()
    java.lang.String qword) {
    }
    
    public final void addToCahar(@org.jetbrains.annotations.NotNull()
    com.parth.GroceryApp.model.product.ProductEntity productEntity) {
    }
    
    public final void removeProductCart(@org.jetbrains.annotations.NotNull()
    com.parth.GroceryApp.model.product.ProductEntity productEntity) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.parth.GroceryApp.data.Repository getRepository() {
        return null;
    }
    
    public ExploreViewModel(@org.jetbrains.annotations.NotNull()
    com.parth.GroceryApp.data.Repository repository) {
        super();
    }
}