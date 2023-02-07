public class OuterClass
{
    public class InnerClass
    {
        public void display()
        {
            System.out.println("This is an inner class");
        }
    }


    public void inner()
    {
        InnerClass in = new InnerClass();
        in.display();
    }

    public static void main(String[] args) 
    {
        OuterClass out = new OuterClass();
        out.inner();
        OuterClass.InnerClass in = out.new InnerClass();
        in.display();
    }


}