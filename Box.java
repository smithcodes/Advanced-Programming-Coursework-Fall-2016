/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BoxCostCalculator;

/**
 *
 * @author up759661
 */
public abstract class Box {
  int width = -1;
  int length = -1;
  int hight = -1;
  
  int grade = -1;
  int colourNum = -1;
  boolean sealableTop = false;
    
  int amount = -1;

    /**
     *
     * @param newWidth
     * @param newLength
     * @param newHight
     * @param newGrade
     * @param newColourNum
     * @param newSealableTop
     * @param newAmount
     */
    public Box(int newWidth, 
            int newLength, 
            int newHight, 
            int newGrade, 
            int newColourNum, 
            boolean newSealableTop, 
            int newAmount)
    {
        width = newWidth;
        length = newLength;
        hight = newHight;
        grade = newGrade;
        colourNum = newColourNum;
        sealableTop = newSealableTop;
        amount = newAmount;
    }
    
    
     public double calculateCost()
    {
        return 0.0;
    }
}