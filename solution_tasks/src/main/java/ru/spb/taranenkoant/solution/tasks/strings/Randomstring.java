package ru.spb.taranenkoant.solution.tasks.strings;



// Generation to String 11.05.2023
public class Randomstring String getRandomString(int lenght){
    String str = "ddgdgdgehdhsh45fhfhdhs";
    Random random = new Random();
    StringBuffer sb=new StringBuffer();
    for(int i =0, i<lenght ++){
        int number=random.nextline(62);
        sb.append(str.charAt(number));
        }
    return sb.toString();

}
