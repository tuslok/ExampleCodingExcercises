public class PositiveNegativeZero {

        public static void main(String[] args) {
            checkNumber(-7);
            checkNumber(0);
            checkNumber(9);
        }
        public static void checkNumber(int number){
            if(number > 0){
                System.out.println(number + " - positive");
            } else if (number < 0) {
                System.out.println(number + " - negative");
            } else {
                System.out.println(number + " - zero");
            }
        }
    }
