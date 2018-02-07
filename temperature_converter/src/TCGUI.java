/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kenji
 */
public class TCGUI extends javax.swing.JFrame {

	/**
	 * Creates new form TCGUI
	 */
	public TCGUI() {
		initComponents();
		FisPressed = true;
	}

	/**
	 * This method is called from within the constructor to initialize the
	 * form. WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                setterGroup = new javax.swing.ButtonGroup();
                TempTextField = new javax.swing.JTextField();
                RezultLabel = new javax.swing.JLabel();
                ConvertButton = new javax.swing.JButton();
                setC = new javax.swing.JRadioButton();
                setF = new javax.swing.JRadioButton();

                setterGroup.add(setC);
                setterGroup.add(setF);

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
                setTitle("Celsius_converter");

                TempTextField.setText("0");
                TempTextField.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                TempTextFieldActionPerformed(evt);
                        }
                });

                RezultLabel.setText("Result");

                getRootPane().setDefaultButton(ConvertButton);
                ConvertButton.setText("Convert");
                ConvertButton.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                ConvertButtonActionPerformed(evt);
                        }
                });

                setC.setText("Convert Fahrenheit to Celsius");
                setC.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                setCActionPerformed(evt);
                        }
                });

                setF.setSelected(true);
                setF.setText("Convert Celsius to Fahrenheit");
                setF.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                setFActionPerformed(evt);
                        }
                });

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(50, 50, 50)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(setF)
                                                        .addComponent(setC)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(55, 55, 55)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(ConvertButton, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(TempTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(RezultLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(17, Short.MAX_VALUE)
                                .addComponent(setF)
                                .addGap(18, 18, 18)
                                .addComponent(setC)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(TempTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(RezultLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ConvertButton)
                                .addGap(14, 14, 14))
                );

                pack();
        }// </editor-fold>//GEN-END:initComponents
	// MY CODE
	private int temp;
	private boolean FisPressed;

	private void calcF(){
		try{
			temp = (int)((Double.parseDouble(TempTextField.getText())) * 1.8 + 32);
		}catch(Exception e){
			temp = 32;
		}
		RezultLabel.setText(temp + " Fahrenheit");
	}

	

	private void calcC(){
		try{
			temp = (int)(((Double.parseDouble(TempTextField.getText())) - 32) / 1.8);
		}catch(Exception e1){
			temp = -17;
		}
		RezultLabel.setText(temp + " Celsius");
	}
        private void TempTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TempTextFieldActionPerformed
                // TODO add your handling code here:
        }//GEN-LAST:event_TempTextFieldActionPerformed

        private void ConvertButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConvertButtonActionPerformed
                // TODO add your handling code here:
		if (FisPressed)
			calcF();
		else 
			calcC();
        }//GEN-LAST:event_ConvertButtonActionPerformed

        private void setCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setCActionPerformed
		FisPressed = false;
        }//GEN-LAST:event_setCActionPerformed

        private void setFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setFActionPerformed
		FisPressed  = true;
        }//GEN-LAST:event_setFActionPerformed

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
			java.util.logging.Logger.getLogger(TCGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(TCGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(TCGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(TCGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new TCGUI().setVisible(true);
			}
		});
	}

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JButton ConvertButton;
        private javax.swing.JLabel RezultLabel;
        private javax.swing.JTextField TempTextField;
        private javax.swing.JRadioButton setC;
        private javax.swing.JRadioButton setF;
        private javax.swing.ButtonGroup setterGroup;
        // End of variables declaration//GEN-END:variables
}