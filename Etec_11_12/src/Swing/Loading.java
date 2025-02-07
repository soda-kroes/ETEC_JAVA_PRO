
package Swing;


public class Loading extends javax.swing.JFrame {

    
    public Loading() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        progress = new javax.swing.JProgressBar();
        loadinglb = new javax.swing.JLabel();
        labelvalue = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);
        getContentPane().add(progress);
        progress.setBounds(0, 280, 580, 19);

        loadinglb.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        loadinglb.setText("Loading");
        getContentPane().add(loadinglb);
        loadinglb.setBounds(10, 250, 100, 30);

        labelvalue.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        labelvalue.setText("0%");
        getContentPane().add(labelvalue);
        labelvalue.setBounds(490, 250, 80, 30);

        setSize(new java.awt.Dimension(587, 337));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       Loading lod = new Loading();
       lod.setVisible(true);
        try {
            for(int i=0;i<=100;i++){
           Thread.sleep(30);
           lod.labelvalue.setText(i+"%");
           if(i==30){
               lod.loadinglb.setText("Please waiting");
           }
           else if(i==7)
           lod.progress.setValue(i);
          }
            
        } catch (Exception e) {
        }
        
      
       
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel labelvalue;
    private javax.swing.JLabel loadinglb;
    private javax.swing.JProgressBar progress;
    // End of variables declaration//GEN-END:variables
}
