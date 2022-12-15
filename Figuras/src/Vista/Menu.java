package Vista;

import Modelo.Pizarron;
import java.awt.event.KeyEvent;

public class Menu extends javax.swing.JFrame {
    

    public Menu() {


        initComponents();
    }

    public void addEventos() {
        spR.setVisible(false);
        spG.setVisible(false);
        spB.setVisible(false);
        spLado.setVisible(false);
        pnColor.setVisible(false);
        lbContador.setVisible(false);
        
        Pizarron controlador = new Pizarron(this);
        miAbrir.addActionListener(controlador);
        miNuevo.addActionListener(controlador);
        miGuardar.addActionListener(controlador);
        bgFiguras.add(rbLinea);
        bgFiguras.add(rbTriangulo);
        bgFiguras.add(rbRectangulo);
        bgFiguras.add(rbPentagono);
        
        panelPrincipal.addMouseListener(controlador);
        spLado.addChangeListener(controlador);
        spR.addChangeListener(controlador);
        spG.addChangeListener(controlador);
        spB.addChangeListener(controlador);
        btMasRotar.addActionListener(controlador);
        btMenosRotar.addActionListener(controlador);
        btMasTamanio.addActionListener(controlador);
        btMenosTamanio.addActionListener(controlador);
        btMovimientoArriba.addActionListener(controlador);
        btMovimientoAbajo.addActionListener(controlador);
        btMovimientoDerecha.addActionListener(controlador);
        btMovimientoIzquierda.addActionListener(controlador);
    }

    @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    bgFiguras = new javax.swing.ButtonGroup();
    lbContador = new javax.swing.JLabel();
    jLabel4 = new javax.swing.JLabel();
    pnColor = new javax.swing.JPanel();
    spB = new javax.swing.JSpinner();
    spLado = new javax.swing.JSpinner();
    spG = new javax.swing.JSpinner();
    spR = new javax.swing.JSpinner();
    panelPrincipal = new Vista.Pizarron();
    jPanel2 = new javax.swing.JPanel();
    rbLinea = new javax.swing.JToggleButton();
    rbTriangulo = new javax.swing.JToggleButton();
    rbRectangulo = new javax.swing.JToggleButton();
    rbPentagono = new javax.swing.JToggleButton();
    jPanel1 = new javax.swing.JPanel();
    jLabel3 = new javax.swing.JLabel();
    cbFiguras = new javax.swing.JComboBox<>();
    btMasRotar = new javax.swing.JButton();
    btMenosRotar = new javax.swing.JButton();
    btMasTamanio = new javax.swing.JButton();
    btMenosTamanio = new javax.swing.JButton();
    btMovimientoDerecha = new javax.swing.JButton();
    btMovimientoArriba = new javax.swing.JButton();
    btMovimientoAbajo = new javax.swing.JButton();
    btMovimientoIzquierda = new javax.swing.JButton();
    jLabel1 = new javax.swing.JLabel();
    jLabel2 = new javax.swing.JLabel();
    jLabel5 = new javax.swing.JLabel();
    jMenuBar1 = new javax.swing.JMenuBar();
    jMenu1 = new javax.swing.JMenu();
    miNuevo = new javax.swing.JMenuItem();
    jSeparator1 = new javax.swing.JPopupMenu.Separator();
    miAbrir = new javax.swing.JMenuItem();
    miGuardar = new javax.swing.JMenuItem();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setResizable(false);
    getContentPane().setLayout(null);

    lbContador.setText("Puntos: 0");
    getContentPane().add(lbContador);
    lbContador.setBounds(120, 440, 60, 20);
    getContentPane().add(jLabel4);
    jLabel4.setBounds(10, 480, 0, 0);

    pnColor.setBackground(new java.awt.Color(25, 57, 106));

    javax.swing.GroupLayout pnColorLayout = new javax.swing.GroupLayout(pnColor);
    pnColor.setLayout(pnColorLayout);
    pnColorLayout.setHorizontalGroup(
      pnColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 20, Short.MAX_VALUE)
    );
    pnColorLayout.setVerticalGroup(
      pnColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 20, Short.MAX_VALUE)
    );

    getContentPane().add(pnColor);
    pnColor.setBounds(90, 440, 20, 20);

    spB.setModel(new javax.swing.SpinnerNumberModel(106, 0, 255, 1));
    getContentPane().add(spB);
    spB.setBounds(50, 440, 20, 22);

    spLado.setModel(new javax.swing.SpinnerNumberModel(2, 2, 9, 1));
    getContentPane().add(spLado);
    spLado.setBounds(70, 440, 20, 22);

    spG.setModel(new javax.swing.SpinnerNumberModel(57, 0, 255, 1));
    getContentPane().add(spG);
    spG.setBounds(30, 440, 20, 22);

    spR.setModel(new javax.swing.SpinnerNumberModel(25, 0, 255, 1));
    spR.setValue(255);
    getContentPane().add(spR);
    spR.setBounds(10, 440, 20, 22);

    panelPrincipal.setBackground(new java.awt.Color(255, 255, 255));

    javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
    panelPrincipal.setLayout(panelPrincipalLayout);
    panelPrincipalLayout.setHorizontalGroup(
      panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 730, Short.MAX_VALUE)
    );
    panelPrincipalLayout.setVerticalGroup(
      panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 420, Short.MAX_VALUE)
    );

    getContentPane().add(panelPrincipal);
    panelPrincipal.setBounds(200, 20, 730, 420);

    rbLinea.setText("Linea");

    rbTriangulo.setText("Triangulo");

    rbRectangulo.setText("Rectangulo");

    rbPentagono.setText("Pentagono");

    javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
    jPanel2.setLayout(jPanel2Layout);
    jPanel2Layout.setHorizontalGroup(
      jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel2Layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
          .addComponent(rbLinea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(rbPentagono, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
          .addComponent(rbTriangulo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(rbRectangulo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        .addContainerGap(23, Short.MAX_VALUE))
    );
    jPanel2Layout.setVerticalGroup(
      jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel2Layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(rbLinea)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(rbTriangulo)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(rbRectangulo)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(rbPentagono)
        .addContainerGap(28, Short.MAX_VALUE))
    );

    getContentPane().add(jPanel2);
    jPanel2.setBounds(30, 10, 140, 140);

    jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel3.setText("Figuras");

    cbFiguras.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Figura..." }));
    cbFiguras.setToolTipText("");

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addGroup(jPanel1Layout.createSequentialGroup()
            .addGap(6, 6, 6)
            .addComponent(cbFiguras, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
        .addGap(16, 16, 16))
    );
    jPanel1Layout.setVerticalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(jLabel3)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(cbFiguras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap(40, Short.MAX_VALUE))
    );

    getContentPane().add(jPanel1);
    jPanel1.setBounds(40, 370, 120, 90);

    btMasRotar.setText("D");
    btMasRotar.setActionCommand("+r");
    btMasRotar.addKeyListener(new java.awt.event.KeyAdapter() {
      public void keyPressed(java.awt.event.KeyEvent evt) {
        btMasRotarKeyPressed(evt);
      }
    });
    getContentPane().add(btMasRotar);
    btMasRotar.setBounds(100, 280, 80, 22);

    btMenosRotar.setText("I");
    btMenosRotar.setActionCommand("-r");
    getContentPane().add(btMenosRotar);
    btMenosRotar.setBounds(20, 280, 80, 22);

    btMasTamanio.setText("Aumento");
    btMasTamanio.setActionCommand("+t");
    btMasTamanio.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btMasTamanioActionPerformed(evt);
      }
    });
    getContentPane().add(btMasTamanio);
    btMasTamanio.setBounds(100, 330, 90, 22);

    btMenosTamanio.setText("Decremento");
    btMenosTamanio.setActionCommand("-t");
    getContentPane().add(btMenosTamanio);
    btMenosTamanio.setBounds(10, 330, 90, 22);

    btMovimientoDerecha.setText("Derecha");
    btMovimientoDerecha.setActionCommand("d");
    getContentPane().add(btMovimientoDerecha);
    btMovimientoDerecha.setBounds(110, 200, 80, 22);

    btMovimientoArriba.setText("Arriba");
    btMovimientoArriba.setActionCommand("a");
    getContentPane().add(btMovimientoArriba);
    btMovimientoArriba.setBounds(60, 170, 80, 22);

    btMovimientoAbajo.setText("Abajo");
    btMovimientoAbajo.setActionCommand("ab");
    getContentPane().add(btMovimientoAbajo);
    btMovimientoAbajo.setBounds(60, 230, 80, 22);

    btMovimientoIzquierda.setText("Izquierda");
    btMovimientoIzquierda.setActionCommand("i");
    getContentPane().add(btMovimientoIzquierda);
    btMovimientoIzquierda.setBounds(10, 200, 80, 22);

    jLabel1.setText("TRASLACION");
    getContentPane().add(jLabel1);
    jLabel1.setBounds(60, 150, 86, 16);

    jLabel2.setText("ROTACION");
    getContentPane().add(jLabel2);
    jLabel2.setBounds(60, 260, 70, 16);

    jLabel5.setText("ESCALAMIENTO");
    getContentPane().add(jLabel5);
    jLabel5.setBounds(50, 310, 100, 16);

    jMenu1.setText("Archivo");

    miNuevo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_DOWN_MASK));
    miNuevo.setText("Nuevo");
    jMenu1.add(miNuevo);
    jMenu1.add(jSeparator1);

    miAbrir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_DOWN_MASK));
    miAbrir.setText("Abrir");
    jMenu1.add(miAbrir);

    miGuardar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_DOWN_MASK));
    miGuardar.setText("Guardar");
    jMenu1.add(miGuardar);

    jMenuBar1.add(jMenu1);

    setJMenuBar(jMenuBar1);

    pack();
  }// </editor-fold>//GEN-END:initComponents

    private void btMasRotarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btMasRotarKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btMasRotarKeyPressed

  private void btMasTamanioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMasTamanioActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_btMasTamanioActionPerformed

  // Variables declaration - do not modify//GEN-BEGIN:variables
  public javax.swing.ButtonGroup bgFiguras;
  private javax.swing.JButton btMasRotar;
  private javax.swing.JButton btMasTamanio;
  private javax.swing.JButton btMenosRotar;
  private javax.swing.JButton btMenosTamanio;
  private javax.swing.JButton btMovimientoAbajo;
  private javax.swing.JButton btMovimientoArriba;
  private javax.swing.JButton btMovimientoDerecha;
  private javax.swing.JButton btMovimientoIzquierda;
  public javax.swing.JComboBox<String> cbFiguras;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JLabel jLabel5;
  private javax.swing.JMenu jMenu1;
  private javax.swing.JMenuBar jMenuBar1;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JPanel jPanel2;
  private javax.swing.JPopupMenu.Separator jSeparator1;
  public javax.swing.JLabel lbContador;
  public javax.swing.JMenuItem miAbrir;
  public javax.swing.JMenuItem miGuardar;
  public javax.swing.JMenuItem miNuevo;
  public Vista.Pizarron panelPrincipal;
  public javax.swing.JPanel pnColor;
  public javax.swing.JToggleButton rbLinea;
  public javax.swing.JToggleButton rbPentagono;
  public javax.swing.JToggleButton rbRectangulo;
  public javax.swing.JToggleButton rbTriangulo;
  public javax.swing.JSpinner spB;
  public javax.swing.JSpinner spG;
  public javax.swing.JSpinner spLado;
  public javax.swing.JSpinner spR;
  // End of variables declaration//GEN-END:variables
}
