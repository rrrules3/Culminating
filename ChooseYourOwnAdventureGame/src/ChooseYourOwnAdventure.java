/*
 * Rohan Rajesh
 * A Choose Your Own Adventure game
 * April 13, 2022
 */

/**
 *
 * @author roraj5945
 */
public class ChooseYourOwnAdventure extends javax.swing.JFrame {

    /**
     * Creates new form ChooseYourOwnAdventure
     */
    public ChooseYourOwnAdventure() {
        initComponents();
    }

    int choice1;
    int choice2;
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        startBtnn = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt1 = new javax.swing.JTextArea();
        btn2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        startBtnn.setText("Start!");
        startBtnn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startBtnnActionPerformed(evt);
            }
        });

        btn1.setText("Choice 1");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        txt1.setColumns(20);
        txt1.setRows(5);
        jScrollPane1.setViewportView(txt1);

        btn2.setText("Choice2");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn2)
                                .addGap(8, 8, 8))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(228, 228, 228)
                        .addComponent(startBtnn)))
                .addContainerGap(110, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(57, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn1)
                    .addComponent(btn2))
                .addGap(18, 18, 18)
                .addComponent(startBtnn)
                .addGap(97, 97, 97))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void startBtnnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startBtnnActionPerformed
        txt1.setText("You are an astronaut heading to the Mars.\nAs you take-off, you notice something is lighting up red. \nChoice 1: You stop and land back on Earth\nChoice 2: You keep going, there's no time to stop!");
        choice1 = 0;
        choice2 = 0;
        startBtnn.setText("Start");
    }//GEN-LAST:event_startBtnnActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        choice1 = choice1 + 1;
        if (choice1 == 1){
           txt1.setText("Good job, you avoided overheating the engine.\nNow that things are back up, it's time to make it to Mars! \nWhile you are in space, you see some meteors coming at you.\nChoice 1: Do you want to shoot at them with lasers\nChoice 2: You evade them like a pro ");
           choice1 = 2;
           choice2 = 2;
       } else if (choice1 == 3) {
           txt1.setText("You click the button to engage the weapons! Then you realize your spaceship isn't equipped with lasers\nYou died.");
           startBtnn.setText("Restart");
       } else if (choice1 == 5) {
         txt1.setText("You board the ship, and you see these aliens! Do you:\n1. Try to communicate with them\n2. Attack them");
         choice1 = 6;
         choice2 = 6;
       } else if (choice1 == 7) {
         txt1.setText("When you try to talk to them, you end up insulting them!\n As a result, they shot you and you died. Cry about it.");
         startBtnn.setText("Restart");
       } else if (choice1 == 9) {
         txt1.setText("You slowly enter Mars and land safely. Congrats, you won!");
       }
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        choice2 = choice2 + 1;
        if (choice2 == 1){
           txt1.setText("The engine was overheating!\nSince you didn't stop, the spaceship exploded and you died!");
           startBtnn.setText("Restart");
       } else if (choice2 == 3){
           txt1.setText("Evading the meteors was a good choice!\nYou narrowly make it through the meteors.\nYou see a spaceship.\nWill you:\n1. Go talk to them\n2. Avoid them.");
           choice1 = 4;
           choice2 = 4;
       } else if (choice2 == 5) {
         txt1.setText("After avoiding, you then realize you are out of fuel.\nYou are stuck floating through space, fated to die soon.");
         startBtnn.setText("Restart");
       } else if (choice2 == 7) {
         txt1.setText("You end up slaughtering every alien found on board. You retrieve all the fuel and continue.\nYou are almost there, so now it is the homestretch. To land the rocket, you have two options.\n1. Steadily enter the atmosphere\n2. Enter in as fast as you can.");
         choice1 = 8;
         choice2 = 8;
       } else if (choice2 == 9) {
         txt1.setText("You end up crashing into the planet and the ship blows up.");
         startBtnn.setText("Restart");
       }
    }//GEN-LAST:event_btn2ActionPerformed

    public static void main(String args[]) {
       
        
        
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChooseYourOwnAdventure().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton startBtnn;
    private javax.swing.JTextArea txt1;
    // End of variables declaration//GEN-END:variables
}
