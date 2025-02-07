
package database_swing;

import java.awt.Color;


public class form_loding extends javax.swing.JFrame {

 
    public form_loding() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        progress = new javax.swing.JProgressBar();
        lb_value = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lb_loding = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 102, 102));
        jPanel1.setLayout(null);
        jPanel1.add(progress);
        progress.setBounds(0, 400, 830, 40);

        lb_value.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        lb_value.setText("%");
        jPanel1.add(lb_value);
        lb_value.setBounds(760, 370, 60, 30);

        jLabel2.setFont(new java.awt.Font("sansserif", 1, 36)); // NOI18N
        jLabel2.setText("STUDENT SYSTEM");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(240, 20, 360, 80);

        lb_loding.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        lb_loding.setText("loding");
        jPanel1.add(lb_loding);
        lb_loding.setBounds(10, 370, 200, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 830, 430);

        setSize(new java.awt.Dimension(840, 468));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    
    public static void main(String args[]) {
       form_loding load = new form_loding();
       load.setVisible(true);
        try {
            for(int i=0;i<=100;i++){
                Thread.sleep(100);
                load.lb_value.setText(i+"%");
                load.progress.setValue(i);
                if(i==30){
                    load.lb_loding.setText("Please Waiting");
                }
                if(i==90){
                    load.lb_loding.setText("Conected");
                }
                load.progress.setBackground(Color.yellow);
                load.progress.setForeground(Color.BLUE);
            }
        } catch (Exception e) {
        }
        load.dispose();
        Login_Form.main(null);
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lb_loding;
    private javax.swing.JLabel lb_value;
    private javax.swing.JProgressBar progress;
    // End of variables declaration//GEN-END:variables
}
