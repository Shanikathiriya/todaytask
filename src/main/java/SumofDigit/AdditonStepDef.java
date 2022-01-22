package SumofDigit;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class AdditonStepDef
{

    int sum,digit;


      @Given("when passed {int}")
      public void when_passed(int number)

      {


          while(number > 0)
          {

              digit = number % 10;

              sum = sum + digit;

              number= number / 10;
          }

   }
      @Then("it returns  addition {int}")
      public void it_returns_addition(Integer int1)
      {

      System.out.println("Sum of Digits: "+sum);


  }


    @Given("when passed the  {int}")
    public void when_passed_the(Integer number) {

        String str1 = String.valueOf(number);
        String str2=str1.substring(1);
        System.out.println(str2);

        int number1= Integer.parseInt(str2);
        while (number1 > 0) {

            digit = number1 % 10;

            sum = sum + digit;

            number1 = number1 / 10;

        }
    }
    @Then("it returns  addition of {int}")
    public void it_returns_addition_of(Integer int1) {

        System.out.println("Sum of Digits: "+sum);

    }


}




