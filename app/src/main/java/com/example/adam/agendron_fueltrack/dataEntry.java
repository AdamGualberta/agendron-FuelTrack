package com.example.adam.agendron_fueltrack;

import java.util.Date;

/**
 * Created by Adam on 31/01/2016.
 */
public class dataEntry {
    dateEntry newDate = new dateEntry();
    stationEntry newStation = new stationEntry();
    odometerEntry newOdometer = new odometerEntry();
    gradeEntry newGrade = new gradeEntry();
    amountEntry newAmount = new amountEntry();
    unitcostEntry newUnitcost = new unitcostEntry();
    Float finalcostCalc;
    int index;

    public void setDate(String date){
        this.newDate.setDate(date);
    }

    public void setStation(String station){
        this.newStation.setStation(station);
    }

    public void setOdometer(Float odometer){
        this.newOdometer.setOdometer(odometer);
    }

    public void setGrade(String grade){
        this.newGrade.setGrade(grade);
    }

    public void setAmount(Float amount){
        this.newAmount.setAmount(amount);
    }

    public void setUnitcost(Float unitcost){
        this.newUnitcost.setUnitcost(unitcost);
    }

    public void setFinalcost(Float finalcostCalc){
        this.finalcostCalc = finalcostCalc;
    }

    public void setIndex(int index){
        this.index = index;
    }

    public int getIndex(){
        return this.index;
    }
}
