public class Main {

    public static void main(String[] args) {
	int birthMonth = 13;
	if (birthMonth < 1)
    {
        System.out.println("You entered an incorrect month value: " + birthMonth); // if birth month is below 1, output will tell user that they entered an incorrect value, as value must be between 1-12
    }
	else if (birthMonth > 12)
    {
        System.out.println("You entered an incorrect month value: " + birthMonth); // if birth month is over 12, output will tell user that they entered an incorrect value, as value must be between 1-12
    }
	else // birthMonth is within range 1-12
    {
        System.out.println("Your birth month is: " + birthMonth); // output will tell user their birth month by echoing back the value that was entered
    }
    }
}
