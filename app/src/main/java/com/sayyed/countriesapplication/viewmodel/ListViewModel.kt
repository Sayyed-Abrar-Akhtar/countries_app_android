package com.sayyed.countriesapplication.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.sayyed.countriesapplication.model.Country

class ListViewModel : ViewModel() {

    val countries = MutableLiveData<List<Country>>()
    val countryLoadError = MutableLiveData<Boolean>()
    val loading = MutableLiveData<Boolean>()

    fun refresh() {
        fetchCountries()
    }

    private fun fetchCountries() {
        val mockData = listOf(
                Country("Nepal"),
                Country("India"),
                Country("China"),
                Country("Pakistan"),
                Country("Bangladesh"),
                Country("Bhutan"),
                Country("Qatar"),
                Country("Dubai"),
                Country("Turkey"),
                Country("Austria")
        )

        countryLoadError.value = false
        loading.value = false
        countries.value = mockData
    }
}