package com.parth.GroceryApp.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0018B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\u0002\u0010\u0006J\b\u0010\f\u001a\u00020\rH\u0016J\u001c\u0010\u000e\u001a\u00020\u00052\n\u0010\u000f\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0010\u001a\u00020\rH\u0016J\u001c\u0010\u0011\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\rH\u0016J\u0014\u0010\u0015\u001a\u00020\u00052\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\t0\u0017R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0019"}, d2 = {"Lcom/parth/GroceryApp/adapter/GroceriesAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/parth/GroceryApp/adapter/GroceriesAdapter$GroceriesViewHolder;", "onClick", "Lkotlin/Function0;", "", "(Lkotlin/jvm/functions/Function0;)V", "list", "", "Lcom/parth/GroceryApp/model/groceries/GroceriesData;", "getOnClick", "()Lkotlin/jvm/functions/Function0;", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setDataAdapter", "data", "", "GroceriesViewHolder", "app_debug"})
public final class GroceriesAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.parth.GroceryApp.adapter.GroceriesAdapter.GroceriesViewHolder> {
    private java.util.List<com.parth.GroceryApp.model.groceries.GroceriesData> list;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.jvm.functions.Function0<kotlin.Unit> onClick = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.parth.GroceryApp.adapter.GroceriesAdapter.GroceriesViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.parth.GroceryApp.adapter.GroceriesAdapter.GroceriesViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public final void setDataAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<com.parth.GroceryApp.model.groceries.GroceriesData> data) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function0<kotlin.Unit> getOnClick() {
        return null;
    }
    
    public GroceriesAdapter(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onClick) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007\u00a8\u0006\t"}, d2 = {"Lcom/parth/GroceryApp/adapter/GroceriesAdapter$GroceriesViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lcom/parth/GroceryApp/adapter/GroceriesAdapter;Landroid/view/View;)V", "bind", "", "groceriesdata", "Lcom/parth/GroceryApp/model/groceries/GroceriesData;", "app_debug"})
    public final class GroceriesViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        
        @android.annotation.SuppressLint(value = {"UseCompatLoadingForDrawables"})
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.parth.GroceryApp.model.groceries.GroceriesData groceriesdata) {
        }
        
        public GroceriesViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
    }
}