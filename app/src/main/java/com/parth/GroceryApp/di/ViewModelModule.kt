package com.parth.GroceryApp.di

import com.parth.GroceryApp.ui.cart.CartViewModel
import com.parth.GroceryApp.ui.detailproduct.DetailProductViewModel
import com.parth.GroceryApp.ui.explore.ExploreViewModel
import com.parth.GroceryApp.ui.favorite.FavoriteViewModel
import com.parth.GroceryApp.ui.product.ProductViewModel
import com.parth.GroceryApp.ui.shop.ShopViewModel
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {
    viewModel { ShopViewModel(get()) }
    viewModel { ProductViewModel(get()) }
    viewModel { DetailProductViewModel(get()) }
    viewModel { FavoriteViewModel(get()) }
    viewModel { ExploreViewModel(get()) }
    viewModel { CartViewModel(get()) }
}