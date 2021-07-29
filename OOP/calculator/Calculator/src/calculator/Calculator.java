
package calculator;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.swing.JLabel;

/**
 *
 * @author alejo
 */
public class Calculator extends javax.swing.JFrame {
    
    ScriptEngineManager sem = new ScriptEngineManager(); 
    ScriptEngine se = sem.getEngineByName("JavaScript");

    /**
     * Creates new form Calculator
     */
    public Calculator() {
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

        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        operation = new javax.swing.JLabel();
        result = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        same = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        pow = new javax.swing.JButton();
        porcentage = new javax.swing.JButton();
        division = new javax.swing.JButton();
        seven = new javax.swing.JButton();
        eight = new javax.swing.JButton();
        nine = new javax.swing.JButton();
        multiply = new javax.swing.JButton();
        four = new javax.swing.JButton();
        five = new javax.swing.JButton();
        six = new javax.swing.JButton();
        less = new javax.swing.JButton();
        one = new javax.swing.JButton();
        two = new javax.swing.JButton();
        three = new javax.swing.JButton();
        plus = new javax.swing.JButton();
        zero = new javax.swing.JButton();
        dot = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        operation.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        operation.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel3.add(operation, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 0, 390, -1));

        result.setBackground(new java.awt.Color(255, 255, 255));
        result.setFont(new java.awt.Font("Arial", 0, 48)); // NOI18N
        result.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        result.setText("0");
        jPanel3.add(result, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 34, 400, 66));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 420, 110));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        same.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        same.setText("=");
        same.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sameActionPerformed(evt);
            }
        });
        jPanel1.add(same, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 420, 80, 80));

        delete.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        delete.setText("C");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        jPanel1.add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 80, 80));

        pow.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        pow.setText("CE");
        pow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                powActionPerformed(evt);
            }
        });
        jPanel1.add(pow, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 80, 80));

        porcentage.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        porcentage.setText("%");
        porcentage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                porcentageActionPerformed(evt);
            }
        });
        jPanel1.add(porcentage, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, 80, 80));

        division.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        division.setText("÷");
        division.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divisionActionPerformed(evt);
            }
        });
        jPanel1.add(division, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 20, 80, 80));

        seven.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        seven.setText("7");
        seven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sevenActionPerformed(evt);
            }
        });
        jPanel1.add(seven, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 80, 80));

        eight.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        eight.setText("8");
        eight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eightActionPerformed(evt);
            }
        });
        jPanel1.add(eight, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 80, 80));

        nine.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        nine.setText("9");
        nine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nineActionPerformed(evt);
            }
        });
        jPanel1.add(nine, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 120, 80, 80));

        multiply.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        multiply.setText("X");
        multiply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiplyActionPerformed(evt);
            }
        });
        jPanel1.add(multiply, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 120, 80, 80));

        four.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        four.setText("4");
        four.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fourActionPerformed(evt);
            }
        });
        jPanel1.add(four, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 80, 80));

        five.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        five.setText("5");
        five.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fiveActionPerformed(evt);
            }
        });
        jPanel1.add(five, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, 80, 80));

        six.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        six.setText("6");
        six.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sixActionPerformed(evt);
            }
        });
        jPanel1.add(six, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 220, 80, 80));

        less.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        less.setText("-");
        less.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lessActionPerformed(evt);
            }
        });
        jPanel1.add(less, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 220, 80, 80));

        one.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        one.setText("1");
        one.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oneActionPerformed(evt);
            }
        });
        jPanel1.add(one, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 80, 80));

        two.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        two.setText("2");
        two.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twoActionPerformed(evt);
            }
        });
        jPanel1.add(two, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 320, 80, 80));

        three.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        three.setText("3");
        three.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                threeActionPerformed(evt);
            }
        });
        jPanel1.add(three, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 320, 80, 80));

        plus.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        plus.setText("+");
        plus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plusActionPerformed(evt);
            }
        });
        jPanel1.add(plus, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 320, 80, 80));

        zero.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        zero.setText("0");
        zero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zeroActionPerformed(evt);
            }
        });
        jPanel1.add(zero, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, 80, 80));

        dot.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        dot.setText(".");
        jPanel1.add(dot, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 420, 80, 80));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 480, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        
        //clean screen
        result.setText("0");
        operation.setText("");
        
    }//GEN-LAST:event_deleteActionPerformed

    private void oneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oneActionPerformed
        // add number in the operation screen
        addNumber("1");
        
        
        
    }//GEN-LAST:event_oneActionPerformed

    private void plusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plusActionPerformed
        // TODO add your handling code here:
       addSimbol("+");
        
    }//GEN-LAST:event_plusActionPerformed

    private void sameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sameActionPerformed
        total();
        
    }//GEN-LAST:event_sameActionPerformed

    private void twoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_twoActionPerformed
        
        addNumber("2");
    }//GEN-LAST:event_twoActionPerformed

    private void threeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_threeActionPerformed
        
        addNumber("3");
    }//GEN-LAST:event_threeActionPerformed

    private void fourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fourActionPerformed
        
        addNumber("4");
    }//GEN-LAST:event_fourActionPerformed

    private void fiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fiveActionPerformed
        
        addNumber("5");
    }//GEN-LAST:event_fiveActionPerformed

    private void sixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sixActionPerformed
        
        addNumber("6");
    }//GEN-LAST:event_sixActionPerformed

    private void sevenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sevenActionPerformed
        // TODO add your handling code here:
        addNumber("7");
    }//GEN-LAST:event_sevenActionPerformed

    private void eightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eightActionPerformed
        // TODO add your handling code here:
        addNumber("8");
    }//GEN-LAST:event_eightActionPerformed

    private void nineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nineActionPerformed
        // TODO add your handling code here:
        addNumber("9");
    }//GEN-LAST:event_nineActionPerformed

    private void zeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zeroActionPerformed
        // TODO add your handling code here:
        addNumber("0");
    }//GEN-LAST:event_zeroActionPerformed

    private void powActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_powActionPerformed
        // TODO add your handling code he
            String text = operation.getText().substring(0,operation.getText().length()-1);
            operation.setText(text);
        
          
    
    }//GEN-LAST:event_powActionPerformed

    private void porcentageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_porcentageActionPerformed
        // TODO add your handling code here:
        addSimbol("%");
    }//GEN-LAST:event_porcentageActionPerformed

    private void divisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divisionActionPerformed
        // TODO add your handling code here:
        addSimbol("÷");
    }//GEN-LAST:event_divisionActionPerformed

    private void multiplyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiplyActionPerformed
        // TODO add your handling code here:
        addSimbol("x");
    }//GEN-LAST:event_multiplyActionPerformed

    private void lessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lessActionPerformed
        // TODO add your handling code here:
        addSimbol("-");
    }//GEN-LAST:event_lessActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculator().setVisible(true);
            }
        });
        
       
    }
    public void addNumber(String number){
        operation.setText(operation.getText()+number);
        }
    public void addSimbol(String simbol){
         
        operation.setText(operation.getText()+simbol);  
    }
    public void total(){
        try{
           String result_1 = se.eval(operation.getText()).toString();
           result.setText(result_1);
        }catch (Exception e){
            System.out.println(e);
        }
        operation.setText("");
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton delete;
    private javax.swing.JButton division;
    private javax.swing.JButton dot;
    private javax.swing.JButton eight;
    private javax.swing.JButton five;
    private javax.swing.JButton four;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton less;
    private javax.swing.JButton multiply;
    private javax.swing.JButton nine;
    private javax.swing.JButton one;
    private javax.swing.JLabel operation;
    private javax.swing.JButton plus;
    private javax.swing.JButton porcentage;
    private javax.swing.JButton pow;
    private javax.swing.JLabel result;
    private javax.swing.JButton same;
    private javax.swing.JButton seven;
    private javax.swing.JButton six;
    private javax.swing.JButton three;
    private javax.swing.JButton two;
    private javax.swing.JButton zero;
    // End of variables declaration//GEN-END:variables

    private void lengt(JLabel operation) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private boolean type(JLabel result) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
