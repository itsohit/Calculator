/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;
  
import javax.swing.JButton;

/**
 *
 * @author IT sohit
 */
public class Calc extends javax.swing.JFrame {
   CalcOperation obj;
    /**
     * Creates new form Calculator
     */
    public Calc() {
       obj = new CalcOperation();
        initComponents();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        textLabel = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        cleanbutton = new javax.swing.JButton();
        plusminus = new javax.swing.JButton();
        mode = new javax.swing.JButton();
        divide = new javax.swing.JButton();
        eight = new javax.swing.JButton();
        seven = new javax.swing.JButton();
        nine = new javax.swing.JButton();
        multiply = new javax.swing.JButton();
        four = new javax.swing.JButton();
        five = new javax.swing.JButton();
        six = new javax.swing.JButton();
        minus = new javax.swing.JButton();
        one = new javax.swing.JButton();
        two = new javax.swing.JButton();
        three = new javax.swing.JButton();
        plus = new javax.swing.JButton();
        zero = new javax.swing.JButton();
        point = new javax.swing.JButton();
        equal = new javax.swing.JButton();
        exit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        textLabel.setEditable(false);
        textLabel.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        textLabel.setToolTipText("");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(textLabel)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 11, Short.MAX_VALUE)
                .addComponent(textLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.setLayout(new java.awt.GridLayout(5, 4, 1, 0));

        cleanbutton.setText("C");
        cleanbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cleanbuttonActionPerformed(evt);
            }
        });
        jPanel2.add(cleanbutton);

        plusminus.setText("+/-");
        plusminus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plusminusActionPerformed(evt);
            }
        });
        jPanel2.add(plusminus);

        mode.setText("%");
        mode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modeActionPerformed(evt);
            }
        });
        jPanel2.add(mode);

        divide.setText("/");
        divide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divideActionPerformed(evt);
            }
        });
        jPanel2.add(divide);

        eight.setText("8");
        eight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eightActionPerformed(evt);
            }
        });
        jPanel2.add(eight);

        seven.setText("7");
        seven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sevenActionPerformed(evt);
            }
        });
        jPanel2.add(seven);

        nine.setText("9");
        nine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nineActionPerformed(evt);
            }
        });
        jPanel2.add(nine);

        multiply.setText("*");
        multiply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiplyActionPerformed(evt);
            }
        });
        jPanel2.add(multiply);

        four.setText("4");
        four.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fourActionPerformed(evt);
            }
        });
        jPanel2.add(four);

        five.setText("5");
        five.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fiveActionPerformed(evt);
            }
        });
        jPanel2.add(five);

        six.setText("6");
        six.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sixActionPerformed(evt);
            }
        });
        jPanel2.add(six);

        minus.setText("-");
        minus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minusActionPerformed(evt);
            }
        });
        jPanel2.add(minus);

        one.setText("1");
        one.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oneActionPerformed(evt);
            }
        });
        jPanel2.add(one);

        two.setText("2");
        two.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twoActionPerformed(evt);
            }
        });
        jPanel2.add(two);

        three.setText("3");
        three.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                threeActionPerformed(evt);
            }
        });
        jPanel2.add(three);

        plus.setText("+");
        plus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plusActionPerformed(evt);
            }
        });
        jPanel2.add(plus);

        zero.setText("0");
        zero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zeroActionPerformed(evt);
            }
        });
        jPanel2.add(zero);

        point.setText(".");
        point.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pointActionPerformed(evt);
            }
        });
        jPanel2.add(point);

        equal.setText("=");
        equal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equalActionPerformed(evt);
            }
        });
        jPanel2.add(equal);
        equal.getAccessibleContext().setAccessibleDescription("");

        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        jPanel2.add(exit);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        setSize(new java.awt.Dimension(233, 376));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void eightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eightActionPerformed
      obj.PressBtn(eight);  // TODO add your handling code here:
    }//GEN-LAST:event_eightActionPerformed

    private void equalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_equalActionPerformed
        obj.equalOperation();
    }//GEN-LAST:event_equalActionPerformed

    private void zeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zeroActionPerformed
      obj.PressBtn(zero);
        // TODO add your handling code here:
    }//GEN-LAST:event_zeroActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
       System.exit(0); // TODO add your handling code here:
    }//GEN-LAST:event_exitActionPerformed

    private void divideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divideActionPerformed
        obj.symbolBtn(divide);
        operator = 4;
    }//GEN-LAST:event_divideActionPerformed

    private void cleanbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cleanbuttonActionPerformed
                        obj.cleanObj();
    }//GEN-LAST:event_cleanbuttonActionPerformed

    private void oneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oneActionPerformed
       obj.PressBtn(one); // TODO add your handling code here:
    }//GEN-LAST:event_oneActionPerformed

    private void twoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_twoActionPerformed
       obj.PressBtn(two);  // TODO add your handling code here:
    }//GEN-LAST:event_twoActionPerformed

    private void threeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_threeActionPerformed
      obj.PressBtn(three);  // TODO add your handling code here:
    }//GEN-LAST:event_threeActionPerformed

    private void fourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fourActionPerformed
       obj.PressBtn(four); // TODO add your handling code here:
    }//GEN-LAST:event_fourActionPerformed

    private void fiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fiveActionPerformed
      obj.PressBtn(five);  // TODO add your handling code here:
    }//GEN-LAST:event_fiveActionPerformed

    private void sixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sixActionPerformed
       obj.PressBtn(six); // TODO add your handling code here:
    }//GEN-LAST:event_sixActionPerformed

    private void sevenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sevenActionPerformed
       obj.PressBtn(seven); // TODO add your handling code here:
    }//GEN-LAST:event_sevenActionPerformed

    private void nineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nineActionPerformed
       obj.PressBtn(nine); // TODO add your handling code here:
    }//GEN-LAST:event_nineActionPerformed

    private void multiplyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiplyActionPerformed
        obj.symbolBtn(multiply);
        operator =3;
    }//GEN-LAST:event_multiplyActionPerformed

    private void minusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minusActionPerformed
        obj.symbolBtn(minus);
        operator = 2;
    }//GEN-LAST:event_minusActionPerformed

    private void plusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plusActionPerformed
        obj.symbolBtn(plus);
        operator = 1;
    }//GEN-LAST:event_plusActionPerformed

    private void pointActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pointActionPerformed
        dot = true;
        obj.PressBtn(point);
    }//GEN-LAST:event_pointActionPerformed

    private void modeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modeActionPerformed
       obj.symbolBtn(mode);
       operator = 5;
    }//GEN-LAST:event_modeActionPerformed

    private void plusminusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plusminusActionPerformed
       try{ if(Double.parseDouble(firstNo) > 0.0&&sign){
			textLabel.setText("-"+textLabel.getText());
                        firstNo = "-"+firstNo;
                        sign = false; }
                                else{
			textLabel.setText(textLabel.getText().substring(1,textLabel.getText().length()));  
                        firstNo = firstNo.substring(1,firstNo.length());
                        sign = true;}
       }catch(Exception e){
        textLabel.setText("Error Try Again");
         obj.cleanObj();
       }
    }//GEN-LAST:event_plusminusActionPerformed
    
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
            java.util.logging.Logger.getLogger(Calc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calc().setVisible(true);
            }
        });
    }

    class CalcOperation{
        
            void symbolBtn(JButton b){
                try {fdouble = Double.parseDouble(firstNo); }
                catch(Exception e){
                textLabel.setText("Error Try Again");
                    obj.cleanObj();
                }
//                       if(fdouble > 0.0&&sign){
//                            fdouble = -fdouble; }
                
                System.out.println("First No : "+fdouble);
                textLabel.setText(textLabel.getText()+""+b.getActionCommand());
                 first =false;
                 second = true;
                 sign = true;
            }
            
            void cleanObj(){
                textLabel.setText("");
                          sdouble = 0;
                          fdouble = 0;
                          operator =0;
                          dot = false;
                          first = true;
                          second = false;
                          firstNo= "";
                          secondNo = ""; 
                          sign = true;
            }
            
            
            void PressBtn(JButton b){
            if(first){
                   firstNo = firstNo+b.getActionCommand(); 
                 textLabel.setText(firstNo);
            }
           if(second){
               secondNo = secondNo+b.getActionCommand();
               textLabel.setText(textLabel.getText()+b.getActionCommand());
          //     System.out.println(l.getText()+b.getActionCommand());
           }   
        }
            
             void equalOperation(){
                first = true;
                second = false;
                       
                   try{   sdouble = Double.parseDouble(secondNo);
                       
                  switch(operator){
                      case 1:
                          ansdouble = fdouble+sdouble;
                          break;
                      case 2:
                          ansdouble = fdouble-sdouble;
                        break;
                      case 3:
                            ansdouble = fdouble*sdouble;
                          break;
                      case 4:
                            ansdouble = fdouble/sdouble;
                            dot = true;
                          break;
                      case 5:
                           ansdouble = fdouble%sdouble;
                           dot = true;
                           break;
                      default:
                }
                  if(dot){
                    System.out.println("Answer :"+ansdouble);
                    textLabel.setText(String.valueOf(ansdouble)); }
                  else {
                      System.out.println("Answer :"+(int)((int)ansdouble));
                      textLabel.setText(String.valueOf((int) ((int)ansdouble)));
                  }
                   }catch(Exception e){
                   textLabel.setText("Error Try Again");
                        obj.cleanObj();  }
                        sdouble = 0;
                          fdouble = 0;
                          operator =0;
                          dot = false;
                          first = true;
                          second = false;
                          firstNo= "";
                          secondNo = "";
          }
     }
    private Boolean sign = true;
    private String firstNo="";
    private String secondNo = "";
    private Boolean second = false;
    private Boolean first = true;
    private Boolean dot = false;
    private int operator = 0;
    private double fdouble,sdouble,ansdouble;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cleanbutton;
    private javax.swing.JButton divide;
    private javax.swing.JButton eight;
    private javax.swing.JButton equal;
    private javax.swing.JButton exit;
    private javax.swing.JButton five;
    private javax.swing.JButton four;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton minus;
    private javax.swing.JButton mode;
    private javax.swing.JButton multiply;
    private javax.swing.JButton nine;
    private javax.swing.JButton one;
    private javax.swing.JButton plus;
    private javax.swing.JButton plusminus;
    private javax.swing.JButton point;
    private javax.swing.JButton seven;
    private javax.swing.JButton six;
    private javax.swing.JTextField textLabel;
    private javax.swing.JButton three;
    private javax.swing.JButton two;
    private javax.swing.JButton zero;
    // End of variables declaration//GEN-END:variables
}
