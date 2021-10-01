// Interface Variable 
interface CustomerIshan
{
  int amt=5;    // public+static+final
  void purchase(); // public+abstract
}
class SellerHarsh implements CustomerIshan
{
    @Override
    public void purchase()
    {
        System.out.println(" Ishan needs "+amt+" Software ");
    }
}
class checkinter
{
    public static void main(String[] args) {
        CustomerIshan c=new SellerHarsh();
        c.purchase();
    }
}