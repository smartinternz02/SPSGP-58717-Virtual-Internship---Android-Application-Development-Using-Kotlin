package com.parth.GroceryApp.listener

import com.parth.GroceryApp.model.product.ProductEntity

interface OnSearchListener {
    fun onSearch(productEntity: ProductEntity)
}