package ru.hyst329.openfoolserver

abstract class Rank(val numericValue: Int) extends Ordered[Rank] {
  override def compare(that: Rank): Int = {
    if (this == Ace && that != Ace) 1
    else if (that == Ace) -1
    else this.numericValue.compare(that.numericValue)
  }
}

case object Ace extends Rank(1)
case object Two extends Rank(2)
case object Three extends Rank(3)
case object Four extends Rank(4)
case object Five extends Rank(5)
case object Six extends Rank(6)
case object Seven extends Rank(7)
case object Eight extends Rank(8)
case object Nine extends Rank(9)
case object Ten extends Rank(10)
case object Jack extends Rank(11)
case object Queen extends Rank(12)
case object King extends Rank(13)
