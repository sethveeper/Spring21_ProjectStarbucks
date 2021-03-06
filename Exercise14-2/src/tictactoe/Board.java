/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe;

/**
 *
 * @author Seth Veeper
 */
public class Board extends javax.swing.JFrame {

    public boolean turn = false;
    /**
     * Creates new form Board
     */
    public Board() {
        initComponents();
    }

    public void OnClick()
    {
        if(turn)
        {
            lblTurn.setText("It is O's turn.");
        }
        else
        {
            lblTurn.setText("It is X's turn.");
        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnNW = new javax.swing.JButton();
        btnN = new javax.swing.JButton();
        btnNE = new javax.swing.JButton();
        btnE = new javax.swing.JButton();
        btnW = new javax.swing.JButton();
        btnC = new javax.swing.JButton();
        btnSE = new javax.swing.JButton();
        btnSW = new javax.swing.JButton();
        btnS = new javax.swing.JButton();
        lblTurn = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnNW.setText("?");
        btnNW.setToolTipText("");
        btnNW.setMaximumSize(new java.awt.Dimension(100, 100));
        btnNW.setMinimumSize(new java.awt.Dimension(40, 40));
        btnNW.setPreferredSize(new java.awt.Dimension(42, 42));
        btnNW.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNWActionPerformed(evt);
            }
        });

        btnN.setText("?");
        btnN.setToolTipText("");
        btnN.setMaximumSize(new java.awt.Dimension(100, 100));
        btnN.setMinimumSize(new java.awt.Dimension(40, 40));
        btnN.setPreferredSize(new java.awt.Dimension(42, 42));
        btnN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNActionPerformed(evt);
            }
        });

        btnNE.setText("?");
        btnNE.setToolTipText("");
        btnNE.setMaximumSize(new java.awt.Dimension(100, 100));
        btnNE.setMinimumSize(new java.awt.Dimension(40, 40));
        btnNE.setPreferredSize(new java.awt.Dimension(42, 42));
        btnNE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNEActionPerformed(evt);
            }
        });

        btnE.setText("?");
        btnE.setToolTipText("");
        btnE.setMaximumSize(new java.awt.Dimension(100, 100));
        btnE.setMinimumSize(new java.awt.Dimension(40, 40));
        btnE.setPreferredSize(new java.awt.Dimension(42, 42));
        btnE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEActionPerformed(evt);
            }
        });

        btnW.setText("?");
        btnW.setToolTipText("");
        btnW.setMaximumSize(new java.awt.Dimension(100, 100));
        btnW.setMinimumSize(new java.awt.Dimension(40, 40));
        btnW.setPreferredSize(new java.awt.Dimension(42, 42));
        btnW.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWActionPerformed(evt);
            }
        });

        btnC.setText("?");
        btnC.setToolTipText("");
        btnC.setMaximumSize(new java.awt.Dimension(100, 100));
        btnC.setMinimumSize(new java.awt.Dimension(40, 40));
        btnC.setPreferredSize(new java.awt.Dimension(42, 42));
        btnC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCActionPerformed(evt);
            }
        });

        btnSE.setText("?");
        btnSE.setToolTipText("");
        btnSE.setMaximumSize(new java.awt.Dimension(100, 100));
        btnSE.setMinimumSize(new java.awt.Dimension(40, 40));
        btnSE.setPreferredSize(new java.awt.Dimension(42, 42));
        btnSE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSEActionPerformed(evt);
            }
        });

        btnSW.setText("?");
        btnSW.setToolTipText("");
        btnSW.setMaximumSize(new java.awt.Dimension(100, 100));
        btnSW.setMinimumSize(new java.awt.Dimension(40, 40));
        btnSW.setPreferredSize(new java.awt.Dimension(42, 42));
        btnSW.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSWActionPerformed(evt);
            }
        });

        btnS.setText("?");
        btnS.setToolTipText("");
        btnS.setMaximumSize(new java.awt.Dimension(100, 100));
        btnS.setMinimumSize(new java.awt.Dimension(40, 40));
        btnS.setPreferredSize(new java.awt.Dimension(42, 42));
        btnS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSActionPerformed(evt);
            }
        });

        lblTurn.setText("It is X's turn.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnNW, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnN, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnNE, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnW, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnC, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnE, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSW, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnS, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSE, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblTurn))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNW, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnN, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNE, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnW, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnC, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnE, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSW, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnS, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSE, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTurn)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public String getMark()
    {
        String output = "";
        if(turn)
        {
            output = "O";
            lblTurn.setText("It is X's turn.");
        }
        else
        {
            output = "X";
            lblTurn.setText("It is O's turn.");
        }
        turn = !turn;
        
        return output;
    }
    
    private void btnNWActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNWActionPerformed
        // TODO add your handling code here:
        btnNW.setText(getMark());
        btnNW.setEnabled(false);
    }//GEN-LAST:event_btnNWActionPerformed

    private void btnNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNActionPerformed
        // TODO add your handling code here:
        btnN.setText(getMark());
        btnN.setEnabled(false);
    }//GEN-LAST:event_btnNActionPerformed

    private void btnNEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNEActionPerformed
        // TODO add your handling code here:
        btnNE.setText(getMark());
        btnNE.setEnabled(false);
    }//GEN-LAST:event_btnNEActionPerformed

    private void btnWActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWActionPerformed
        // TODO add your handling code here:
        btnW.setText(getMark());
        btnW.setEnabled(false);
    }//GEN-LAST:event_btnWActionPerformed

    private void btnCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCActionPerformed
        // TODO add your handling code here:
        btnC.setText(getMark());
        btnC.setEnabled(false);
    }//GEN-LAST:event_btnCActionPerformed

    private void btnEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEActionPerformed
        // TODO add your handling code here:
        btnE.setText(getMark());
        btnE.setEnabled(false);
    }//GEN-LAST:event_btnEActionPerformed

    private void btnSWActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSWActionPerformed
        // TODO add your handling code here:
        btnSW.setText(getMark());
        btnSW.setEnabled(false);
    }//GEN-LAST:event_btnSWActionPerformed

    private void btnSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSActionPerformed
        // TODO add your handling code here:
        btnS.setText(getMark());
        btnS.setEnabled(false);
    }//GEN-LAST:event_btnSActionPerformed

    private void btnSEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSEActionPerformed
        // TODO add your handling code here:
        btnSE.setText(getMark());
        btnSE.setEnabled(false);
    }//GEN-LAST:event_btnSEActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnC;
    private javax.swing.JButton btnE;
    private javax.swing.JButton btnN;
    private javax.swing.JButton btnNE;
    private javax.swing.JButton btnNW;
    private javax.swing.JButton btnS;
    private javax.swing.JButton btnSE;
    private javax.swing.JButton btnSW;
    private javax.swing.JButton btnW;
    private javax.swing.JLabel lblTurn;
    // End of variables declaration//GEN-END:variables
}
