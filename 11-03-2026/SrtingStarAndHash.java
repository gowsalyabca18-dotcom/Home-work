
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


 import java.util.Scanner;

public class  SrtingStarAndHash {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no. of star and hash");
        String s = sc.nextLine();

        int star = 0;
        int hash = 0;

        for(int i = 0; i < s.length(); i++) {

            if(s.charAt(i) == '*') {
                star++;
            }

            else if(s.charAt(i) == '#') {
                hash++;
            }
        }

        int result = star - hash;

        System.out.println(result);
    }
}
    

