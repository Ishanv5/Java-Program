// NumberFormatException
class NFE
{
    public static void main(String[] args) {
        String str="ishan";
        try{
            int a= Integer.parseInt(str);
            System.out.println(a);
            System.out.println(" String nos Format exception ");
        }
        catch(NumberFormatException n)
        {
            System.out.println(" String"+str+" Cannot  converted to integer ");
        }
     
    }
}