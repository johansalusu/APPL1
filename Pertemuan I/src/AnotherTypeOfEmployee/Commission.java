/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AnotherTypeOfEmployee;

/**
 *
 * @author Johan Salusu
 */

//********************************************************************
// Commission.java Author: Lewis/Loftus
//
// ....
//********************************************************************
public class Commission extends Hourly
{
    private double totalSales; 
    private double commissionRate;
    
    public Commission(String eName, String eAddress, String ePhone, String socSecNumber, double rate, double comrate)
    {
        super(eName, eAddress, ePhone, socSecNumber, rate);
        commissionRate = comrate;
        totalSales = 0;
    }
    public void addSales(double newtotalSales)
    {
        totalSales += newtotalSales;
    }
    @Override
    public double pay()
    {
        totalSales = totalSales*commissionRate;
        totalSales = totalSales + super.pay(); 
        double myPay = totalSales;
        totalSales = 0;
        return myPay;
    }
    @Override
    public String toString()
    {
        String result = super.toString();
        result += "\nTotal Sales: "+ totalSales;
        return result;
    }
}