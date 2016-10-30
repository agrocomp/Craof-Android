/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package screen.craof.fichas.CompraInsumos;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import org.controle.craof.Controle_Compra_Insumos;
import org.entidade.craof.CompraInsumos;
import org.entidade.craof.Insumo;
import screen.craof.FrameAuxiliar;
import screen.craof.SegundaTela;
import screen.craof.insumo.PanelInsumoBuscar;

/**
 *
 * @author Luan
 */
public class CompraInsumosCadastrar extends javax.swing.JPanel {

    /**
     * Creates new form CompraInsumos
     */
    public CompraInsumosCadastrar(FrameAuxiliar frameauxiliar) throws SQLException {
        initComponents();
        this.frameauxiliar = frameauxiliar;
        wtInsumo.setEnabled(false);
        wtInsumo.setText("Clique em buscar!!");
        controle = new Controle_Compra_Insumos();
        compraInsumos = new CompraInsumos();
        wtCodigo.setText(controle.maximoId());
        this.frameauxiliar.corrigir();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        wtInsumo = new javax.swing.JTextField();
        wlLocal = new javax.swing.JLabel();
        wtFinalidade = new javax.swing.JTextField();
        wtCodigo = new javax.swing.JTextField();
        wlData = new javax.swing.JLabel();
        buscarInsumo = new javax.swing.JButton();
        wtData = new javax.swing.JTextField();
        try{
            javax.swing.text.MaskFormatter data = new javax.swing.text.MaskFormatter("##/##/####");
            wtData = new javax.swing.JFormattedTextField(data);
        }catch(Exception e){
        }
        wtQuantidade = new javax.swing.JTextField();
        salvar = new javax.swing.JButton();
        wlQuantidade = new javax.swing.JLabel();
        cancelar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        wlCodigo = new javax.swing.JLabel();
        wlInsumo = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();

        wtInsumo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        wlLocal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        wlLocal.setText("Finalidade de uso:");

        wtFinalidade.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        wtCodigo.setEditable(false);
        wtCodigo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        wtCodigo.setText("Automático");

        wlData.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        wlData.setText("Data:");

        buscarInsumo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        buscarInsumo.setText("BUSCAR");
        buscarInsumo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarInsumoActionPerformed(evt);
            }
        });

        wtData.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        wtQuantidade.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        salvar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        salvar.setText("SALVAR");
        salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarActionPerformed(evt);
            }
        });

        wlQuantidade.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        wlQuantidade.setText("Quantidade");

        cancelar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cancelar.setText("CANCELAR");
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("COMPRA DE INSUMOS");

        wlCodigo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        wlCodigo.setText("Código:");

        wlInsumo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        wlInsumo.setText("Insumo:");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/craof80.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(76, 76, 76)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(wlInsumo)
                            .addComponent(wlData)
                            .addComponent(wlCodigo)
                            .addComponent(wlQuantidade))
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(wtData)
                            .addComponent(wtInsumo, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                            .addComponent(wtCodigo)
                            .addComponent(wtQuantidade, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(wlLocal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(wtFinalidade)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(salvar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cancelar)))))
                .addGap(18, 18, 18)
                .addComponent(buscarInsumo)
                .addGap(61, 61, 61))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(wlCodigo)
                    .addComponent(wtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(wlData)
                    .addComponent(wtData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buscarInsumo)
                    .addComponent(wtInsumo, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(wlInsumo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(wtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(wlQuantidade))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(wtFinalidade, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(wlLocal))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelar)
                    .addComponent(salvar))
                .addContainerGap(26, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void buscarInsumoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarInsumoActionPerformed
        FrameAuxiliar c = new FrameAuxiliar(this);
        c.abrirPanel(new PanelInsumoBuscar(c), "Buscar Insumo - CRAOF");
        c.setVisible(true);
    }//GEN-LAST:event_buscarInsumoActionPerformed

    private void salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarActionPerformed
        if (!wtData.getText().equals("")) {
            if (!wtInsumo.getText().equals("")) {
                if (!wtQuantidade.getText().equals("")) {
                    if (!wtFinalidade.getText().equals("")) {
                        try {
                            compraInsumos.setId_compraInsumo(Integer.parseInt(controle.maximoId()));
                        } catch (SQLException ex) {
                            Logger.getLogger(CompraInsumosCadastrar.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        compraInsumos.setDataCompra(wtData.getText());
                        System.out.println(compraInsumos.getInsumo().getId_insumo());
                        try {
                            compraInsumos.setQuantidade(Integer.parseInt(wtQuantidade.getText()));
                            compraInsumos.setFinalidade(wtFinalidade.getText());
                            compraInsumos.setId_usuario(1);
                            if (!controle.salvar(compraInsumos)) {
                                JOptionPane.showMessageDialog(null, "Compra de insumo salvo com sucesso!");
                                FrameAuxiliar frame = (FrameAuxiliar) frameauxiliar;
                                ((CompraInsumosBuscar) frame.getPanel()).atualizarTabela(compraInsumos);
                                frame.fechar();
                            } else {
                                JOptionPane.showMessageDialog(null, "ERROR CRAOFx01 : Falha ao salvar compra de insumos!");
                            }
                        } catch (SQLException ex) {
                            Logger.getLogger(CompraInsumosCadastrar.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "ERROR CRAOFx04 : Preencher campo Finalidade de uso.");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "ERROR CRAOFx04 : Preencher campo Quantidade.");
                }
            } else {
                JOptionPane.showMessageDialog(null, "ERROR CRAOFx04 : Preencher campo Insumo.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "ERROR CRAOFx04 : Preencher campo Data.");
        }
    }//GEN-LAST:event_salvarActionPerformed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        frameauxiliar.fechar();
    }//GEN-LAST:event_cancelarActionPerformed

    public JTextField getWtInsumo() {
        return wtInsumo;
    }

    public void setInsumo(Insumo insumo) {
        this.wtInsumo.setText(insumo.getDescricao());
        compraInsumos.setInsumo(insumo);

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscarInsumo;
    private javax.swing.JButton cancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton salvar;
    private javax.swing.JLabel wlCodigo;
    private javax.swing.JLabel wlData;
    private javax.swing.JLabel wlInsumo;
    private javax.swing.JLabel wlLocal;
    private javax.swing.JLabel wlQuantidade;
    private javax.swing.JTextField wtCodigo;
    private javax.swing.JTextField wtData;
    private javax.swing.JTextField wtFinalidade;
    private javax.swing.JTextField wtInsumo;
    private javax.swing.JTextField wtQuantidade;
    // End of variables declaration//GEN-END:variables
    private FrameAuxiliar frameauxiliar;
    private CompraInsumos compraInsumos;
    private Controle_Compra_Insumos controle;
}
