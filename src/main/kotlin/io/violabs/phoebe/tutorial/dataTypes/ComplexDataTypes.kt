package io.violabs.phoebe.tutorial.dataTypes

import java.util.*

typealias CoolerString = String

open class TypedClass<T>(val item: T) // the T is called a Generic Type

class ExtendedTypeClass<T>(item: T) : TypedClass<T>(item)

class TypeClassWithBoundType<U, T : TypedClass<U>>(val typedClass: T)

data class ComplexDataTypes(
  val typeAlias: CoolerString = "Hello Cool World",
  val typedClassString: TypedClass<String> = TypedClass("string"),
  val typedClassNumber: TypedClass<Number> = TypedClass(1),
  val typeClassTypedClass: TypedClass<TypedClass<Number>> = TypedClass(TypedClass(1)),
  val extendedTypeClass: ExtendedTypeClass<Number> = ExtendedTypeClass(1),
  val topLevelBoundTypeClass: TypeClassWithBoundType<Number, TypedClass<Number>> =
    TypeClassWithBoundType(TypedClass(1)),
  val extendedBoundTypeClass: TypeClassWithBoundType<Number, ExtendedTypeClass<Number>> =
    TypeClassWithBoundType(ExtendedTypeClass(1)),

  //region List type
  val mutableList: MutableList<Number> = mutableListOf(1, 2, 3),
  val immutableList: List<Number> = listOf(1, 2, 3),
  //endregion List type

  //region Set type
  val mutableSet: MutableSet<Number> = mutableSetOf(1, 1, 2), // will be 1, 2 (may throw error)
  val immutableSet: Set<Number> = setOf(1, 1, 2),
  //endregion Set type

  //region Map type
  val mutableMap: MutableMap<Number, Number> = mutableMapOf(1 to 10),
  val immutableMap: Map<Number, Number> = mutableMapOf(1 to 10),
  //endregion Map type

  //region Sequence type
  val sequence: Sequence<Number> = sequenceOf(1, 2, 3),
  val sequenceGenerated: Sequence<Number> = sequence { Random().nextInt() },
  //endregion Sequence type

  val listCollection: Collection<Number> = listOf(1, 2, 3),
  val setCollection: Collection<Number> = setOf(1, 2, 3),

  val stack: Stack<Number> = Stack(),
  val queue: Queue<Number> = LinkedList(),
  val dequeue: Deque<Number> = LinkedList(),
  val vector: Vector<Number> = Vector(),

  //region Lambda Function types
  // (T) -> Boolean
  val predicate: (String) -> Boolean = { it.length > 1 },
  // (T) -> Unit
  val consumer: (String) -> Unit = { println(it) }, // run or set
  // () -> R
  val supplier: () -> String = { "Hello world!" },
  // (T) -> R
  val function: (Number) -> String = { it.toString() },
  // (T) -> T
  val unaryOperator: (Int) -> Int = { it * 10 },
  // (T, T) -> T
  var binaryOperator: (Int, Int) -> Int = { a, b -> a + b },
  // (T, T) -> Unit
  var binaryConsumer: (Int, Int) -> Unit = { a, b -> println(a + b) },
  // (T, T) -> R
  var binaryFunction: (Int, Int) -> String = { a, b -> (a + b).toString() },
  // (T) -> T - just return self
  var functionalIdentity: (Int) -> Int = { it },
  val scopedFunction: Byte.() -> String = { this.toString() }
  //endregion Lambda Function types
)