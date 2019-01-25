
//Andre Nonaka
//Wednesday October 24th 2018
public class Grammar_AndreNonaka{  
public static void main(String args[]){  
String s1="My thame is Lrank.I live to Caridnal Lenngther 2ndary Stchool. The nuform there are very bard. My matesclass is in my 1st periodt. We talk berry muth.";  //This is the grammatically incorect sentenece
  String sNew=s1.replace("thame","name");//replaces all occurrences of "thame" to "name"
//here
  String sNew2=sNew.replace("Lrank", "Frank");//replaces all occurrences of "Lrank" to "Frank" 
//here
 String sNew3=sNew2.replace("live", "go");//replaces all occurrences of "live" to "go" 
 //here
String sNew4=sNew3.replace("Caridnal", "Cardinal");//replaces all occurrences of "Caridnal" to "Cardinal"  
//here
String sNew5=sNew4.replace("Lenngther", "Leger");//replaces all occurrences of "Lenngther" to "Leger" 
//here
String sNew6=sNew5.replace("2ndary", "Secondary");//replaces all occurrences of "2ndary" to "Secondary" 
//here
String sNew7=sNew6.replace("Stchool", "School");//replaces all occurrences of "Stchool" to "School" 
//here
String sNew8=sNew7.replace("nuform", "uniforms");//replaces all occurrences of "nuform" to "uniforms"
//here
String sNew9=sNew8.replace("there", "their");//replaces all occurrences of "there" to "their" //here
//here
String sNew10=sNew9.replace("bard", "boring");//replaces all occurrences of "bard" to "boring" 
//here
String sNew11=sNew10.replace("matesclass", "mathclass");//replaces all occurrences of "matesclass" to "mathclass" 
//here
String sNew12=sNew11.replace("periodt", "period");//replaces all occurrences of "periodt" to "period" 
//here
String sNew13=sNew12.replace("berry", "very");//replaces all occurrences of "berry" to "very" 
//here
String sNew14=sNew13.replace("muth", "much");//replaces all occurrences of "muth" to "much" 
System.out.println(sNew14); //prints out gramatically corrected sentence
}
}

