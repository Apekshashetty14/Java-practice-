class Sum
  public static void main ( String args[]){
    int num=123;
    int Sum=0;
    while( num!= 0){
      int digit = num%10;
      Sum=Sum+ digit;
      num=num/10;
    }
    System.out.println("sum of digit :"+Sum);
  }
