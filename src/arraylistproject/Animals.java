/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylistproject;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author Family
 */
public class Animals {
  java.util.Scanner scan = new java.util.Scanner (System.in);
    
    
  public void simpleMessage(){ 
      //creates color arraylist
        ArrayList arrayListColor;
        
        arrayListColor = new ArrayList();
        
        ArrayList<String> color = new ArrayList<String>();
        
        color.add("green");
        color.add("brown");
        color.add("yellow");
        color.add("blue");
        color.add("red");
        color.add("orange");
        color.add("purple");
        color.add("black");
        color.add("white");
        color.add("pink");
        
        
        //creates sink or swim arraylist
        ArrayList arrayListSinkOrSwim;
        
        arrayListSinkOrSwim = new ArrayList();
        
        ArrayList<String> sinkOrSwim = new ArrayList<String>();
        
        sinkOrSwim.add("Swim");
        sinkOrSwim.add("Can not swim");
        
        
        ArrayList arrayListVertebrate;
        
        arrayListVertebrate = new ArrayList();
        
        ArrayList<String> vertebrate = new ArrayList<String>();
        
        vertebrate.add("vertebrate");
        vertebrate.add("invertebrate");
      
    
      
    System.out.println("     Animal List");
 // creates animals array list  
    ArrayList arrayListAnimals;  
    
    arrayListAnimals = new ArrayList();
  
    ArrayList<String> animals = new ArrayList<String>();
    
     animals.add("cow");
     animals.add("horse");
     animals.add("pig");
     animals.add("chicken");
     animals.add("rooster");
     animals.add("cat");
     animals.add("dog");
    
    
    for (int i = 0; i < animals.size(); i ++)
            
    {
        System.out.println(animals.get(i));
    }
    
    System.out.println("Enter desired option (add, edit, delete, or print) here:");
    String userInput = scan.nextLine();
    
    //allows user to add another animal to animals array list 
    if(userInput.equals("add")){
        System.out.println("Input animal to add to list:");
        String userInputFour = scan.nextLine();
        animals.add(userInputFour);
        
        System.out.println("Input " +userInputFour+ "'s color");
        color.add(scan.nextLine());
        
        System.out.println("Can " +userInputFour+ " (swim) or (Can not swim)");
        sinkOrSwim.add(scan.nextLine());
        
        System.out.println("Is "+userInputFour+ " vertebrate or invertebrate");
        vertebrate.add(scan.nextLine());
       
        
    
        System.out.println("     Animal List");
        System.out.println(animals);
    }
    //allows user to edit an animal from the array list animals
    else if(userInput.equals("edit")){
        
        System.out.println("Input animal name to edit:");
        String userInputTwo = scan.nextLine();
        
        
          if(userInputTwo.equals("cow")){
            System.out.println("Edit animal name:");
            String userInputFive = scan.nextLine();
            animals.set(0, userInputFive);}
          else if(userInputTwo.equals("horse")){
            System.out.println("Edit animal name:");
            String userInputSix = scan.nextLine();
            animals.set(1, userInputSix);}
          else if(userInputTwo.equals("pig")){
              System.out.println("Edit animal name:");
              String userInputSeven = scan.nextLine();
              animals.set(2, userInputSeven);}
          else if(userInputTwo.equals("chicken")){
              System.out.println("Enter animal name:");
              String userInputEight = scan.nextLine();
              animals.set(3, userInputEight);}
          else if(userInputTwo.equals("rooster")){
              System.out.println("Enter animal name:");
              String userInputNine = scan.nextLine();
              animals.set(4, userInputNine);}
          else if(userInputTwo.equals("cat")){
              System.out.println("Enter animal name:");
              String userInputTen = scan.nextLine();
              animals.set(5, userInputTen);}
          else if(userInputTwo.equals("dog")){
              System.out.println("Enter animal name:");
              String userInputEleven = scan.nextLine();
              animals.set(6, userInputEleven);}
          
          System.out.println(animals);
    }
    //allows user to delete an animal from the array list animals 
    else if(userInput.equals("delete")){
        System.out.println("Enter animal name to be deleted from list:");
        String userInputThree = scan.nextLine();
        
           if(userInputThree.equals("cow"))
            animals.remove(0);
           else if(userInputThree.equals("horse"))
            animals.remove(1);
           else if(userInputThree.equals("pig"))
            animals.remove(2);
           else if(userInputThree.equals("chicken"))
            animals.remove(3);
           else if(userInputThree.equals("rooster"))
            animals.remove(4);
           else if(userInputThree.equals("cat"))
            animals.remove(5);
           else if(userInputThree.equals("dog"))
            animals.remove(6); 
           
           System.out.println(animals);
    }
    else if (userInput.equals("print")){
      System.out.println(animals);
    
    
   }
  
    System.out.println("Enter an animal from the list:");
    String userInputFinal = scan.nextLine();
    
    // displays the chosen animals characteristics 
    if(userInputFinal.equals(animals.get(0))){
        System.out.println(animals.get(0)+ "'s Characteristics:");
        System.out.println(color.get(7)+" & "+color.get(8));
        System.out.println(sinkOrSwim.get(1));
        System.out.println(vertebrate.get(0));
    }
        else if(userInputFinal.equals(animals.get(1))){            
         System.out.println(animals.get(1)+ "'s Characteristics:");
         System.out.println(color.get(1));
         System.out.println(sinkOrSwim.get(1));
         System.out.println(vertebrate.get(0));
         }
        else if(userInputFinal.equals(animals.get(2))){
            System.out.println(animals.get(2) + "'s Characteristics");
            System.out.println(color.get(9));
            System.out.println(sinkOrSwim.get(1));
            System.out.println(vertebrate.get(0));
        }    
        else if(userInputFinal.equals(animals.get(3))){
            System.out.println(animals.get(3) + "'s Characteristics");
            System.out.println(color.get(1));
            System.out.println(sinkOrSwim.get(1));
            System.out.println(vertebrate.get(0));
        }  
        else if(userInputFinal.equals(animals.get(4))){
            System.out.println(animals.get(4) + "'s Characteristics");
            System.out.println(color.get(1));
            System.out.println(sinkOrSwim.get(1));
            System.out.println(vertebrate.get(0));
        }   
        else if(userInputFinal.equals(animals.get(5))){
            System.out.println(animals.get(5) + "'s Characteristics");
            System.out.println(color.get(5));
            System.out.println(sinkOrSwim.get(1));
            System.out.println(vertebrate.get(0));
        }
        else if(userInputFinal.equals(animals.get(6))){
            System.out.println(animals.get(6) + "'s Characteristics");
            System.out.println(color.get(7));
            System.out.println(sinkOrSwim.get(0));
            System.out.println(vertebrate.get(0));
        }
        else if(userInputFinal.equals(animals.get(7))){
            System.out.println(animals.get(7) + "'s Characteristics");
            System.out.println(color.get(10));
            System.out.println(sinkOrSwim.get(2));
            System.out.println(vertebrate.get(2));
        }
        else if(userInputFinal.equals(animals.get(8))){
            System.out.println();
        }
        else if(userInputFinal.equals(animals.get(9))){
            System.out.println();
        }
  }
  
}