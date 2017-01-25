/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BoxCostCalculator;

/**
 *
 * @author Dansn_000
 */

public class BoxType1 extends Box {
    
    private boolean refBottom = false;
    private boolean refCorners = false;
    
    
    public BoxType1(int newWidth,
                    int newLength, 
                    int newHight, 
                    int newGrade, 
                    int newColourNum, 
                    boolean newSealableTop, 
                    int newAmount,
                    boolean newRefBottom,
                    boolean newRefCorners) {
        
        super (newWidth, 
            newLength, 
            newHight, 
            newGrade, 
            newColourNum, 
            newSealableTop, 
            newAmount);
        
        refBottom = newRefBottom;
        refCorners = newRefCorners;
    }
    
    public double calculateCost()
    {
        double totalBoxCost;
        double cardCostMod;
        double sealableTopMod = 0.0;
        
        if (super.sealableTop){
            sealableTopMod = 0.08;
        }
        
        double refCornersMod = 0.0;
        if (refCorners){
            refCornersMod = 0.10;
        }
        
        double refBottomMod = 0.0;
        if (refBottom){
            refBottomMod = 0.14;
        }
        
        
        
        
        switch (super.grade){
            case 1:
                cardCostMod = 0.5;
                break;
            case 2:
                cardCostMod = 0.6;
                break;
            case 3:
                cardCostMod = 0.72;
                break;
            
            default:
                cardCostMod = 1;
                break;
        }
        
        double area = (((super.hight * super.length)
                +(super.length * super.width)
                +(super.hight * super.width))*2);
        area = area/100;
        
        totalBoxCost = area*cardCostMod;
        
        double colourMod = 0.0;
        
        double topCost = totalBoxCost*(sealableTopMod);
        
        double bottomCost = totalBoxCost*(refBottomMod);
        
        double cornerCost = totalBoxCost*(refCornersMod);
        
        double colourCost = totalBoxCost*(colourMod);
        
        
        totalBoxCost += (topCost + bottomCost + cornerCost + colourCost);
        //System.out.println("TotalCost2: " + totalBoxCost);
        return totalBoxCost*super.amount;
    }
    
    
    
    
    
    
    
    
    
    public boolean getRefCorners(){
        return refCorners;
    }
    
    public boolean getRefBottom(){
        return refBottom;
    }
    
    public void setRefCorners(boolean newRefCorners){
        refCorners = newRefCorners;
    }
    
    public void setRefBottom(boolean newRefBottom){
        refBottom = newRefBottom;
    }
    
    
    
}
