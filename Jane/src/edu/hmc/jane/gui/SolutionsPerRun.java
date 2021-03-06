package edu.hmc.jane.gui;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * SolutionsPerRun.java
 *
 * Created on Jul 22, 2010, 1:05:53 PM
 */

/**
 *
 * @author Tselil
 */
public class SolutionsPerRun extends javax.swing.JDialog {

    int value = 100000;     //Integer.MAX_VALUE;
    boolean changed = false;

    /** Creates new form SolutionsPerRun */
    public SolutionsPerRun(java.awt.Frame owner) {
        super(owner, "Change Number of Solutions Stored");
        Utils.initIcons(this);
        initComponents();
        getRootPane().setDefaultButton(ok_button);
        number_of_solutions_jSliderInput.setValue(value);
        setVisible(false);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ok_button = new javax.swing.JButton();
        cancel_button = new javax.swing.JButton();
        number_of_solutions_jSliderInput = new edu.hmc.jane.gui.JSliderInput();
        number_of_solutions_label = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Set Number of Solutions Stored");
        setLocationByPlatform(true);
        setModal(true);
        setResizable(false);

        ok_button.setText("OK");
        ok_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ok_buttonActionPerformed(evt);
            }
        });

        cancel_button.setText("Cancel");
        cancel_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancel_buttonActionPerformed(evt);
            }
        });

        number_of_solutions_jSliderInput.setDoubleBuffered(false);
        number_of_solutions_jSliderInput.setMaximum(99999);
        number_of_solutions_jSliderInput.setMinimum(1);

        number_of_solutions_label.setText("# Solutions:");

        jLabel1.setText("Set the maximum number of solutions stored from each run.");

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(layout.createSequentialGroup()
                        .add(ok_button, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 66, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(cancel_button))
                    .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                        .add(layout.createSequentialGroup()
                            .add(number_of_solutions_label)
                            .add(10, 10, 10)
                            .add(number_of_solutions_jSliderInput, 0, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .add(org.jdesktop.layout.GroupLayout.LEADING, jLabel1)))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .add(jLabel1)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(number_of_solutions_label)
                    .add(number_of_solutions_jSliderInput, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(cancel_button, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .add(ok_button, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancel_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancel_buttonActionPerformed
        setVisible(false);
        number_of_solutions_jSliderInput.setValue(value);
    }//GEN-LAST:event_cancel_buttonActionPerformed

    private void ok_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ok_buttonActionPerformed
        setVisible(false);
        changed = (value != number_of_solutions_jSliderInput.getValue());
        value = number_of_solutions_jSliderInput.getValue();
    }//GEN-LAST:event_ok_buttonActionPerformed

    public int getValue() {
        return value;
    }

    public boolean wasChanged() {
        if (changed) {
            changed = false; // reset for future
            return true;
        }
        return false;
    }
    
    public void openWithEditStatus(boolean val) {
        cancel_button.setEnabled(val);
        number_of_solutions_jSliderInput.setEnabled(val);
        this.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancel_button;
    private javax.swing.JLabel jLabel1;
    private edu.hmc.jane.gui.JSliderInput number_of_solutions_jSliderInput;
    private javax.swing.JLabel number_of_solutions_label;
    private javax.swing.JButton ok_button;
    // End of variables declaration//GEN-END:variables
}
