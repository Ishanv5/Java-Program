// Charcter Pattern Part 3
class CharacterPattern3 {
    public static void main(String[] args) {
        char i,j,count=65;
        for(i='A';i<='E';i++)
        {
            for(j='A';j<=i;j++)
            {
                System.out.print(count);
                count++;
            }
            System.out.print("\n");
        }
    }
}
