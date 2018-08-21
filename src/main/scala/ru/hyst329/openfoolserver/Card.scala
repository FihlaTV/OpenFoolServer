package ru.hyst329.openfoolserver

import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.databind.{JsonSerializer, SerializerProvider}

final class Card(val rank: Rank, val suit: Suit) {
  override def toString: String = s"$rank of $suit"

}

class CardSerializer extends JsonSerializer[Card] {
  override def serialize(value: Card, gen: JsonGenerator, serializers: SerializerProvider): Unit = {
    gen.writeStartObject()
    gen.writeFieldName("rank")
    gen.writeNumber(value.rank.numericValue)
    gen.writeFieldName("suit")
    gen.writeString(value.suit.suitSymbol.toString)
    gen.writeEndObject()
  }
}
