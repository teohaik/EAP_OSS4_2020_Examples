package fractiongui;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author tchaikalis
 */
public class CalcFrame extends JFrame{
    
    private JLabel lblNominator, lblDenominator, lblResult;
    private JTextField txtNominator, txtDenominator;
    private JButton calcButton;
    
    public CalcFrame(){
        super("Division Frame");
        
        lblNominator = new JLabel("Nominator");
        lblDenominator = new JLabel("Denominator");
        lblResult = new JLabel("Result");
        txtNominator = new JTextField(10);
        txtDenominator = new JTextField(10);
        calcButton = new JButton("Calculate");
        calcButton.addActionListener(this::calcButtonClicked);
        
        
        JPanel masterPanel = new JPanel();

        JPanel textPanel = new JPanel();
        textPanel.setLayout(new GridLayout(2, 2));
        
        textPanel.add(lblNominator);
        textPanel.add(txtNominator);
        textPanel.add(lblDenominator);
        textPanel.add(txtDenominator);
        
        masterPanel.add(textPanel, BorderLayout.LINE_START);
        masterPanel.add(calcButton, BorderLayout.LINE_END);
        masterPanel.add(lblResult, BorderLayout.PAGE_END);
        
        this.setContentPane(masterPanel);
               
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(350,150);
        setVisible(true);
    }
    
    public void calcButtonClicked(ActionEvent e) {
        String nomText = txtNominator.getText();
        String denomText = txtDenominator.getText();
        if(!nomText.isEmpty() && !nomText.contains(",")
                && !denomText.isEmpty() && !denomText.contains(",")){
            double nominator = Double.parseDouble(nomText);
            double denominator = Double.parseDouble(denomText);
            
            Fraction f = new Fraction(nominator, denominator);
            double value = f.getValue();
            lblResult.setText("Result = "+value);
            
        }
    }
   

}
