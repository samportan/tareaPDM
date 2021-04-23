package com.portan.livedataexample

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel
import java.util.*

class MainViewModel : ViewModel() {
    private var _message = MutableLiveData<String>()
    val message: LiveData<String>
        get() = _message



    fun setMessage(message: String){
        // Validaciones
        _message.value = message
    }

    init {
        _message.value = ""
    }

    var messageLowerCase = Transformations.map(_message) { message ->
        message.toLowerCase(Locale.ROOT)
    }

    var messageNumeric = Transformations.map(_message) { message ->

        message.replace("a", "4")

    }

}