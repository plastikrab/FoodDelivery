package com.example.fooddelivery.presentation.viewModel


import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.fooddelivery.R
import com.example.fooddelivery.presentation.data.entities.FoodItem
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor() : ViewModel() {

    private val _name = MutableLiveData<String>()
    val name: LiveData<String> get() = _name

    private val _phoneNumber = MutableLiveData<String>()
    val phoneNumber: LiveData<String> get() = _phoneNumber

    private val _email = MutableLiveData<String>()
    val email: LiveData<String> get() = _email

    private val _password = MutableLiveData<String>()
    val password: LiveData<String> get() = _password

    private val _searchQuery = MutableLiveData<String>()
    val searchQuery: LiveData<String> get() = _searchQuery

    private var _foodList = MutableLiveData<List<FoodItem>>()
    val foodList: LiveData<List<FoodItem>> get() = _foodList

    fun setName(newName: String) {
        _name.value = newName
    }

    fun setPhoneNumber(newPhoneNumber: String) {
        _phoneNumber.value = newPhoneNumber
    }

    fun setEmail(newEmail: String) {
        _email.value = newEmail
    }

    fun setPassword(newPassword: String) {
        _password.value = newPassword
    }

    fun setSearchQuery(newSearchQuery: String) {
        _searchQuery.value = newSearchQuery
    }

    init {
        _foodList.value = listOf(
            FoodItem(R.drawable.chicken_fillet, "Food Item 1", "Description 1", "$10"),
            FoodItem(R.drawable.chicken_noodle_soup, "Food Item 2", "Description 2", "$15"),
            FoodItem(R.drawable.tuna_rice, "Food Item 3", "Description 3", "$20"),
            FoodItem(R.drawable.chicken_fillet, "Food Item 1", "Description 1", "$10"),
            FoodItem(R.drawable.chicken_noodle_soup, "Food Item 2", "Description 2", "$15"),
            FoodItem(R.drawable.tuna_rice, "Food Item 3", "Description 3", "$20"),
            FoodItem(R.drawable.chicken_fillet, "Food Item 1", "Description 1", "$10"),
            FoodItem(R.drawable.chicken_noodle_soup, "Food Item 2", "Description 2", "$15"),
            FoodItem(R.drawable.tuna_rice, "Food Item 3", "Description 3", "$20"),

        )
    }
}