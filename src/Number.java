public  class Number {
   private static int number;
    int f;
    int g;
    int e;

    public Number(int f, int g, int e) {
       this.g = number;
       this.f = number;
       this.e = number;

    }
    private static  int addtonumbers(int g, int f){
        g = number +  number;
        return  g + f;
    }
    public int getAddtonumbers(int g, int f){

        return addtonumbers(g,f);
    }

    public int getNunber(){
        return Number.number;
    }
}
