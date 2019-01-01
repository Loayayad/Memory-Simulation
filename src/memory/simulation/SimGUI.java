package memory.simulation;
import com.sun.glass.events.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
/**
 *
 * @author karim
 */
public class SimGUI extends javax.swing.JFrame {
    public SimGUI() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BGPanel = new javax.swing.JPanel();
        sidePanel = new javax.swing.JPanel();
        contPanel = new javax.swing.JPanel();
        contLabel = new javax.swing.JLabel();
        nonContPanel5 = new javax.swing.JPanel();
        nonContLabel5 = new javax.swing.JLabel();
        jSeparator12 = new javax.swing.JSeparator();
        jSeparator13 = new javax.swing.JSeparator();
        virPanel = new javax.swing.JPanel();
        virLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        memSizeInput = new java.awt.TextField();
        jLabel4 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        pIDInput = new java.awt.TextField();
        pSizeInput = new java.awt.TextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        confirmProcessBtn = new java.awt.Button();
        memStartSize = new javax.swing.JLabel();
        memEndSize = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        iconLabel = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        backLabel = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        deleteProBtn = new java.awt.Button();
        jLabel12 = new javax.swing.JLabel();
        sizeRemainingLabel = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel14 = new javax.swing.JLabel();
        holesLabel = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        delProLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        jLabel10 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        backLabel1 = new javax.swing.JLabel();
        iconLabel1 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        pagesNoIn = new java.awt.TextField();
        sequenceSingleIn = new java.awt.TextField();
        jLabel18 = new javax.swing.JLabel();
        finishBtn = new java.awt.Button();
        jScrollPane3 = new javax.swing.JScrollPane();
        jList3 = new javax.swing.JList<>();
        jLabel19 = new javax.swing.JLabel();
        pageFaultsLabel = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        backLabel2 = new javax.swing.JLabel();
        iconLabel2 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        noOfFramesIn = new java.awt.TextField();
        jLabel22 = new javax.swing.JLabel();
        ProNameIn = new java.awt.TextField();
        addAnotherBtn = new java.awt.Button();
        jLabel24 = new javax.swing.JLabel();
        NoOfPagesIn = new java.awt.TextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        jList4 = new javax.swing.JList<>();
        jScrollPane5 = new javax.swing.JScrollPane();
        jList5 = new javax.swing.JList<>();
        finishBtn2 = new java.awt.Button();
        jLabel23 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        memoryFullLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        BGPanel.setBackground(new java.awt.Color(85, 35, 110));
        BGPanel.setPreferredSize(new java.awt.Dimension(1097, 704));

        sidePanel.setBackground(new java.awt.Color(54, 33, 90));

        contPanel.setBackground(new java.awt.Color(85, 55, 110));

        contLabel.setFont(new java.awt.Font("Consolas", 1, 26)); // NOI18N
        contLabel.setForeground(new java.awt.Color(255, 255, 255));
        contLabel.setText("Contiguous Allocation");
        contLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                contLabelMouseClicked(evt);
            }
        });

        nonContPanel5.setBackground(new java.awt.Color(85, 55, 110));

        nonContLabel5.setFont(new java.awt.Font("Consolas", 1, 26)); // NOI18N
        nonContLabel5.setForeground(new java.awt.Color(255, 255, 255));
        nonContLabel5.setText("Non-Contiguous Allocation");
        nonContLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nonContLabel5MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout nonContPanel5Layout = new javax.swing.GroupLayout(nonContPanel5);
        nonContPanel5.setLayout(nonContPanel5Layout);
        nonContPanel5Layout.setHorizontalGroup(
            nonContPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, nonContPanel5Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(nonContLabel5)
                .addGap(64, 64, 64))
            .addComponent(jSeparator12, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jSeparator13, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        nonContPanel5Layout.setVerticalGroup(
            nonContPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, nonContPanel5Layout.createSequentialGroup()
                .addComponent(jSeparator12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(nonContLabel5)
                .addGap(30, 30, 30)
                .addComponent(jSeparator13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        virPanel.setBackground(new java.awt.Color(85, 55, 110));

        virLabel.setFont(new java.awt.Font("Consolas", 1, 26)); // NOI18N
        virLabel.setForeground(new java.awt.Color(255, 255, 255));
        virLabel.setText("Non with Virtual Allocation");
        virLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                virLabelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout virPanelLayout = new javax.swing.GroupLayout(virPanel);
        virPanel.setLayout(virPanelLayout);
        virPanelLayout.setHorizontalGroup(
            virPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, virPanelLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(virLabel)
                .addGap(39, 39, 39))
        );
        virPanelLayout.setVerticalGroup(
            virPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(virPanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(virLabel)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout contPanelLayout = new javax.swing.GroupLayout(contPanel);
        contPanel.setLayout(contPanelLayout);
        contPanelLayout.setHorizontalGroup(
            contPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(nonContPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(virPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(contPanelLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(contLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        contPanelLayout.setVerticalGroup(
            contPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contPanelLayout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addComponent(contLabel)
                .addGap(30, 30, 30)
                .addComponent(nonContPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(virPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Memory Simulator System");

        javax.swing.GroupLayout sidePanelLayout = new javax.swing.GroupLayout(sidePanel);
        sidePanel.setLayout(sidePanelLayout);
        sidePanelLayout.setHorizontalGroup(
            sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(sidePanelLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addContainerGap())
        );
        sidePanelLayout.setVerticalGroup(
            sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidePanelLayout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jLabel1)
                .addGap(65, 65, 65)
                .addComponent(contPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.setBackground(new java.awt.Color(85, 35, 110));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 25)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Welcome to the MEMORY SIMULATOR SYSTEM");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 25)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Choose a simulation mode from the side panel shown");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(79, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(77, 77, 77))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addComponent(jLabel2)
                .addContainerGap(163, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(318, 318, 318)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addContainerGap(367, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(85, 35, 110));

        memSizeInput.setColumns(10);
        memSizeInput.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        memSizeInput.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                memSizeInputKeyPressed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Contiguous Allocation Mode");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Preferable Memory Size in KBs:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(240, 240, 240));
        jLabel6.setText("Add new process to memory:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(240, 240, 240));
        jLabel7.setText("Process ID");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(240, 240, 240));
        jLabel8.setText("Process Size in KBs");

        pIDInput.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        pSizeInput.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        jList1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jList1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jList1.setToolTipText("");
        jScrollPane1.setViewportView(jList1);

        confirmProcessBtn.setBackground(new java.awt.Color(85, 35, 110));
        confirmProcessBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        confirmProcessBtn.setForeground(new java.awt.Color(240, 240, 240));
        confirmProcessBtn.setLabel("Add New Process");
        confirmProcessBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmProcessBtnActionPerformed(evt);
            }
        });

        memStartSize.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        memStartSize.setForeground(new java.awt.Color(240, 240, 240));
        memStartSize.setText("0");

        memEndSize.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        memEndSize.setForeground(new java.awt.Color(240, 240, 240));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(240, 240, 240));
        jLabel9.setText("Memory");

        iconLabel.setIcon(new javax.swing.ImageIcon("E:\\Computer Engineering & Communications\\Computer Engineering Third Year\\3rd Year\\Operating Systems\\Projects\\Memory Simulation\\back.png")); // NOI18N
        iconLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iconLabelMouseClicked(evt);
            }
        });

        backLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        backLabel.setForeground(new java.awt.Color(240, 240, 240));
        backLabel.setText("Back");
        backLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backLabelMouseClicked(evt);
            }
        });

        deleteProBtn.setBackground(new java.awt.Color(85, 35, 110));
        deleteProBtn.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        deleteProBtn.setForeground(new java.awt.Color(240, 240, 240));
        deleteProBtn.setLabel("Delete Selected Process");
        deleteProBtn.setPreferredSize(new java.awt.Dimension(101, 25));
        deleteProBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteProBtnActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(240, 240, 240));
        jLabel12.setText("Size Remaining = ");

        sizeRemainingLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        sizeRemainingLabel.setForeground(new java.awt.Color(255, 51, 51));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(240, 240, 240));
        jLabel13.setText("Press Enter to Confirm");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(240, 240, 240));
        jLabel14.setText("Total number of holes    =");

        holesLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        holesLabel.setForeground(new java.awt.Color(240, 240, 240));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(240, 240, 240));
        jLabel15.setText("Total deleted processes = ");

        delProLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        delProLabel.setForeground(new java.awt.Color(240, 240, 240));

        jList2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jScrollPane2.setViewportView(jList2);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(240, 240, 240));
        jLabel10.setText("Waiting List");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(83, 83, 83))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(100, 100, 100))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(holesLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(memEndSize)
                                .addGap(30, 30, 30))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addGap(34, 34, 34)
                                            .addComponent(iconLabel)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(backLabel)
                                            .addGap(14, 14, 14)
                                            .addComponent(jLabel11)
                                            .addGap(132, 132, 132)
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jSeparator4)
                                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addContainerGap()
                                            .addComponent(jLabel5)
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel2Layout.createSequentialGroup()
                                                    .addGap(34, 34, 34)
                                                    .addComponent(memSizeInput, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(memStartSize, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(jPanel2Layout.createSequentialGroup()
                                                    .addGap(18, 18, 18)
                                                    .addComponent(jLabel13)))))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel2Layout.createSequentialGroup()
                                                    .addComponent(jLabel15)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(delProLabel)
                                                    .addGap(103, 103, 103))
                                                .addComponent(deleteProBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(confirmProcessBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                            .addComponent(pIDInput, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                        .addGap(53, 53, 53)
                                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                                .addGap(27, 27, 27)
                                                                .addComponent(pSizeInput, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                            .addComponent(jLabel8)))
                                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                        .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                                .addGap(225, 225, 225)))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sizeRemainingLabel))
                            .addComponent(jScrollPane1))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(backLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel4)
                                .addComponent(jLabel11)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(iconLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(3, 3, 3)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(memSizeInput, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(memStartSize))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel13)
                                .addGap(6, 6, 6)
                                .addComponent(jLabel6)
                                .addGap(3, 3, 3)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(pSizeInput, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel8))
                                        .addGap(24, 24, 24)
                                        .addComponent(pIDInput, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(25, 25, 25)
                                .addComponent(confirmProcessBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(deleteProBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(memEndSize))))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(sizeRemainingLabel)
                    .addComponent(jLabel15)
                    .addComponent(delProLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(holesLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        jPanel3.setBackground(new java.awt.Color(85, 35, 110));
        jPanel3.setPreferredSize(new java.awt.Dimension(858, 732));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Non-Contiguous Virtual Memory Allocation Mode");

        backLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        backLabel1.setForeground(new java.awt.Color(240, 240, 240));
        backLabel1.setText("Back");
        backLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backLabel1MouseClicked(evt);
            }
        });

        iconLabel1.setIcon(new javax.swing.ImageIcon("E:\\Computer Engineering & Communications\\Computer Engineering Third Year\\3rd Year\\Operating Systems\\Projects\\Memory Simulation\\back.png")); // NOI18N
        iconLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iconLabel1MouseClicked(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(240, 240, 240));
        jLabel17.setText("Number of pages:");

        pagesNoIn.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        pagesNoIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pagesNoInActionPerformed(evt);
            }
        });
        pagesNoIn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pagesNoInKeyPressed(evt);
            }
        });

        sequenceSingleIn.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        sequenceSingleIn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                sequenceSingleInKeyPressed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(240, 240, 240));
        jLabel18.setText("Enter Sequence one by one:");

        finishBtn.setBackground(new java.awt.Color(85, 35, 110));
        finishBtn.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        finishBtn.setForeground(new java.awt.Color(240, 240, 240));
        finishBtn.setLabel("Finish");
        finishBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                finishBtnMouseClicked(evt);
            }
        });

        jList3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jScrollPane3.setViewportView(jList3);

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 0, 0));
        jLabel19.setText("Page Faults  = ");

        pageFaultsLabel.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        pageFaultsLabel.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(281, 281, 281)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel19)
                                .addGap(18, 18, 18)
                                .addComponent(pageFaultsLabel))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(377, 377, 377)
                        .addComponent(finishBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(iconLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(backLabel1)
                                .addGap(48, 48, 48)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jSeparator5)
                                    .addComponent(jLabel16)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addGap(133, 133, 133)
                                .addComponent(pagesNoIn, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel18)
                                .addGap(47, 47, 47)
                                .addComponent(sequenceSingleIn, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(133, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(iconLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(backLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(40, 40, 40)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pagesNoIn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(sequenceSingleIn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addComponent(finishBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(pageFaultsLabel))
                .addContainerGap(92, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(85, 35, 110));
        jPanel4.setPreferredSize(new java.awt.Dimension(858, 732));

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Non-Contiguous Allocation Mode");

        backLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        backLabel2.setForeground(new java.awt.Color(240, 240, 240));
        backLabel2.setText("Back");
        backLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backLabel2MouseClicked(evt);
            }
        });

        iconLabel2.setIcon(new javax.swing.ImageIcon("E:\\Computer Engineering & Communications\\Computer Engineering Third Year\\3rd Year\\Operating Systems\\Projects\\Memory Simulation\\back.png")); // NOI18N
        iconLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iconLabel2MouseClicked(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(240, 240, 240));
        jLabel21.setText("Number of frames:");

        noOfFramesIn.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        noOfFramesIn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                noOfFramesInKeyPressed(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(240, 240, 240));
        jLabel22.setText("Process Name:");

        ProNameIn.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        ProNameIn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ProNameInKeyPressed(evt);
            }
        });

        addAnotherBtn.setBackground(new java.awt.Color(85, 35, 110));
        addAnotherBtn.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        addAnotherBtn.setForeground(new java.awt.Color(240, 240, 240));
        addAnotherBtn.setLabel("Add Another ");
        addAnotherBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addAnotherBtnMouseClicked(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(240, 240, 240));
        jLabel24.setText("No. Of Pages");

        NoOfPagesIn.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        NoOfPagesIn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                NoOfPagesInKeyPressed(evt);
            }
        });

        jList4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jScrollPane4.setViewportView(jList4);

        jList5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jScrollPane5.setViewportView(jList5);

        finishBtn2.setBackground(new java.awt.Color(85, 35, 110));
        finishBtn2.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        finishBtn2.setForeground(new java.awt.Color(240, 240, 240));
        finishBtn2.setLabel("Finish");
        finishBtn2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                finishBtn2MouseClicked(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(240, 240, 240));
        jLabel23.setText("Page Tables");

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(240, 240, 240));
        jLabel25.setText("Memory Frames");

        memoryFullLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        memoryFullLabel.setForeground(new java.awt.Color(255, 0, 51));
        memoryFullLabel.setText("Memory Is Full");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(iconLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(backLabel2)
                                .addGap(88, 88, 88)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel20)
                                    .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel23)
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel21)
                                        .addComponent(jLabel22)))
                                .addGap(43, 43, 43)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(noOfFramesIn, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                                            .addComponent(ProNameIn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(52, 52, 52)
                                        .addComponent(jLabel24)
                                        .addGap(43, 43, 43)
                                        .addComponent(NoOfPagesIn, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGap(9, 9, 9)
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(addAnotherBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(memoryFullLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE))
                                        .addGap(29, 29, 29)
                                        .addComponent(jLabel25))))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(61, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(329, 329, 329)
                    .addComponent(finishBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(345, Short.MAX_VALUE)))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(iconLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel20)
                            .addComponent(backLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(45, 45, 45)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(noOfFramesIn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(NoOfPagesIn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ProNameIn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
                .addGap(31, 31, 31)
                .addComponent(addAnotherBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(memoryFullLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane4)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49))
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(302, 302, 302)
                    .addComponent(finishBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(429, Short.MAX_VALUE)))
        );

        jLayeredPane2.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jPanel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jPanel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jPanel4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane2Layout = new javax.swing.GroupLayout(jLayeredPane2);
        jLayeredPane2.setLayout(jLayeredPane2Layout);
        jLayeredPane2Layout.setHorizontalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane2Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jLayeredPane2Layout.setVerticalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 758, Short.MAX_VALUE)
            .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane2Layout.createSequentialGroup()
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 33, Short.MAX_VALUE)))
            .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane2Layout.createSequentialGroup()
                    .addContainerGap(251, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(333, Short.MAX_VALUE)))
            .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout BGPanelLayout = new javax.swing.GroupLayout(BGPanel);
        BGPanel.setLayout(BGPanelLayout);
        BGPanelLayout.setHorizontalGroup(
            BGPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BGPanelLayout.createSequentialGroup()
                .addComponent(sidePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLayeredPane2)
                .addContainerGap())
        );
        BGPanelLayout.setVerticalGroup(
            BGPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sidePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(BGPanelLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLayeredPane2)
                .addGap(10, 10, 10))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BGPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 1294, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BGPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 785, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public ArrayList <Process> processList = new ArrayList<>();
    public ArrayList <Process> removedproList = new ArrayList<>();
    public ArrayList <Hole> holesList = new ArrayList<>();
    public ArrayList <Process> waitingList = new ArrayList<>();
    private void nonContLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nonContLabel5MouseClicked
        jLayeredPane2.removeAll();
        jLayeredPane2.repaint();
        jLayeredPane2.revalidate();
        jLayeredPane2.add(jPanel4);
        jLayeredPane2.repaint();
        jLayeredPane2.revalidate();
        memoryFullLabel.setVisible(false);
    }//GEN-LAST:event_nonContLabel5MouseClicked

    private void contLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contLabelMouseClicked
        jLayeredPane2.removeAll();
        jLayeredPane2.repaint();
        jLayeredPane2.revalidate();
        jLayeredPane2.add(jPanel2);
        jLayeredPane2.repaint();
        jLayeredPane2.revalidate();
    }//GEN-LAST:event_contLabelMouseClicked

    private void backLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backLabelMouseClicked
        jLayeredPane2.removeAll();
        jLayeredPane2.repaint();
        jLayeredPane2.revalidate();
        jLayeredPane2.add(jPanel1);
        jLayeredPane2.repaint();
        jLayeredPane2.revalidate();
    }//GEN-LAST:event_backLabelMouseClicked

    private void iconLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconLabelMouseClicked
        jLayeredPane2.removeAll();
        jLayeredPane2.repaint();
        jLayeredPane2.revalidate();
        jLayeredPane2.add(jPanel1);
        jLayeredPane2.repaint();
        jLayeredPane2.revalidate();
    }//GEN-LAST:event_iconLabelMouseClicked
    private int memSizeInputI;
    private Process newProcess;
    private void confirmProcessBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmProcessBtnActionPerformed
        String pIdS = pIDInput.getText();
        int pSizeI = Integer.parseInt(pSizeInput.getText());
        newProcess = new Process (pIdS, pSizeI);
        jList2.setModel(dlm2);
        if(memSizeInputI == 0){
            JOptionPane.showMessageDialog(this, "Memory Full !");
            System.out.println("memory full");
            return;
        }       
        else if(pSizeI > memSizeInputI){
            JOptionPane.showMessageDialog(this, "Process Size is larger than available memory, was added to waiting list.");
            waitingList.add(newProcess);
            dlm2.addElement(newProcess.getpID() + " (Size = " + newProcess.getpSize() + " KBs)");
            pSizeInput.setText("");
            pIDInput.setText("");
            return;
        }
        memEndSize.setText(memSizeInput.getText());        
        //newProcess = new Process (pIdS, pSizeI);       
        confirmProcessInCaseOfHoles();
        if (processList.indexOf(newProcess) == 0) newProcess.setBase(0);
        else newProcess.setBase((processList.get(processList.indexOf(newProcess)-1)).getLimit());
        jList1.setModel(dlm);
        newProcess.setLimit(newProcess.getBase(), newProcess.getpSize());
        for (int i=0; i<processList.size(); i++){
            if(processList.get(i).isPrinted()) {continue;}
            dlm.addElement(processList.get(i).getpID() +" ("+ newProcess.getBase() + " KBs --> " + (newProcess.getLimit()-1) + " KBs)");
            processList.get(i).setPrinted(true);
        }
        pIDInput.setText("");
        pSizeInput.setText("");
        System.out.println(processList);
        memSizeInputI -= newProcess.getpSize();
        sizeRemainingLabel.setText(String.valueOf(memSizeInputI));
    }//GEN-LAST:event_confirmProcessBtnActionPerformed
    
    private void confirmProcessInCaseOfHoles () {
        int holesNum = holesList.size();    
        if(holesNum > 0){
            for (int i=0; i<holesList.size(); i++){
                if (newProcess.getpSize() <= holesList.get(i).getholeSize()){
                    if(processList.contains(null)){
                        int iz = processList.indexOf(null);
                        processList.add(iz, newProcess);
                        holesList.remove(holesList.get(i));
                        processList.remove(iz+1);
                        break;
                    }
                }
            }
            holesNum--;
            holesLabel.setText(String.valueOf(holesNum));
            
        } else {
            processList.add(newProcess);
        }
    }

    private void deleteProBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteProBtnActionPerformed
        int index = jList1.getSelectedIndex();
        Process removedProStore = processList.get(index);
        Hole hole = new Hole (index, removedProStore.getpSize());
        holesList.add(hole);       
        removedproList.add(removedProStore);
        memSizeInputI += removedProStore.getpSize();
        sizeRemainingLabel.setText(String.valueOf(memSizeInputI));
        dlm.setElementAt("" + "\n" + "\n", index);
        dlm.remove(index);
        processList.set(index,null);    
        delProLabel.setText(String.valueOf(removedproList.size()));
        holesLabel.setText (String.valueOf(holesList.size()));
        System.out.println("pro list: " + processList);
        System.out.println("removed list: " + removedproList);
        System.out.println("no of holes: " + holesList.size());
    }//GEN-LAST:event_deleteProBtnActionPerformed

    private void memSizeInputKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_memSizeInputKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER) {
            memSizeInputI = Integer.parseInt(memSizeInput.getText());
            System.out.println("Enter pressed to confirm memory size = " + memSizeInputI);
            sizeRemainingLabel.setText(String.valueOf(memSizeInputI));
        }
    }//GEN-LAST:event_memSizeInputKeyPressed

    private void backLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backLabel1MouseClicked
        jLayeredPane2.removeAll();
        jLayeredPane2.repaint();
        jLayeredPane2.revalidate();
        jLayeredPane2.add(jPanel1);
        jLayeredPane2.repaint();
        jLayeredPane2.revalidate();
    }//GEN-LAST:event_backLabel1MouseClicked

    private void iconLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconLabel1MouseClicked
        jLayeredPane2.removeAll();
        jLayeredPane2.repaint();
        jLayeredPane2.revalidate();
        jLayeredPane2.add(jPanel1);
        jLayeredPane2.repaint();
        jLayeredPane2.revalidate();
    }//GEN-LAST:event_iconLabel1MouseClicked

    private void pagesNoInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pagesNoInActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pagesNoInActionPerformed
        int noOfPagesIn;
    private void pagesNoInKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pagesNoInKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER) {
            noOfPagesIn = Integer.parseInt(pagesNoIn.getText());
            System.out.println("Number of pages entered = " + noOfPagesIn + " pages");
        }
    }//GEN-LAST:event_pagesNoInKeyPressed

    private void sequenceSingleInKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sequenceSingleInKeyPressed
       if(evt.getKeyCode() == KeyEvent.VK_ENTER){
        int currSeqIn = Integer.parseInt(sequenceSingleIn.getText());
        if(currSeqIn < noOfPagesIn){
            sequenceList.add(currSeqIn);
            sequenceSingleIn.setText("");
        } else {
            JOptionPane.showMessageDialog(this, "Number entered is larger than no. of pages !");
            sequenceSingleIn.setText("");
            return;
        }
       }
    }//GEN-LAST:event_sequenceSingleInKeyPressed

    private int sequenceArr [];
    private ArrayList <Integer> sequenceList = new ArrayList<>();
    private void virLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_virLabelMouseClicked
        jLayeredPane2.removeAll();
        jLayeredPane2.repaint();
        jLayeredPane2.revalidate();
        jLayeredPane2.add(jPanel3);
        jLayeredPane2.repaint();
        jLayeredPane2.revalidate();
    }//GEN-LAST:event_virLabelMouseClicked

    private void finishBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_finishBtnMouseClicked
        sequenceArr = new int [sequenceList.size()];
        for(int i=0; i<sequenceList.size(); i++)
            sequenceArr [i] = sequenceList.get(i);
        displayArr(sequenceArr);
        // m.k
        Virtual_memory_sim virtual = new Virtual_memory_sim(noOfPagesIn, sequenceArr.length);
        Virtual_memory_sim.doubly_LinkList mm = virtual.new doubly_LinkList();
        mm.Allocate(sequenceArr);
        mm.displayForward();
        jList3.setModel(dlm3);
        for(int i=0; i<virtual.virtualList.size(); i++){
            dlm3.addElement(virtual.virtualList.get(i));
        }
        pageFaultsLabel.setText(String.valueOf(Virtual_memory_sim.page_faults));
    }//GEN-LAST:event_finishBtnMouseClicked

    private void backLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backLabel2MouseClicked
        jLayeredPane2.removeAll();
        jLayeredPane2.repaint();
        jLayeredPane2.revalidate();
        jLayeredPane2.add(jPanel1);
        jLayeredPane2.repaint();
        jLayeredPane2.revalidate();
    }//GEN-LAST:event_backLabel2MouseClicked

    private void iconLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconLabel2MouseClicked
        jLayeredPane2.removeAll();
        jLayeredPane2.repaint();
        jLayeredPane2.revalidate();
        jLayeredPane2.add(jPanel1);
        jLayeredPane2.repaint();
        jLayeredPane2.revalidate();
    }//GEN-LAST:event_iconLabel2MouseClicked
        List memoryFrames;
    private void noOfFramesInKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_noOfFramesInKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            memoryFrames = NonContig.memoryToFrames(Integer.parseInt(noOfFramesIn.getText()));
            System.out.println(memoryFrames);
            //noOfFramesIn.setText("");
        }
    }//GEN-LAST:event_noOfFramesInKeyPressed
        List <ProcessNon> ProcessListnon = new ArrayList <> (); 
        List <String>  ProcessDetectedNames = new ArrayList <> (); 
        String nonproNameIn;
        int noOfpages;
    private void ProNameInKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ProNameInKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            nonproNameIn = ProNameIn.getText();
            ProcessDetectedNames.add(nonproNameIn);
        }        
    }//GEN-LAST:event_ProNameInKeyPressed

    private void addAnotherBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addAnotherBtnMouseClicked
       ProNameIn.setText("");
       NoOfPagesIn.setText("");
    }//GEN-LAST:event_addAnotherBtnMouseClicked

    private void NoOfPagesInKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NoOfPagesInKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER) {
            noOfpages = Integer.parseInt(NoOfPagesIn.getText());
            for (int i=0; i < noOfpages ;i++){
                ProcessListnon.add(new ProcessNon(nonproNameIn, i));           
            }  
        }
    }//GEN-LAST:event_NoOfPagesInKeyPressed
        NonContig nonCont = new NonContig();
    private void finishBtn2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_finishBtn2MouseClicked
        NonContig.addPagesToMemory(memoryFrames, ProcessListnon, ProcessDetectedNames);
        System.out.println("memory frames : " + memoryFrames);
        System.out.println("process list: " + ProcessListnon);
        System.out.println("detected: " + ProcessDetectedNames);
        jList5.setModel(dlm5);
        for(int i=0; i<memoryFrames.size(); i++){
            dlm5.addElement(memoryFrames.get(i));
        }
        jList4.setModel(dlm4);
        displayList(memoryFrames, ProcessDetectedNames);
        setRedLabelMemoryFull();
    }//GEN-LAST:event_finishBtn2MouseClicked
    
    private void displayArr (int [] arr){
        for(int i : arr) System.out.print(i + " ");
    }
    
    DefaultListModel dlm = new DefaultListModel();
    DefaultListModel dlm2 = new DefaultListModel();
    DefaultListModel dlm3 = new DefaultListModel();
    DefaultListModel dlm4 = new DefaultListModel();
    DefaultListModel dlm5 = new DefaultListModel();
    
    public void displayList (List <ProcessNon> memorylist,List <String> detected) {
         for (int i=0; i<detected.size(); i++){
             String currProName = detected.get(i);
             for(int j=0; j<memorylist.size(); j++){
                 if ( memorylist.get(j) != null){
                 String currPro = memorylist.get(j).getprocessName();
                 if(currPro.equals(currProName)){
                     System.out.println("Process: " + currPro + " ,page: " + memorylist.get(j).getProcessPageNumber()
                      + ", in frame: " + memorylist.indexOf(memorylist.get(j)));
                     dlm4.addElement("Process: " + currPro + " ,page: " + memorylist.get(j).getProcessPageNumber()
                      + ", in frame: " + memorylist.indexOf(memorylist.get(j)));
                 }
                 }              
             }
             System.out.println();
         }
     }
    
    public void setRedLabelMemoryFull () {
        if(ProcessListnon.size() > memoryFrames.size()){
            memoryFullLabel.setVisible(true);
        }
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SimGUI().setVisible(true);
            }
        });      
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BGPanel;
    private java.awt.TextField NoOfPagesIn;
    private java.awt.TextField ProNameIn;
    private java.awt.Button addAnotherBtn;
    private javax.swing.JLabel backLabel;
    private javax.swing.JLabel backLabel1;
    private javax.swing.JLabel backLabel2;
    private java.awt.Button confirmProcessBtn;
    private javax.swing.JLabel contLabel;
    private javax.swing.JPanel contPanel;
    private javax.swing.JLabel delProLabel;
    private java.awt.Button deleteProBtn;
    private java.awt.Button finishBtn;
    private java.awt.Button finishBtn2;
    private javax.swing.JLabel holesLabel;
    private javax.swing.JLabel iconLabel;
    private javax.swing.JLabel iconLabel1;
    private javax.swing.JLabel iconLabel2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JList<String> jList1;
    private javax.swing.JList<String> jList2;
    private javax.swing.JList<String> jList3;
    private javax.swing.JList<String> jList4;
    private javax.swing.JList<String> jList5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JLabel memEndSize;
    private java.awt.TextField memSizeInput;
    private javax.swing.JLabel memStartSize;
    private javax.swing.JLabel memoryFullLabel;
    private java.awt.TextField noOfFramesIn;
    private javax.swing.JLabel nonContLabel5;
    private javax.swing.JPanel nonContPanel5;
    private java.awt.TextField pIDInput;
    private java.awt.TextField pSizeInput;
    private javax.swing.JLabel pageFaultsLabel;
    private java.awt.TextField pagesNoIn;
    private java.awt.TextField sequenceSingleIn;
    private javax.swing.JPanel sidePanel;
    private javax.swing.JLabel sizeRemainingLabel;
    private javax.swing.JLabel virLabel;
    private javax.swing.JPanel virPanel;
    // End of variables declaration//GEN-END:variables
}
