class SumDigitsString{
  static int sum(String s,int index){
    if index == s.length()){
      return 0;
    }
    return (s.charAt(index) - '0')+sum(s.index + 1);
  }
  public static void main(String args[]){
    String num="123";
    System.out.println(sum(num,0));
  }
}
