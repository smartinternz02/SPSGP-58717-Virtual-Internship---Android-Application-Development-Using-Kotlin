package com.parth.GroceryApp.di

import com.parth.GroceryApp.data.DummyDataSource
import com.parth.GroceryApp.data.Repository
import com.parth.GroceryApp.model.DataBase
import org.koin.dsl.module

val dataModule = module {

    single { DataBase.getInstance() }
    factory { DummyDataSource() }
    single { Repository(get(), get()) }

}