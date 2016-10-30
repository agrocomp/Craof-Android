/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package screen.craof.local;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import org.controle.craof.Controle_CRUD_Cultura;
import org.controle.craof.Controle_CRUD_Local;
import org.entidade.craof.Cultura;
import org.entidade.craof.LocalPlantio;
import org.entidade.usuario.Usuario;
import screen.craof.FrameAuxiliar;
import screen.craof.SegundaTela;
import screen.craof.aplicacaoInsumos.AplicacaoInsumo;
import screen.craof.destinoProduto.DestinoProdutos;
import screen.craof.cultura.PanelCulturaCadastrar;
import screen.craof.fichas.ControlePlantio.ControlePlantio;

/**
 *
 * @author Luan
 */
public class PanelLocalCadastrar extends javax.swing.JPanel {

    /**
     * Creates new form PanelLocalCadastrar
     *
     * @param frameInicial
     */
    public PanelLocalCadastrar(JFrame frame) throws SQLException {
        initComponents();
        this.frame = frame;
        controle = new Controle_CRUD_Local();
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

        jLabel1 = new javax.swing.JLabel();
        wlCodigo = new javax.swing.JLabel();
        wtCodigo = new javax.swing.JTextField();
        wlDescricao = new javax.swing.JLabel();
        wtDescricao = new javax.swing.JTextField();
        salvar = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("CADASTRO DE LOCAL");

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
                        .addGap(79, 79, 79)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(wlDescricao)
                            .addComponent(wlCodigo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(wtDescricao, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                            .addComponent(wtCodigo)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addComponent(salvar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cancelar))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addGap(72, 72, 72)
                        .addComponent(jLabel1)))
                .addContainerGap(113, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(wlCodigo)
                    .addComponent(wtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(wlDescricao)
                    .addComponent(wtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(salvar)
                    .addComponent(cancelar))
                .addGap(0, 52, Short.MAX_VALUE))
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
            controle = new Controle_CRUD_Local();
            usuario = new Usuario();
            localPlantio = new LocalPlantio();
            localPlantio.setDescricao(wtDescricao.getText());
            localPlantio.setId_usuario(1);
            int cadastrou = 0;
            try {
                usuario.setId(1);
                cadastrou = controle.cadastrar(localPlantio, usuario);
                if (cadastrou == 0) {
                    JOptionPane.showMessageDialog(null, "Cadastro feito com sucesso");
                } else if (cadastrou == 1) {
                    JOptionPane.showMessageDialog(null, "ERROR CRAOFx01: Falha ao cadastrar.");
                } else {
                    JOptionPane.showMessageDialog(null, "ERROR CRAOFx01: Já existe uma cultura cadastrada com este nome");
                }
            } catch (SQLException ex) {
                Logger.getLogger(PanelCulturaCadastrar.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (cadastrou == 0) {
                if (frame instanceof FrameAuxiliar) {
                    try {
                        localPlantio = controle.buscarId(localPlantio, usuario);
                        FrameAuxiliar c = (FrameAuxiliar) frame;
                        if (c.getPanel() instanceof ControlePlantio) {
                            ((ControlePlantio) c.getPanel()).setLocal(localPlantio);
                        } else if (c.getPanel() instanceof AplicacaoInsumo) {
                            ((AplicacaoInsumo) c.getPanel()).setLocal(localPlantio);
                        } else if (c.getPanel() instanceof DestinoProdutos) {
                            ((DestinoProdutos) c.getPanel()).setLocalPlantio(localPlantio);
                        }
                        ((FrameAuxiliar) frame).fechar();
                    } catch (SQLException ex) {
                        Logger.getLogger(PanelCulturaCadastrar.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "ERROR CRAOFx04 : Preencher o campo Descrição do Local.");
        }
    }//GEN-LAST:event_salvarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelar;
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
    private LocalPlantio localPlantio;
    private Controle_CRUD_Local controle;
    private Usuario usuario;
}