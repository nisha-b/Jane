package edu.hmc.jane.gui;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * SetPolytomyParams.java
 *
 * Created on Jul 5, 2012, 3:40:00 PM
 */

/**
 *
 * @author Ki Wan Gkoo
 */
public class SetPolytomyParams extends javax.swing.JDialog {
    
    boolean ensureSequential = true;
    boolean preventMidPolytomy = true;
    boolean changed = false;
    private boolean allow_editing;

    /** Creates new form SetPolytomyParams */
    public SetPolytomyParams(java.awt.Frame owner) {
        super(owner, "Set Genetic Parameters");
        Utils.initIcons(this);
        initComponents();
        getRootPane().setDefaultButton(ok_button);
        ensure_sequential_resolutions_jCheckBox.setSelected(ensureSequential);
        prevent_mid_polytomy_events_jCheckBox.setSelected(preventMidPolytomy);
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
        ensure_sequential_resolutions_jCheckBox = new javax.swing.JCheckBox();
        prevent_mid_polytomy_events_jCheckBox = new javax.swing.JCheckBox();

        setTitle("Set Genetic Parameters");
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

        ensure_sequential_resolutions_jCheckBox.setSelected(true);
        ensure_sequential_resolutions_jCheckBox.setText("Ensure Sequential Resolutions");

        prevent_mid_polytomy_events_jCheckBox.setSelected(true);
        prevent_mid_polytomy_events_jCheckBox.setText("Prevent Mid-Polytomy Events");

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(8, 8, 8)
                        .add(ok_button, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 63, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(45, 45, 45)
                        .add(cancel_button))
                    .add(prevent_mid_polytomy_events_jCheckBox)
                    .add(ensure_sequential_resolutions_jCheckBox))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(ensure_sequential_resolutions_jCheckBox)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(prevent_mid_polytomy_events_jCheckBox)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(ok_button, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .add(cancel_button))
                        .addContainerGap())
                    .add(layout.createSequentialGroup()
                        .add(97, 97, 97))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancel_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancel_buttonActionPerformed
        ensure_sequential_resolutions_jCheckBox.setSelected(ensureSequential);
        prevent_mid_polytomy_events_jCheckBox.setSelected(preventMidPolytomy);        
        this.setVisible(false);
    }//GEN-LAST:event_cancel_buttonActionPerformed

    private void ok_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ok_buttonActionPerformed
        if (!allow_editing) {
            this.setVisible(false);
            return;
        }
        changed = (ensureSequential != ensure_sequential_resolutions_jCheckBox.isSelected()) || (preventMidPolytomy != prevent_mid_polytomy_events_jCheckBox.isSelected());
        ensureSequential = ensure_sequential_resolutions_jCheckBox.isSelected();
        preventMidPolytomy = prevent_mid_polytomy_events_jCheckBox.isSelected();
        this.setVisible(false);
    }//GEN-LAST:event_ok_buttonActionPerformed

    public boolean wasChanged() {
        if (changed) {
            changed = false; // Reset for future changes
            return true;
        }
        return false;
    }
    
    public void openWithEditStatus(boolean val) {
        allow_editing = val;
        ensure_sequential_resolutions_jCheckBox.setEnabled(val);
        prevent_mid_polytomy_events_jCheckBox.setEnabled(val);
        cancel_button.setEnabled(val);
        this.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancel_button;
    public javax.swing.JCheckBox ensure_sequential_resolutions_jCheckBox;
    private javax.swing.JButton ok_button;
    public javax.swing.JCheckBox prevent_mid_polytomy_events_jCheckBox;
    // End of variables declaration//GEN-END:variables
}