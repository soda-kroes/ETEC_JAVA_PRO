
package Swing;

import java.awt.Color;


public class formloading extends javax.swing.JFrame {

   
    public formloading() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new com.k33ptoo.components.KGradientPanel();
        jLabel1 = new javax.swing.JLabel();
        progress = new javax.swing.JProgressBar();
        lb_value = new javax.swing.JLabel();
        lb_loading = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        kGradientPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ETEC DRINK SHOP");
        kGradientPanel1.add(jLabel1);
        jLabel1.setBounds(200, 30, 390, 90);
        kGradientPanel1.add(progress);
        progress.setBounds(-10, 480, 760, 30);

        lb_value.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        lb_value.setForeground(new java.awt.Color(255, 255, 255));
        lb_value.setText("0%");
        kGradientPanel1.add(lb_value);
        lb_value.setBounds(680, 450, 60, 30);

        lb_loading.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        lb_loading.setForeground(new java.awt.Color(255, 255, 255));
        lb_loading.setText("Loading");
        kGradientPanel1.add(lb_loading);
        lb_loading.setBounds(10, 446, 110, 30);

        getContentPane().add(kGradientPanel1);
        kGradientPanel1.setBounds(0, 0, 750, 510);

        setSize(new java.awt.Dimension(758, 541));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    public static void main(String args[]) {
        formloading load = new formloading();
        load.setVisible(true);
        try {
            for(int i=0;i<=100;i++){
                Thread.sleep(50);
                load.lb_value.setText(i+"%");
                if(i==30){
                    load.lb_loading.setText("Please Waiting");
                }
                load.progress.setValue(i);
                
                load.progress.setBackground(Color.red);
                
            }
           
        } catch (Exception e) {
        }
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private com.k33ptoo.components.KGradientPanel kGradientPanel1;
    private javax.swing.JLabel lb_loading;
    private javax.swing.JLabel lb_value;
    private javax.swing.JProgressBar progress;
    // End of variables declaration//GEN-END:variables
}
