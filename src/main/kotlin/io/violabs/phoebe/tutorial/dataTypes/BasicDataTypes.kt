package io.violabs.phoebe.tutorial.dataTypes

data class BasicDataTypes(
  //region Integer types
  /**
   * 8 bits.
   * Standard range of a byte is 0 <-> 255.
   * This is signed so the range is -128 <-> 127.
   */
  val byte: Byte = 0b1111111,
  val byteMin: Byte = -128,
  val byteMax: Byte =  127,
  val byteHex: Byte = 0x0F,

  /**
   * 16 bits
   */
  val shortMin: Short = -32_768,
  val shortMax: Short =  32_767,

  /**
   * 32 bits
   */
  val intMin: Int = -2_147_483_648, // -2^31
  val intMax: Int =  2_147_483_647, //  2^31 - 1

  /**
   * 64 bits
   */
  val longMin: Long = -9_223_372_036_854_775_807L - 1, // -2^63
  val longMax: Long =  9_223_372_036_854_775_807L,     //  2^63 - 1

  // AUTO CHOOSE - based on the number the type is provided
  val aByte: Number = 1,
  val aShort: Number = 128,
  val aInt: Number = 32_768,
  val aLong: Number = 2_147_483_648,
  val byteHexSplit: Number = 0xDE_AD_BE_EF,
  //endregion Integer types

  //region Floating-point types
  // double is the default float is explicit
  /**
   *                      32 Bits
   *                  /            \
   * 24 Significant bits     .      8 Exponent bits
   *
   * 6 to 7 decimal digits
   */
  val float: Float = 0.123_456_7f,
  val floatTrucated: Float = 0.123_456_74f, //same

  /**
   *                      64 Bits
   *                  /            \
   * 53 Significant bits     .      11 Exponent bits
   *
   * 15 to 16 decimal digits
   */
  val double: Double = 0.123_456_789_012_345_6,
  val doubleSN: Double = 123.5e10,
  //endregion Floating-point types

  //region Boolean type
  val truth: Boolean = true,
  val falsity: Boolean = false,
  val andExampleTT: Boolean = true && true,   // (T) runs both
  val andExampleTF: Boolean = true && false,  // (F) runs both
  val andExampleFT: Boolean = false && true,  // (F) runs first only
  val andExampleFF: Boolean = false && false, // (F) runs first only

  val orExampleTT: Boolean = true || true,   // (T) runs both
  val orExampleTF: Boolean = true || false,  // (T) runs both
  val orExampleFT: Boolean = false || true,  // (T) runs both
  val orExampleFF: Boolean = false || false, // (f) runs both

  val negationT: Boolean = !true,  // (F)
  val negationF: Boolean = !false, // (T)
  //endregion Boolean type

  //region Character type
  val char: Char = 'a',
  val tab: Char = '\t',
  val backspace: Char = '\b',
  val newLine: Char = '\n',
  val carraigeReturn: Char = '\r',
  val singleQuote: Char = '\'',
  val doubleQuote: Char = '\"',
  val backslash: Char = '\\',
  val dollarSign: Char = '\$',
  val unicode: Char = '\uFF00',
  //endregion Character type

  //region String type
  val basicString: String = "Hello world",
  val charArray: CharArray = "Hello world".toCharArray(),
  val concatenatedString: String = "Hello " + "world",
  val escapedString: String = "Give me a new line.\n",
  val rawString: String = """
    This will have
    multiple lines and preserve 
    new lines/tabs
  """,
  val trimmedString: String = """
    |this pipe character
    |is the default margin
    |that will get trimmed away
    |but you can add anything in
    |the input of trimMargin
  """.trimMargin(),
  val stringTemplate: String = "We can interpolate a string like '$basicString'",
  val complexStringTemplate: String =
    "If we need more complex interpolation we can do: ${basicString.uppercase()}",
  //endregion String type

  //region Array type
  val basicArray: Array<String> = arrayOf("Hello", "World"),
  val generatedArray: Array<String> = Array(5) { i -> i.toString() },

  // Primitives are underlying java data type that isn't necessarily
  // an object but a fundamental data type.
  val primitiveByteArray: ByteArray = ByteArray(5),
  val primitiveShortArray: ShortArray = ShortArray(5),
  val primitiveIntArray: IntArray = IntArray(5),
  val primitiveLongArray: LongArray = LongArray(5),
  val primitiveFloatArray: FloatArray = FloatArray(5),
  val primitiveDoubleArray: DoubleArray = DoubleArray(5),
  val primitiveBooleanArray: BooleanArray = BooleanArray(5),
  val primitiveCharacterArray: CharArray = CharArray(5)
  //endregion Array type
)