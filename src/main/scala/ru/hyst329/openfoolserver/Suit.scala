package ru.hyst329.openfoolserver

abstract class Suit(val numberValue: Int, val suitSymbol: Char)

case object Spades extends Suit(0, '\u2660')
case object Clubs extends Suit(1, '\u2663')
case object Diamonds extends Suit(2, '\u2662')
case object Hearts extends Suit(3, '\u2661')
