package views;

import helpers.Artist_Swing;

import java.awt.Dimension;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JToggleButton;
import models.Tower_Fire;
import models.Tower_IceBeam;
import models.Tower_Laser;
import models.Tower_SpreadShot;

/**
 *
 * 
 * 
 */
public class GameControlPanel extends JPanel  {
	private final int buttonSize = 90;

    /**
     *
     */
	private static final String SPREADTEXT = "A Spread-beam tower. Shoot multiple enemies with a slightly less powerful beam.";
	private static final String LASERTEXT = "A Laser-beam tower. Normal attack.";
	private static final String ICETEXT = "An Ice-beam tower. Slow enemies who are shot by it.";
	private static final String FIRETEXT = "A Fire-beam tower. Light critters on fire and damages them over time.";
    public static final int CONTROLPANELHEIGHT = 150;
	//we have our two control panels.
	JPanel towerControlPanel = new JPanel();
	JPanel generalControlPanel = new JPanel();
	//our tower control panel will have all info pertaining to our tower
	//this includes tower buttons, upgrading, selling, etc
	JButton bSellTower = new JButton("Sell");
	JButton bUpgradeTower = new JButton("Upgrade");
	JTextArea lblTowerInfo = new JTextArea("No tower selected");
	JLabel lblBuildTowerPrompt = new JLabel("Tower:");
	ButtonGroup towerGroup = new ButtonGroup();
	JToggleButton bSpread = new JToggleButton("Spread (" + Tower_SpreadShot.getBuyPrice() + ")");
	JToggleButton bFire = new JToggleButton("Fire (" + Tower_Fire.getBuyPrice() + ")");
	JToggleButton bIceBeam = new JToggleButton("Ice (" + Tower_IceBeam.getBuyPrice() + ")");
	JToggleButton bLaser = new JToggleButton("Laser (" + Tower_Laser.getBuyPrice() + ")");
	JToggleButton bNone = new JToggleButton("Check");
	
	
	//our general control panel will have general info (lives, money)
	//this also includes main menu button, pausing, speeding up game, etc.
	JButton bStartWave = new JButton("Game Start!");
	JLabel lblInfo = new JLabel("| Lives = " + ", Money = " + ", Wavenumber =  |");
	JButton bPause = new JButton("Pause");
	JButton bReturn = new JButton("Main Menu");
	
	

    /**
     *
     */
    public GameControlPanel(){
		//add our buttons to a group so only one can be selected at once.
		towerGroup.add(bSpread);
		towerGroup.add(bFire);
		towerGroup.add(bIceBeam);
		towerGroup.add(bLaser);
		towerGroup.add(bNone);
		
		bUpgradeTower.setPreferredSize(new Dimension(buttonSize+30,20));
		bSellTower.setPreferredSize(new Dimension(buttonSize, 20));
		bSpread.setPreferredSize(new Dimension(buttonSize+30, 20));
		bFire.setPreferredSize(new Dimension(buttonSize, 20));
		bIceBeam.setPreferredSize(new Dimension(buttonSize, 20));
		bLaser.setPreferredSize(new Dimension(buttonSize+10, 20));
		bNone.setPreferredSize(new Dimension(buttonSize-10, 20));
		bSpread.setName("Spread");
		bFire.setName("Fire");
		bIceBeam.setName("IceBeam");
		bLaser.setName("Laser");
		bNone.setName("None");
		bSpread.setToolTipText(SPREADTEXT);
		bLaser.setToolTipText(LASERTEXT);
		bIceBeam.setToolTipText(ICETEXT);
		bFire.setToolTipText(FIRETEXT);
		
		
		Font oldFont = lblInfo.getFont();
		lblInfo.setFont(new Font(oldFont.getFontName(), Font.BOLD, oldFont.getSize()));
		//format the slider
		
		towerControlPanel.add(lblTowerInfo);
		
		towerControlPanel.add(bUpgradeTower);
		towerControlPanel.add(bSellTower);
		towerControlPanel.add(lblBuildTowerPrompt);
		towerControlPanel.add(bSpread);
		towerControlPanel.add(bFire);
		towerControlPanel.add(bIceBeam);
		towerControlPanel.add(bLaser);
		towerControlPanel.add(bSpread);
		towerControlPanel.add(bNone);
        //add everything to this panel.
		
		generalControlPanel.add(bStartWave);
		generalControlPanel.add(lblInfo);
		
		generalControlPanel.add(bPause);
		generalControlPanel.add(bReturn);
        
		//add our two panels to the main panel
		this.add(towerControlPanel);
		this.add(generalControlPanel);
		this.setSize(Artist_Swing.PIXELWIDTH, CONTROLPANELHEIGHT);
		this.validate();
	}

    /**
     *
     * @return
     */
    public JButton getSellButton(){
		return this.bSellTower;
	}
	
    /**
     *
     * @return
     */
    public JButton getUpgradeButton(){
		return this.bUpgradeTower;
	}
    
    /**
     *
     * @return
     */
    public static int getControlPanelHeight(){
		return CONTROLPANELHEIGHT;
	}

    /**
     *
     * @return
     */
    public JLabel getInfoLabel(){
		return lblInfo;
	}

    /**
     *
     * @param text
     */
    public void setTowerInfoLabelText(String text){
		lblTowerInfo.setText(text);
	}

    /**
     *
     * @param text
     */
    public void setInfoLabelText(String text){
		lblInfo.setText(text);
	}
	
    /**
     *
     * @return
     */
    public JButton getPauseButton(){
		return bPause;
	}

    /**
     *
     * @return
     */
    public JButton getReturnButton(){
		return bReturn;
	}

    /**
     *
     * @return
     */
    public JButton getStartWaveButton(){
		return null;
	}

    /**
     *
     * @return
     */
    public JToggleButton getSpreadButton(){
		return bSpread;
	}

    /**
     *
     * @return
     */
    public JToggleButton getFireButton(){
		return bFire;
	}

    /**
     *
     * @return
     */
    public JToggleButton getIceButton(){
		return bIceBeam;
	}

    /**
     *
     * @return
     */
    public JToggleButton getLaserButton(){
		return bLaser;
	}

    /**
     *
     * @return
     */
    public JToggleButton getNoneButton(){
		return bNone;
	}

    

    /**
     *
     * @return
     */
    public JComboBox<String> getCBStrategy(){
		return null;
	}


}
