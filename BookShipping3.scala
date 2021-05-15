object BooksShipping3 extends App{
  def TtlWhlslPrc(copy:Int):Double=((copy-50)*0.75)+(50*3)+(copy*24.95*40/100);
  print(TtlWhlslPrc(60));
}
