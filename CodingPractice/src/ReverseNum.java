class ReverseDigit {
    int number;
    public int  reverseNumber(int number){
        if( number <10){
            System.out.println("provide valid number");
            return 0;
        }

        int last_digit;
        int reverse=0;
        while(number>0){
            last_digit = number %10;
            reverse = (reverse*10) + last_digit;
            number = number/10;
        }

        return reverse;
    }

    public boolean checkIfPolyndrome(int inputNumber){
        int reverseNum = reverseNumber(inputNumber);
        if(reverseNum == inputNumber){
            System.out.println("Provided number is palindrome\s" + inputNumber);
            return true;
        }
        System.out.println("Not a palindrome number");
        return false;
    }
}



public class ReverseNum {
    public static void main(String[] args){
        ReverseDigit num = new ReverseDigit();
        num.checkIfPolyndrome(1321);
    }
}
