case class Pos(row: Int, col: Int) {
  /** The position obtained by changing the `x` coordinate by `d` */
  def dRow(d: Int) = copy(row = row + d)
  /** The position obtained by changing the `y` coordinate by `d` */
  def dCol(d: Int) = copy(col = col + d)
}

val pos = new Pos(1,2)
pos.copy

