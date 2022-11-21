class Main {
  public static void main(String[] args) {
    String name = "";
    Boolean result = IsPalindrome(name);
    System.out.println(result);
  }

  static Boolean IsPalindrome(String name){
    if(name.length() == 0){
      return false;
    }
    for (int i=0; i<name.length(); i++){
      char start = name.charAt(i);
      char end = name.charAt( name.length() - 1 - i);
      if (start != end){
        return false;
      }
    }
    return true;
  }
}
