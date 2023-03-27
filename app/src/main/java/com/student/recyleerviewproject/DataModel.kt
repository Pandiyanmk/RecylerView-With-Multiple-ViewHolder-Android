package com.student.recyleerviewproject


sealed class DataModel {
    data class ItemsViewModel(val name: String, val email: String) : DataModel()
    data class HeaderData(val title: String, val description: String) : DataModel()
}
