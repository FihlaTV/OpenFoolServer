package ru.hyst329.openfoolserver

sealed trait PassingOption

case object ThrowIn extends PassingOption

case object Passing extends PassingOption

sealed trait ThrowingOption

case object NeighborsOnly extends ThrowingOption

case object AllPlayers extends ThrowingOption

class GameRules(
  val dealingAmount: Int = 6,
  val firstDiscardLimit: Int = 6,
  val passingOption: PassingOption = ThrowIn,
  val throwingOption: ThrowingOption = NeighborsOnly,
  val deuceBeatsAce: Boolean = false
)
