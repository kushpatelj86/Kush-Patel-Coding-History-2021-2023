public class StackTester
{


    public static void main(String[] args) {
        Stack<String> tower = new Stack<String>();
        //last in first out
        tower.push("Minecraft");
        tower.push("Skyrim");
        tower.push("DOOM");
        tower.push("Borderlands");
        tower.pop(); //we remove the last element 
        System.out.println("Empty: " + tower.isEmpty());
        System.out.println("Size: " + tower.size());

    }
   













}