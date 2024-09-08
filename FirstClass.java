public class FirstClass {
    public static void main(String[] args) {
        System.out.println("Hello World");
        boolean isAliean = true;
        if(isAliean==true) {
            System.out.println("TRUE");
               System.out.println("FALSE");
        }
        int topScore = 80;
        if(topScore<100) {
            System.out.println("you got the highest score ");
        }
        int secondTopScore=60;
        if((topScore>secondTopScore) && (topScore<100)){
            System.out.println("greater than secondTopScore and less than 100");
        }
        if((topScore>90) || (secondTopScore==60)){
            System.out.println("Either or both of the condition are true");
        }
        System.out.println("ABDUL MALIK");

    }
}
