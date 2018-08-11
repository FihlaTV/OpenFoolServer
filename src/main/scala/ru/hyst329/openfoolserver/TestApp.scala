package ru.hyst329.openfoolserver

import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.module.scala.DefaultScalaModule
import com.fasterxml.jackson.module.scala.experimental.ScalaObjectMapper

object TestApp extends App {
  val aceOfClubs: Card = new Card(Ace, Clubs)
  val kingOfClubs: Card = new Card(King, Clubs)
  val kingOfDiamonds: Card = new Card(King, Diamonds)
  println(aceOfClubs)
  println(kingOfClubs)
  println(kingOfDiamonds)
  println(aceOfClubs >= kingOfClubs)
  println(aceOfClubs <= kingOfClubs)
  println(aceOfClubs >= kingOfDiamonds)
  println(aceOfClubs <= kingOfDiamonds)
  val mapper = new ObjectMapper() with ScalaObjectMapper

  import com.fasterxml.jackson.databind.module.SimpleModule

  val serializers = new SimpleModule("Serializers")
  serializers.addSerializer(classOf[Card], new CardSerializer)
  mapper.registerModule(DefaultScalaModule)
  mapper.registerModule(serializers)
  println(mapper.writeValueAsString(aceOfClubs))
}
