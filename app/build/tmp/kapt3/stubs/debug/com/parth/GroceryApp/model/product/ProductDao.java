package com.parth.GroceryApp.model.product;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0018\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\'J\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u000b2\u0006\u0010\t\u001a\u00020\bH\'J\u001e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u000b2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\'J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'\u00a8\u0006\u000f"}, d2 = {"Lcom/parth/GroceryApp/model/product/ProductDao;", "", "delete", "", "productEntity", "Lcom/parth/GroceryApp/model/product/ProductEntity;", "deleteById", "id", "", "type", "getAll", "", "getById", "insert", "update", "app_debug"})
public abstract interface ProductDao {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM product WHERE type = :type")
    public abstract java.util.List<com.parth.GroceryApp.model.product.ProductEntity> getAll(int type);
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void insert(@org.jetbrains.annotations.NotNull()
    com.parth.GroceryApp.model.product.ProductEntity productEntity);
    
    @androidx.room.Delete()
    public abstract void delete(@org.jetbrains.annotations.NotNull()
    com.parth.GroceryApp.model.product.ProductEntity productEntity);
    
    @androidx.room.Query(value = "DELETE FROM product WHERE id = :id AND type = :type")
    public abstract void deleteById(int id, int type);
    
    @androidx.room.Update()
    public abstract void update(@org.jetbrains.annotations.NotNull()
    com.parth.GroceryApp.model.product.ProductEntity productEntity);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * From product Where id = :id AND type = :type")
    public abstract java.util.List<com.parth.GroceryApp.model.product.ProductEntity> getById(int id, int type);
}