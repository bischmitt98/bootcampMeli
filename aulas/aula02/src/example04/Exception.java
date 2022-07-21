package example04;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception extends Throwable {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        int num;

        System.out.println("Type an integer value");

        try {
            num = Integer.parseInt(keyboard.nextLine());
            System.out.println(num);
        } catch (InputMismatchException ex){
            System.out.println("Invalid typing");
            System.out.println(ex.getMessage());
        } catch (NumberFormatException ex){
            System.out.println("Incorrect value");
            System.out.println(ex.getMessage());
        }
//        catch (Exception ex){
//            System.out.println("Incorrect value");
//        }
        finally {
            System.out.println("End");
            keyboard.close();
        }
    }
}
