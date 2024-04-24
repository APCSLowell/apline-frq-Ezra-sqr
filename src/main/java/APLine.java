public class APLine
{
  private int a,b,c;
  public APLine (int j,int k,int l){
   a=j;
   b=k;
   c=l;
  }
  public double getSlope(){
   return (-1*a)/b;
  }
  public boolean isOnLine(int x, int y){
    if(a*x+b*y+c==0)
      return true;
    return false;
  }
}
