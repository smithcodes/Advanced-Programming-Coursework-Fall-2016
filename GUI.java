/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BoxCostCalculator;

import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import java.awt.*;
import static java.lang.Boolean.parseBoolean;
import static java.lang.Integer.parseInt;


/**
 *
 * @author up770785
 */
public class GUI extends javax.swing.JFrame {

    private ArrayList<JComponent> jComponents = new ArrayList<JComponent>();
    private ArrayList OrderContent = new ArrayList();
    
    private String resultString = "";
    private double allOrderTotal = 0.0;
    /**
     * Creates new form GUI
     */
    public GUI() {
        initComponents();
        jComponents.addAll(Arrays.asList(heightSlider,
                depthSlider,
                quantitySlider,
                lengthSlider,
                lblGrade,
                lstGrades,
                lstGrade,
                lblHWL,
                lblColors,
                rdbColourZero,
                rdbColourOne,
                rdbColourTwo,
                lblExtras,
                chxReinforcedBottom,
                chxReinforcedCorners,
                chxSealableTops,
                lblHeightVal,
                lblDepthVal,
                lblLengthVal,
                lblHeight,
                lblDepth,
                lblLength,
                lblQuantity, 
                lblQuantityVal, 
                lblOrderMore, 
                btnOrderMore 
                ));

        // setName is needed in order for getName to work.
        // getName is used to identify components in arrayList and
        // then whatever property needs to be trigged can be done easily
        // without sName - getName returns null which does not work

        heightSlider.setName("heightSlider");
        depthSlider.setName("depthSlider");
        lengthSlider.setName("lengthSlider");
        lblGrade.setName("lblGrade");
        lstGrades.setName("lstGrades");
        lstGrade.setName("lstGrade");
        lblHWL.setName("lblHWL");
        lblColors.setName("lblColors");
        rdbColourZero.setName("rdbColourZero");
        rdbColourOne.setName("rdbColourOne");
        rdbColourTwo.setName("rdbColourTwo");
        lblExtras.setName("lblExtras");
        chxReinforcedBottom.setName("chxReinforcedBottom");
        chxReinforcedCorners.setName("chxReinforcedCorners");
        chxSealableTops.setName("chxSealableTops");
        lblHeightVal.setName("lblHeightVal");
        lblDepthVal.setName("lblDepthVal");
        lblLengthVal.setName("lblLengthVal");
        lblHeight.setName("lblHeight");
        lblDepth.setName("lblDepth");
        lblLength.setName("lblLength");
        lblQuantity.setName("lblQuantity");
        lblQuantityVal.setName("lblQuantityVal");
        quantitySlider.setName("quantitySlider");
        lblOrderMore.setName("lblOrderMore");
        btnOrderMore.setName("btnOrderMore");
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGrpColour = new javax.swing.ButtonGroup();
        lblOrderReview = new javax.swing.JLabel();
        lblGrade = new javax.swing.JLabel();
        heightSlider = new javax.swing.JSlider();
        lblDepth = new javax.swing.JLabel();
        quantitySlider = new javax.swing.JSlider();
        lblLength = new javax.swing.JLabel();
        lengthSlider = new javax.swing.JSlider();
        lblHeight = new javax.swing.JLabel();
        lstGrade = new javax.swing.JScrollPane();
        lstGrades = new javax.swing.JList<>();
        lblOrderMore = new javax.swing.JLabel();
        lblExtras = new javax.swing.JLabel();
        rdbCm = new javax.swing.JRadioButton();
        rdbColourTwo = new javax.swing.JRadioButton();
        lblQuantity = new javax.swing.JLabel();
        rdbColourZero = new javax.swing.JRadioButton();
        rdbColourOne = new javax.swing.JRadioButton();
        lblColors = new javax.swing.JLabel();
        chxSealableTops = new javax.swing.JCheckBox();
        chxReinforcedBottom = new javax.swing.JCheckBox();
        chxReinforcedCorners = new javax.swing.JCheckBox();
        lblHWL = new javax.swing.JLabel();
        lblLengthVal = new javax.swing.JLabel();
        lblHeightVal = new javax.swing.JLabel();
        lblDepthVal = new javax.swing.JLabel();
        depthSlider = new javax.swing.JSlider();
        lblQuantityVal = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnOrderMore = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        lblCurrentTotalVal = new javax.swing.JLabel();
        lblOrderTotalVal = new javax.swing.JLabel();
        lblOrderTotal = new javax.swing.JLabel();
        lblCurrentTotal = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(720, 550));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblOrderReview.setFont(new java.awt.Font("Candara", 0, 24)); // NOI18N
        lblOrderReview.setForeground(new java.awt.Color(206, 103, 103));
        lblOrderReview.setText("Order review_______________________________________________");
        getContentPane().add(lblOrderReview, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 700, 30));

        lblGrade.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        lblGrade.setText("Please select a grade from the list:");
        getContentPane().add(lblGrade, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 260, 20));

        heightSlider.setMaximum(1000);
        heightSlider.setMinimum(10);
        heightSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                heightSliderStateChanged(evt);
            }
        });
        getContentPane().add(heightSlider, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 190, -1));

        lblDepth.setText("Enter depth");
        getContentPane().add(lblDepth, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 100, -1));

        quantitySlider.setMaximum(1000);
        quantitySlider.setMinimum(10);
        quantitySlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                quantitySliderStateChanged(evt);
            }
        });
        quantitySlider.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                quantitySliderFocusGained(evt);
            }
        });
        getContentPane().add(quantitySlider, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 270, 200, -1));

        lblLength.setText("Enter length");
        getContentPane().add(lblLength, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 90, -1));

        lengthSlider.setMaximum(1000);
        lengthSlider.setMinimum(10);
        lengthSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                lengthSliderStateChanged(evt);
            }
        });
        getContentPane().add(lengthSlider, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, 190, -1));

        lblHeight.setText("Enter height");
        getContentPane().add(lblHeight, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 90, -1));

        lstGrades.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Grade 1", "Grade 2", "Grade 3", "Grade 4", "Grade 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        lstGrades.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lstGradesMouseClicked(evt);
            }
        });
        lstGrade.setViewportView(lstGrades);

        getContentPane().add(lstGrade, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 70, 100));

        lblOrderMore.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        lblOrderMore.setText("Finished with this Box Order?");
        getContentPane().add(lblOrderMore, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 310, 220, 20));

        lblExtras.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        lblExtras.setText("Please select extras:");
        getContentPane().add(lblExtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 150, 180, 20));

        rdbCm.setText("cm(s)");
        rdbCm.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                rdbCmStateChanged(evt);
            }
        });
        rdbCm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rdbCmMouseClicked(evt);
            }
        });
        getContentPane().add(rdbCm, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, -1, -1));

        btnGrpColour.add(rdbColourTwo);
        rdbColourTwo.setText("Colour Two");
        rdbColourTwo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rdbColourTwoMouseClicked(evt);
            }
        });
        getContentPane().add(rdbColourTwo, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 120, -1, -1));

        lblQuantity.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        lblQuantity.setText("How many boxes like these?");
        getContentPane().add(lblQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 250, 220, 20));

        btnGrpColour.add(rdbColourZero);
        rdbColourZero.setText("Colour Zero");
        rdbColourZero.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rdbColourZeroMouseClicked(evt);
            }
        });
        getContentPane().add(rdbColourZero, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 80, -1, -1));

        btnGrpColour.add(rdbColourOne);
        rdbColourOne.setText("Colour One");
        rdbColourOne.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rdbColourOneMouseClicked(evt);
            }
        });
        getContentPane().add(rdbColourOne, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 100, 90, -1));

        lblColors.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        lblColors.setText("Please select colour options:");
        getContentPane().add(lblColors, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 60, 260, 20));

        chxSealableTops.setText("Sealable Tops");
        getContentPane().add(chxSealableTops, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 210, 170, -1));

        chxReinforcedBottom.setText("Reinforced Bottom");
        chxReinforcedBottom.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                chxReinforcedBottomStateChanged(evt);
            }
        });
        getContentPane().add(chxReinforcedBottom, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 170, 170, -1));

        chxReinforcedCorners.setText("Reinforced Corners");
        getContentPane().add(chxReinforcedCorners, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 190, 170, -1));

        lblHWL.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        lblHWL.setText("Please adjust values in centimenters for each:");
        getContentPane().add(lblHWL, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 350, 20));

        lblLengthVal.setText("jLabel2");
        getContentPane().add(lblLengthVal, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 170, 60, -1));

        lblHeightVal.setText("jLabel2");
        getContentPane().add(lblHeightVal, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 110, 60, -1));

        lblDepthVal.setText("jLabel2");
        getContentPane().add(lblDepthVal, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 140, 60, -1));

        depthSlider.setMaximum(1000);
        depthSlider.setMinimum(10);
        depthSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                depthSliderStateChanged(evt);
            }
        });
        getContentPane().add(depthSlider, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 190, -1));

        lblQuantityVal.setText("jLabel2");
        getContentPane().add(lblQuantityVal, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 280, -1, -1));

        jLabel7.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel7.setText("Choose main units");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 150, 20));

        btnOrderMore.setText("Submit Order");
        btnOrderMore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrderMoreActionPerformed(evt);
            }
        });
        getContentPane().add(btnOrderMore, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 330, 150, -1));

        jLabel2.setFont(new java.awt.Font("Candara", 0, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(206, 103, 103));
        jLabel2.setText("Welcome to FlexBox Calculator");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 410, 30));

        lblCurrentTotalVal.setFont(new java.awt.Font("Candara", 1, 16)); // NOI18N
        lblCurrentTotalVal.setText("£0.00");
        getContentPane().add(lblCurrentTotalVal, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 370, 350, 20));

        lblOrderTotalVal.setFont(new java.awt.Font("Candara", 1, 16)); // NOI18N
        lblOrderTotalVal.setText("£0.00");
        getContentPane().add(lblOrderTotalVal, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 400, 350, 20));

        lblOrderTotal.setFont(new java.awt.Font("Candara", 0, 16)); // NOI18N
        lblOrderTotal.setForeground(new java.awt.Color(206, 103, 103));
        lblOrderTotal.setText("All order's Total:");
        getContentPane().add(lblOrderTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, 130, 20));

        lblCurrentTotal.setFont(new java.awt.Font("Candara", 0, 16)); // NOI18N
        lblCurrentTotal.setForeground(new java.awt.Color(206, 103, 103));
        lblCurrentTotal.setText("Prevoius Orders Total:");
        getContentPane().add(lblCurrentTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 160, 20));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void heightSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_heightSliderStateChanged
        // kept unit selectors so possiable unit conversion can be applied
        lblHeightVal.setText(heightSlider.getValue() + whichUnitSelected());
    }//GEN-LAST:event_heightSliderStateChanged

    
    
    private void rdbCmStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_rdbCmStateChanged

    }//GEN-LAST:event_rdbCmStateChanged

    
    
    
    
    //actual useful stuff
    private void rdbCmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rdbCmMouseClicked
        // TODO: fix so doesnt have to display
        rdbCm.setSelected(true);
        lblHWL.setText("Please adjust values in centimeters:");
        unitAdjustment(heightSlider, 10, 150, 50);
        unitAdjustment(lengthSlider, 10, 150, 50);
        unitAdjustment(depthSlider, 10, 150, 50);
        
        //make 3 sliders appear
        enableSomeJComponents(new String[] {"lblHWL", "lblHeight", "heightSlider", "lblHeightVal"});
        enableSomeJComponents(new String[] {"lblDepth", "depthSlider", "lblDepthVal"});
        enableSomeJComponents(new String[] {"lblLength", "lengthSlider", "lblLengthVal"});
        enableSomeJComponents(new String[] {"lblGrade", "lstGrades", "lstGrade"});
        
    }//GEN-LAST:event_rdbCmMouseClicked

    
    
    
    private void lengthSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_lengthSliderStateChanged
        // changes lable value so the int is visable
        lblLengthVal.setText(lengthSlider.getValue() + whichUnitSelected());
    }//GEN-LAST:event_lengthSliderStateChanged

    private void rdbColourZeroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rdbColourZeroMouseClicked
        // TODO: change to colour 1 2 3 selectors 
        rdbColourZero.setSelected(true);
        rdbColourOne.setSelected(false);
        rdbColourTwo.setSelected(false);
        enableSomeJComponents(new String[] {"lblExtras",
                                            "chxReinforcedCorners",
                                            "chxReinforcedBottom", 
                                            "chxSealableTops", 
                                            "lblQuantity", 
                                            "quantitySlider",
                                            "lblQuantityVal", 
                                            "lblOrderMore", 
                                            "btnOrderMore"});
        unitAdjustment(quantitySlider, 1, 250, 1);
    }//GEN-LAST:event_rdbColourZeroMouseClicked

    private void rdbColourOneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rdbColourOneMouseClicked
        // TODO: modify
        rdbColourOne.setSelected(true);
        rdbColourTwo.setSelected(false);
        rdbColourZero.setSelected(false);
        enableSomeJComponents(new String[] {"lblExtras",
                                            "chxReinforcedCorners",
                                            "chxReinforcedBottom", 
                                            "chxSealableTops", 
                                            "lblQuantity", 
                                            "quantitySlider",
                                            "lblQuantityVal", 
                                            "lblOrderMore", 
                                            "btnOrderMore"});
        unitAdjustment(quantitySlider, 1, 250, 1);
    }//GEN-LAST:event_rdbColourOneMouseClicked

    
    
    
    
    private void depthSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_depthSliderStateChanged
        lblDepthVal.setText(depthSlider.getValue() + whichUnitSelected());
    }//GEN-LAST:event_depthSliderStateChanged

    private void lstGradesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lstGradesMouseClicked
        // alter for grade colour link
        enableSomeJComponents(new String[] {"lblColors", "rdbColourZero", "rdbColourOne", "rdbColourTwo"});
    }//GEN-LAST:event_lstGradesMouseClicked

    private void quantitySliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_quantitySliderStateChanged
        lblQuantityVal.setText(quantitySlider.getValue() + " boxes");
    }//GEN-LAST:event_quantitySliderStateChanged

    
    
    
    
    private void btnOrderMoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrderMoreActionPerformed
        // Button pressed and order info collected on click
        //Harvest Info
        resultString="";
        OrderContent = harvestInfo();
        
        
        resultString = validateOrderContent(OrderContent);
        
        
        if (resultString==""){
            //create box object and add info to array....
            
            int length = parseInt(OrderContent.get(0).toString());
            int hight = parseInt(OrderContent.get(2).toString());
            int width = parseInt(OrderContent.get(1).toString());
            int amount = parseInt(OrderContent.get(8).toString());
            int gradeIntValue = parseInt(OrderContent.get(3).toString());
            int colourNum = parseInt(OrderContent.get(4).toString());
        
        //seperate bools
            boolean refBottom = parseBoolean(OrderContent.get(5).toString());
            boolean refCorners = parseBoolean(OrderContent.get(6).toString());
            boolean sealableTop = parseBoolean(OrderContent.get(7).toString());
            
            
            
            if (colourNum == 0){
                BoxType1 newBox = new BoxType1(width,
                    length, 
                    hight, 
                    gradeIntValue, 
                    colourNum, 
                    sealableTop, 
                    amount,
                    refBottom,
                    refCorners);
                
                    double boxCost = newBox.calculateCost();
                    
                    lblCurrentTotalVal.setText("£" + boxCost);
                    allOrderTotal += boxCost;
                    lblOrderTotalVal.setText("£" + allOrderTotal);
            }
            else if (colourNum == 1){
                BoxType2 newBox = new BoxType2(width,
                    length, 
                    hight, 
                    gradeIntValue, 
                    colourNum, 
                    sealableTop, 
                    amount,
                    refBottom,
                    refCorners);
                
                    double boxCost = newBox.calculateCost();
                    
                    lblCurrentTotalVal.setText("£" + boxCost);
                    allOrderTotal += boxCost;
                    lblOrderTotalVal.setText("£" + allOrderTotal);    
            
            }
            else if (colourNum == 2){
                if ((!refBottom) && (!refCorners)){
                    BoxType3 newBox = new BoxType3(width,
                    length, 
                    hight, 
                    gradeIntValue, 
                    colourNum, 
                    sealableTop, 
                    amount,
                    refBottom,
                    refCorners);
                    
                    double boxCost = newBox.calculateCost();
                    
                    lblCurrentTotalVal.setText("£" + boxCost);
                    allOrderTotal += boxCost;
                    lblOrderTotalVal.setText("£" + allOrderTotal);
                }
                else if ((refBottom) && (!refCorners)){
                    BoxType4 newBox = new BoxType4(width,
                    length, 
                    hight, 
                    gradeIntValue, 
                    colourNum, 
                    sealableTop, 
                    amount,
                    refBottom,
                    refCorners);
                    
                    double boxCost = newBox.calculateCost();
                    
                    lblCurrentTotalVal.setText("£" + boxCost);
                    allOrderTotal += boxCost;
                    lblOrderTotalVal.setText("£" + allOrderTotal);
                
                }
                else if ((refBottom) && (refCorners)){
                    BoxType5 newBox = new BoxType5(width,
                    length, 
                    hight, 
                    gradeIntValue, 
                    colourNum, 
                    sealableTop, 
                    amount,
                    refBottom,
                    refCorners);
                    
                    double boxCost = newBox.calculateCost();
                    
                    lblCurrentTotalVal.setText("£" + boxCost);
                    allOrderTotal += boxCost;
                    lblOrderTotalVal.setText("£" + allOrderTotal);
                    
                }
            }
            
            
            
            msgbox("The order has been sucessfully saved!\n "
                    + "To add more orders, please fill out\n"
                    + "the form again and press submit once again.");
        }
        else{
            msgbox(resultString);
        }
        
        
        
        
        
        
        
    }//GEN-LAST:event_btnOrderMoreActionPerformed

    private void quantitySliderFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_quantitySliderFocusGained
        enableSomeJComponents(new String[] {"btnOrderMore", "lblOrderMore"});
    }//GEN-LAST:event_quantitySliderFocusGained

    private void rdbColourTwoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rdbColourTwoMouseClicked
        rdbColourOne.setSelected(false);
        rdbColourTwo.setSelected(true);
        rdbColourZero.setSelected(false);
        enableSomeJComponents(new String[] {"lblExtras",
                                            "chxReinforcedCorners",
                                            "chxReinforcedBottom", 
                                            "chxSealableTops", 
                                            "lblQuantity", 
                                            "quantitySlider",
                                            "lblQuantityVal", 
                                            "lblOrderMore", 
                                            "btnOrderMore"});
        unitAdjustment(quantitySlider, 1, 250, 1);
        
        
    }//GEN-LAST:event_rdbColourTwoMouseClicked

    private void chxReinforcedBottomStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_chxReinforcedBottomStateChanged
        
    }//GEN-LAST:event_chxReinforcedBottomStateChanged

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    public void unitAdjustment(JSlider jSlider, int minVal, int maxVal, int dflVal){
        jSlider.setMinimum(minVal);
        jSlider.setMaximum(maxVal);
        jSlider.setValue(dflVal);
    }

    public String whichUnitSelected(){
        
       // kept incase we want to include a diffrent measuremet at some point
        String selectedVal = "";
        if (rdbCm.isSelected()){
            selectedVal = " cm(s)";
        }
        return selectedVal;
    }

    public void disableAll(){
        for (int i = 0; i < jComponents.size(); i++){
            jComponents.get(i).setVisible(false);
            System.out.println(jComponents.get(i).getName());
        }
    }

    public void enableSomeJComponents(String[] components){
        for (int i = 0; i < jComponents.size(); i++){
            for (String component : components) {
                if (component == jComponents.get(i).getName()) {
                    jComponents.get(i).setVisible(true);
                }
            }
        }
    }
    
    
    //Validation of orderContent
    public String validateOrderContent(ArrayList orderData)
    {
        String returnString = "";
        
        //Validation variables brought in
        int gradeIntValue = parseInt(orderData.get(3).toString());
        int colourNum = parseInt(orderData.get(4).toString());
        
        //seperate bools
        boolean refBottom = parseBoolean(orderData.get(5).toString());
        boolean refCorners = parseBoolean(orderData.get(6).toString());
        
        // colour 0 = grades 1-3 & no bottom or corners
        //((colourNum==0) && (gradeIntValue>=1 && gradeIntValue <=3) && (!refBottom && !refCorners))
        if (colourNum==0){
            if (gradeIntValue>=1 && gradeIntValue <=3){
                if (refBottom || refCorners){
                    //can not have reinforced corners with this grade of card
                    returnString = returnString.concat("We do NOT supply this colour " + colourNum + " card with Reinforced Corners or Bottoms. ");
                }
            }
            else{
                // can not have this colour with this grade
                returnString = returnString.concat("We do NOT supply this colour " + colourNum + " card in grade " + gradeIntValue + ". ");
            }
        }
        
        // colour 1 = grades 2-4 & no bottom or corners
        else if (colourNum==1){
            if (gradeIntValue>=2 && gradeIntValue <=4){
                if (refBottom || refCorners){
                    //can not have reinforced corners with this grade of card
                    returnString = returnString.concat("We do NOT supply this colour " + colourNum + " card with Reinforced Corners or Bottoms. ");
                }
            }
            else{
                // can not have this colour with this grade
                returnString = returnString.concat("We do NOT supply this colour " + colourNum + " card in grade " + gradeIntValue + ". ");
            }
        }
        
        // colour 2 = grades 2-5 & mixed
        else if (colourNum==2){
            //check within whole acceptable grade bounds
            if (gradeIntValue>=2 && gradeIntValue <=5){
                //if grade 2 then no corners?
                if (gradeIntValue==2){
                    if (refCorners){
                    //corners detected
                    returnString = returnString.concat("We do NOT supply grade 2 card with Reinforced Corners. ");
                    }
                }
                //if no bottom then no corners
                if ((!refBottom) && (refCorners)){
                    returnString = returnString.concat("We do NOT supply reinforced corners on grade " + gradeIntValue + " card without reinforced bottoms. ");
                }
            }
            else{
                // can not have this colour with this grade
                returnString = returnString.concat("We do NOT supply this colour " + colourNum + " card in grade " + gradeIntValue + ". ");
            }
        }
        

        return returnString;
    }
    
    
    private void msgbox(String message){
        JOptionPane.showMessageDialog(null, message);
    }
    
    
    
    //-------- group accessor harvestors ---------
    public ArrayList harvestInfo() {
        //establish temp array
        ArrayList tempArray = new ArrayList();
        // collect measurements
        int length = parseInt( (lblLengthVal.getText()).split(" ") [0]);
        int depth = parseInt( (lblDepthVal.getText()).split(" ") [0]);
        int hight = parseInt( (lblHeightVal.getText()).split(" ") [0]);
        
        //collect amount
        int amount = parseInt( (lblQuantityVal.getText()).split(" ") [0]);
        
        // collect grade
        String tempGrade = lstGrades.getSelectedValue(); //value of grade box
        tempGrade = tempGrade.split(" ") [1];
        
        int gradeIntValue = parseInt(tempGrade);
        
        // collect colour
        int colourNum;
        if (rdbColourZero.isSelected()){
           colourNum = 0;
        } else if (rdbColourOne.isSelected()){
            colourNum = 1;
        } else {
            colourNum = 2;
        }
        
        // collect checkbox values
        //1 is true/0 is false
        boolean refBottom;
        boolean refCorners;
        boolean sealableTop;
        
        if (chxReinforcedBottom.isSelected()){
            refBottom = true;
        } else {
            refBottom = false;
        }
        
        if (chxReinforcedCorners.isSelected()){
            refCorners = true;
        } else {
            refCorners = false;
        }
        
        if (chxSealableTops.isSelected()){
            sealableTop = true;
        } else {
            sealableTop = false;
        }
        
        
        //put results into a temp array
        tempArray.add(length);
        tempArray.add(depth);
        tempArray.add(hight);
        tempArray.add(gradeIntValue);
        tempArray.add(colourNum);
        tempArray.add(refBottom);
        tempArray.add(refCorners);
        tempArray.add(sealableTop);
        tempArray.add(amount);
        //pass array back
        return tempArray;
    }
    
    
    
    public double getTypeCostModifyer()
    {
        //in percentages held as decimals
        
        double colourCost = 0.16;
        double bottomCost = 0.14;
        double cornerCost = 0.10;
        double typeCostMod = cornerCost + bottomCost + colourCost;
        return typeCostMod;
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btnGrpColour;
    private javax.swing.JButton btnOrderMore;
    private javax.swing.JCheckBox chxReinforcedBottom;
    private javax.swing.JCheckBox chxReinforcedCorners;
    private javax.swing.JCheckBox chxSealableTops;
    private javax.swing.JSlider depthSlider;
    private javax.swing.JSlider heightSlider;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel lblColors;
    private javax.swing.JLabel lblCurrentTotal;
    private javax.swing.JLabel lblCurrentTotalVal;
    private javax.swing.JLabel lblDepth;
    private javax.swing.JLabel lblDepthVal;
    private javax.swing.JLabel lblExtras;
    private javax.swing.JLabel lblGrade;
    private javax.swing.JLabel lblHWL;
    private javax.swing.JLabel lblHeight;
    private javax.swing.JLabel lblHeightVal;
    private javax.swing.JLabel lblLength;
    private javax.swing.JLabel lblLengthVal;
    private javax.swing.JLabel lblOrderMore;
    private javax.swing.JLabel lblOrderReview;
    private javax.swing.JLabel lblOrderTotal;
    private javax.swing.JLabel lblOrderTotalVal;
    private javax.swing.JLabel lblQuantity;
    private javax.swing.JLabel lblQuantityVal;
    private javax.swing.JSlider lengthSlider;
    private javax.swing.JScrollPane lstGrade;
    private javax.swing.JList<String> lstGrades;
    private javax.swing.JSlider quantitySlider;
    private javax.swing.JRadioButton rdbCm;
    private javax.swing.JRadioButton rdbColourOne;
    private javax.swing.JRadioButton rdbColourTwo;
    private javax.swing.JRadioButton rdbColourZero;
    // End of variables declaration//GEN-END:variables
}


/**
 * 
 * //measurement variables held for future use? TODO
        int length = parseInt(orderData.get(0).toString());
        int depth = parseInt(orderData.get(1).toString());
        int hight = parseInt(orderData.get(2).toString());
        
        //Validation variables brought in
        int gradeIntValue = parseInt(orderData.get(3).toString());
        int colourNum = parseInt(orderData.get(4).toString());
        
        //seperate bools
        boolean refBottom = parseBoolean(orderData.get(5).toString());
        boolean refCorners = parseBoolean(orderData.get(6).toString());
        boolean sealableTop = parseBoolean(orderData.get(7).toString());
 * 
 * 
 * 
 */