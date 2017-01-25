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
public class BoxType2 extends Box {
    
    private boolean refBottom = false;
    private boolean refCorners = false;
    
    /**
     *
     * @param newWidth
     * @param newLength
     * @param newHight
     * @param newGrade
     * @param newColourNum
     * @param newSealableTop
     * @param newAmount
     * @param newRefBottom
     * @param newRefCorners
     */
    public BoxType2(int newWidth,
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
    
    /**
     *
     * @return
     */
    public boolean getRefCorners(){
        return refCorners;
    }
    
    /**
     *
     * @return
     */
    public boolean getRefBottom(){
        return refBottom;
    }
    
    /**
     *
     * @param newRefCorners
     */
    public void setRefCorners(boolean newRefCorners){
        refCorners = newRefCorners;
    }
    
    /**
     *
     * @param newRefBottom
     */
    public void setRefBottom(boolean newRefBottom){
        refBottom = newRefBottom;
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
            case 2:
                cardCostMod = 0.6;
                break;
            case 3:
                cardCostMod = 0.72;
                break;
            case 4:
                cardCostMod = 0.90;
                break;
            
            default:
                cardCostMod = 1;
                break;
        }
        
        //System.out.println("hight: " + super.hight);
        //System.out.println("length: " + super.length);
        //System.out.println("width: " + super.width);
        double area = (((super.hight * super.length)
                +(super.length * super.width)
                +(super.hight * super.width))*2);
        area = area/100;
        //System.out.println("super.grade: " + super.grade);
        totalBoxCost = area*cardCostMod;
        //System.out.println("totalBoxCost: " + totalBoxCost);
        double colourMod = 0.13;
        
        double topCost = totalBoxCost*(sealableTopMod);
        //System.out.println("topCost: " + topCost);
        double bottomCost = totalBoxCost*(refBottomMod);
        //System.out.println("bottomCost: " + bottomCost);
        double cornerCost = totalBoxCost*(refCornersMod);
        //System.out.println("cornerCost: " + cornerCost);
        double colourCost = totalBoxCost*(colourMod);
        //System.out.println("colourCost: " + colourCost);
        
        totalBoxCost += (topCost + bottomCost + cornerCost + colourCost);
        //System.out.println("TotalCost2: " + totalBoxCost);
        return totalBoxCost*super.amount;
    }
    
}
