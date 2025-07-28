public class Main{
    public static void main(String[] args) {
        int switchValue =6;
         switch (switchValue){
            case 1 -> System.out.println("Value was 1");
            case 2 -> System.out.println("Value was 2");
            default -> System.out.println("Was not 1 or 2");
         }

         String month = "APRIL";
         System.out.println(month + " is in the " + getQuarter(month) + " quarter");
         }
         
         public static String getQuarter(String month) {
            switch (month){
                case "JANUARY", "FEBRUARY", "MARCH" -> {
                    return "1st";
            }
                case "APRIL", "MAY", "JUNE" -> {
                    return "2nd";
            }
                case "JULY", "AUGUST", "SEPTEMBER" -> {
                    return "3rd";
            }
                case "OCTOBER", "NOVEMBER", "DECEMBER" -> {
                    return "4th";
            }
            }
            return "bad";
         }

    
        
    }

