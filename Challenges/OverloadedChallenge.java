public class OverloadedChallenge{
    public static void main(String[] args) {
            System.out.println("5ft, 8in = " + convertToCentimeters(5,8) + "cm");
            System.out.println("68in = " + convertToCentimeters(68) + "cm");
    }
    
    public static double convertToCentimeters(int inchHeight){
        double centHeight = inchHeight * 2.54;
        return centHeight;
    }
    public static double convertToCentimeters(int feetHeight, int remainingInches){
        int totalInches = feetHeight * 12 + remainingInches;
        return convertToCentimeters(totalInches);

    }

}