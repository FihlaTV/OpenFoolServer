package ru.hyst329.openfoolserver

class CardOrdering(val trumpSuit: Suit) extends PartialOrdering[Card] {
  override def tryCompare(x: Card, y: Card): Option[Int] = ???

  override def lteq(x: Card, y: Card): Boolean = ???
}
