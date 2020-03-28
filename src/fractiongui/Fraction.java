/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fractiongui;

/**
 *
 * @author tchaikalis
 */
public class Fraction {
    
    private double nominator;
    private double denominator;

    public Fraction(double nominator, double denominator) {
        if(Double.compare(denominator, 0) == 0) {
            throw new NumberFormatException("Denominator cannot be zero!");
        }
        this.nominator = nominator;
        this.denominator = denominator;
    }

    public double getNominator() {
        return nominator;
    }

    public void setNominator(double nominator) {
        this.nominator = nominator;
    }

    public double getDenominator() {
        return denominator;
    }

    public void setDenominator(double denominator) {
        this.denominator = denominator;
    }

    @Override
    public String toString() {
        return "" + nominator + "/" + denominator ;
    } 
    
    public double getValue(){
        return (nominator / denominator);
    }
    
}
