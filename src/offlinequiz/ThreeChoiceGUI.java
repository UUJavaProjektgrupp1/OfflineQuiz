/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package offlinequiz;

import java.lang.reflect.InvocationTargetException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author conta
 */
public class ThreeChoiceGUI extends javax.swing.JFrame {

    AnswerClass ac = new AnswerClass();
    QuizCounter qc = new QuizCounter();

    /**
     * Creates new form ThreeChoiceGUI
     */
    public ThreeChoiceGUI() {
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

        svar1 = new javax.swing.JButton();
        svar2 = new javax.swing.JButton();
        svar3 = new javax.swing.JButton();
        Counter = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        questionLabel = new javax.swing.JLabel();
        correctAnswerCounter = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        svar1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        svar1.setText("jButton1");
        svar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                svar1ActionPerformed(evt);
            }
        });

        svar2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        svar2.setText("jButton1");
        svar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                svar2ActionPerformed(evt);
            }
        });

        svar3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        svar3.setText("jButton1");
        svar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                svar3ActionPerformed(evt);
            }
        });

        Counter.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        Counter.setText("X");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel2.setText("Fråga");

        questionLabel.setText("jLabel1");

        correctAnswerCounter.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(svar1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(svar2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(svar3, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Counter)
                                .addGap(172, 172, 172))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(correctAnswerCounter)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(questionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(47, 47, 47)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(correctAnswerCounter)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Counter)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(questionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(svar1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(svar2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(svar3, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //When svar1 Button is clicked
    private void svar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_svar1ActionPerformed
        ThreeChoiceGUI tcg = new ThreeChoiceGUI();
        if (ac.getAnswer1().equals(ac.getCorrectAnswer())) {
            qc.setAnswerCounter();
            tcg.openWindow();
            this.hide();
        } else {
            tcg.openWindow();
            this.hide();
        }
    }//GEN-LAST:event_svar1ActionPerformed

    //When svar2 Button is clicked
    private void svar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_svar2ActionPerformed
        ThreeChoiceGUI tcg = new ThreeChoiceGUI();
        if (ac.getAnswer2().equals(ac.getCorrectAnswer())) {
            qc.setAnswerCounter();
            tcg.openWindow();
            this.hide();
        } else {
            tcg.openWindow();
            this.hide();
        }
    }//GEN-LAST:event_svar2ActionPerformed

    //When svar3 button is clicked
    private void svar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_svar3ActionPerformed
        ThreeChoiceGUI tcg = new ThreeChoiceGUI();
        if (ac.getAnswer3().equals(ac.getCorrectAnswer())) {
            qc.setAnswerCounter();
            tcg.openWindow();
            this.hide();
        } else {
            tcg.openWindow();
            this.hide();
        }
    }//GEN-LAST:event_svar3ActionPerformed

    public void openWindow() {
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
            java.util.logging.Logger.getLogger(ThreeChoiceGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ThreeChoiceGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ThreeChoiceGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ThreeChoiceGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ThreeChoiceGUI tcg = new ThreeChoiceGUI();
                AnswerClass ac = new AnswerClass();
                QuizCounter qc = new QuizCounter();
                // Check if there has been 10 questions ---------------------
                if(qc.checkCounter()){
                    EndScreenGUI es = new EndScreenGUI();
                    es.showMenu();
                    tcg.hide();
                }
                else{
                    // Fetch a set of randomized answers -----------------------------
                    ac.randomizeAnswers();
                //Then set up the variables on the frame -------------------------------
                tcg.Counter.setText(String.valueOf(qc.getCounter()));
                tcg.questionLabel.setText(ac.getQuestion());
                tcg.svar1.setText(ac.getAnswer1());
                tcg.svar2.setText(ac.getAnswer2());
                tcg.svar3.setText(ac.getAnswer3());
                tcg.correctAnswerCounter.setText(String.valueOf(qc.getAnswerCounter()));
                tcg.setVisible(true);
                qc.AddToCounter();
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Counter;
    private javax.swing.JLabel correctAnswerCounter;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel questionLabel;
    private javax.swing.JButton svar1;
    private javax.swing.JButton svar2;
    private javax.swing.JButton svar3;
    // End of variables declaration//GEN-END:variables
}