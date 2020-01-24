package com.suner;

import java.util.ArrayList;

public class BattleAirplane extends Airplane {
    private ArrayList<Missile> Missiles = new ArrayList<>();
    private Double MaxShootingRange;
    private boolean IsEnemy;
    private boolean encrypted;

    public BattleAirplane(String brand, String model, String licensePlate, String origin, String destination, Double autonomy, int passengerCapacity, int crew, Double maxShootingRange, boolean isEnemy, int quantityMissiles, Double missilesDamage) {
        super(brand, model, licensePlate, origin, destination, autonomy, passengerCapacity, crew);
        MaxShootingRange = maxShootingRange;
        IsEnemy = isEnemy;
        AddMissile(new Missile(missilesDamage), quantityMissiles);
        encrypted = false;
    }

    public ArrayList<Missile> getMissiles() {
        return Missiles;
    }
    public void setMissiles(ArrayList<Missile> missiles) {
        Missiles = missiles;
    }

    public Double getMaxShootingRange() {
        return MaxShootingRange;
    }
    public void setMaxShootingRange(Double maxShootingRange) {
        MaxShootingRange = maxShootingRange;
    }

    public boolean isEnemy() {
        return IsEnemy;
    }
    public void setEnemy(boolean enemy) {
        IsEnemy = enemy;
    }

    public boolean isEncrypted() {
        return encrypted;
    }
    public void setEncrypted(boolean encrypted) {
        this.encrypted = encrypted;
    }

    /*----------------------------------------------------------------------------------------------------------*/

    public void AddMissile(Missile missile, int quantityMissiles) {
        for(int i = 0; i < quantityMissiles; i++) {
            Missiles.add(missile);
        }
    }

    public String EnemyShow() {
        return IsEnemy == true ? "Si" : "No";
    }

    @Override
    public String toString() {
        if (encrypted) {
            return Texts.getCombatAirplaneTxt() + super.getLicensePlate() + Texts.getIsEncryptedTxt();
        }
        else {
            return Texts.getCombatAirplaneTxt() + super.toString() + Texts.getMaximumFiringRangeTxt() + MaxShootingRange + Texts.getIsEnemyOrNotTxt() + EnemyShow() + Texts.getNumberOfMissilesTxt() + Missiles.size();
        }
    }
}
