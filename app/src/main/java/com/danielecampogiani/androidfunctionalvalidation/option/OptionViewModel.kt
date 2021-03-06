package com.danielecampogiani.androidfunctionalvalidation.option

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import arrow.core.Option
import com.danielecampogiani.androidfunctionalvalidation.Data


class OptionViewModel : ViewModel() {

    private val mutableValidation: MutableLiveData<Option<Data>> = MutableLiveData()

    val validation: LiveData<Option<Data>>
        get() = mutableValidation


    fun validate(mail: String, phoneNumber: String) {
        val validationResult = validateData(mail, phoneNumber)
        mutableValidation.value = validationResult
    }

}