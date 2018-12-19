//Create Multiple Choice Qs using for loop
public class NestedLoopPractice {
    public static void main(String[] args) {
        //char[]array={a,b,c,d,e,f};
        for (int i=0; i<1;i++){
            System.out.print(i+1 +".");
            System.out.println("Pick one from the list: \n");
            for (int j=0;j<1;j++){
                System.out.println("First question:");
                System.out.println(" a   b   c");
                System.out.println("Second question:");
                System.out.println(" a   b   c");
                System.out.println("Third question:");
                System.out.println(" a   b   c");
            }
            System.out.println();
        }

    }
}
