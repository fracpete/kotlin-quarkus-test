package com.github.fracpete.kqt

import krangl.*

fun main(args : Array<String>) {
  // Read data-frame from disk
  val iris = DataFrame.readCSV(args[0])


  // Create data-frame in memory
  val df: DataFrame = dataFrameOf(
      "first_name", "last_name", "age", "weight")(
      "Max", "Doe", 23, 55,
      "Franz", "Smith", 23, 88,
      "Horst", "Keanes", 12, 82
  )

  // Or from csv
  // val otherDF = DataFrame.readCSV("path/to/file")

  // Print rows
  df                              // with implict string conversion using default options
  df.print(colNames = false)      // with custom printing options

  // Print structure
  df.schema()
}
