package com.suner;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Base64;

public class AirTrafficController {
    FrontEnd frontEnd = new FrontEnd();
    private static String CharsetName = "utf-8";

    private ArrayList<Airplane> Airplanes = new ArrayList<>();
    private int[] VisibleSpace = new int[]{1000, 1000};

    public ArrayList<Airplane> getAirplanes() {
        return Airplanes;
    }
    public void setAirplanes(ArrayList<Airplane> airplanes) {
        Airplanes = airplanes;
    }

    public boolean AddAirplane(Airplane airplane) {
        return Airplanes.add(airplane);
    }

    public void RemoveAirplane(Airplane airplane) {
        Airplanes.remove(airplane);
    }

    public void ShowAirplanes() {
        for (Airplane a : Airplanes) {
            System.out.println(a.toString());
        }
    }

    public void ShowBattleAirplanes() {
        for (Airplane a : Airplanes) {
            if (a instanceof BattleAirplane) {
                System.out.println(a.toString());
            }
        }
    }

    public void ShowAirplanesShootingRange(BattleAirplane battleAirplane) {
        for (Airplane a : Airplanes) {
            if (Math.abs(a.getCoordinates().getX() - battleAirplane.getCoordinates().getX()) <= battleAirplane.getMaxShootingRange() && Math.abs(a.getCoordinates().getY() - battleAirplane.getCoordinates().getY()) <= battleAirplane.getMaxShootingRange()) {
                if (a != battleAirplane) {
                    System.out.println(a.toString());
                }
            }
        }
    }

    public Airplane SearchAirplane(String licensePlate) {
        Airplane airplane = null;
        for (Airplane a : Airplanes) {
            if (a.getLicensePlate().equals(licensePlate)) {
                airplane = a;
            }
        }
        return airplane;
    }

    public boolean SearchAirplaneInTrack() {
        boolean inTrack = false;

        for (Airplane a : Airplanes) {
            if (a.isTakenOff() == false) {
                inTrack = true;
            }
        }

        return inTrack;
    }

    public boolean CheckCollision(int X, int Y) {
        boolean collision = false;

        for (Airplane a : Airplanes) {
            if (a.getCoordinates().getX() == X && a.getCoordinates().getY() == Y) {
                collision = true;
            }
        }

        return collision;
    }

    public void Warnings(){
        boolean x = false;
        for(int a = 0;a < Airplanes.size() ;a++){
            for(int b = 0; b < a ;a++){
                if(Airplanes.get(a) != Airplanes.get(b)){
                    if((Math.abs(Airplanes.get(a).getCoordinates().getX() - Airplanes.get(b).getCoordinates().getX()) <= 200 && Math.abs(Airplanes.get(a).getCoordinates().getY() - Airplanes.get(b).getCoordinates().getY()) <= 200 && Airplanes.get(a).getCoordinates().getZ() == Airplanes.get(b).getCoordinates().getZ()) || (Math.abs(Airplanes.get(a).getCoordinates().getZ() - Airplanes.get(b).getCoordinates().getZ()) <= 200 && Airplanes.get(a).getCoordinates().getX() == Airplanes.get(b).getCoordinates().getX() && Airplanes.get(a).getCoordinates().getY() == Airplanes.get(b).getCoordinates().getY())){
                        System.out.println(Texts.getTheAirplaneTxt() + Airplanes.get(a).getBrand() + Texts.getWhithLicencePlateTxt() + Airplanes.get(a).getLicensePlate() + Texts.getAndTheAirplaneTxt() + Airplanes.get(b).getBrand() + Texts.getWhithLicencePlateTxt() + Airplanes.get(b).getLicensePlate() + Texts.getVeryCloseRiskOfCollisionTxt());
                        System.out.println(Texts.getCoordinatesInQuestionTxt());
                        System.out.println(Texts.getAirplaneTxt() + Airplanes.get(a).getBrand() + Texts.getTwoDotsTxt() + Airplanes.get(a).getCoordinates());
                        System.out.println(Texts.getAirplaneTxt() + Airplanes.get(b).getBrand() + Texts.getTwoDotsTxt() + Airplanes.get(b).getCoordinates());
                        x = true;
                    }
                }
            }
        }

        if(!x){
            System.out.println(Texts.getEverythingInOrderTxt());
        }
    }

    public boolean CheckIfEncrypted(String licensePlate) {
        boolean isEncrypted = false;
        for (Airplane a : Airplanes) {
            if (a instanceof BattleAirplane ) {
                BattleAirplane a2 = (BattleAirplane) a;
                if (a2.isEncrypted()) {
                    isEncrypted = true;
                }
            }
        }
        return isEncrypted;
    }

    public static String Encrypt(String s) throws UnsupportedEncodingException {
        return Base64.getEncoder().encodeToString(s.getBytes(CharsetName));
    }

    public static String Decrypt(String s) throws UnsupportedEncodingException {
        byte[] decode = Base64.getDecoder().decode(s.getBytes());
        return new String(decode, CharsetName);
    }

}
