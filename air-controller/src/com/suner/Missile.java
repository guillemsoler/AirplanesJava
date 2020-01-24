package com.suner;

public class Missile {
    private Double Damage;

    public Missile(Double damage) {
        Damage = damage;
    }

    public Double getDamage() {
        return Damage;
    }

    public void setDamage(Double damage) {
        Damage = damage;
    }

    @Override
    public String toString() {
        return Texts.getMissileArrayTxt() +
                Texts.getDamageTxt() + Damage +
                Texts.getEndBracketTxt();
    }
}
