package mypaint;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.geom.Line2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.*;
import java.awt.Polygon;
import java.awt.TextField;
import java.awt.*;

import java.util.ArrayList;
import java.util.List;
//import javafx.scene.paint.Color;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.embed.swing.SwingFXUtils;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.shape.Line;
import javax.imageio.ImageIO;
import javax.imageio.*;
import javax.swing.JColorChooser;
import javax.swing.JPanel;
import javax.swing.*;



public class Paint extends javax.swing.JFrame {


    public Paint() {
        initComponents();
    }
    
    private int xStart, yStart, xEnd, yEnd;
    private Line2D lineBuffer;
    private Ellipse2D ovalBuffer;
    private Rectangle2D rectBuffer;
    private Polygon triBuffer, isotriBuffer;
    private RoundRectangle2D roundrectBuffer;
    private Line2D penBuffer;
    
    private Color ColorDraw = Color.BLACK;
    private double size = 1;

    public Graphics2D g1,g2,g3,g4,g5,g6,g7,g8;

    private List<Shape> shapeList = new ArrayList();
    private List<Line2D> lineContainer = new ArrayList();
    private List<Line2D> penContainer = new ArrayList();
    private List<Ellipse2D> ovalContainer = new ArrayList();
    private List<Rectangle2D> rectContainer = new ArrayList();
    private List<Polygon> triContainer = new ArrayList();
    private List<Polygon> isotriContainer = new ArrayList();
    private List<RoundRectangle2D> roundrectContainer = new ArrayList();

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroup1 = new javax.swing.ButtonGroup();
        jColorChooser1 = new javax.swing.JColorChooser();
        btnGroupSize = new javax.swing.ButtonGroup();
        jFileChooser1 = new javax.swing.JFileChooser();
        frame = new javax.swing.JFrame();
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jRadiobtnLine = new javax.swing.JRadioButton();
        jRadiobtnOval = new javax.swing.JRadioButton();
        jRadiobtnTri = new javax.swing.JRadioButton();
        jRadiobtnIsoTri = new javax.swing.JRadioButton();
        jRadiobtnRect = new javax.swing.JRadioButton();
        jRadiobtnRoundRect = new javax.swing.JRadioButton();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jRadiobtnPen = new javax.swing.JRadioButton();
        btnFill = new javax.swing.JRadioButton();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        btnSize = new javax.swing.JButton();
        btnSize3 = new javax.swing.JRadioButton();
        btnSize2 = new javax.swing.JRadioButton();
        jTabbedPane4 = new javax.swing.JTabbedPane();
        jPanel5 = new javax.swing.JPanel();
        btnColor1 = new javax.swing.JButton();
        btnColor = new javax.swing.JButton();
        jTabbedPane5 = new javax.swing.JTabbedPane();
        jPanel6 = new javax.swing.JPanel();
        jButtonClear = new javax.swing.JButton();
        btnSave = new javax.swing.JRadioButton();

        javax.swing.GroupLayout frameLayout = new javax.swing.GroupLayout(frame.getContentPane());
        frame.getContentPane().setLayout(frameLayout);
        frameLayout.setHorizontalGroup(
            frameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        frameLayout.setVerticalGroup(
            frameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("My Paint");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jPanel1MouseReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 440, Short.MAX_VALUE)
        );

        jTabbedPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jRadiobtnLine.setBackground(new java.awt.Color(255, 255, 255));
        btnGroup1.add(jRadiobtnLine);
        jRadiobtnLine.setToolTipText("Line");
        jRadiobtnLine.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jRadiobtnLine.setIcon(new javax.swing.ImageIcon(getClass().getResource("/line.png"))); // NOI18N

        jRadiobtnOval.setBackground(new java.awt.Color(255, 255, 255));
        btnGroup1.add(jRadiobtnOval);
        jRadiobtnOval.setToolTipText("Oval");
        jRadiobtnOval.setIcon(new javax.swing.ImageIcon(getClass().getResource("/oval.png"))); // NOI18N

        jRadiobtnTri.setBackground(new java.awt.Color(255, 255, 255));
        btnGroup1.add(jRadiobtnTri);
        jRadiobtnTri.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trivuong.png"))); // NOI18N
        jRadiobtnTri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadiobtnTriActionPerformed(evt);
            }
        });

        jRadiobtnIsoTri.setBackground(new java.awt.Color(255, 255, 255));
        btnGroup1.add(jRadiobtnIsoTri);
        jRadiobtnIsoTri.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trican.png"))); // NOI18N

        jRadiobtnRect.setBackground(new java.awt.Color(255, 255, 255));
        btnGroup1.add(jRadiobtnRect);
        jRadiobtnRect.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rectange.png"))); // NOI18N

        jRadiobtnRoundRect.setBackground(new java.awt.Color(255, 255, 255));
        btnGroup1.add(jRadiobtnRoundRect);
        jRadiobtnRoundRect.setIcon(new javax.swing.ImageIcon(getClass().getResource("/roundrect.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jRadiobtnIsoTri)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadiobtnRect, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jRadiobtnLine)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadiobtnOval, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadiobtnRoundRect)
                    .addComponent(jRadiobtnTri))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jRadiobtnTri)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadiobtnRoundRect, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadiobtnLine)
                            .addComponent(jRadiobtnOval, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(3, 3, 3)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadiobtnIsoTri)
                            .addComponent(jRadiobtnRect, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 10, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Shapes", jPanel3);

        jTabbedPane2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jRadiobtnPen.setBackground(new java.awt.Color(255, 255, 255));
        btnGroup1.add(jRadiobtnPen);
        jRadiobtnPen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pen.png"))); // NOI18N
        jRadiobtnPen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadiobtnPenActionPerformed(evt);
            }
        });

        btnFill.setBackground(new java.awt.Color(255, 255, 255));
        btnFill.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tomau.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jRadiobtnPen)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnFill, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnFill)
                    .addComponent(jRadiobtnPen))
                .addGap(0, 36, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Tools", jPanel2);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        btnSize.setBackground(new java.awt.Color(255, 255, 255));
        btnSize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/size.png"))); // NOI18N
        btnSize.setToolTipText("");
        btnSize.setEnabled(false);
        btnSize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSizeMouseClicked(evt);
            }
        });
        btnSize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSizeActionPerformed(evt);
            }
        });

        btnSize3.setBackground(new java.awt.Color(255, 255, 255));
        btnGroupSize.add(btnSize3);
        btnSize3.setText("Size 3");
        btnSize3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSize3MouseClicked(evt);
            }
        });
        btnSize3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                none(evt);
            }
        });

        btnSize2.setBackground(new java.awt.Color(255, 255, 255));
        btnGroupSize.add(btnSize2);
        btnSize2.setText("Size 2");
        btnSize2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSize2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnSize3, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSize2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addComponent(btnSize, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(btnSize3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSize2)
                    .addComponent(btnSize, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("Size", jPanel4);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        btnColor1.setBackground(new java.awt.Color(0, 0, 0));

        btnColor.setBackground(new java.awt.Color(255, 255, 255));
        btnColor.setText("Show Color Choose");
        btnColor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnColorMouseClicked(evt);
            }
        });
        btnColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnColorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnColor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnColor1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 24, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnColor1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnColor, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane4.addTab("Color", jPanel5);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        jButtonClear.setBackground(new java.awt.Color(255, 255, 255));
        jButtonClear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/new.png"))); // NOI18N
        jButtonClear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonClearMouseClicked(evt);
            }
        });
        jButtonClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonClearActionPerformed(evt);
            }
        });

        btnSave.setBackground(new java.awt.Color(255, 255, 255));
        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/save20x20.png"))); // NOI18N
        btnSave.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonClear, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSave, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonClear, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jTabbedPane5.addTab("File", jPanel6);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTabbedPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTabbedPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTabbedPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 199, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jTabbedPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTabbedPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTabbedPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 
    
    private void jRadiobtnTriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadiobtnTriActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadiobtnTriActionPerformed

    private void jRadiobtnPenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadiobtnPenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadiobtnPenActionPerformed

    private void btnColorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnColorMouseClicked
       //JColorChooser jcc = new JColorChooser();
       Color ColorDraw = JColorChooser.showDialog(null, "Color Chooser", Color.yellow);
       btnColor1.setBackground(ColorDraw);
       //jPanel1.setBackground(ColorDraw);
       
       
        
    }//GEN-LAST:event_btnColorMouseClicked

    private void btnColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnColorActionPerformed
            //JColorChooser jcc = new JColorChooser();
       ColorDraw = JColorChooser.showDialog(null, "Color Chooser", Color.CYAN);
       btnColor1.setBackground(ColorDraw);
       //jPanel1.setBackground(ColorDraw);
    }//GEN-LAST:event_btnColorActionPerformed

    private void jPanel1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseReleased

        if(jRadiobtnLine.isSelected())
        {
            
            //jPanel1.update(g1);
            
            xEnd = evt.getX();
            yEnd = evt.getY();
               
            g1.setPaint(ColorDraw);
            g1.setStroke(new BasicStroke((float) size));

            lineBuffer = new Line2D.Float((float)xStart, (float)yStart, (float)xEnd, (float)yEnd);
            lineContainer.add(lineBuffer);
            DrawAll();
        }

        if(jRadiobtnOval.isSelected())
        {
            //jPanel1.update(g2);

            xEnd = evt.getX();
            yEnd = evt.getY();
            
            g2.setPaint(ColorDraw);
            g2.setStroke(new BasicStroke((float) size));

            ovalBuffer = new Ellipse2D.Float((float)Math.min(xStart,xEnd), (float)Math.min(yStart, yEnd), (float)Math.abs(xEnd- xStart), (float)Math.abs(yEnd- yStart));
            //g2.fillOval((int)Math.min(xStart,xEnd), (int)Math.min(yStart, yEnd), (int)xEnd, (int)yEnd);
            ovalContainer.add(ovalBuffer);
            
            if(btnFill.isSelected())
            {
               g2.fillOval((int)Math.min(xStart,xEnd), (int)Math.min(yStart, yEnd), (int)Math.abs(xEnd- xStart), (int)Math.abs(yEnd- yStart));
               
            }
            DrawAll();
           
        }

        if(jRadiobtnRect.isSelected())
        {
            //jPanel1.update(g3);

            xEnd = evt.getX();
            yEnd = evt.getY();
            
            g3.setPaint(ColorDraw);
            g3.setStroke(new BasicStroke((float) size));

            rectBuffer = new Rectangle2D.Float((float)Math.min(xStart,xEnd), (float)Math.min(yStart, yEnd), (float)Math.abs(xEnd- xStart), (float)Math.abs(yEnd- yStart));
            rectContainer.add(rectBuffer);
            
            if(btnFill.isSelected())
            {
                g3.fillRect((int)Math.min(xStart,xEnd), (int)Math.min(yStart, yEnd), (int)Math.abs(xEnd- xStart), (int)Math.abs(yEnd- yStart));
            }

            DrawAll();
        }

        if(jRadiobtnRoundRect.isSelected())
        {
           // jPanel1.update(g4);

            xEnd = evt.getX();
            yEnd = evt.getY();
            
            g4.setPaint(ColorDraw);
            g4.setStroke(new BasicStroke((float) size));

            roundrectBuffer = new RoundRectangle2D.Float((float)Math.min(xStart,xEnd), (float)Math.min(yStart, yEnd), (float)Math.abs(xEnd- xStart), (float)Math.abs(yEnd- yStart),90,90);
            roundrectContainer.add(roundrectBuffer);
            
            if(btnFill.isSelected())
            {
                g3.fillRoundRect((int)Math.min(xStart,xEnd), (int)Math.min(yStart, yEnd), (int)Math.abs(xEnd- xStart), (int)Math.abs(yEnd- yStart),90,90);
            }

            DrawAll();
        }

        if(jRadiobtnPen.isSelected())
        {
            //jPanel1.update(g5);
            xEnd = evt.getX();
            yEnd = evt.getY();
            
            g5.setPaint(ColorDraw);
            g5.setStroke(new BasicStroke((float) size));
            
            penBuffer = new Line2D.Float((float)xStart, (float)yStart, (float)xEnd, (float)yEnd);
            penContainer.add(penBuffer);
            
            
            //repaint();
            xStart= xEnd;
            yStart= yEnd;
            //g2.setColor(java.awt.Color.red);

            
            DrawAll();

        }

        if(jRadiobtnTri.isSelected())
        {
           // jPanel1.update(g7);

            xEnd = evt.getX();
            yEnd = evt.getY();
            
            g7.setPaint(ColorDraw);
            g7.setStroke(new BasicStroke((float) size));
            
            triBuffer = new Polygon();
            triBuffer.addPoint(xStart, yStart);
            triBuffer.addPoint(xStart, yEnd);
            triBuffer.addPoint(xEnd, yEnd);

            triContainer.add(triBuffer);
            
            if(btnFill.isSelected())
            {
                g7.fillPolygon(triBuffer);
            }

            DrawAll();
        }

        if(jRadiobtnIsoTri.isSelected())
        {
            jPanel1.update(g8);

            xEnd = evt.getX();
            yEnd = evt.getY();
            
            g8.setPaint(ColorDraw);
            g8.setStroke(new BasicStroke((float) size));
            
            isotriBuffer = new Polygon();
            //triBuffer = new Polygon(xStart, yStart,xStart, yEnd,xEnd, yEnd);
            isotriBuffer.addPoint((int)(xStart + xEnd)/2, yStart);
            isotriBuffer.addPoint(xStart, yEnd);
            isotriBuffer.addPoint(xEnd, yEnd);
            isotriContainer.add(isotriBuffer);
            
             if(btnFill.isSelected())
            {
                g8.fillPolygon(isotriBuffer);
            }
             
            DrawAll();
        }
     
    }//GEN-LAST:event_jPanel1MouseReleased

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
//        if(g2 == null)
//        {
//             //BufferedImage buffImage=new BufferedImage(jPanel1.getWidth(), jPanel1.getHeight(), BufferedImage.TRANSLUCENT);
//             //Graphics2D g2=(Graphics2D)buffImage.createGraphics(); 
//            g2 = (Graphics2D)jPanel1.getGraphics();
//            g3 = (Graphics2D)jPanel1.getGraphics();
//        }

        if(g1 == null)
            g1 = (Graphics2D)jPanel1.getGraphics();
        if(g2 == null)
            g2 = (Graphics2D)jPanel1.getGraphics();
        if(g3 == null)
            g3 = (Graphics2D)jPanel1.getGraphics();
        if(g4 == null)
            g4 = (Graphics2D)jPanel1.getGraphics();
        if(g5 == null)
            g5 = (Graphics2D)jPanel1.getGraphics();
        if(g6 == null)
            g6 = (Graphics2D)jPanel1.getGraphics();
        if(g7 == null)
            g7 = (Graphics2D)jPanel1.getGraphics();
        if(g8 == null)
            g8 = (Graphics2D)jPanel1.getGraphics();
//        dbImage = createImage(getWidth(),getHeight());
//        g1 = (Graphics2D) dbImage.getGraphics();
//        g2 = (Graphics2D) dbImage.getGraphics();
//        g3 = (Graphics2D) dbImage.getGraphics();
//        g4 = (Graphics2D) dbImage.getGraphics();
//        g5 = (Graphics2D) dbImage.getGraphics();
//        g6 = (Graphics2D) dbImage.getGraphics();
//        g7 = (Graphics2D) dbImage.getGraphics();
//        g8 = (Graphics2D) dbImage.getGraphics();
        
        xStart = evt.getX();
        yStart = evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged

        if(jRadiobtnLine.isSelected())
        {         
            jPanel1.update(g1);
            
            xEnd = evt.getX();
            yEnd = evt.getY();           
            lineBuffer = new Line2D.Float((float)xStart, (float)yStart, (float)xEnd, (float)yEnd); 
            //setsize
            g1.setStroke(new BasicStroke((float) size));
            //setcolor
            g1.setColor(ColorDraw);
            //repaint all
            DrawAll();
            
            g1.draw(lineBuffer);
        }

        if(jRadiobtnOval.isSelected())
        {
            jPanel1.update(g2);

            xEnd = evt.getX();
            yEnd = evt.getY();
            
            g2.setPaint(ColorDraw);
            g2.setStroke(new BasicStroke((float) size));
            
            ovalBuffer = new Ellipse2D.Float((float)Math.min(xStart,xEnd), (float)Math.min(yStart, yEnd), (float)Math.abs(xEnd- xStart), (float)Math.abs(yEnd- yStart));
            if(btnFill.isSelected())
            {
                g2.fillOval((int)Math.min(xStart,xEnd), (int)Math.min(yStart, yEnd), (int)Math.abs(xEnd- xStart), (int)Math.abs(yEnd- yStart));
            }
            DrawAll();
            g2.draw(ovalBuffer);
        }

        if(jRadiobtnRect.isSelected())
        {
            jPanel1.update(g3);

            xEnd = evt.getX();
            yEnd = evt.getY();
            
            g3.setPaint(ColorDraw);
            g3.setStroke(new BasicStroke((float) size));

            rectBuffer = new Rectangle2D.Float((float)Math.min(xStart,xEnd), (float)Math.min(yStart, yEnd), (float)Math.abs(xEnd- xStart), (float)Math.abs(yEnd- yStart));
            
            if(btnFill.isSelected())
            {
                g3.fillRect((int)Math.min(xStart,xEnd), (int)Math.min(yStart, yEnd), (int)Math.abs(xEnd- xStart), (int)Math.abs(yEnd- yStart));
            }
            
            DrawAll();
            g3.draw(rectBuffer);
        }

        if(jRadiobtnRoundRect.isSelected())
        {
            jPanel1.update(g4);

            xEnd = evt.getX();
            yEnd = evt.getY();
            
            g4.setPaint(ColorDraw);
            g4.setStroke(new BasicStroke((float) size));

            roundrectBuffer = new RoundRectangle2D.Float((float)Math.min(xStart,xEnd), (float)Math.min(yStart, yEnd), (float)Math.abs(xEnd- xStart), (float)Math.abs(yEnd- yStart),90,90);
            
            if(btnFill.isSelected())
            {
                g4.fillRoundRect((int)Math.min(xStart,xEnd), (int)Math.min(yStart, yEnd), (int)Math.abs(xEnd- xStart), (int)Math.abs(yEnd- yStart),90,90);
            }
            
            DrawAll();
            g4.draw(roundrectBuffer);
        }

        if(jRadiobtnPen.isSelected())
        {
            jPanel1.update(g5);
            xEnd = evt.getX();
            yEnd = evt.getY();
            
            g5.setPaint(ColorDraw);
            g5.setStroke(new BasicStroke((float) size));
            
            penBuffer = new Line2D.Float((float)xStart, (float)yStart, (float)xEnd, (float)yEnd);
            penContainer.add(penBuffer);

            xStart= xEnd;
            yStart= yEnd;

            DrawAll();
            g5.draw(penBuffer);
        }
        
        //if()
        
        if(jRadiobtnTri.isSelected())
        {
            jPanel1.update(g7);

            xEnd = evt.getX();
            yEnd = evt.getY();
            
            g7.setPaint(ColorDraw);
            g7.setStroke(new BasicStroke((float) size));
            triBuffer = new Polygon();
            //triBuffer = new Polygon(xStart, yStart,xStart, yEnd,xEnd, yEnd);
            triBuffer.addPoint(xStart, yStart);
            triBuffer.addPoint(xStart, yEnd);
            triBuffer.addPoint(xEnd, yEnd);
            if(btnFill.isSelected())
            {
                g7.fillPolygon(triBuffer);
            }
            DrawAll();
            g7.drawPolygon(triBuffer);
        }

        if(jRadiobtnIsoTri.isSelected())
        {
            jPanel1.update(g8);

            xEnd = evt.getX();
            yEnd = evt.getY();
            
            g8.setPaint(ColorDraw);
            g8.setStroke(new BasicStroke((float) size));
            
            isotriBuffer = new Polygon();
            //triBuffer = new Polygon(xStart, yStart,xStart, yEnd,xEnd, yEnd);
            
            isotriBuffer.addPoint((int)(xStart + xEnd)/2, yStart);
            isotriBuffer.addPoint(xStart, yEnd);
            isotriBuffer.addPoint(xEnd, yEnd);
            
            if(btnFill.isSelected())
            {
                g8.fillPolygon(isotriBuffer);
            }

            DrawAll();
            g8.drawPolygon(isotriBuffer);
        }
    
    }//GEN-LAST:event_jPanel1MouseDragged

    private void btnSizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSizeMouseClicked
        

        
    }//GEN-LAST:event_btnSizeMouseClicked

    private void jButtonClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonClearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonClearActionPerformed

    private void jButtonClearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonClearMouseClicked
        jPanel1.update(g1);
        jPanel1.update(g2);
        jPanel1.update(g3);
        jPanel1.update(g4);
        jPanel1.update(g5);
        jPanel1.update(g7);
        jPanel1.update(g8);
        //jPanel1.update(g6);
        lineContainer.clear();
        ovalContainer.clear();
        rectContainer.clear();
        roundrectContainer.clear();
        isotriContainer.clear();
        triContainer.clear();
        penContainer.clear();
    }//GEN-LAST:event_jButtonClearMouseClicked

    private void btnSizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSizeActionPerformed
        if(btnSize2.isSelected())
        {  
            size = 2;    
        }
        if(btnSize3.isSelected())
        {
            size = 4;
        }  
        
    }//GEN-LAST:event_btnSizeActionPerformed

    private void btnSize3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSize3MouseClicked
        btnSize.setEnabled(true);
    }//GEN-LAST:event_btnSize3MouseClicked

    private void btnSize2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSize2MouseClicked
        btnSize.setEnabled(true);
    }//GEN-LAST:event_btnSize2MouseClicked

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        JFileChooser jfc = new JFileChooser();
        int var = jfc.showSaveDialog(null);
         String filename = null ;
         String dir = null;

        if(var == JFileChooser.APPROVE_OPTION)
        {
            filename = jfc.getSelectedFile().getName();
            dir = jfc.getCurrentDirectory().toString();

        }
            String filePath = dir +"\\"+ filename;
        BufferedImage buffImg = new BufferedImage(300,300,BufferedImage.TYPE_INT_RGB);
        DrawAll();
        g1 = buffImg.createGraphics();
        //g1.draw(lineBuffer);
        g2 = buffImg.createGraphics();
        //g2.draw(ovalBuffer);
        g3 = buffImg.createGraphics();
        //g3.draw(rectBuffer);
        g4 = buffImg.createGraphics();
        //g4.draw(roundrectBuffer);
        g5 = buffImg.createGraphics();
        //g5.draw(penBuffer);
        g6 = buffImg.createGraphics();
        g7 = buffImg.createGraphics();
        //g7.draw(triBuffer);
        g8 = buffImg.createGraphics();
        //g8.draw(isotriBuffer);
//        g1 = buffImg.createGraphics();  
//        //g1.draw(triBuffer);
//        g1.drawOval(0, 0, 20, 20);
         
        
        
        File file = new File(filePath);
        try {
            ImageIO.write(buffImg, filename, file);
        } catch (IOException ex) {
            ex.printStackTrace();
        }

         

        
    }//GEN-LAST:event_btnSaveActionPerformed

    

    private void none(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_none
        // TODO add your handling code here:
    }//GEN-LAST:event_none

    
    private void DrawAll()
    {
     for(int i=0; i<lineContainer.size(); i++)
        {
            g1.draw(lineContainer.get(i));
        }
        
        for(int i=0; i<ovalContainer.size(); i++)
        {
                g2.draw(ovalContainer.get(i));
        }
        
        for(int i=0; i<rectContainer.size(); i++)
        {
            g3.draw(rectContainer.get(i));
        }
        
       for(int i=0; i<triContainer.size(); i++)
        {
            g7.draw(triContainer.get(i));
        }
        
        for(int i=0; i<roundrectContainer.size(); i++)
        {
            g4.draw(roundrectContainer.get(i));
        }
        
        for(int i=0; i<penContainer.size(); i++)
        {
            g5.draw(penContainer.get(i));
        }
        
        for(int i=0; i<isotriContainer.size(); i++)
        {
            g8.draw(isotriContainer.get(i));
        }    
    }


    public static void main(String args[]) throws IOException {
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
            java.util.logging.Logger.getLogger(Paint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Paint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Paint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Paint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Paint().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnColor;
    private javax.swing.JButton btnColor1;
    private javax.swing.JRadioButton btnFill;
    private javax.swing.ButtonGroup btnGroup1;
    private javax.swing.ButtonGroup btnGroupSize;
    private javax.swing.JRadioButton btnSave;
    private javax.swing.JButton btnSize;
    private javax.swing.JRadioButton btnSize2;
    private javax.swing.JRadioButton btnSize3;
    private javax.swing.JFrame frame;
    private javax.swing.JButton jButtonClear;
    private javax.swing.JColorChooser jColorChooser1;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JRadioButton jRadiobtnIsoTri;
    private javax.swing.JRadioButton jRadiobtnLine;
    private javax.swing.JRadioButton jRadiobtnOval;
    private javax.swing.JRadioButton jRadiobtnPen;
    private javax.swing.JRadioButton jRadiobtnRect;
    private javax.swing.JRadioButton jRadiobtnRoundRect;
    private javax.swing.JRadioButton jRadiobtnTri;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTabbedPane jTabbedPane4;
    private javax.swing.JTabbedPane jTabbedPane5;
    // End of variables declaration//GEN-END:variables

}
