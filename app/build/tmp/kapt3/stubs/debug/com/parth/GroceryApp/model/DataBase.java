package com.parth.GroceryApp.model;

import java.lang.System;

@androidx.room.Database(entities = {com.parth.GroceryApp.model.product.ProductEntity.class}, version = 1)
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u00a8\u0006\u0006"}, d2 = {"Lcom/parth/GroceryApp/model/DataBase;", "Landroidx/room/RoomDatabase;", "()V", "productDao", "Lcom/parth/GroceryApp/model/product/ProductDao;", "Companion", "app_debug"})
public abstract class DataBase extends androidx.room.RoomDatabase {
    private static com.parth.GroceryApp.model.DataBase INSTANCE;
    @org.jetbrains.annotations.NotNull()
    public static final com.parth.GroceryApp.model.DataBase.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.parth.GroceryApp.model.product.ProductDao productDao();
    
    public DataBase() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0006J\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/parth/GroceryApp/model/DataBase$Companion;", "", "()V", "INSTANCE", "Lcom/parth/GroceryApp/model/DataBase;", "destroyInstance", "", "getInstance", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.Nullable()
        public final com.parth.GroceryApp.model.DataBase getInstance() {
            return null;
        }
        
        public final void destroyInstance() {
        }
        
        private Companion() {
            super();
        }
    }
}