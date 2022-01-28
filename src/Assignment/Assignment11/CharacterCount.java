package Assignment.Assignment11;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharacterCount {
    public static void main(String[] args) throws FileNotFoundException {
        try{
            File file = new File("C:\\Zemoso\\JavaAssignments\\src\\Assignment\\Assignment11\\input.txt");
            Scanner scread=new Scanner(file);
            PrintWriter pr=new PrintWriter("C:\\Zemoso\\JavaAssignments\\src\\Assignment\\Assignment11\\output.txt");
            Map<Character,Integer> map=new HashMap<>();
            char[] temp;
            while(scread.hasNext()){
                temp=scread.next().toCharArray();
                for(char c : temp){
                    if(map.containsKey(c))
                        map.put(c,map.get(c)+1);
                    else
                        map.put(c,1);
                }
            }
            scread.close();
            for(Character c:map.keySet()){
                pr.println(c+" : "+map.get(c));
            }
            pr.close();
        }
        catch(FileNotFoundException e){
            System.out.println(e.getMessage());
        }
    }
}
