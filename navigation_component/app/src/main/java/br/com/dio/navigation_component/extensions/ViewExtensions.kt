package br.com.dio.navigation_component.extensions

import com.google.android.material.textfield.TextInputLayout

var TextInputLayout.text: String
    get() = editText?.text.toString() ?: ""

    set(value) {
        editText?.setText(value)
    }