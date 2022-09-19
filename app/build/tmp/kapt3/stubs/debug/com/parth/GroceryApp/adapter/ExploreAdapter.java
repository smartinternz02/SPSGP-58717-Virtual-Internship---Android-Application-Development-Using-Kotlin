package com.parth.GroceryApp.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u001aB\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\r\u001a\u00020\u000eH\u0016J\u001c\u0010\u000f\u001a\u00020\u00102\n\u0010\u0011\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u000eH\u0016J\u001c\u0010\u0013\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000eH\u0016J\u0014\u0010\u0017\u001a\u00020\u00102\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00060\u0019R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f\u00a8\u0006\u001b"}, d2 = {"Lcom/parth/GroceryApp/adapter/ExploreAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/parth/GroceryApp/adapter/ExploreAdapter$ExploreViewHolder;", "()V", "list", "", "Lcom/parth/GroceryApp/model/product/ProductEntity;", "onClickListener", "Lcom/parth/GroceryApp/listener/OnClickItemAndAdd;", "getOnClickListener", "()Lcom/parth/GroceryApp/listener/OnClickItemAndAdd;", "setOnClickListener", "(Lcom/parth/GroceryApp/listener/OnClickItemAndAdd;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setDataAdapter", "data", "", "ExploreViewHolder", "app_debug"})
public final class ExploreAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.parth.GroceryApp.adapter.ExploreAdapter.ExploreViewHolder> {
    private java.util.List<com.parth.GroceryApp.model.product.ProductEntity> list;
    @org.jetbrains.annotations.Nullable()
    private com.parth.GroceryApp.listener.OnClickItemAndAdd onClickListener;
    
    @org.jetbrains.annotations.Nullable()
    public final com.parth.GroceryApp.listener.OnClickItemAndAdd getOnClickListener() {
        return null;
    }
    
    public final void setOnClickListener(@org.jetbrains.annotations.Nullable()
    com.parth.GroceryApp.listener.OnClickItemAndAdd p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.parth.GroceryApp.adapter.ExploreAdapter.ExploreViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.parth.GroceryApp.adapter.ExploreAdapter.ExploreViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public final void setDataAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<com.parth.GroceryApp.model.product.ProductEntity> data) {
    }
    
    public ExploreAdapter() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007\u00a8\u0006\t"}, d2 = {"Lcom/parth/GroceryApp/adapter/ExploreAdapter$ExploreViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lcom/parth/GroceryApp/adapter/ExploreAdapter;Landroid/view/View;)V", "bind", "", "productEntity", "Lcom/parth/GroceryApp/model/product/ProductEntity;", "app_debug"})
    public final class ExploreViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        
        @android.annotation.SuppressLint(value = {"SetTextI18n"})
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.parth.GroceryApp.model.product.ProductEntity productEntity) {
        }
        
        public ExploreViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
    }
}