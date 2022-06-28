package com.example.perfil_investidor.model

import android.widget.TextView
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.perfil_investidor.R
import com.example.perfil_investidor.ResultActivity

class QuizViewModel : ViewModel() {

    private val _score = MutableLiveData<Int>(0)
    val score : LiveData<Int>
        get() = _score

    private val _q1 = MutableLiveData<Int>(0)
    val q1 : LiveData<Int> = _q1

    fun q1Points(points: Int) {
        _q1.value = points
        _score.value = (_score.value)?.plus(points)
    }

    private val _q2 = MutableLiveData<Int>(0)
    val q2 : LiveData<Int> = _q2

    fun q2Points(points: Int) {
        _q2.value = points
        _score.value = (_score.value)?.plus(points)
    }

    private val _q3 = MutableLiveData<Int>(0)
    val q3 : LiveData<Int> = _q3

    fun q3Points(points: Int) {
        _q3.value = points
        _score.value = (_score.value)?.plus(points)
    }

    private val _q4 = MutableLiveData<Int>(0)
    val q4 : LiveData<Int> = _q4

    fun q4Points(points: Int) {
        _q4.value = points
        _score.value = (_score.value)?.plus(points)
    }

    private val _q5 = MutableLiveData<Int>(0)
    val q5 : LiveData<Int> = _q5

    fun q5Points(points: Int) {
        _q5.value = points
        _score.value = (_score.value)?.plus(points)
    }

    private val _q6 = MutableLiveData<Int>(0)
    val q6 : LiveData<Int> = _q6

    fun q6Points(points: Int) {
        _q6.value = points
        _score.value = (_score.value)?.plus(points)
    }

    private val _q7 = MutableLiveData<Int>(0)
    val q7 : LiveData<Int> = _q7

    fun q7Points(points: Int) {
        _q8.value = points
        _score.value = (_score.value)?.plus(points)
    }

    private val _q8 = MutableLiveData<Int>(0)
    val q8 : LiveData<Int> = _q8

    fun q8Points(points: Int) {
        _q8.value = points
        _score.value = (_score.value)?.plus(points)
    }

    private val _q9 = MutableLiveData<Int>(0)
    val q9 : LiveData<Int> = _q9

    fun q9Points(points: Int) {
        _q9.value = points
        _score.value = (_score.value)?.plus(points)
    }

}