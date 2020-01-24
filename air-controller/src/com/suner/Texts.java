package com.suner;

public class Texts {
    //Airplane
    private static String brandTxt = "Marca = ";
    private static String modelTxt = "Model = ";
    private static String licensePlateTxt = "Matrícula = ";
    private static String originTxt = "Origen = ";
    private static String destinationTxt = "Destinació = ";
    private static String speedTxt = "Velocitat = ";
    private static String autonomyTxt = "Autonomia = ";
    private static String undercarriageTxt = "Tren d'aterratge = ";
    private static String engineTxt = "Motor = ";
    private static String coordinatesTxt = "Coordenades = ";
    private static String passengerCapacityTxt = "Capacitat de passatgers = ";
    private static String crewTxt = "Tripulants = ";
    //AirTrafficController
    private static String everythingInOrderTxt = "Tot en ordre.";
    private static String theAirplaneTxt = "L'avió ";
    private static String whithLicencePlateTxt = " (amb matrícula ";
    private static String andTheAirplaneTxt = ") i l'avió ";
    private static String veryCloseRiskOfCollisionTxt = ") són molt a props. Risc de possible colissió.";
    private static String coordinatesInQuestionTxt = "Coordenades dels avions en qüestió: ";
    private static String AirplaneTxt = "Avió ";
    private static String TwoDotsTxt = ": ";
    //BattleAirplane
    private static String CombatAirplaneTxt = "Avió de combat ";
    private static String IsEncryptedTxt = " està encriptat!";
    private static String MaximumFiringRangeTxt = ", Rang de dispar màxim: ";
    private static String IsEnemyOrNotTxt = ", Enemic? Y/N";
    private static String NumberOfMissilesTxt = ", Quantitat de missils: ";
    //CommercialAirplane
    private static String CommercialAirplaneTxt = "Avió Comerical: ";
    private static String AdaptedTxt = ", Adaptat = ";
    //Coordinate
    private static String XTxt = "X=";
    private static String YTxt = ", Y=";
    private static String ZTxt = ", Z=";
    //Missile
    private static String MissileArrayTxt = "Missile{";
    private static String DamageTxt = "Damage=";
    private static char EndBracketTxt = '}';
    //Inputs

    //Menus
    private static String OnlyCanHave10AirplanesTxt = "Només es poden haver-hi 10 avions a l'espai aeri!";
    private static String AirplaneInLandingTrackCantCreateAirplaneTxt = "Hi ha un avió a la pista. No pots crear l'avió.";
    private static String IndicateLicensePlateToBeEncryptedTxt = "Indica la matrícula del avió a encriptar: ";
    private static String EncryptionAirplaneTxt = "Encriptant avió...";
    private static String SuccesfullyEncryptedTxt = "Encriptat exitosament!";
    private static String IndicatesLicensePlateToBeDecryptTxt = "Indica la matrícula del avió a desencriptar: ";
    private static String DecryptionAirplaneTxt = "Deseencriptant avió...";
    private static String DecryptSuccesfullyTxt = "Desencriptat exitosament!";
    private static String ItIsAdaptedTxt = "És adaptat? (S/N): ";
    private static String Error = "ERROR";
    private static String MenuRedirectionTxt = "S'et redirigirà al menú de inici...";
    private static String LetterSTxt = "S";
    private static String MissileDamageTxt = "Dany dels missils: ";
    private static String SuccesfullyAdded = "S'ha afegit existosament!";
    private static String IntroduceLicensePlatAirplaneToManage = "Introdueix la matrícula del avió a gestionar: (0 per sortir) ";
    private static String Number0Txt = "0";
    private static String NoPlaneCouldBeFoundWithThisLicensePlateTxt = "No s'ha pogut trobar cap avió amb aquesta matrícula.";
    private static String AirplaneFoundTxt = "S'ha trobat l'avió ";
    private static String WithLicensePlateTxt = " amb matrícula ";
    private static String DotTxt = ".";
    private static String AirplaneIsEnryptedDecryptItBeforeHandlingItTxt = "L'avió ésta encriptat. Desxifra'l abans de manipular-lo!";
    private static String AirplaneFindsEngineStoppedWantTurnOnTxt = "L'avió és a terra i amb el motor apagat. El vols encendre? (S/N): ";
    private static String AircraftGroundTurnOfMotorTxt = "L'avió és a terra i amb el motor encès. El vols apagar? (S/N): ";
    private static String AirplaneFlyingCantStopMotorTxt = "L'avió està enlairat. No pots apagar el motor.";
    private static String AirplaneMovingCantStopMotorTxt = "L'avió està en moviment. No pots apagar el motor.";
    private static String TheMotorIsStoppedTurnOnToMoveTxt = "El motor està apagat. Per moure't ha d'estar encès!";
    private static String DoYouWantTurnOnMotorTxt = "Vols encendre el motor? (S/N): ";
    private static String AirplaneStoppedDoYouWantToAccelerateTxt = "L'avió és aturat. Vols accelerar? (S/N): ";
    private static String IndicatesKmHourTxt = "Indica els km/h: ";
    private static String CantInidcateNegativeSpeedTxt = "No pots indicar una velocitat negativa!";
    private static String SpeedActualAirplaneTxt = "L'avió actualment té una velocitat de ";
    private static String KmHourTxt = " km/h.";
    private static String IndicateKmHourToAcelerateOrDecrease = "Indica els km/h a accelerar o frenar: ";
    private static String CantIndicateNegativeVelocity = "No pots indicar una velocitat negativa!";
    private static String MotorIsOff = "El motor està apagat.";
    private static String DoYouCanTurnOnMotor = "Vols encendre el motor? (S/N): ";
    private static String DontHide = "Vols encendre el motor? (S/N): ";

//anava a moure tots els texts aqui per separarlos del codi i poder fer refactoritzacions mes rapides pero no m'ha donat temps











    public static String getBrandTxt() {
        return brandTxt;
    }

    public static String getModelTxt() {
        return modelTxt;
    }

    public static String getLicensePlateTxt() {
        return licensePlateTxt;
    }

    public static String getOriginTxt() {
        return originTxt;
    }

    public static String getDestinationTxt() {
        return destinationTxt;
    }

    public static String getSpeedTxt() {
        return speedTxt;
    }

    public static String getAutonomyTxt() {
        return autonomyTxt;
    }

    public static String getUndercarriageTxt() {
        return undercarriageTxt;
    }

    public static String getEngineTxt() {
        return engineTxt;
    }

    public static String getCoordinatesTxt() {
        return coordinatesTxt;
    }

    public static String getPassengerCapacityTxt() {
        return passengerCapacityTxt;
    }

    public static String getCrewTxt() {
        return crewTxt;
    }

    public static String getEverythingInOrderTxt() {
        return everythingInOrderTxt;
    }

    public static String getTheAirplaneTxt() {
        return theAirplaneTxt;
    }

    public static String getWhithLicencePlateTxt() {
        return whithLicencePlateTxt;
    }

    public static String getAndTheAirplaneTxt() {
        return andTheAirplaneTxt;
    }

    public static String getVeryCloseRiskOfCollisionTxt() {
        return veryCloseRiskOfCollisionTxt;
    }

    public static String getCoordinatesInQuestionTxt() {
        return coordinatesInQuestionTxt;
    }

    public static String getAirplaneTxt() {
        return AirplaneTxt;
    }

    public static String getTwoDotsTxt() {
        return TwoDotsTxt;
    }

    public static String getCombatAirplaneTxt() {
        return CombatAirplaneTxt;
    }

    public static String getIsEncryptedTxt() {
        return IsEncryptedTxt;
    }

    public static String getMaximumFiringRangeTxt() {
        return MaximumFiringRangeTxt;
    }

    public static String getIsEnemyOrNotTxt() {
        return IsEnemyOrNotTxt;
    }

    public static String getNumberOfMissilesTxt() {
        return NumberOfMissilesTxt;
    }

    public static String getCommercialAirplaneTxt() {
        return CommercialAirplaneTxt;
    }

    public static String getAdaptedTxt() {
        return AdaptedTxt;
    }

    public static String getXTxt() {
        return XTxt;
    }

    public static String getYTxt() {
        return YTxt;
    }

    public static String getZTxt() {
        return ZTxt;
    }

    public static String getMissileArrayTxt() {
        return MissileArrayTxt;
    }

    public static String getDamageTxt() {
        return DamageTxt;
    }

    public static char getEndBracketTxt() {
        return EndBracketTxt;
    }

    public static String getOnlyCanHave10AirplanesTxt() {
        return OnlyCanHave10AirplanesTxt;
    }

    public static String getAirplaneInLandingTrackCantCreateAirplaneTxt() {
        return AirplaneInLandingTrackCantCreateAirplaneTxt;
    }

    public static String getIndicateLicensePlateToBeEncryptedTxt() {
        return IndicateLicensePlateToBeEncryptedTxt;
    }

    public static String getEncryptionAirplaneTxt() {
        return EncryptionAirplaneTxt;
    }

    public static String getSuccesfullyEncryptedTxt() {
        return SuccesfullyEncryptedTxt;
    }

    public static String getIndicatesLicensePlateToBeDecryptTxt() {
        return IndicatesLicensePlateToBeDecryptTxt;
    }

    public static String getDecryptionAirplaneTxt() {
        return DecryptionAirplaneTxt;
    }

    public static String getDecryptSuccesfullyTxt() {
        return DecryptSuccesfullyTxt;
    }

    public static String getItIsAdaptedTxt() {
        return ItIsAdaptedTxt;
    }

    public static String getError() {
        return Error;
    }

    public static String getMenuRedirectionTxt() {
        return MenuRedirectionTxt;
    }

    public static String getLetterSTxt() {
        return LetterSTxt;
    }

    public static String getMissileDamageTxt() {
        return MissileDamageTxt;
    }

    public static String getSuccesfullyAdded() {
        return SuccesfullyAdded;
    }

    public static String getIntroduceLicensePlatAirplaneToManage() {
        return IntroduceLicensePlatAirplaneToManage;
    }

    public static String getNumber0Txt() {
        return Number0Txt;
    }

    public static String getNoPlaneCouldBeFoundWithThisLicensePlateTxt() {
        return NoPlaneCouldBeFoundWithThisLicensePlateTxt;
    }

    public static String getAirplaneFoundTxt() {
        return AirplaneFoundTxt;
    }

    public static String getWithLicensePlateTxt() {
        return WithLicensePlateTxt;
    }

    public static String getDotTxt() {
        return DotTxt;
    }

    public static String getAirplaneIsEnryptedDecryptItBeforeHandlingItTxt() {
        return AirplaneIsEnryptedDecryptItBeforeHandlingItTxt;
    }

    public static String getAirplaneFindsEngineStoppedWantTurnOnTxt() {
        return AirplaneFindsEngineStoppedWantTurnOnTxt;
    }

    public static String getAircraftGroundTurnOfMotorTxt() {
        return AircraftGroundTurnOfMotorTxt;
    }

    public static String getAirplaneFlyingCantStopMotorTxt() {
        return AirplaneFlyingCantStopMotorTxt;
    }

    public static String getAirplaneMovingCantStopMotorTxt() {
        return AirplaneMovingCantStopMotorTxt;
    }

    public static String getTheMotorIsStoppedTurnOnToMoveTxt() {
        return TheMotorIsStoppedTurnOnToMoveTxt;
    }

    public static String getDoYouWantTurnOnMotorTxt() {
        return DoYouWantTurnOnMotorTxt;
    }

    public static String getAirplaneStoppedDoYouWantToAccelerateTxt() {
        return AirplaneStoppedDoYouWantToAccelerateTxt;
    }

    public static String getIndicatesKmHourTxt() {
        return IndicatesKmHourTxt;
    }

    public static String getCantInidcateNegativeSpeedTxt() {
        return CantInidcateNegativeSpeedTxt;
    }

    public static String getSpeedActualAirplaneTxt() {
        return SpeedActualAirplaneTxt;
    }

    public static String getKmHourTxt() {
        return KmHourTxt;
    }

    public static String getIndicateKmHourToAcelerateOrDecrease() {
        return IndicateKmHourToAcelerateOrDecrease;
    }

    public static String getCantIndicateNegativeVelocity() {
        return CantIndicateNegativeVelocity;
    }

    public static String getMotorIsOff() {
        return MotorIsOff;
    }

    public static String getDoYouCanTurnOnMotor() {
        return DoYouCanTurnOnMotor;
    }
}
