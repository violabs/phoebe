package io.violabs.phoebe.tutorial.classes

class EmptyClass

class FirstClass(val number: Int)

data class SecondClass(val number: Int)

class VariableSetClass(
  var requiredNumberUndefined: Int,
  var nullableNumberUndefined: Int?,
  var requiredNumberDefault: Int = 1,
  var nullableNumberDefault: Int? = null
) {
  lateinit var lateVariable: String
  var internalVariable: Int? = null
}

class ValueSetClass(
  val requiredNumberUndefined: Int,
  val nullableNumberUndefined: Int?,
  val requiredNumberDefault: Int = 1,
  val nullableNumberDefault: Int? = null
) {
  var internalVariable: Int? = null
}

open class ExtendableClass(var number: Int)
open class ExtendableClass2(open var number: Int)

class ExtendedClass(number: Int) : ExtendableClass(number)
class ExtendedClass2(override var number: Int) : ExtendableClass2(number)