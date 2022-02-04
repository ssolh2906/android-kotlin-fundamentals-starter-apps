package com.example.android.guesstheword.screens.game

import android.util.Log
import androidx.lifecycle.ViewModel

// Put data to be displayed on the screen,
// and code to process that data, in the ViewModel.
//ViewModel should not contain references to the app's activities, fragments, or views
class GameViewModel : ViewModel() {

    // The current word
    var word = ""

    // The current score
    var score = 0

    // The list of words - the front of the list is the next word to guess
    private lateinit var wordList: MutableList<String>


    init {
        Log.i("GameViewModel","GameViewModel Created!")

        resetList()
        nextWord()
    }




    /**
     * Resets the list of words and randomizes the order
     */
    private fun resetList() {
        wordList = mutableListOf(
            "queen",
            "hospital",
            "basketball",
            "cat",
            "change",
            "snail",
            "soup",
            "calendar",
            "sad",
            "desk",
            "guitar",
            "home",
            "railway",
            "zebra",
            "jelly",
            "car",
            "crow",
            "trade",
            "bag",
            "roll",
            "bubble"
        )
        wordList.shuffle()
    }

    /**
     * Moves to the next word in the list
     */
    private fun nextWord() {
        if (!wordList.isEmpty()) {
            //Select and remove a word from the list
            word = wordList.removeAt(0)
        }
        /** Update는 UI Controller (Fragment)의 역할 **/
        //updateWordText()
        //updateScoreText()
    }

    /** Methods for buttons presses **/
    // = Processing UI

    fun onSkip() {
        // 데이터 관리는 ViewModel
        score--
        nextWord()
    }

    fun onCorrect() {
        score++
        nextWord()
    }

    // Fragment, Activity 끝날 때
    override fun onCleared() {
        super.onCleared()
        Log.i("GameViewModel", "GameViewModel Destroyed!")
    }

}