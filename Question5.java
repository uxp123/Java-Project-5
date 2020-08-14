/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question.pkg5;

/**
 *
 * @author philipfynn
 */
public class Question5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Average average = new Average();
         average.setThird(3);
         average.setSecond(2);
         average.setFirst(1);
         
         int sum = 0;
         sum = (average.getFirst() + average.getSecond() + average.getThird());
         System.out.println("The average is "+ sum/3);
         
        
        
        // TODO code application logic here
    }
    
}
