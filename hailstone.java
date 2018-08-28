class hailstone{
  public static int h1(int a){
    if(a<=1){
      return 1;
    }
    else if (a%2==0){
      return (h1(a/2));
    }
    else{
      return (h1((3*a)+1));
    }
  }
  public static void main(String[] args) {
    for(int i=0; i<args.length;i++){
      System.out.println(args[i]);
    }
    h1(34);



  }
}
