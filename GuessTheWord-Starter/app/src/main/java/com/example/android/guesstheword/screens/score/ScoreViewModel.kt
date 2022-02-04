package com.example.android.guesstheword.screens.score

import android.util.Log
import androidx.lifecycle.ViewModel

// variable 이 있는 ViewModel
// Factory Method Pattern
class ScoreViewModel(finalScore:Int) :ViewModel(){
    var score = finalScore
    init {
        Log.i("ScoreViewModel", "Final score is $finalScore")
    }
}