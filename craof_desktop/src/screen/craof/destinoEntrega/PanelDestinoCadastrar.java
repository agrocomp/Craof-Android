/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package screen.craof.destinoEntrega;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import org.controle.craof.Controle_CRUD_Destino;
import org.controle.craof.Controle_CRUD_Local;
import org.entidade.craof.LocalDestino;
import org.entidade.craof.LocalPlantio;
import org.entidade.usuario.Usuario;
import screen.craof.FrameAuxiliar;
import screen.craof.SegundaTela;
import screen.craof.destinoProduto.DestinoProdutos;
import screen.craof.cultura.PanelCulturaCadastrar;
import screen.craof.fichas.ControlePlantio.ControlePlantio;

/**
 *
 * @author Luan
 */
public class PanelDestinoCadastrar extends javax.swing.JPanel {

    /**
     * Creates new form PanelLocalCadastrar
     *
     * @param frameInicial
     */
    public PanelDestinoCadastrar(JFrame frame) throws SQLException {
        initComponents();
        this.frame = frame;
        controle = new Controle_CRUD_Destino();
        wtCodigo.setText(controle.maximoId());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jLabel1 = new javax.swing.JLabel();
        wlCodigo = new javax.swing.JLabel();
        wtCodigo = new javax.swing.JTextField();
        wlDescricao = new javax.swing.JLabel();
        wtDescricao = new javax.swing.JTextField();
        salvar = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("CADASTRO DE LOCAL DE DESTINO");

        wlCodigo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        wlCodigo.setText("Código:");

        wtCodigo.setEditable(false);
        wtCodigo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        wtCodigo.setText("Automático");

        wlDescricao.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        wlDescricao.setText("Descrição do Local:");

        wtDescricao.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        salvar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        salvar.setText("SALVAR");
        salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarActionPerformed(evt);
            }
        });

        cancelar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cancelar.setText("CANCELAR");
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/craof80.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(wlDescricao)
                            .addComponent(wlCodigo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(wtDescricao, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                            .addComponent(wtCodigo)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(32, 32, 32)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(salvar)
                        .addGap(26, 26, 26)
                        .addComponent(cancelar)))
                .addContainerGap(102, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(wlCodigo)
                    .addComponent(wtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(wlDescricao)
                    .addComponent(wtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(salvar)
                    .addComponent(cancelar))
                .addGap(54, 54, 54))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        if (frame instanceof SegundaTela) {
            ((SegundaTela) frame).fecharPanel();
        } else {
            ((FrameAuxiliar) frame).fechar();
        }
    }//GEN-LAST:event_cancelarActionPerformed

    private void salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarActionPerformed
        if (!wtDescricao.getText().equals("")) {
            controle = new Controle_CRUD_Destino();
            usuario = new Usuario();
            localDestino = new LocalDestino();
            localDestino.setDescricao(wtDescricao.getText());
            localDestino.setId_usuario(1);
            int cadastrou = 0;
            try {
                usuario.setId(1);
                cadastrou = controle.cadastrar(localDestino, usuario);
                if (cadastrou == 0) {
                    JOptionPane.showMessageDialog(null, "Cadastro feito com sucesso");
                } else if (cadastrou == 1) {
                    JOptionPane.showMessageDialog(null, "ERROR CRAOFx01: Falha ao cadastrar.");
                } else {
                    JOptionPane.showMessageDialog(null, "ERROR CRAOFx02: Já existe um local de destino cadastrado com este nome");
                }

            } catch (SQLException ex) {
                Logger.getLogger(PanelCulturaCadastrar.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (cadastrou == 0) {
                if (frame instanceof FrameAuxiliar) {
                    try {
                        localDestino = controle.buscarId(localDestino, usuario);
                        FrameAuxiliar c = (FrameAuxiliar) frame;
                        if (c.getPanel() instanceof DestinoProdutos) {
                            ((DestinoProdutos) c.getPanel()).setLocalDestino(localDestino);
                        }
                    } catch (SQLException ex) {
                        Logger.getLogger(PanelCulturaCadastrar.class.getName()).log(Level.SEVERE, null, ex);
                    }

                    ((FrameAuxiliar) frame).fechar();
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "ERROR CRAOFx04 : Preencher o campo Descrição do Local");
        }
    }//GEN-LAST:event_salvarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelar;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton salvar;
    private javax.swing.JLabel wlCodigo;
    private javax.swing.JLabel wlDescricao;
    private javax.swing.JTextField wtCodigo;
    private javax.swing.JTextField wtDescricao;
    // End of variables declaration//GEN-END:variables
    private final JFrame frame;
    private LocalDestino localDestino;
    private Controle_CRUD_Destino controle;
    private Usuario usuario;
}