package Assignment.Assignment2;


import java.util.*;

import static java.lang.System.*;

    public class Assignment2 {

        public static boolean checkInputString(String str){
            int index=0;
            for(index=0;index<str.length();index++){
                if(str.charAt(index)>=97 && str.charAt(index)<122){
                    return true;

                }
            }
            return false;
        }
        public static void main(String args[]){
            Scanner obj =new Scanner(System.in);
            System.out.println("Enter the input String");
            String str=obj.nextLine();
            if(checkInputString(str)){
                System.out.println("Input String contains all the letters of a_z");
            }

        }

    }

/*
 * Time Complexity
 * O(n)
 *
 * Space Complexity
 *O(1)    Since program takes constant space of size 26
 * */