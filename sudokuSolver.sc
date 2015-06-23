object TestSudoku {
  val sudokuBoard0 = Array(
    0,2,3,4,5,6,7,8,9,
    4,0,6,7,8,9,1,2,3,
    7,8,0,1,2,3,4,5,6,
    2,3,4,0,6,7,8,9,1,
    5,6,7,8,0,1,2,3,4,
    8,9,1,2,3,0,5,6,7,
    3,4,5,6,7,8,0,1,2,
    6,7,8,9,1,2,3,0,5,
    9,1,2,3,4,5,6,7,0
  )
  val sudokuBoard00 = Array(
    0,2,3,4,0,6,7,8,0,
    4,0,6,7,8,9,1,0,3,
    7,8,0,1,2,3,0,5,6,
    2,3,4,0,6,0,8,9,1,
    0,6,7,8,0,1,2,3,0,
    8,9,1,0,3,0,5,6,7,
    3,4,0,6,7,8,0,1,2,
    6,0,8,9,1,2,3,0,5,
    0,1,2,3,0,5,6,7,0
  )
  val sudokuBoard1 = Array(
    0,2,1,0,0,0,0,0,4,
    4,0,0,8,0,0,0,0,0,
    0,0,0,7,0,4,5,0,0,
    0,0,6,0,1,0,0,9,0,
    0,9,0,0,0,0,0,7,0,
    0,4,0,0,9,0,6,0,0,
    0,0,3,9,0,2,0,0,0,
    0,0,0,0,0,3,0,0,1,
    9,0,0,0,0,0,8,5,0)
  val sudokuBoard2 = Array(0,2,0,1,7,8,0,3,0,
    0,4,0,3,0,2,0,9,0,
    1,0,0,0,0,0,0,0,6,
    0,0,8,6,0,3,5,0,0,
    3,0,0,0,0,0,0,0,4,
    0,0,6,7,0,9,2,0,0,
    9,0,0,0,0,0,0,0,2,
    0,8,0,9,0,1,0,6,0,
    0,1,0,4,3,6,0,5,0)
  def inRowTest() = {
    def check(expected:Set[Int], actual:Set[Int])={
      Assert.isTrue(expected == actual, f"Expected did not match actual. expected: $expected actual: $actual")
    }

    val expected1 = Array(0,2,1,0,0,0,0,0,4).toSet
    check(expected1, inRow(sudokuBoard1,0))
    check(expected1, inRow(sudokuBoard1,1))
    check(expected1, inRow(sudokuBoard1,2))
    check(expected1, inRow(sudokuBoard1,3))
    check(expected1, inRow(sudokuBoard1,4))
    check(expected1, inRow(sudokuBoard1,5))
    check(expected1, inRow(sudokuBoard1,6))
    check(expected1, inRow(sudokuBoard1,7))
    check(expected1, inRow(sudokuBoard1,8))
    val expected9 = Array(9,0,0,0,0,0,8,5,0).toSet
    check(expected9, inRow(sudokuBoard1,72))
    check(expected9, inRow(sudokuBoard1,73))
    check(expected9, inRow(sudokuBoard1,74))
    check(expected9, inRow(sudokuBoard1,75))
    check(expected9, inRow(sudokuBoard1,76))
    check(expected9, inRow(sudokuBoard1,77))
    check(expected9, inRow(sudokuBoard1,78))
    check(expected9, inRow(sudokuBoard1,79))
    check(expected9, inRow(sudokuBoard1,80))
  }
  def inColTest() = {
    def check(expected:Set[Int], actual:Set[Int])={
      Assert.isTrue(expected == actual, f"Expected did not match actual. expected: $expected actual: $actual")
    }
    val expected1 = Array(0,4,0,0,0,0,0,0,9).toSet
    check(expected1, inCol(sudokuBoard1,0))
    check(expected1, inCol(sudokuBoard1,9))
    check(expected1, inCol(sudokuBoard1,18))
    check(expected1, inCol(sudokuBoard1,27))
    check(expected1, inCol(sudokuBoard1,36))
    check(expected1, inCol(sudokuBoard1,45))
    check(expected1, inCol(sudokuBoard1,54))
    check(expected1, inCol(sudokuBoard1,63))
    check(expected1, inCol(sudokuBoard1,72))
    val expected9 = Array(4,0,0,0,0,0,0,1,0).toSet
    check(expected9, inCol(sudokuBoard1,8))
    check(expected9, inCol(sudokuBoard1,17))
    check(expected9, inCol(sudokuBoard1,26))
    check(expected9, inCol(sudokuBoard1,35))
    check(expected9, inCol(sudokuBoard1,44))
    check(expected9, inCol(sudokuBoard1,53))
    check(expected9, inCol(sudokuBoard1,62))
    check(expected9, inCol(sudokuBoard1,71))
    check(expected9, inCol(sudokuBoard1,80))
  }
  def toSubGridXTest() = {
    def check(expected:Int, actual:Int)={
      Assert.isTrue(expected == actual, f"Expected did not match actual. expected: $expected actual: $actual")
    }
    val expected1 = 0
    check(expected1, toSubGridX(0))
    check(expected1, toSubGridX(1))
    check(expected1, toSubGridX(2))
    check(expected1, toSubGridX(9))
    check(expected1, toSubGridX(10))
    check(expected1, toSubGridX(11))
    check(expected1, toSubGridX(18))
    check(expected1, toSubGridX(19))
    check(expected1, toSubGridX(20))
    val expected2 = 2
    check(expected2, toSubGridX(60))
    check(expected2, toSubGridX(61))
    check(expected2, toSubGridX(62))
    check(expected2, toSubGridX(69))
    check(expected2, toSubGridX(70))
    check(expected2, toSubGridX(71))
    check(expected2, toSubGridX(78))
    check(expected2, toSubGridX(79))
    check(expected2, toSubGridX(80))
  }
  def toSubGridYTest() = {
    def check(expected:Int, actual:Int)={
      Assert.isTrue(expected == actual, f"Expected did not match actual. expected: $expected actual: $actual")
    }
    val expected1 = 0
    check(expected1, toSubGridY(0))
    check(expected1, toSubGridY(1))
    check(expected1, toSubGridY(2))
    check(expected1, toSubGridY(9))
    check(expected1, toSubGridY(10))
    check(expected1, toSubGridY(11))
    check(expected1, toSubGridY(18))
    check(expected1, toSubGridY(19))
    check(expected1, toSubGridY(20))
    val expected2 = 2
    check(expected2, toSubGridY(58))
    check(expected2, toSubGridY(59))
    check(expected2, toSubGridY(60))
    check(expected2, toSubGridY(69))
    check(expected2, toSubGridY(70))
    check(expected2, toSubGridY(71))
    check(expected2, toSubGridY(78))
    check(expected2, toSubGridY(79))
    check(expected2, toSubGridY(80))
  }
  def toFirstCellTest() ={
    def check(expected:Int, actual:Int, raw:(Int,Int))={
      Assert.isTrue(expected == actual, f"Expected did not match actual. expected: $expected actual: $actual raw: $raw")
    }
    val expected1 = 0
    val actual = toFirstCell(0, 0)
    check(expected1, actual._1 + actual._2, actual)

    val expected2 = 3
    val actual2 = toFirstCell(1, 0)
    check(expected2, actual2._1 + actual2._2, actual2)

    val expected3 = 6
    val actual3 = toFirstCell(2, 0)
    check(expected3, actual3._1 + actual3._2, actual3)

    val expected4 = 27
    val actual4 = toFirstCell(0, 1)
    check(expected4, actual4._1 + actual4._2, actual4)

    val expected5 = 30
    val actual5 = toFirstCell(1, 1)
    check(expected5, actual5._1 + actual5._2, actual5)

    val expected6 = 33
    val actual6 = toFirstCell(2, 1)
    check(expected6, actual6._1 + actual6._2, actual6)

    //        check(expected1, toFirstCell(59))
    //        check(expected1, toFirstCell(60))
    //        check(expected1, toFirstCell(69))
    //        check(expected1, toFirstCell(70))
    //        check(expected1, toFirstCell(71))
    //        check(expected1, toFirstCell(78))
    //        check(expected1, toFirstCell(79))
    //        check(expected1, toFirstCell(80))
  }
  def inSubGridTest() = {
    def check(expected:Set[Int], actual:Set[Int])={
      Assert.isTrue(expected == actual, f"Expected did not match actual. expected: $expected actual: $actual")
    }
    val expected1 = Array(0,2,1,4,0,0,0,0,0).toSet
    check(expected1, inSubGrid(sudokuBoard1,0))
    check(expected1, inSubGrid(sudokuBoard1,1))
    check(expected1, inSubGrid(sudokuBoard1,2))
    check(expected1, inSubGrid(sudokuBoard1,9))
    check(expected1, inSubGrid(sudokuBoard1,10))
    check(expected1, inSubGrid(sudokuBoard1,11))
    check(expected1, inSubGrid(sudokuBoard1,18))
    check(expected1, inSubGrid(sudokuBoard1,19))
    check(expected1, inSubGrid(sudokuBoard1,20))
  }
  def assertSudokuSolves (inputBoard: Array[Int], checkBoard: (Array[Int]=>Boolean)) = {
    val boardCopy = inputBoard.clone()
    val actual = solveSudoku(boardCopy)
    val solved = checkBoard(actual)
    lazy val errorOutput = StringBuilder.newBuilder.append("Failed to solve the board:\n")
      .append(

        StringBuilder.newBuilder
          .append("input:")
          .append(sudokuToString(inputBoard)).toString().split("\n")
          .zip(StringBuilder.newBuilder
          .append("result:")
          .append(sudokuToString(actual)).toString().split("\n"))
          .map{case (a,b)=> a.padTo(30,' ') + b}
          .mkString("\n")
          //.foldLeft(StringBuilder.newBuilder){case (sb,s)=>sb.append(s)}
          .toString()
      ).toString()
    lazy val successOutput = StringBuilder.newBuilder.append("Success!! Solved the board:\n")
      .append(

          StringBuilder.newBuilder
              .append("input:")
              .append(sudokuToString(inputBoard)).toString().split("\n")
          .zip(StringBuilder.newBuilder
              .append("result:")
              .append(sudokuToString(actual)).toString().split("\n"))
          .map{case (a,b)=> a.padTo(30,' ') + b}
            .mkString("\n")
          //.foldLeft(StringBuilder.newBuilder){case (sb,s)=>sb.append(s)}
          .toString()
      ).toString()
    if (!solved) errorOutput
    else successOutput
  }
  def boardBadColsAndRows(board: Array[Int]): (Stream[Int],Stream[Int])={
    def inRow(board: Array[Int],idx:Int): Set[Int] ={
      val rowIdx = (0 to 8).filter(x=> x*9 <= idx).max
      board.splitAt(rowIdx*9)._2.take(9).toSet
    }
    def inCol(board: Array[Int],idx:Int): Set[Int] = {
      val colIdx = idx % 9
      board.scanLeft((-1,0))((idxitem, item)=>(idxitem._1 + 1,item))
        .filter((idxitem) => idxitem._1 % 9 == colIdx)
        .map(idxitem=>idxitem._2).toSet
    }
    def badColumns(board:Array[Int]): Stream[Int]= {
      def sumCheckColumn(board: Array[Int], col: Int): Boolean={
        inCol(board,col*9).toList.length == 9
      }
      Stream.from(0).takeWhile(x=>x<10).filter(col => !sumCheckColumn(board,col))
    }
    def badRows(board:Array[Int]): Stream[Int]= {
      def sumCheckRow(board: Array[Int], row: Int): Boolean={
        inRow(board,row*9).toList.length == 9
      }
      Stream.from(0).takeWhile(x=>x<10).filter(row => !sumCheckRow(board,row))
    }
    (badColumns(board),badRows(board))
  }
  def doesBoardSolve(board: Array[Int]): Boolean ={
    val badColsBadRows = boardBadColsAndRows(board)
    badColsBadRows._1.length + badColsBadRows._2.length == 0
  }
  def solveSudokuTest() = {
    assertSudokuSolves(sudokuBoard0, doesBoardSolve)
  }

  // returns the rows contained in the subgrid not including the provided row
  def otherRows(rowIndex: Int) = {
    if (rowIndex <= 2) (0 to 2).toSet - rowIndex
    else if (rowIndex <= 5) (3 to 5).toSet - rowIndex
    else (6 to 8).toSet - rowIndex
  }

  // same as other Rows, but for columns
  def otherCols(colIndex: Int) = otherRows(colIndex)

  def rowIndex(cell: Int) = cell / 9

  def colIndex(cell: Int) = cell % 9

  def inRowIndex(board: Array[Int], rowIndex: Int) = {
    board.splitAt(rowIndex * 9)._2.take(9)
      .toSet
  }

  def inRow(board: Array[Int], cell: Int): Set[Int] = {
    val rowIdx = rowIndex(cell)
    inRowIndex(board, rowIdx)
  }

  def inColIndex(board: Array[Int], colIndex: Int) = {
    board.scanLeft((-1, 0))((idxitem, item) => (idxitem._1 + 1, item))
      .filter((idxitem) => idxitem._1 % 9 == colIndex)
      .map(idxitem => idxitem._2)
      .toSet
  }

  def inCol(board: Array[Int], cell: Int): Set[Int] = {
    val colIdx = colIndex(cell)
    inColIndex(board, colIdx)
  }

  def toSubGridX(cell: Int) = (cell % 9) / 3

  def toSubGridY(cell: Int) = (cell / 9) / 3

  def toFirstCell(subGridX: Int, subGridY: Int) = (subGridY * 27, subGridX * 3)

  def inSubGrid(board: Array[Int], cell: Int): Set[Int] = {
    val subGridX = toSubGridX(cell)
    val subGridY = toSubGridY(cell)
    val fc = toFirstCell(subGridX, subGridY)
    val cells = for (x <- 0 to 2;
                     y <- 0 to 2
    ) yield {
        val xy = (fc._1 + x, fc._2 + (y * 9))
        board(xy._1 + xy._2)
      }
    cells.toSet
  }

  object Assert {
    class NullCoalesce[A <: AnyRef](a: A) {
      def ??(b: A) = if (a == null) b else a
    }
    implicit def coalesce_anything[A <: AnyRef](a: A) = new NullCoalesce(a)
    def areEqual[T](expected: T, actual: T, failText: String = null) {
      if (expected != actual) {
        throw new Exception(failText ?? "Expected '" + expected + "' but got '" + actual + "'.");
      }
    }
    def isTrue(condition: Boolean, failText: String = null) {
      if (!condition) {
        throw new Exception(failText ?? "Expected true.");
      }
    }
    def isFalse(condition: Boolean, failText: String = null) {
      if (condition) {
        throw new Exception(failText ?? "Expected false.");
      }
    }
    def isInRange(least: Double, most: Double, actual: Double, failText: String = null) {
      if (actual < least || actual > most) {
        throw new Exception(failText ?? "Expected " + least + " to " + most + ", but got " + actual + ".");
      }
    }
  }

  def sudokuToString(board: Array[Int]): String = {
    val length = Stream.from(2).filter(x => x * x >= board.length).head
    val hline = "+" + Seq.range(0, 6 + length * 2)
      .map(x => if (x % 8 == 7) "+" else "-")
      .foldLeft(StringBuilder.newBuilder)((sb, s) => {
      sb.append(s)
    }).toString() + "\n"
    val sb = board.foldLeft((StringBuilder.newBuilder, 0))((bi, item) => {
      val b = bi._1
      var i = bi._2
      b.append(if (i % length == 0 && i % (length * 3) == 0) hline else "")
      b.append(if (i % length == 0 && item == 0) f"|  "
      else if (i % 3 != 2 && i % length != length - 1 && item == 0) f"  "
      else if (i % 3 == 2 && i % length != length - 1 && item == 0) f"   |"
      else if (item == 0) f"   |%n"
      else if (i % length == 0) f"| $item%1d"
      else if (i % 3 != 2 && i % length != length - 1) f" $item%1d"
      else if (i % 3 == 2 && i % length != length - 1) f" $item%1d |"
      else f" $item%1d |%n")
      (b, i + 1)
    })
    "\n" + sb._1.append(hline).toString() + "\n"
  }

  def bestCell(board: Array[Int]) : Array[(Int, Seq[Int])] = {

    val res = board.zipWithIndex
      .filter(x => board.apply(x._2) == 0)
      .map{ case (idxValue,idx) => {
      (idx,
        ((1 to 9).toSet --
          inSubGrid(board, idx) --
          inCol(board, idx) --
          inRow(board, idx))
          .toSeq.sortBy(cellValue => {
                val otherValues = otherRows(rowIndex(idx))
                  .toSeq
                  .map(rowIdx => inRowIndex(board, rowIdx).toSeq)
                  .flatMap(x => x) ++
                  otherCols(colIndex(idx))
                    .toSeq
                    .map(colIdx => inColIndex(board, colIdx).toSeq)
                    .flatMap(x => x)

                otherValues
                  .filter(x => x == cellValue)
                  .length
              }).reverse
        )
    }}
      .sortBy(x => x._2.size)
      .filter(x => x._2.size > 0)
    res
  }


  // A standard Sudoku puzzle contains 81 cells, in a 9 by 9 grid, and has 9 zones, each zone being the
  // intersection of 3 rows and 3 columns. Each cell may contain a number from one to nine; each number
  // can only occur once in each zone, row, and column of the grid. At the beginning of the game, many
  // cells begin with numbers in them, and the goal is to fill in the remaining cells. -- wikipedia

  // Solve any 9x9 Sudoku board that is input as an array.
  // Array values of 0 represent cells that must be solved for.
  // Array values > 0 must not be modified.
  // To solve: each number 1-9 must exist exactly 9 times, and never in the same row or same column as its self
  // The only valid values are 1-9
  // The more elegant the approach the better
  def solveSudoku(input: Array[Int]): Array[Int] = {
    val inputT = input.clone()
    def searchSudoku(sudokuBoard: Array[Int]): Array[Int] = {
      val safeBoard = sudokuBoard.clone()

      def backtracker(sb:Array[Int], allOps:Array[(Int, Seq[Int])]) : Array[Int] = {
        allOps
        .take(1)
        .map{case (pos,opts) => {
          opts
            .take(2)
            .map(cellValue => {
              val cp = sb.clone()
              cp.update(pos,cellValue)
              cp
            })
          .map(searchSudoku)
          .takeWhile(ss => ss.count(x=> x == 0) > 0)
        }}
        .flatMap(x=>x)
        .sortBy(ss => ss.count(x => x == 0))
        .head
      }

      if (sudokuBoard.forall(x => x > 0)) sudokuBoard
      else {
        val boardOptions = bestCell(sudokuBoard)

        if (boardOptions.toList.length == 0)
          sudokuBoard
        else {
          val best = boardOptions.head

          val stuck =
            if (sudokuBoard.apply(best._1) == 0 && best._2.toList.length > 0) {
              false
            }
            else {
              println(f"bestCell $best ${best._2.map(x => x.toString()).mkString(" ")}")
              true
            }

          if (stuck) sudokuBoard
          else backtracker(sudokuBoard, boardOptions)
        }
      }
    }
    searchSudoku(inputT)
  }
  val foo0 = assertSudokuSolves(sudokuBoard0, doesBoardSolve)
  val foo00 = assertSudokuSolves(sudokuBoard00, doesBoardSolve)
  val bar1 = assertSudokuSolves(sudokuBoard1, doesBoardSolve)
  val bar2 = assertSudokuSolves(sudokuBoard2, doesBoardSolve)
}