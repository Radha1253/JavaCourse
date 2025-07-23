
public class Hello {
    public static void main(String[] args){
        System.out.println("Hello, Rajni");

        boolean isAlien = false;
        if (isAlien == false){
            System.out.println("It is not an alien!");
            System.out.println("And I am scared of aliens");
        }

        int topScore = 80;
        if(topScore < 100){
            System.out.println("You got the high score!");
        }

        int secondTopScore = 81;
        if ((topScore > secondTopScore) && (topScore <100)){
            System.out.println("Grater than second top score and less than 100");
        }

        if(topScore > 90 || secondTopScore <= 90){
            System.out.println("Either or both of the conditions are true");
        }

        int newValue = 50;
        //if(newValue = 50) {
          //  System.out.println("This is an error");
        //} - Issue is that there has to be a "==" instead of "=" in the if statement because there is a difference between a logical operator and assignment

        if(newValue == 50){
            System.out.println("Works!");
        }

        boolean isCar = false;
        if(isCar){
            System.out.println("This is not supposed to happen");
        }

        String makeOfCar = "Volkswagen";
        boolean isDomestic = makeOfCar == "Volkswagen" ? false : true;

        if(isDomestic){
            System.out.println("This car is domestic to our country");
        }

        String s = (isDomestic) ? "This car is domestic" : "This car is not domestic";

        System.out.println(s);

        double value = 20;
        double secondValue = 80;
        double product = (value + secondValue)*100;
        System.out.println("Product = " + product);

        double remainder = product%40;
        System.out.println("The Remainder = "+ remainder);

        boolean isEven = remainder == 0 ? true : false;
        System.out.println(isEven);

        if (!isEven){
            System.out.println("Got some remainder");
        }
    }
}
