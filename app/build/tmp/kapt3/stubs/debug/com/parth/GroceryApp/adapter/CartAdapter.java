package com.parth.GroceryApp.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u001eB\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u001c\u0010\u0013\u001a\u00020\u00142\n\u0010\u0015\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0012H\u0016J\u001c\u0010\u0017\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0012H\u0016J\u0014\u0010\u001b\u001a\u00020\u00142\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\b0\u001dR\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010\u00a8\u0006\u001f"}, d2 = {"Lcom/parth/GroceryApp/adapter/CartAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/parth/GroceryApp/adapter/CartAdapter$CartViewHolder;", "listener", "Lcom/parth/GroceryApp/listener/OnTotalChange;", "(Lcom/parth/GroceryApp/listener/OnTotalChange;)V", "list", "", "Lcom/parth/GroceryApp/model/product/ProductEntity;", "getListener", "()Lcom/parth/GroceryApp/listener/OnTotalChange;", "onClickListener", "Lcom/parth/GroceryApp/listener/OnClickItemAddRemove;", "getOnClickListener", "()Lcom/parth/GroceryApp/listener/OnClickItemAddRemove;", "setOnClickListener", "(Lcom/parth/GroceryApp/listener/OnClickItemAddRemove;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setDataAdapter", "data", "", "CartViewHolder", "app_debug"})
public final class CartAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.parth.GroceryApp.adapter.CartAdapter.CartViewHolder> {
    private java.util.List<com.parth.GroceryApp.model.product.ProductEntity> list;
    @org.jetbrains.annotations.Nullable()
    private com.parth.GroceryApp.listener.OnClickItemAddRemove onClickListener;
    @org.jetbrains.annotations.NotNull()
    private final com.parth.GroceryApp.listener.OnTotalChange listener = null;
    
    @org.jetbrains.annotations.Nullable()
    public final com.parth.GroceryApp.listener.OnClickItemAddRemove getOnClickListener() {
        return null;
    }
    
    public final void setOnClickListener(@org.jetbrains.annotations.Nullable()
    com.parth.GroceryApp.listener.OnClickItemAddRemove p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.parth.GroceryApp.adapter.CartAdapter.CartViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.parth.GroceryApp.adapter.CartAdapter.CartViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public final void setDataAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<com.parth.GroceryApp.model.product.ProductEntity> data) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.parth.GroceryApp.listener.OnTotalChange getListener() {
        return null;
    }
    
    public CartAdapter(@org.jetbrains.annotations.NotNull()
    com.parth.GroceryApp.listener.OnTotalChange listener) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007\u00a8\u0006\t"}, d2 = {"Lcom/parth/GroceryApp/adapter/CartAdapter$CartViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lcom/parth/GroceryApp/adapter/CartAdapter;Landroid/view/View;)V", "bind", "", "productEntity", "Lcom/parth/GroceryApp/model/product/ProductEntity;", "app_debug"})
    public final class CartViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        
        @android.annotation.SuppressLint(value = {"SetTextI18n"})
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.parth.GroceryApp.model.product.ProductEntity productEntity) {
        }
        
        public CartViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
    }
}