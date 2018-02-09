package edu.hmc.jane.gui;

import edu.hmc.jane.CostTuple;
import edu.hmc.jane.ProblemInstance;
import javax.swing.JOptionPane;
import javax.swing.table.*;

/*
Copyright (c) 2009, Chris Conow, Daniel Fielder, Yaniv Ovidia, Ran Libeskind-Hadas
All rights reserved.

Redistribution and use in source and binary forms, with or without modification,
are permitted provided that the following conditions are met:

    * Redistributions of source code must retain the above copyright notice,
      this list of conditions and the following disclaimer.
    * Redistributions in binary form must reproduce the above copyright notice,
      this list of conditions and the following disclaimer in the documentation
      and/or other materials provided with the distribution.
    * Neither the name of the Harvey Mudd College nor the names of its
      contributors may be used to endorse or promote products derived from this
      software without specific prior written permission.

THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR
ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
(INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON
ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
(INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * EditCosts.java
 *
 * Created on Jul 27, 2009, 10:55:27 AM
 * Modified on June 18, 2012, 4:00:00 PM
 */

/**
 *
 * @author dfielder
 * @Modified by Ki Wan Gkoo
 */
public class EditCosts extends javax.swing.JDialog {

    public static final int[] DEFAULT_COSTS = new int[] {0, 1, 2, 1, 1, 1,
                                                         0, 1, 2, 1, 1, 1,
                                                         0, 1, 2, 1, 1, 1,
                                                         1, 1, 1, 1, 1, 1,
                                                         0, 0, 0, 0, 0, 0,
                                                         0};
    public static final boolean DEFAULT_COST_MODEL_STATE = true;

    public int[] costs = new int[31];
    private boolean allow_editing;

    public CostTuple tuple = new CostTuple();
    
    public int decimal_places = 0;

    javax.swing.JTextField[] textfield;
    javax.swing.JSpinner[] spinnerfield;
    
    String[] names = new String[] {"Cospeciation", "Duplication", "Host Switch & Duplication", "Loss", "Failure To Diverge", "Infestation",
                                   "Cospeciation Upper Bound", "Duplication Upper Bound", "Host Switch & Duplication Upper Bound", "Loss Upper Bound", "Failure To Diverge Upper Bound", "Infestation Upper Bound",
                                   "Cospeciation Lower Bound", "Duplication Lower Bound", "Host Switch & Duplication Lower Bound", "Loss Lower Bound", "Failure To Diverge Lower Bound", "Infestation Lower Bound",
                                   "Cospeciation Step Size", "Duplication Step Size", "Host Switch & Duplication Step Size", "Loss Step Size", "Failure To Diverge Step Size", "Infestation Step Size",
                                   "Cospeciation Number Of Steps", "Duplication Number Of Steps", "Host Switch & Duplication Number Of Steps", "Loss Number Of Steps", "Failure To Diverge Number Of Steps", "Infestation Number Of Steps"};
    
    /** Creates new form EditCosts */
    public EditCosts(javax.swing.JFrame owner) {
        Utils.initIcons(this);
        initComponents();
        getRootPane().setDefaultButton(ok_button);
        costs[0] = DEFAULT_COSTS[0];
        costs[1] = DEFAULT_COSTS[1];
        costs[2] = DEFAULT_COSTS[2];
        costs[3] = DEFAULT_COSTS[3];
        costs[4] = DEFAULT_COSTS[4];
        costs[5] = DEFAULT_COSTS[5];
        costs[6] = DEFAULT_COSTS[6];
        costs[7] = DEFAULT_COSTS[7];
        costs[8] = DEFAULT_COSTS[8];
        costs[9] = DEFAULT_COSTS[9];
        costs[10] = DEFAULT_COSTS[10];
        costs[11] = DEFAULT_COSTS[11];
        costs[12] = DEFAULT_COSTS[12];
        costs[13] = DEFAULT_COSTS[13];
        costs[14] = DEFAULT_COSTS[14];
        costs[15] = DEFAULT_COSTS[15];      
        costs[16] = DEFAULT_COSTS[16];      
        costs[17] = DEFAULT_COSTS[17];      
        costs[18] = DEFAULT_COSTS[18];      
        costs[19] = DEFAULT_COSTS[19];
        costs[20] = DEFAULT_COSTS[20];   
        costs[21] = DEFAULT_COSTS[21];
        costs[22] = DEFAULT_COSTS[22];
        costs[23] = DEFAULT_COSTS[23];
        costs[24] = DEFAULT_COSTS[24];
        costs[25] = DEFAULT_COSTS[25];
        costs[26] = DEFAULT_COSTS[26];
        costs[27] = DEFAULT_COSTS[27];
        costs[28] = DEFAULT_COSTS[28];
        costs[29] = DEFAULT_COSTS[29];
        costs[30] = DEFAULT_COSTS[30];
        
        spinnerfield = new javax.swing.JSpinner[30];
        
        textfield = new javax.swing.JTextField[30];
        

        textfield[0] = cospeciation_jTextField_SetCosts;
        textfield[1] = duplication_jTextField_SetCosts;
        textfield[2] = duplication_host_switch_jTextField_SetCosts;
        textfield[3] = loss_jTextField_SetCosts;
        textfield[4] = failure_to_diverge_jTextField_SetCosts;
        textfield[5] = infestation_jTextField_SetCosts;
        textfield[6] = cospeciation_upper_bound_jTextField;
        textfield[7] = duplication_upper_bound_jTextField;
        textfield[8] = duplication_host_switch_upper_bound_jTextField;
        textfield[9] = loss_upper_bound_jTextField;
        textfield[10] = failure_to_diverge_upper_bound_jTextField;
        textfield[11] = infestation_upper_bound_jTextField;
        textfield[12] = cospeciation_lower_bound_jTextField;
        textfield[13] = duplication_lower_bound_jTextField;
        textfield[14] = duplication_host_switch_lower_bound_jTextField;
        textfield[15] = loss_lower_bound_jTextField;
        textfield[16] = failure_to_diverge_lower_bound_jTextField;
        textfield[17] = infestation_lower_bound_jTextField;
        textfield[18] = cospeciation_step_jTextField;
        textfield[19] = duplication_step_jTextField;
        textfield[20] = duplication_host_switch_step_jTextField;
        textfield[21] = loss_step_jTextField;
        textfield[22] = failure_to_diverge_step_jTextField;
        textfield[23] = infestation_step_jTextField;
        textfield[24] = cospeciation_number_of_steps_jTextField;
        textfield[25] = duplication_number_of_steps_jTextField;
        textfield[26] = duplication_host_switch_number_of_steps_jTextField;
        textfield[27] = loss_number_of_steps_jTextField;
        textfield[28] = failure_to_diverge_number_of_steps_jTextField;
        textfield[29] = infestation_number_of_steps_jTextField;
       

        for (int i = 0; i < 30; i++) {
            textfield[i].setText(Integer.toString(costs[i]));
        }

        use_vertex_based_cost_model_button.setSelected(DEFAULT_COST_MODEL_STATE);
        allow_editing = true;
        
        // Making parts related to infestation invisible.
        infestation_label_setcosts.setVisible(false);
        infestation_jTextField_SetCosts.setVisible(false);
        infestation_label_rangecosts.setVisible(false);
        infestation_lower_bound_jTextField.setVisible(false);
        infestation_step_jTextField.setVisible(false);
        infestation_number_of_steps_jTextField.setVisible(false);
        infestation_upper_bound_jTextField.setVisible(false);
        this.setSize(565, 580);
        
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jSpinner1 = new javax.swing.JSpinner();
        jProgressBar1 = new javax.swing.JProgressBar();
        cancel_button = new javax.swing.JButton();
        ok_button = new javax.swing.JButton();
        default_button = new javax.swing.JButton();
        use_edge_based_cost_model_button = new javax.swing.JRadioButton();
        use_vertex_based_cost_model_button = new javax.swing.JRadioButton();
        tabs = new javax.swing.JTabbedPane();
        SetCosts_jPanel = new javax.swing.JPanel();
        duplication_label_setcosts = new javax.swing.JLabel();
        duplication_host_switch_label_setcosts = new javax.swing.JLabel();
        loss_label_setcosts = new javax.swing.JLabel();
        failure_to_diverge_label_setcosts = new javax.swing.JLabel();
        infestation_label_setcosts = new javax.swing.JLabel();
        cospeciation_label_setcosts = new javax.swing.JLabel();
        cospeciation_jTextField_SetCosts = new javax.swing.JTextField();
        duplication_jTextField_SetCosts = new javax.swing.JTextField();
        duplication_host_switch_jTextField_SetCosts = new javax.swing.JTextField();
        loss_jTextField_SetCosts = new javax.swing.JTextField();
        failure_to_diverge_jTextField_SetCosts = new javax.swing.JTextField();
        infestation_jTextField_SetCosts = new javax.swing.JTextField();
        RangeCosts_jPanel = new javax.swing.JPanel();
        cospeciation_label_rangecosts = new javax.swing.JLabel();
        duplication_label_rangecosts = new javax.swing.JLabel();
        duplication_host_switch_label_rangecosts = new javax.swing.JLabel();
        loss_label_rangecosts = new javax.swing.JLabel();
        failure_to_diverge_label_rangecosts = new javax.swing.JLabel();
        infestation_label_rangecosts = new javax.swing.JLabel();
        to_label = new javax.swing.JLabel();
        number_of_steps_label = new javax.swing.JLabel();
        step_label = new javax.swing.JLabel();
        from_label = new javax.swing.JLabel();
        cospeciation_lower_bound_jTextField = new javax.swing.JTextField();
        cospeciation_step_jTextField = new javax.swing.JTextField();
        cospeciation_upper_bound_jTextField = new javax.swing.JTextField();
        cospeciation_number_of_steps_jTextField = new javax.swing.JTextField();
        duplication_lower_bound_jTextField = new javax.swing.JTextField();
        duplication_step_jTextField = new javax.swing.JTextField();
        duplication_upper_bound_jTextField = new javax.swing.JTextField();
        duplication_number_of_steps_jTextField = new javax.swing.JTextField();
        duplication_host_switch_lower_bound_jTextField = new javax.swing.JTextField();
        duplication_host_switch_step_jTextField = new javax.swing.JTextField();
        duplication_host_switch_upper_bound_jTextField = new javax.swing.JTextField();
        duplication_host_switch_number_of_steps_jTextField = new javax.swing.JTextField();
        loss_lower_bound_jTextField = new javax.swing.JTextField();
        loss_step_jTextField = new javax.swing.JTextField();
        loss_upper_bound_jTextField = new javax.swing.JTextField();
        loss_number_of_steps_jTextField = new javax.swing.JTextField();
        failure_to_diverge_lower_bound_jTextField = new javax.swing.JTextField();
        failure_to_diverge_step_jTextField = new javax.swing.JTextField();
        failure_to_diverge_upper_bound_jTextField = new javax.swing.JTextField();
        failure_to_diverge_number_of_steps_jTextField = new javax.swing.JTextField();
        infestation_lower_bound_jTextField = new javax.swing.JTextField();
        infestation_step_jTextField = new javax.swing.JTextField();
        infestation_upper_bound_jTextField = new javax.swing.JTextField();
        infestation_number_of_steps_jTextField = new javax.swing.JTextField();
        region_costs_jPanel = new javax.swing.JPanel();
        region_costs_label = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        region_costs_table = new javax.swing.JTable();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Set Costs");
        setModal(true);
        setResizable(false);

        cancel_button.setText("Cancel");
        cancel_button.setPreferredSize(new java.awt.Dimension(90, 30));
        cancel_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancel_buttonActionPerformed(evt);
            }
        });

        ok_button.setText("OK");
        ok_button.setPreferredSize(new java.awt.Dimension(75, 30));
        ok_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ok_buttonActionPerformed(evt);
            }
        });

        default_button.setText("Default");
        default_button.setPreferredSize(new java.awt.Dimension(90, 30));
        default_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                default_buttonActionPerformed(evt);
            }
        });

        buttonGroup1.add(use_edge_based_cost_model_button);
        use_edge_based_cost_model_button.setText("Use Edge Based Cost Model");

        buttonGroup1.add(use_vertex_based_cost_model_button);
        use_vertex_based_cost_model_button.setText("Use Vertex Based Cost Model");

        tabs.setMinimumSize(new java.awt.Dimension(0, 0));
        tabs.setRequestFocusEnabled(false);
        tabs.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                tabsStateChanged(evt);
            }
        });

        duplication_label_setcosts.setText("Duplication");

        duplication_host_switch_label_setcosts.setText("Duplication & Host Switch");

        loss_label_setcosts.setText("Loss");

        failure_to_diverge_label_setcosts.setText("Failure To Diverge");

        infestation_label_setcosts.setText("Infestation");

        cospeciation_label_setcosts.setText("Cospeciation");

        cospeciation_jTextField_SetCosts.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        cospeciation_jTextField_SetCosts.setText("0");
        cospeciation_jTextField_SetCosts.setToolTipText("");

        duplication_jTextField_SetCosts.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        duplication_jTextField_SetCosts.setText("1");
        duplication_jTextField_SetCosts.setToolTipText("");

        duplication_host_switch_jTextField_SetCosts.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        duplication_host_switch_jTextField_SetCosts.setText("2");

        loss_jTextField_SetCosts.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        loss_jTextField_SetCosts.setText("1");

        failure_to_diverge_jTextField_SetCosts.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        failure_to_diverge_jTextField_SetCosts.setText("1");

        infestation_jTextField_SetCosts.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        infestation_jTextField_SetCosts.setText("1");

        org.jdesktop.layout.GroupLayout SetCosts_jPanelLayout = new org.jdesktop.layout.GroupLayout(SetCosts_jPanel);
        SetCosts_jPanel.setLayout(SetCosts_jPanelLayout);
        SetCosts_jPanelLayout.setHorizontalGroup(
            SetCosts_jPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(SetCosts_jPanelLayout.createSequentialGroup()
                .addContainerGap()
                .add(SetCosts_jPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(infestation_label_setcosts)
                    .add(loss_label_setcosts, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 111, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(failure_to_diverge_label_setcosts)
                    .add(duplication_label_setcosts)
                    .add(cospeciation_label_setcosts)
                    .add(duplication_host_switch_label_setcosts))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(SetCosts_jPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, cospeciation_jTextField_SetCosts)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, duplication_jTextField_SetCosts)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, loss_jTextField_SetCosts)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, duplication_host_switch_jTextField_SetCosts)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, failure_to_diverge_jTextField_SetCosts)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, infestation_jTextField_SetCosts, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 335, Short.MAX_VALUE))
                .add(17, 17, 17))
        );
        SetCosts_jPanelLayout.setVerticalGroup(
            SetCosts_jPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(SetCosts_jPanelLayout.createSequentialGroup()
                .add(40, 40, 40)
                .add(SetCosts_jPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(cospeciation_label_setcosts, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(cospeciation_jTextField_SetCosts, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(SetCosts_jPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(duplication_jTextField_SetCosts, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(duplication_label_setcosts))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(SetCosts_jPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(duplication_host_switch_jTextField_SetCosts, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(duplication_host_switch_label_setcosts))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(SetCosts_jPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(loss_jTextField_SetCosts, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(loss_label_setcosts))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(SetCosts_jPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(failure_to_diverge_jTextField_SetCosts, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(failure_to_diverge_label_setcosts))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(SetCosts_jPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(infestation_label_setcosts)
                    .add(infestation_jTextField_SetCosts, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        SetCosts_jPanelLayout.linkSize(new java.awt.Component[] {duplication_host_switch_label_setcosts, duplication_label_setcosts, failure_to_diverge_label_setcosts, infestation_label_setcosts, loss_label_setcosts}, org.jdesktop.layout.GroupLayout.VERTICAL);

        tabs.addTab("Set Costs", SetCosts_jPanel);

        cospeciation_label_rangecosts.setText("Cospeciation");

        duplication_label_rangecosts.setText("Duplication");

        duplication_host_switch_label_rangecosts.setText("Duplication & Host Switch");

        loss_label_rangecosts.setText("Loss");

        failure_to_diverge_label_rangecosts.setText("Failure To Diverge");

        infestation_label_rangecosts.setText("Infestation");

        to_label.setText("Upper Bound");

        number_of_steps_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        number_of_steps_label.setText("# Steps");

        step_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        step_label.setText("Step Size");
        step_label.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        from_label.setText("Lower Bound");

        cospeciation_lower_bound_jTextField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        cospeciation_lower_bound_jTextField.setText("0");
        cospeciation_lower_bound_jTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                cospeciation_lower_bound_jTextFieldFocusLost(evt);
            }
        });

        cospeciation_step_jTextField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        cospeciation_step_jTextField.setText("1");
        cospeciation_step_jTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                cospeciation_step_jTextFieldFocusLost(evt);
            }
        });

        cospeciation_upper_bound_jTextField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        cospeciation_upper_bound_jTextField.setText("0");
        cospeciation_upper_bound_jTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                cospeciation_upper_bound_jTextFieldFocusLost(evt);
            }
        });

        cospeciation_number_of_steps_jTextField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        cospeciation_number_of_steps_jTextField.setText("0");
        cospeciation_number_of_steps_jTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                cospeciation_number_of_steps_jTextFieldFocusLost(evt);
            }
        });

        duplication_lower_bound_jTextField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        duplication_lower_bound_jTextField.setText("1");
        duplication_lower_bound_jTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                duplication_lower_bound_jTextFieldFocusLost(evt);
            }
        });

        duplication_step_jTextField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        duplication_step_jTextField.setText("1");
        duplication_step_jTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                duplication_step_jTextFieldFocusLost(evt);
            }
        });

        duplication_upper_bound_jTextField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        duplication_upper_bound_jTextField.setText("1");
        duplication_upper_bound_jTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                duplication_upper_bound_jTextFieldFocusLost(evt);
            }
        });

        duplication_number_of_steps_jTextField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        duplication_number_of_steps_jTextField.setText("0");
        duplication_number_of_steps_jTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                duplication_number_of_steps_jTextFieldFocusLost(evt);
            }
        });

        duplication_host_switch_lower_bound_jTextField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        duplication_host_switch_lower_bound_jTextField.setText("2");
        duplication_host_switch_lower_bound_jTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                duplication_host_switch_lower_bound_jTextFieldFocusLost(evt);
            }
        });

        duplication_host_switch_step_jTextField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        duplication_host_switch_step_jTextField.setText("1");
        duplication_host_switch_step_jTextField.setToolTipText("");
        duplication_host_switch_step_jTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                duplication_host_switch_step_jTextFieldFocusLost(evt);
            }
        });

        duplication_host_switch_upper_bound_jTextField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        duplication_host_switch_upper_bound_jTextField.setText("2");
        duplication_host_switch_upper_bound_jTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                duplication_host_switch_upper_bound_jTextFieldFocusLost(evt);
            }
        });

        duplication_host_switch_number_of_steps_jTextField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        duplication_host_switch_number_of_steps_jTextField.setText("0");
        duplication_host_switch_number_of_steps_jTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                duplication_host_switch_number_of_steps_jTextFieldFocusLost(evt);
            }
        });

        loss_lower_bound_jTextField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        loss_lower_bound_jTextField.setText("1");
        loss_lower_bound_jTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                loss_lower_bound_jTextFieldFocusLost(evt);
            }
        });

        loss_step_jTextField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        loss_step_jTextField.setText("1");
        loss_step_jTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                loss_step_jTextFieldFocusLost(evt);
            }
        });

        loss_upper_bound_jTextField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        loss_upper_bound_jTextField.setText("1");
        loss_upper_bound_jTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                loss_upper_bound_jTextFieldFocusLost(evt);
            }
        });

        loss_number_of_steps_jTextField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        loss_number_of_steps_jTextField.setText("0");
        loss_number_of_steps_jTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                loss_number_of_steps_jTextFieldFocusLost(evt);
            }
        });

        failure_to_diverge_lower_bound_jTextField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        failure_to_diverge_lower_bound_jTextField.setText("1");
        failure_to_diverge_lower_bound_jTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                failure_to_diverge_lower_bound_jTextFieldFocusLost(evt);
            }
        });

        failure_to_diverge_step_jTextField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        failure_to_diverge_step_jTextField.setText("1");
        failure_to_diverge_step_jTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                failure_to_diverge_step_jTextFieldFocusLost(evt);
            }
        });

        failure_to_diverge_upper_bound_jTextField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        failure_to_diverge_upper_bound_jTextField.setText("1");
        failure_to_diverge_upper_bound_jTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                failure_to_diverge_upper_bound_jTextFieldFocusLost(evt);
            }
        });

        failure_to_diverge_number_of_steps_jTextField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        failure_to_diverge_number_of_steps_jTextField.setText("0");
        failure_to_diverge_number_of_steps_jTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                failure_to_diverge_number_of_steps_jTextFieldFocusLost(evt);
            }
        });

        infestation_lower_bound_jTextField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        infestation_lower_bound_jTextField.setText("1");

        infestation_step_jTextField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        infestation_step_jTextField.setText("1");

        infestation_upper_bound_jTextField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        infestation_upper_bound_jTextField.setText("1");

        infestation_number_of_steps_jTextField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        infestation_number_of_steps_jTextField.setText("0");

        org.jdesktop.layout.GroupLayout RangeCosts_jPanelLayout = new org.jdesktop.layout.GroupLayout(RangeCosts_jPanel);
        RangeCosts_jPanel.setLayout(RangeCosts_jPanelLayout);
        RangeCosts_jPanelLayout.setHorizontalGroup(
            RangeCosts_jPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(RangeCosts_jPanelLayout.createSequentialGroup()
                .addContainerGap()
                .add(RangeCosts_jPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(loss_label_rangecosts, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 93, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(duplication_host_switch_label_rangecosts)
                    .add(duplication_label_rangecosts)
                    .add(cospeciation_label_rangecosts)
                    .add(infestation_label_rangecosts)
                    .add(failure_to_diverge_label_rangecosts))
                .add(RangeCosts_jPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, RangeCosts_jPanelLayout.createSequentialGroup()
                        .add(16, 16, 16)
                        .add(duplication_host_switch_lower_bound_jTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 70, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(RangeCosts_jPanelLayout.createSequentialGroup()
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(RangeCosts_jPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(RangeCosts_jPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                .add(from_label, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 80, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(org.jdesktop.layout.GroupLayout.TRAILING, cospeciation_lower_bound_jTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 70, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(org.jdesktop.layout.GroupLayout.TRAILING, loss_lower_bound_jTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 70, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(org.jdesktop.layout.GroupLayout.TRAILING, failure_to_diverge_lower_bound_jTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 70, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(org.jdesktop.layout.GroupLayout.TRAILING, infestation_lower_bound_jTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 70, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, duplication_lower_bound_jTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 70, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(RangeCosts_jPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(infestation_step_jTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 70, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(failure_to_diverge_step_jTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 70, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(loss_step_jTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 70, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(step_label, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 80, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(cospeciation_step_jTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 70, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(duplication_step_jTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 70, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(duplication_host_switch_step_jTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 70, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(RangeCosts_jPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(to_label, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 80, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, cospeciation_upper_bound_jTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 70, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, duplication_upper_bound_jTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 70, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, duplication_host_switch_upper_bound_jTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 70, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, loss_upper_bound_jTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 70, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, failure_to_diverge_upper_bound_jTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 70, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, infestation_upper_bound_jTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 70, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(RangeCosts_jPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(RangeCosts_jPanelLayout.createSequentialGroup()
                        .add(RangeCosts_jPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(RangeCosts_jPanelLayout.createSequentialGroup()
                                .add(18, 18, 18)
                                .add(RangeCosts_jPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(duplication_host_switch_number_of_steps_jTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 70, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(loss_number_of_steps_jTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 70, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(failure_to_diverge_number_of_steps_jTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 70, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(infestation_number_of_steps_jTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 70, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                            .add(RangeCosts_jPanelLayout.createSequentialGroup()
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(number_of_steps_label, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 80, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                        .add(0, 0, Short.MAX_VALUE))
                    .add(RangeCosts_jPanelLayout.createSequentialGroup()
                        .add(18, 18, 18)
                        .add(RangeCosts_jPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(duplication_number_of_steps_jTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 70, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(cospeciation_number_of_steps_jTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 70, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(12, Short.MAX_VALUE))))
        );
        RangeCosts_jPanelLayout.setVerticalGroup(
            RangeCosts_jPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(RangeCosts_jPanelLayout.createSequentialGroup()
                .add(14, 14, 14)
                .add(RangeCosts_jPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(RangeCosts_jPanelLayout.createSequentialGroup()
                        .add(28, 28, 28)
                        .add(RangeCosts_jPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(cospeciation_lower_bound_jTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(cospeciation_step_jTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(cospeciation_upper_bound_jTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(cospeciation_number_of_steps_jTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .add(57, 57, 57)
                        .add(RangeCosts_jPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(duplication_host_switch_lower_bound_jTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(duplication_host_switch_step_jTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(duplication_host_switch_upper_bound_jTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(duplication_host_switch_number_of_steps_jTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                    .add(RangeCosts_jPanelLayout.createSequentialGroup()
                        .add(RangeCosts_jPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(RangeCosts_jPanelLayout.createSequentialGroup()
                                .add(RangeCosts_jPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                                    .add(from_label)
                                    .add(step_label)
                                    .add(to_label)
                                    .add(number_of_steps_label))
                                .add(55, 55, 55)
                                .add(RangeCosts_jPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                                    .add(duplication_lower_bound_jTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(duplication_step_jTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(duplication_upper_bound_jTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(duplication_number_of_steps_jTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                            .add(RangeCosts_jPanelLayout.createSequentialGroup()
                                .add(RangeCosts_jPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(RangeCosts_jPanelLayout.createSequentialGroup()
                                        .add(114, 114, 114)
                                        .add(duplication_host_switch_label_rangecosts))
                                    .add(RangeCosts_jPanelLayout.createSequentialGroup()
                                        .add(28, 28, 28)
                                        .add(cospeciation_label_rangecosts, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 31, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                                        .add(duplication_label_rangecosts, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 31, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                                .add(RangeCosts_jPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                                    .add(loss_label_rangecosts, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 25, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(loss_lower_bound_jTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(loss_step_jTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(loss_upper_bound_jTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(loss_number_of_steps_jTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                                .add(RangeCosts_jPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                                    .add(failure_to_diverge_label_rangecosts, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 24, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(failure_to_diverge_lower_bound_jTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(failure_to_diverge_step_jTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(failure_to_diverge_upper_bound_jTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(failure_to_diverge_number_of_steps_jTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(RangeCosts_jPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                                    .add(infestation_label_rangecosts)
                                    .add(infestation_lower_bound_jTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(infestation_step_jTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(infestation_upper_bound_jTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(infestation_number_of_steps_jTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))))))
                .add(44, 44, 44))
        );

        RangeCosts_jPanelLayout.linkSize(new java.awt.Component[] {cospeciation_label_rangecosts, duplication_host_switch_label_rangecosts, duplication_label_rangecosts, failure_to_diverge_label_rangecosts, infestation_label_rangecosts}, org.jdesktop.layout.GroupLayout.VERTICAL);

        RangeCosts_jPanelLayout.linkSize(new java.awt.Component[] {from_label, number_of_steps_label, step_label, to_label}, org.jdesktop.layout.GroupLayout.VERTICAL);

        tabs.addTab("Range Costs", RangeCosts_jPanel);

        region_costs_label.setText("Region Costs");

        region_costs_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Host Node 1", "Host Node 2", "Cost"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        region_costs_table.setRowSelectionAllowed(false);
        region_costs_table.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(region_costs_table);
        if (region_costs_table.getColumnModel().getColumnCount() > 0) {
            region_costs_table.getColumnModel().getColumn(0).setResizable(false);
            region_costs_table.getColumnModel().getColumn(1).setResizable(false);
            region_costs_table.getColumnModel().getColumn(2).setResizable(false);
        }

        org.jdesktop.layout.GroupLayout region_costs_jPanelLayout = new org.jdesktop.layout.GroupLayout(region_costs_jPanel);
        region_costs_jPanel.setLayout(region_costs_jPanelLayout);
        region_costs_jPanelLayout.setHorizontalGroup(
            region_costs_jPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(region_costs_jPanelLayout.createSequentialGroup()
                .addContainerGap()
                .add(region_costs_jPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(region_costs_label)
                    .add(jScrollPane2))
                .addContainerGap())
        );
        region_costs_jPanelLayout.setVerticalGroup(
            region_costs_jPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(region_costs_jPanelLayout.createSequentialGroup()
                .addContainerGap()
                .add(region_costs_label)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jScrollPane2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE))
        );

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(tabs, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(default_button, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 132, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(ok_button, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(cancel_button, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 110, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .add(layout.createSequentialGroup()
                        .add(region_costs_jPanel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                        .add(0, 138, Short.MAX_VALUE)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(use_edge_based_cost_model_button)
                            .add(use_vertex_based_cost_model_button))
                        .add(192, 192, 192))))
        );

        layout.linkSize(new java.awt.Component[] {cancel_button, default_button}, org.jdesktop.layout.GroupLayout.HORIZONTAL);

        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(tabs, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 324, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(region_costs_jPanel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(use_vertex_based_cost_model_button)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(use_edge_based_cost_model_button)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(cancel_button, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(ok_button, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(default_button, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public int[] getCosts() {
        return costs;
    }
    
    private int findDecimal(String str) {
        int dotIndex = 0;
        int decimalPoints = 0;
        for (int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            if (c == '.') {
                dotIndex = i;
            } else if (dotIndex != 0) {
                decimalPoints += 1;
            }
        } 
        return decimalPoints;
    }
    
    private int stringParser(String str, int decimalPoints) {
        if (decimalPoints != 0) {
            int dotIndex = str.length() - decimalPoints - 1;
            StringBuilder sb = new StringBuilder(str);
            sb.deleteCharAt(dotIndex);
            str = sb.toString();
        }
        return Integer.parseInt(str);
    }
    
    public String addDecimal(int cost, int scale) {
        String strCost = Integer.toString(cost);
        StringBuilder sb = new StringBuilder(strCost);
        int decLocation = strCost.length() - scale;
        if (scale != 0) {
            while (sb.length() - scale <= 0) {
                sb.insert(0, "0");
                decLocation = 1;
            }
            sb.insert(decLocation, ".");
        }
        return sb.toString();   
    }
    
    

    private void ok_buttonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_ok_buttonActionPerformed
    {//GEN-HEADEREND:event_ok_buttonActionPerformed
        if (!allow_editing) {
            this.setVisible(false);
            return;
        }
        
        for (int i = 0; i < 30; ++i) {
            if (textfield[i].getText() == null) {
                JOptionPane.showMessageDialog(this, "The value for " + names[i] + " appears to be empty.", "Invalid Data", javax.swing.JOptionPane.ERROR_MESSAGE);
                return;
            } 
            try {
               Double.parseDouble(textfield[i].getText());
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "The value for " + names[i] + " does not appear to be a number.", "Invalid Data", javax.swing.JOptionPane.ERROR_MESSAGE);
                return;
            }
        }
        
         if((Double.parseDouble(textfield[1].getText())) > (Double.parseDouble(textfield[2].getText()))){
             JOptionPane.showMessageDialog(this, "The value for Duplication cannot be greater than Duplication & Host Switch.", "Invalid Cost", javax.swing.JOptionPane.ERROR_MESSAGE);
                return;
        }   

        // Hold on to the older cost values in case a new one is out of range.
        int[] newCosts = new int[30];

        // Scale up values
        for (int i = 0; i < 24; ++i) {
            String cost_str = textfield[i].getText();
            int cost_dec = findDecimal(cost_str);

            if (cost_dec > decimal_places) {
                decimal_places = cost_dec;
            }
            int tempCost = stringParser(cost_str, cost_dec);
            newCosts[i] = tempCost * ((int) Math.pow(10, (decimal_places - cost_dec)));
           
        }
        
        // Don't scale up number of steps
        for (int i = 24; i < 30; ++i) {
            String cost_str = textfield[i].getText();
            int cost_dec = findDecimal(cost_str);
            newCosts[i] = stringParser(cost_str, cost_dec);
        }
        
        
        for (int i = 0; i < 30; i++) {
            //fail if costs are so big that total cost might exceed infinity
            if (Math.abs(newCosts[i]) > 99999) {
                JOptionPane.showMessageDialog(this, "Event costs above 99999 or below -99999 are not allowed.");
                return;
            }
        }
        
        tuple.setDecimalPlaces(decimal_places);
        
             
        // Update costs
        for (int i = 0; i < 30; ++i) {
            costs[i] = newCosts[i];
        }

        this.setVisible(false);
    }//GEN-LAST:event_ok_buttonActionPerformed

    private void cancel_buttonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_cancel_buttonActionPerformed
    {//GEN-HEADEREND:event_cancel_buttonActionPerformed
        for (int i = 0; i < 30; ++i)
            textfield[i].setText(Integer.toString(costs[i]));

        use_vertex_based_cost_model_button.setSelected(tuple.isTarzan());
        tabs.setSelectedIndex(0);
        this.setVisible(false);
    }//GEN-LAST:event_cancel_buttonActionPerformed

    private void default_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_default_buttonActionPerformed
        if (allow_editing) {
            
            for(int i = 0; i < 30; ++i)
                textfield[i].setText(Integer.toString(DEFAULT_COSTS[i]));
            use_vertex_based_cost_model_button.setSelected(DEFAULT_COST_MODEL_STATE);
        }
    }//GEN-LAST:event_default_buttonActionPerformed

    private int[] findDiff(String lower, String upper) {
        
        int scale;
        int lower_scale = findDecimal(lower);
        int upper_scale = findDecimal(upper);
        
        int lower_num = stringParser(lower, lower_scale);
        int upper_num = stringParser(upper, upper_scale);
        
        if (lower_scale > upper_scale) {
            upper_num *= Math.pow(10, lower_scale - upper_scale);
            scale = lower_scale;
        } else {
            lower_num *= Math.pow(10, upper_scale - lower_scale);
            scale = upper_scale;
        }
        
        int diff = upper_num - lower_num;
        return new int[]{scale, diff};             
    }
    
    private String findUpperBound(String lower, String step, String num_of_steps) {
        int scale;
       
        
        int lower_scale = findDecimal(lower);
        int step_scale = findDecimal(step);

        int lower_num = stringParser(lower, lower_scale);
        int step_num = stringParser(step, step_scale);
        int num_of_steps_num = stringParser(num_of_steps, 0);
        
        if (lower_scale > step_scale) {
            step_num *= Math.pow(10, lower_scale - step_scale);
            scale = lower_scale;
        } else {
            lower_num *= Math.pow(10, step_scale - lower_scale);
            scale = step_scale;
        }
        int upper = lower_num + (step_num * num_of_steps_num);
        return addDecimal(upper, scale);
    }
    
    
    private void tabsStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_tabsStateChanged
        if (tabs.getSelectedIndex() == 0)
            costs[30] = 0;
        else
            costs[30] = 1;
    }//GEN-LAST:event_tabsStateChanged

    private void cospeciation_upper_bound_jTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cospeciation_upper_bound_jTextFieldFocusLost
        try {
            int[] values = findDiff(cospeciation_lower_bound_jTextField.getText(), cospeciation_upper_bound_jTextField.getText());
            int diff = values[1];
            int scale = values[0];
            cospeciation_number_of_steps_jTextField.setText(Integer.toString(diff));
            cospeciation_step_jTextField.setText(addDecimal(1, scale));
        } catch (NumberFormatException e) {

        }
    }//GEN-LAST:event_cospeciation_upper_bound_jTextFieldFocusLost

    private void cospeciation_lower_bound_jTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cospeciation_lower_bound_jTextFieldFocusLost
        try {
            cospeciation_upper_bound_jTextField.setText(
                    findUpperBound(cospeciation_lower_bound_jTextField.getText(), cospeciation_step_jTextField.getText(), cospeciation_number_of_steps_jTextField.getText()));
        } catch (NumberFormatException e) {
        }
    }//GEN-LAST:event_cospeciation_lower_bound_jTextFieldFocusLost

    private void cospeciation_number_of_steps_jTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cospeciation_number_of_steps_jTextFieldFocusLost
        try {
            cospeciation_upper_bound_jTextField.setText(
                    findUpperBound(cospeciation_lower_bound_jTextField.getText(), cospeciation_step_jTextField.getText(), cospeciation_number_of_steps_jTextField.getText()));
        } catch (NumberFormatException e) {
        }
    }//GEN-LAST:event_cospeciation_number_of_steps_jTextFieldFocusLost

    private void cospeciation_step_jTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cospeciation_step_jTextFieldFocusLost
        try {
            cospeciation_upper_bound_jTextField.setText(
                    findUpperBound(cospeciation_lower_bound_jTextField.getText(), cospeciation_step_jTextField.getText(), cospeciation_number_of_steps_jTextField.getText()));
        } catch (NumberFormatException e) {
        }
    }//GEN-LAST:event_cospeciation_step_jTextFieldFocusLost

    private void duplication_lower_bound_jTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_duplication_lower_bound_jTextFieldFocusLost
        try {
            duplication_upper_bound_jTextField.setText(
                    findUpperBound(duplication_lower_bound_jTextField.getText(), duplication_step_jTextField.getText(), duplication_number_of_steps_jTextField.getText()));
        } catch (NumberFormatException e) {
        }
        
    }//GEN-LAST:event_duplication_lower_bound_jTextFieldFocusLost

    private void duplication_step_jTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_duplication_step_jTextFieldFocusLost
        try {
            duplication_upper_bound_jTextField.setText(
                    findUpperBound(duplication_lower_bound_jTextField.getText(), duplication_step_jTextField.getText(), duplication_number_of_steps_jTextField.getText()));
        } catch (NumberFormatException e) {
        }
    }//GEN-LAST:event_duplication_step_jTextFieldFocusLost

    private void duplication_upper_bound_jTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_duplication_upper_bound_jTextFieldFocusLost
        
        try {
            int[] values = findDiff(duplication_lower_bound_jTextField.getText(), duplication_upper_bound_jTextField.getText());
            int diff = values[1];
            int scale = values[0];
            duplication_number_of_steps_jTextField.setText(Integer.toString(diff));
            duplication_step_jTextField.setText(addDecimal(1, scale));
        } catch (NumberFormatException e) {
        }
    }//GEN-LAST:event_duplication_upper_bound_jTextFieldFocusLost

    private void duplication_number_of_steps_jTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_duplication_number_of_steps_jTextFieldFocusLost
        try {
            duplication_upper_bound_jTextField.setText(
                    findUpperBound(duplication_lower_bound_jTextField.getText(), duplication_step_jTextField.getText(), duplication_number_of_steps_jTextField.getText()));
        } catch (NumberFormatException e) {
        }
    }//GEN-LAST:event_duplication_number_of_steps_jTextFieldFocusLost

    private void duplication_host_switch_lower_bound_jTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_duplication_host_switch_lower_bound_jTextFieldFocusLost
        try {
            duplication_host_switch_upper_bound_jTextField.setText(
                    findUpperBound(duplication_host_switch_lower_bound_jTextField.getText(), duplication_host_switch_step_jTextField.getText(), duplication_host_switch_number_of_steps_jTextField.getText()));
        } catch (NumberFormatException e) {
        }
        
    }//GEN-LAST:event_duplication_host_switch_lower_bound_jTextFieldFocusLost

    private void duplication_host_switch_step_jTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_duplication_host_switch_step_jTextFieldFocusLost
        try {
            duplication_host_switch_upper_bound_jTextField.setText(
                    findUpperBound(duplication_host_switch_lower_bound_jTextField.getText(), duplication_host_switch_step_jTextField.getText(), duplication_host_switch_number_of_steps_jTextField.getText()));
        } catch (NumberFormatException e) {
        }
    }//GEN-LAST:event_duplication_host_switch_step_jTextFieldFocusLost

    private void duplication_host_switch_upper_bound_jTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_duplication_host_switch_upper_bound_jTextFieldFocusLost
        try {
            int[] values = findDiff(duplication_host_switch_lower_bound_jTextField.getText(), duplication_host_switch_upper_bound_jTextField.getText());
            int diff = values[1];
            int scale = values[0];
            duplication_host_switch_number_of_steps_jTextField.setText(Integer.toString(diff));
            duplication_host_switch_step_jTextField.setText(addDecimal(1, scale));
        } catch (NumberFormatException e) {
        }
    }//GEN-LAST:event_duplication_host_switch_upper_bound_jTextFieldFocusLost

    private void duplication_host_switch_number_of_steps_jTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_duplication_host_switch_number_of_steps_jTextFieldFocusLost
        try {
            duplication_host_switch_upper_bound_jTextField.setText(
                    findUpperBound(duplication_host_switch_lower_bound_jTextField.getText(), duplication_host_switch_step_jTextField.getText(), duplication_host_switch_number_of_steps_jTextField.getText()));
        } catch (NumberFormatException e) {
        }
    }//GEN-LAST:event_duplication_host_switch_number_of_steps_jTextFieldFocusLost

    private void loss_lower_bound_jTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_loss_lower_bound_jTextFieldFocusLost
        try {
            loss_upper_bound_jTextField.setText(
                    findUpperBound(loss_lower_bound_jTextField.getText(), loss_step_jTextField.getText(), loss_number_of_steps_jTextField.getText()));
        } catch (NumberFormatException e) {
        }
    }//GEN-LAST:event_loss_lower_bound_jTextFieldFocusLost

    private void loss_step_jTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_loss_step_jTextFieldFocusLost
        try {
            loss_upper_bound_jTextField.setText(
                    findUpperBound(loss_lower_bound_jTextField.getText(), loss_step_jTextField.getText(), loss_number_of_steps_jTextField.getText()));
        } catch (NumberFormatException e) {
        }
    }//GEN-LAST:event_loss_step_jTextFieldFocusLost

    private void loss_upper_bound_jTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_loss_upper_bound_jTextFieldFocusLost
        try {
            int[] values = findDiff(loss_lower_bound_jTextField.getText(), loss_upper_bound_jTextField.getText());
            int diff = values[1];
            int scale = values[0];
            loss_number_of_steps_jTextField.setText(Integer.toString(diff));
            loss_step_jTextField.setText(addDecimal(1, scale));
        } catch (NumberFormatException e) {
        }
    }//GEN-LAST:event_loss_upper_bound_jTextFieldFocusLost

    private void loss_number_of_steps_jTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_loss_number_of_steps_jTextFieldFocusLost
        try {
            loss_upper_bound_jTextField.setText(
                    findUpperBound(loss_lower_bound_jTextField.getText(), loss_step_jTextField.getText(), loss_number_of_steps_jTextField.getText()));
        } catch (NumberFormatException e) {
        }
    }//GEN-LAST:event_loss_number_of_steps_jTextFieldFocusLost

    private void failure_to_diverge_lower_bound_jTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_failure_to_diverge_lower_bound_jTextFieldFocusLost
        try {
            failure_to_diverge_upper_bound_jTextField.setText(
                    findUpperBound(failure_to_diverge_lower_bound_jTextField.getText(), failure_to_diverge_step_jTextField.getText(), failure_to_diverge_number_of_steps_jTextField.getText()));
        } catch (NumberFormatException e) {
        }
    }//GEN-LAST:event_failure_to_diverge_lower_bound_jTextFieldFocusLost

    private void failure_to_diverge_step_jTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_failure_to_diverge_step_jTextFieldFocusLost
        try {
            failure_to_diverge_upper_bound_jTextField.setText(
                    findUpperBound(failure_to_diverge_lower_bound_jTextField.getText(), failure_to_diverge_step_jTextField.getText(), failure_to_diverge_number_of_steps_jTextField.getText()));
        } catch (NumberFormatException e) {
        }
    }//GEN-LAST:event_failure_to_diverge_step_jTextFieldFocusLost

    private void failure_to_diverge_upper_bound_jTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_failure_to_diverge_upper_bound_jTextFieldFocusLost
        try {
            int[] values = findDiff(failure_to_diverge_lower_bound_jTextField.getText(), failure_to_diverge_upper_bound_jTextField.getText());
            int diff = values[1];
            int scale = values[0];
            failure_to_diverge_number_of_steps_jTextField.setText(Integer.toString(diff));
            failure_to_diverge_step_jTextField.setText(addDecimal(1, scale));
        } catch (NumberFormatException e) {
        }
    }//GEN-LAST:event_failure_to_diverge_upper_bound_jTextFieldFocusLost

    private void failure_to_diverge_number_of_steps_jTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_failure_to_diverge_number_of_steps_jTextFieldFocusLost
        try {
            failure_to_diverge_upper_bound_jTextField.setText(
                    findUpperBound(failure_to_diverge_lower_bound_jTextField.getText(), failure_to_diverge_step_jTextField.getText(), failure_to_diverge_number_of_steps_jTextField.getText()));
        } catch (NumberFormatException e) {
        }
    }//GEN-LAST:event_failure_to_diverge_number_of_steps_jTextFieldFocusLost

    
    public void openWithEditStatus(boolean fileLoaded, boolean val, boolean hostSwitch, boolean infestation, boolean failureToDiverge, ProblemInstance prob) {
        allow_editing = val;
        for (int i = 0; i < 30; ++i)
            textfield[i].setEnabled(val);
            
        if (!hostSwitch) {
            textfield[2].setEnabled(false);
            textfield[8].setEnabled(false);
            textfield[14].setEnabled(false);
            textfield[20].setEnabled(false);
            textfield[26].setEnabled(false);
        }
        if (!failureToDiverge) {
            textfield[4].setEnabled(false);
            textfield[10].setEnabled(false);
            textfield[16].setEnabled(false);
            textfield[22].setEnabled(false);
            textfield[28].setEnabled(false);
        }
        if (!infestation) {
            textfield[5].setEnabled(false);
            textfield[11].setEnabled(false);
            textfield[17].setEnabled(false);
            textfield[23].setEnabled(false);
            textfield[29].setEnabled(false);
            
        }
        use_vertex_based_cost_model_button.setEnabled(val);
        use_edge_based_cost_model_button.setEnabled(val);
        default_button.setEnabled(val);
        cancel_button.setEnabled(val);
        tabs.setEnabled(val);
        
        String data[][] = {};
        String col[] = {"Host Node 1", "Host Node 2", "Cost"};
        DefaultTableModel model = new DefaultTableModel(data, col);
        if (fileLoaded && prob.hasRegions()) {
            while(model.getRowCount() > 0) {
                model.removeRow(model.getRowCount());
            }
            int z = 0;
            for (int i = 0; i < prob.hostRegions.numRegions+1; i++) {
                for (int j = 0; j < prob.hostRegions.numRegions+1; j++) {
                    if (prob.hostRegions.getSwitchCost()[i][j] != 0) {
                    model.insertRow(z, new Object[]{i, j, prob.hostRegions.getSwitchCost()[i][j]});
                    z++;
                    }
                }
            }
            region_costs_table.setModel(model);
            region_costs_table.repaint();
        } else {
            while(model.getRowCount() > 0) {
                model.removeRow(model.getRowCount());
            }
            region_costs_table.setModel(model);
            region_costs_table.repaint();
        }
        region_costs_jPanel.setEnabled(val);
        region_costs_table.setEnabled(val);
        this.setVisible(true);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel RangeCosts_jPanel;
    private javax.swing.JPanel SetCosts_jPanel;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton cancel_button;
    private javax.swing.JTextField cospeciation_jTextField_SetCosts;
    private javax.swing.JLabel cospeciation_label_rangecosts;
    private javax.swing.JLabel cospeciation_label_setcosts;
    private javax.swing.JTextField cospeciation_lower_bound_jTextField;
    private javax.swing.JTextField cospeciation_number_of_steps_jTextField;
    private javax.swing.JTextField cospeciation_step_jTextField;
    private javax.swing.JTextField cospeciation_upper_bound_jTextField;
    private javax.swing.JButton default_button;
    private javax.swing.JTextField duplication_host_switch_jTextField_SetCosts;
    private javax.swing.JLabel duplication_host_switch_label_rangecosts;
    private javax.swing.JLabel duplication_host_switch_label_setcosts;
    private javax.swing.JTextField duplication_host_switch_lower_bound_jTextField;
    private javax.swing.JTextField duplication_host_switch_number_of_steps_jTextField;
    private javax.swing.JTextField duplication_host_switch_step_jTextField;
    private javax.swing.JTextField duplication_host_switch_upper_bound_jTextField;
    private javax.swing.JTextField duplication_jTextField_SetCosts;
    private javax.swing.JLabel duplication_label_rangecosts;
    private javax.swing.JLabel duplication_label_setcosts;
    private javax.swing.JTextField duplication_lower_bound_jTextField;
    private javax.swing.JTextField duplication_number_of_steps_jTextField;
    private javax.swing.JTextField duplication_step_jTextField;
    private javax.swing.JTextField duplication_upper_bound_jTextField;
    private javax.swing.JTextField failure_to_diverge_jTextField_SetCosts;
    private javax.swing.JLabel failure_to_diverge_label_rangecosts;
    private javax.swing.JLabel failure_to_diverge_label_setcosts;
    private javax.swing.JTextField failure_to_diverge_lower_bound_jTextField;
    private javax.swing.JTextField failure_to_diverge_number_of_steps_jTextField;
    private javax.swing.JTextField failure_to_diverge_step_jTextField;
    private javax.swing.JTextField failure_to_diverge_upper_bound_jTextField;
    private javax.swing.JLabel from_label;
    private javax.swing.JTextField infestation_jTextField_SetCosts;
    private javax.swing.JLabel infestation_label_rangecosts;
    private javax.swing.JLabel infestation_label_setcosts;
    private javax.swing.JTextField infestation_lower_bound_jTextField;
    private javax.swing.JTextField infestation_number_of_steps_jTextField;
    private javax.swing.JTextField infestation_step_jTextField;
    private javax.swing.JTextField infestation_upper_bound_jTextField;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField loss_jTextField_SetCosts;
    private javax.swing.JLabel loss_label_rangecosts;
    private javax.swing.JLabel loss_label_setcosts;
    private javax.swing.JTextField loss_lower_bound_jTextField;
    private javax.swing.JTextField loss_number_of_steps_jTextField;
    private javax.swing.JTextField loss_step_jTextField;
    private javax.swing.JTextField loss_upper_bound_jTextField;
    private javax.swing.JLabel number_of_steps_label;
    private javax.swing.JButton ok_button;
    private javax.swing.JPanel region_costs_jPanel;
    private javax.swing.JLabel region_costs_label;
    private javax.swing.JTable region_costs_table;
    private javax.swing.JLabel step_label;
    private javax.swing.JTabbedPane tabs;
    private javax.swing.JLabel to_label;
    private javax.swing.JRadioButton use_edge_based_cost_model_button;
    private javax.swing.JRadioButton use_vertex_based_cost_model_button;
    // End of variables declaration//GEN-END:variables
}
