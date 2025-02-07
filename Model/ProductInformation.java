/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Controller.TextbookDB;
import Controller.ProductList;
import Controller.NonFictionDB;
import Controller.FictionDB;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Void
 */
public class ProductInformation extends javax.swing.JFrame {

    /**
     * Creates new form ProductInformation
     */
    static String categoryChooser="";
    
    public ProductInformation() {
        initComponents();
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        productPhoto = new javax.swing.JLabel();
        productInfoBrand = new javax.swing.JLabel();
        productInfoBrand1 = new javax.swing.JLabel();
        productInfoBrand2 = new javax.swing.JLabel();
        productInfoBrand3 = new javax.swing.JLabel();
        productInfoBrand4 = new javax.swing.JLabel();
        addToCart = new javax.swing.JButton();
        productInfoBrandName = new javax.swing.JLabel();
        productInfoModel = new javax.swing.JLabel();
        productInfoPrice = new javax.swing.JLabel();
        productInfoStock = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        productInfoFeature = new javax.swing.JTextArea();
        productInfoBrand5 = new javax.swing.JLabel();
        productQtyField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 121, 107));
        jPanel2.setPreferredSize(new java.awt.Dimension(1200, 72));

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Product Information");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Info_48px.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(728, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1250, 60));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        productPhoto.setBackground(new java.awt.Color(255, 255, 255));
        productPhoto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        productPhoto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 77, 64)));

        productInfoBrand.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        productInfoBrand.setForeground(new java.awt.Color(0, 77, 64));
        productInfoBrand.setText("Book");

        productInfoBrand1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        productInfoBrand1.setForeground(new java.awt.Color(0, 77, 64));
        productInfoBrand1.setText("Price:");

        productInfoBrand2.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        productInfoBrand2.setForeground(new java.awt.Color(0, 77, 64));
        productInfoBrand2.setText("In Stock:");

        productInfoBrand3.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        productInfoBrand3.setForeground(new java.awt.Color(0, 77, 64));
        productInfoBrand3.setText("Author:");

        productInfoBrand4.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        productInfoBrand4.setForeground(new java.awt.Color(0, 77, 64));
        productInfoBrand4.setText("Year Published");

        addToCart.setBackground(new java.awt.Color(0, 77, 64));
        addToCart.setFont(new java.awt.Font("Roboto", 0, 20)); // NOI18N
        addToCart.setForeground(new java.awt.Color(255, 255, 255));
        addToCart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8_Add_Shopping_Cart_24px.png"))); // NOI18N
        addToCart.setText("Add to cart");
        addToCart.setBorder(null);
        addToCart.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addToCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addToCartActionPerformed(evt);
            }
        });

        productInfoBrandName.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        productInfoBrandName.setForeground(new java.awt.Color(0, 77, 64));

        productInfoModel.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        productInfoModel.setForeground(new java.awt.Color(0, 77, 64));

        productInfoPrice.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        productInfoPrice.setForeground(new java.awt.Color(0, 77, 64));

        productInfoStock.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        productInfoStock.setForeground(new java.awt.Color(0, 77, 64));

        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        productInfoFeature.setEditable(false);
        productInfoFeature.setColumns(20);
        productInfoFeature.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        productInfoFeature.setLineWrap(true);
        productInfoFeature.setRows(5);
        productInfoFeature.setBorder(null);
        productInfoFeature.setFocusable(false);
        productInfoFeature.setRequestFocusEnabled(false);
        productInfoFeature.setVerifyInputWhenFocusTarget(false);
        jScrollPane1.setViewportView(productInfoFeature);

        productInfoBrand5.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        productInfoBrand5.setForeground(new java.awt.Color(0, 77, 64));
        productInfoBrand5.setText("Qty:");

        productQtyField.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        productQtyField.setText("1");
        productQtyField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 77, 64)));
        productQtyField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productQtyFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(productInfoBrand)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(productInfoBrandName, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)
                        .addComponent(productInfoBrand4, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(productInfoStock, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(productInfoBrand1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(productInfoPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(productInfoBrand3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(productInfoModel, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(productInfoBrand2))
                                .addGap(141, 141, 141))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(productInfoBrand5)
                                .addGap(18, 18, 18)
                                .addComponent(productQtyField, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(addToCart, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(productPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(productInfoBrand, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(productInfoBrandName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(productInfoBrand4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(productInfoBrand3)
                            .addComponent(productInfoModel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(57, 57, 57)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(productInfoBrand1)
                            .addComponent(productInfoPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addComponent(productInfoStock, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(productInfoBrand2)
                    .addComponent(productPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(productInfoBrand5)
                    .addComponent(productQtyField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addToCart, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(103, 103, 103))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 880, 420));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 862, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel1MouseClicked
    
    public static ArrayList<ProductList> cartItem = new ArrayList();
    
    private void addToCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addToCartActionPerformed
        
        if(Integer.parseInt(this.productInfoStock.getText())<Integer.parseInt(this.productQtyField.getText())){
            JOptionPane.showMessageDialog(null, "Not enough product in Stock!");
        }
        else{
            int qty = Integer.parseInt(this.productQtyField.getText());
            ProductList p = new ProductList(this.productInfoBrandName.getText(), this.productInfoModel.getText(), qty*Integer.parseInt(this.productInfoPrice.getText()), 
                                                Integer.parseInt(this.productQtyField.getText()), null, null);
            cartItem.add(p);
            JOptionPane.showMessageDialog(null, "Product added to cart!");
   
            int qtyTester = Integer.parseInt(this.productInfoStock.getText())-Integer.parseInt(this.productQtyField.getText());
            
            if(categoryChooser.equals("non-fiction"))
                    NonFictionDB.updateMobileDB(this.productInfoModel.getText(), qtyTester);
            else if(categoryChooser.equals("textbook"))
                    TextbookDB.updateKidsDB(this.productInfoModel.getText(), qtyTester);
            else if(categoryChooser.equals("fiction"))
                    FictionDB.updateElectronicsDB(this.productInfoModel.getText(), qtyTester);
            
        }
    }//GEN-LAST:event_addToCartActionPerformed

    private void productQtyFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productQtyFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_productQtyFieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addToCart;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel productInfoBrand;
    private javax.swing.JLabel productInfoBrand1;
    private javax.swing.JLabel productInfoBrand2;
    private javax.swing.JLabel productInfoBrand3;
    private javax.swing.JLabel productInfoBrand4;
    private javax.swing.JLabel productInfoBrand5;
    public javax.swing.JLabel productInfoBrandName;
    public javax.swing.JTextArea productInfoFeature;
    public javax.swing.JLabel productInfoModel;
    public javax.swing.JLabel productInfoPrice;
    public javax.swing.JLabel productInfoStock;
    public javax.swing.JLabel productPhoto;
    private javax.swing.JTextField productQtyField;
    // End of variables declaration//GEN-END:variables
}
