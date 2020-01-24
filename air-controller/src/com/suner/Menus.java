package com.suner;

import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class Menus {
    Inputs inputs = new Inputs();
    FrontEnd frontEnd = new FrontEnd();

    public void AirTrafficControllerMenu(AirTrafficController airTrafficController) throws UnsupportedEncodingException {
        Scanner sc = new Scanner(System.in);

        int option = inputs.InputAirTrafficControllerMenu();

        while (option != 0) {
            switch (option) {
                case 1:
                    if (!airTrafficController.SearchAirplaneInTrack()) {
                        if (airTrafficController.getAirplanes().size() < 10) {
                            AirplaneTypeToCreateMenu(airTrafficController);
                        }
                        else {
                            System.out.println(Texts.getOnlyCanHave10AirplanesTxt());
                        }
                    }
                    else {
                        System.out.println(Texts.getAirplaneInLandingTrackCantCreateAirplaneTxt());
                    }
                    break;
                case 2:
                    AirplaneManagementMenu(airTrafficController);
                    break;
                case 3:
                    frontEnd.Clear();
                    airTrafficController.ShowAirplanes();
                    System.out.println();
                    airTrafficController.Warnings();
                    System.out.println();
                    break;
                case 4:
                    frontEnd.Clear();
                    airTrafficController.ShowBattleAirplanes();
                    System.out.println(Texts.getIndicateLicensePlateToBeEncryptedTxt());
                    String licensePlate = sc.next();

                    Airplane a = airTrafficController.SearchAirplane(licensePlate);
                    BattleAirplane battleAirplane = (BattleAirplane) a;

                    battleAirplane.setEncrypted(true);
                    battleAirplane.setBrand(airTrafficController.Encrypt(battleAirplane.getBrand()));
                    battleAirplane.setModel(airTrafficController.Encrypt(battleAirplane.getModel()));
                    battleAirplane.setOrigin(airTrafficController.Encrypt(battleAirplane.getOrigin()));
                    battleAirplane.setDestination(airTrafficController.Encrypt(battleAirplane.getDestination()));

                    System.out.println(Texts.getEncryptionAirplaneTxt());
                    frontEnd.Sleep(2);
                    frontEnd.Clear();
                    System.out.println(Texts.getSuccesfullyEncryptedTxt());
                    frontEnd.Sleep(1);
                    frontEnd.Clear();

                    break;
                case 5:
                    frontEnd.Clear();
                    airTrafficController.ShowBattleAirplanes();
                    System.out.println(Texts.getIndicatesLicensePlateToBeDecryptTxt());
                    String licensePlate2 = sc.next();

                    Airplane a2 = airTrafficController.SearchAirplane(licensePlate2);
                    BattleAirplane battleAirplane2 = (BattleAirplane) a2;

                    battleAirplane2.setEncrypted(false);
                    battleAirplane2.setBrand(airTrafficController.Decrypt(battleAirplane2.getBrand()));
                    battleAirplane2.setModel(airTrafficController.Decrypt(battleAirplane2.getModel()));
                    battleAirplane2.setOrigin(airTrafficController.Decrypt(battleAirplane2.getOrigin()));
                    battleAirplane2.setDestination(airTrafficController.Decrypt(battleAirplane2.getDestination()));

                    System.out.println(Texts.getDecryptionAirplaneTxt());
                    frontEnd.Sleep(2);
                    frontEnd.Clear();
                    System.out.println(Texts.getDecryptSuccesfullyTxt());
                    frontEnd.Sleep(1);
                    frontEnd.Clear();

                    break;
            }

            option = inputs.InputAirTrafficControllerMenu();
        }
    }

    public void AirplaneTypeToCreateMenu(AirTrafficController airTrafficController) {
        Scanner sc = new Scanner(System.in);

        int option = inputs.InputAirplaneTypeCreateMenu();

        String brand, model, licensePlate, origin, destination;
        Double autonomy;
        int passengerCapacity, crew;

        switch(option) {
            case 1:
                boolean adapted = false;

                try {
                    System.out.print(Texts.getBrandTxt());
                    brand = sc.next();
                    System.out.print(Texts.getModelTxt());
                    model = sc.next();
                    System.out.print(Texts.getLicensePlateTxt());
                    licensePlate = sc.next();
                    System.out.print(Texts.getOriginTxt());
                    origin = sc.next();
                    System.out.print(Texts.getDestinationTxt());
                    destination = sc.next();
                    System.out.print(Texts.getAutonomyTxt());
                    autonomy = sc.nextDouble();
                    System.out.print(Texts.getPassengerCapacityTxt());
                    passengerCapacity = sc.nextInt();
                    System.out.print(Texts.getCrewTxt());
                    crew = sc.nextInt();
                    System.out.print(Texts.getItIsAdaptedTxt());
                    if (sc.next().equals(Texts.getLetterSTxt())) adapted = true;

                    airTrafficController.AddAirplane(new CommercialAirplane(brand, model, licensePlate, origin, destination, autonomy, passengerCapacity, crew, adapted));
                }
                catch (Exception e) {
                    frontEnd.Clear();
                    System.out.println(Texts.getError());
                    System.out.println(Texts.getMenuRedirectionTxt());
                    frontEnd.Sleep(2);
                    frontEnd.Clear();
                    AirplaneTypeToCreateMenu(airTrafficController);
                }

                break;
            case 2:
                Double maxShootingRange, missilesDamage;
                boolean isEnemy = false;
                int quantityMissiles;

                try {
                    System.out.print(Texts.getBrandTxt());
                    brand = sc.next();
                    System.out.print(Texts.getModelTxt());
                    model = sc.next();
                    System.out.print(Texts.getLicensePlateTxt());
                    licensePlate = sc.next();
                    System.out.print(Texts.getOriginTxt());
                    origin = sc.next();
                    System.out.print(Texts.getDestinationTxt());
                    destination = sc.next();
                    System.out.print(Texts.getAutonomyTxt());
                    autonomy = sc.nextDouble();
                    System.out.print(Texts.getPassengerCapacityTxt());
                    passengerCapacity = sc.nextInt();
                    System.out.print(Texts.getCrewTxt());
                    crew = sc.nextInt();
                    System.out.print(Texts.getMaximumFiringRangeTxt());
                    maxShootingRange = sc.nextDouble();
                    System.out.print(Texts.getIsEnemyOrNotTxt());
                    if (sc.next().equals(Texts.getLetterSTxt())) isEnemy = true;
                    System.out.print(Texts.getNumberOfMissilesTxt());
                    quantityMissiles = sc.nextInt();
                    System.out.print(Texts.getMissileDamageTxt());
                    missilesDamage = sc.nextDouble();

                    airTrafficController.AddAirplane(new BattleAirplane(brand, model, licensePlate, origin, destination, autonomy, passengerCapacity, crew, maxShootingRange, isEnemy, quantityMissiles, missilesDamage));
                }
                catch (Exception e) {
                    frontEnd.Clear();
                    System.out.println(Texts.getError());
                    System.out.println(Texts.getMenuRedirectionTxt());
                    frontEnd.Sleep(2);
                    frontEnd.Clear();
                    AirplaneTypeToCreateMenu(airTrafficController);
                }

                break;
        }

        frontEnd.Clear();
        System.out.println(Texts.getSuccesfullyAdded());
        frontEnd.Sleep(1);
        frontEnd.Clear();
    }

    public void AirplaneManagementMenu(AirTrafficController airTrafficController) {
        Scanner sc = new Scanner(System.in);

        System.out.print(Texts.getIntroduceLicensePlatAirplaneToManage());
        String licensePlate = sc.next();

        if (!airTrafficController.CheckIfEncrypted(licensePlate)) {
            if (!licensePlate.equals(Texts.getNumber0Txt())) {
                Airplane airplane = airTrafficController.SearchAirplane(licensePlate);

                if (airplane == null) {
                    System.out.println(Texts.getNoPlaneCouldBeFoundWithThisLicensePlateTxt());
                } else {
                    System.out.println(Texts.getAirplaneFoundTxt() + airplane.getBrand() + Texts.getWithLicensePlateTxt() + airplane.getLicensePlate() + Texts.getDotTxt());
                    frontEnd.Sleep(2);
                    frontEnd.Clear();

                    System.out.println(Texts.getAirplaneTxt() + airplane.getBrand());

                    if (airplane instanceof CommercialAirplane) {
                        CommercialAirplane commercialAirplane = (CommercialAirplane) airplane;
                        int option = inputs.InputCommercialAirplaneManagementMenu();

                        while (option != 0) {
                            CommercialAirplaneManagementMenuOption(option, commercialAirplane, airTrafficController);
                            option = inputs.InputCommercialAirplaneManagementMenu();
                        }
                    } else if (airplane instanceof BattleAirplane) {
                        BattleAirplane battleAirplane = (BattleAirplane) airplane;
                        int option = inputs.InputBattleAirplaneManagementMenu();

                        while (option != 0) {
                            BattleAirplaneManagementMenuOption(option, battleAirplane, airTrafficController);
                            option = inputs.InputBattleAirplaneManagementMenu();
                        }
                    }

                }
            }
        }
        else {
            System.out.println(Texts.getAirplaneIsEnryptedDecryptItBeforeHandlingItTxt());
            frontEnd.Sleep(2);
            frontEnd.Clear();
        }
    }

    public void CommercialAirplaneManagementMenuOption(int option, CommercialAirplane airplane, AirTrafficController airTrafficController) {
        Scanner sc = new Scanner(System.in);

        switch(option) {
            case 1:

                if (airplane.getCoordinates().getZ() == 0 && airplane.getEngine() == false) {
                    System.out.println(Texts.getAirplaneFindsEngineStoppedWantTurnOnTxt());
                    String optionEngine = sc.next();

                    if (optionEngine.equals(Texts.getLetterSTxt())) { airplane.setEngine(true); }
                }
                else if (airplane.getCoordinates().getZ() == 0 && airplane.getEngine() == true) {
                    System.out.print(Texts.getAircraftGroundTurnOfMotorTxt());
                    String optionEngine = sc.next();

                    if (optionEngine.equals(Texts.getLetterSTxt())) { airplane.setEngine(false); }
                }
                else if (airplane.getCoordinates().getZ() != 0 && airplane.getEngine() == true) {
                    System.out.println(Texts.getAirplaneFlyingCantStopMotorTxt());
                }
                else if (airplane.getCoordinates().getZ() == 0 && airplane.getSpeed() > 0) {
                    System.out.println(Texts.getAirplaneMovingCantStopMotorTxt());
                }

                break;
            case 2:

                if (airplane.getEngine() == false) {
                    System.out.println(Texts.getTheMotorIsStoppedTurnOnToMoveTxt());
                    System.out.print(Texts.getDoYouWantTurnOnMotorTxt());
                    String optionEngine = sc.next();

                    if (optionEngine.equals(Texts.getLetterSTxt())) { airplane.setEngine(true); }
                }

                if (airplane.getEngine() == true) {
                    if (airplane.getSpeed() == 0) {
                        System.out.print(Texts.getAirplaneStoppedDoYouWantToAccelerateTxt());
                        String optionSpeed = sc.next();

                        if (optionSpeed.equals(Texts.getLetterSTxt())) {
                            System.out.print(Texts.getIndicatesKmHourTxt());
                            double speed = sc.nextDouble();

                            if (speed < 0) {
                                System.out.println(Texts.getCantInidcateNegativeSpeedTxt());
                            }
                            else {
                                airplane.setSpeed(speed);
                            }
                        }
                    }
                    else {
                        System.out.println(Texts.getSpeedActualAirplaneTxt() + airplane.getSpeed() + Texts.getKmHourTxt());
                        System.out.print(Texts.getIndicateKmHourToAcelerateOrDecrease());
                        double speed = sc.nextDouble();

                        if (speed < 0) {
                            System.out.println(Texts.getCantIndicateNegativeVelocity());
                        }
                        else {
                            airplane.setSpeed(speed);
                        }
                    }
                }

                break;
            case 3:

                if (airplane.getEngine() == false) {
                    System.out.println(Texts.getMotorIsOff());
                    System.out.print(Texts.getDoYouCanTurnOnMotor());
                    String optionEngine = sc.next();

                    if (optionEngine.equals(Texts.getLetterSTxt())) { airplane.setEngine(true); }
                }

                if (airplane.getEngine() == true) {
                    if (airplane.getUndercarriage() == true && airplane.getCoordinates().getZ() < 500) {
                        System.out.println("No pots amagar el tren d'aterratge. L'avió ha d'estar com a mínim a 500 metres d'alçada.");
                    }
                    else if (airplane.getCoordinates().getZ() > 500 && airplane.getSpeed() > 300 && airplane.getUndercarriage() == false) {
                        System.out.println("No pots treure el tren d'atteratge si estem a una altura superior a 500 metres i una velocitat superior als 300 km/h.");
                    }
                    else if (airplane.getCoordinates().getZ() > 500 && airplane.getSpeed() <= 300 && airplane.getUndercarriage() == true) {
                        System.out.println("Estàs a una altura superior o igual als 500 metres amb una velocitat de " + airplane.getSpeed() + " km/h.");
                        System.out.println("Vols amagar el tren d'aterratge? (S/N): ");
                        String optionUndercarriage = sc.next();

                        if (optionUndercarriage.equals("S")) { airplane.setUndercarriage(false); }
                    }
                }

                break;
            case 4: /* PUJAR/BAIXAR ALÇADA */

                if (airplane.getEngine() == false) {
                    System.out.println("El motor està apagat.");
                    System.out.print("Vols encendre el motor? (S/N): ");
                    String optionEngine = sc.next();

                    if (optionEngine.equals("S")) { airplane.setEngine(true); }
                }

                if (airplane.getEngine() == true) {
                    if (airplane.getCoordinates().getZ() == 0 && airplane.getSpeed() >= 180) {
                        System.out.print("Pots enlairar-te. Vols enlairar-te? (S/N): ");
                        String optionHeight = sc.next();

                        if (optionHeight.equals("S")) {
                            System.out.print("Especifica l'alçada: ");
                            int height = sc.nextInt();

                            if (height > 0 && height < 12800) {
                                airplane.getCoordinates().setZ(height);
                                airplane.setTakenOff(true);
                            }
                        }
                    }
                    else if (airplane.getCoordinates().getZ() == 0 && airplane.getSpeed() < 180) {
                        System.out.println("No pots pujar alçada. Necessites estar a 180 km/h. La velocitat actual és de: " + airplane.getSpeed() + " km/h.");
                    }
                    else if (airplane.getCoordinates().getZ() > 0) {
                        System.out.println("L'alçada actual és de " + airplane.getCoordinates().getZ() + " metres.");
                        System.out.println("Indica la alçada a la que vols pujar/baixar: ");
                        int height = sc.nextInt();

                        if (height > 0 && height < 12800) {
                            airplane.getCoordinates().setZ(height);
                            airplane.setTakenOff(true);
                        }
                    }
                }

                break;
            case 5:
                if (airplane.getEngine() == false) {
                    System.out.println("El motor està apagat.");
                    System.out.print("Vols encendre el motor? (S/N): ");
                    String optionEngine = sc.next();

                    if (optionEngine.equals("S")) { airplane.setEngine(true); }
                }
                else {
                    System.out.println("Indica la posició a la que et vols moure.");
                    System.out.print("X: "); int userX = sc.nextInt();
                    System.out.print("Y: "); int userY = sc.nextInt();

                    if (userX < 0 || userY < 0) {
                        System.out.println("Introdueix un valor positiu!");
                    }
                    else {
                        // Limits del radar
                        if ((userX >= 0 && userX <= 1000) && (userY >= 0 && userY <= 1000)) {
                            if (!airTrafficController.CheckCollision(userX, userY)) {
                                airplane.getCoordinates().setX(userX);
                                airplane.getCoordinates().setY(userY);
                            }
                            else {
                                System.out.println("Estàs segur? Colisionaràs amb un altre avió! (S/N)");
                                String optionCollision = sc.next();

                                if (optionCollision == "S") {
                                    airplane.getCoordinates().setX(userX);
                                    airplane.getCoordinates().setY(userY);

                                    System.out.println("BOOOOOOOOOOOOOOOOOOOOOOM! ADIÓS CRUCK.");

                                    airTrafficController.RemoveAirplane(airplane);
                                    // FALTA ELIMINAR L'ALTRE AVIÓ
                                }
                            }
                        }
                        else {
                            airTrafficController.RemoveAirplane(airplane);
                        }
                    }
                }

                break;
            case 6:
                System.out.println(airplane.toString());
                break;
        }
    }

    public void BattleAirplaneManagementMenuOption(int option, BattleAirplane airplane, AirTrafficController airTrafficController) {
        Scanner sc = new Scanner(System.in);

        switch(option) {
            case 1: /* ENCENDRE O APAGAR MOTOR */

                if (airplane.getCoordinates().getZ() == 0 && airplane.getEngine() == false) {
                    System.out.println("L'avió és a terra i amb el motor apagat. El vols encendre? (S/N): ");
                    String optionEngine = sc.next();

                    if (optionEngine.equals("S")) { airplane.setEngine(true); }
                }
                else if (airplane.getCoordinates().getZ() == 0 && airplane.getEngine() == true) {
                    System.out.print("L'avió és a terra i amb el motor encès. El vols apagar? (S/N): ");
                    String optionEngine = sc.next();

                    if (optionEngine.equals("S")) { airplane.setEngine(false); }
                }
                else if (airplane.getCoordinates().getZ() != 0 && airplane.getEngine() == true) {
                    System.out.println("L'avió està enlairat. No pots apagar el motor.");
                }
                else if (airplane.getCoordinates().getZ() == 0 && airplane.getSpeed() > 0) {
                    System.out.println("L'avió està en moviment. No pots apagar el motor.");
                }

                break;
            case 2: /* ACCELERAR O FRENAR */

                if (airplane.getEngine() == false) {
                    System.out.println("El motor està apagat. Per moure't ha d'estar encès!");
                    System.out.print("Vols encendre el motor? (S/N): ");
                    String optionEngine = sc.next();

                    if (optionEngine.equals("S")) { airplane.setEngine(true); }
                }

                if (airplane.getEngine() == true) {
                    if (airplane.getSpeed() == 0) {
                        System.out.print("L'avió és aturat. Vols accelerar? (S/N): ");
                        String optionSpeed = sc.next();

                        if (optionSpeed.equals("S")) {
                            System.out.print("Indica els km/h: ");
                            double speed = sc.nextDouble();

                            if (speed < 0) {
                                System.out.println("No pots indicar una velocitat negativa!");
                            }
                            else {
                                airplane.setSpeed(speed);
                            }
                        }
                    }
                    else {
                        System.out.println("L'avió actualment té una velocitat de " + airplane.getSpeed() + " km/h.");
                        System.out.print("Indica els km/h a accelerar o frenar: ");
                        double speed = sc.nextDouble();

                        if (speed < 0) {
                            System.out.println("No pots indicar una velocitat negativa!");
                        }
                        else {
                            airplane.setSpeed(speed);
                        }
                    }
                }

                break;
            case 3: /* PUJAR/BAIXAR TREN D'ATERRATGE  */

                if (airplane.getEngine() == false) {
                    System.out.println("El motor està apagat.");
                    System.out.print("Vols encendre el motor? (S/N): ");
                    String optionEngine = sc.next();

                    if (optionEngine.equals("S")) { airplane.setEngine(true); }
                }

                if (airplane.getEngine() == true) {
                    if (airplane.getUndercarriage() == true && airplane.getCoordinates().getZ() < 500) {
                        System.out.println("No pots amagar el tren d'aterratge. L'avió ha d'estar com a mínim a 500 metres d'alçada.");
                    }
                    else if (airplane.getCoordinates().getZ() > 500 && airplane.getSpeed() > 300 && airplane.getUndercarriage() == false) {
                        System.out.println("No pots treure el tren d'atteratge si estem a una altura superior a 500 metres i una velocitat superior als 300 km/h.");
                    }
                    else if (airplane.getCoordinates().getZ() > 500 && airplane.getSpeed() <= 300 && airplane.getUndercarriage() == true) {
                        System.out.println("Estàs a una altura superior o igual als 500 metres amb una velocitat de " + airplane.getSpeed() + " km/h.");
                        System.out.println("Vols amagar el tren d'aterratge? (S/N): ");
                        String optionUndercarriage = sc.next();

                        if (optionUndercarriage.equals("S")) { airplane.setUndercarriage(false); }
                    }
                }

                break;
            case 4: /* PUJAR/BAIXAR ALÇADA */

                if (airplane.getEngine() == false) {
                    System.out.println("El motor està apagat.");
                    System.out.print("Vols encendre el motor? (S/N): ");
                    String optionEngine = sc.next();

                    if (optionEngine.equals("S")) { airplane.setEngine(true); }
                }

                if (airplane.getEngine() == true) {
                    if (airplane.getCoordinates().getZ() == 0 && airplane.getSpeed() >= 180) {
                        System.out.print("Pots enlairar-te. Vols enlairar-te? (S/N): ");
                        String optionHeight = sc.next();

                        if (optionHeight.equals("S")) {
                            System.out.print("Especifica l'alçada: ");
                            int height = sc.nextInt();

                            if (height > 0 && height < 12800) {
                                airplane.getCoordinates().setZ(height);
                                airplane.setTakenOff(true);
                            }
                        }
                    }
                    else if (airplane.getCoordinates().getZ() == 0 && airplane.getSpeed() < 180) {
                        System.out.println("No pots pujar alçada. Necessites estar a 180 km/h. La velocitat actual és de: " + airplane.getSpeed() + " km/h.");
                    }
                    else if (airplane.getCoordinates().getZ() > 0) {
                        System.out.println("L'alçada actual és de " + airplane.getCoordinates().getZ() + " metres.");
                        System.out.println("Indica la alçada a la que vols pujar/baixar: ");
                        int height = sc.nextInt();

                        if (height > 0 && height < 12800) {
                            airplane.getCoordinates().setZ(height);
                            airplane.setTakenOff(true);
                        }
                    }
                }

                break;
            case 5:
                if (airplane.getEngine() == false) {
                    System.out.println("El motor està apagat.");
                    System.out.print("Vols encendre el motor? (S/N): ");
                    String optionEngine = sc.next();

                    if (optionEngine.equals("S")) { airplane.setEngine(true); }
                }
                else {
                    System.out.println("Indica la posició a la que et vols moure.");
                    System.out.print("X: "); int userX = sc.nextInt();
                    System.out.print("Y: "); int userY = sc.nextInt();

                    if (userX < 0 || userY < 0) {
                        System.out.println("Introdueix un valor positiu!");
                    }
                    else {
                        // Limits del radar
                        if ((userX >= 0 && userX <= 1000) && (userY >= 0 && userY <= 1000)) {
                            if (!airTrafficController.CheckCollision(userX, userY)) {
                                airplane.getCoordinates().setX(userX);
                                airplane.getCoordinates().setY(userY);
                            }
                            else {
                                System.out.println("Estàs segur? Colisionaràs amb un altre avió! (S/N)");
                                String optionCollision = sc.next();

                                if (optionCollision == "S") {
                                    airplane.getCoordinates().setX(userX);
                                    airplane.getCoordinates().setY(userY);

                                    System.out.println("BOOOOOOOOOOOOOOOOOOOOOOM! ADIÓS CRUCK.");

                                    airTrafficController.RemoveAirplane(airplane);
                                    // FALTA ELIMINAR L'ALTRE AVIÓ
                                }
                            }
                        }
                        else {
                            airTrafficController.RemoveAirplane(airplane);
                        }
                    }
                }

                break;
            case 6:
                System.out.println(airplane.toString());
                break;
            case 7:
                if (airplane.getEngine() == false) {
                    System.out.println("No pots disparar si tens el motor apagat!");
                    System.out.print("Vols encendre el motor? (S/N): ");
                    String optionEngine = sc.next();

                    if (optionEngine.equals("S")) { airplane.setEngine(true); }
                }
                else {
                    frontEnd.Clear();
                    airTrafficController.ShowAirplanesShootingRange(airplane);
                    System.out.println("Aquests són els avions disponibles a disparar, ja que són dintre del teu rang de dispar.");
                    System.out.print("Introdueix la matrícula del avió que vols disparar. (0 per sortir): ");
                    String licensePlate = sc.next();

                    if (airTrafficController.SearchAirplane(licensePlate) == null) {
                        System.out.println("No s'ha pogut trobar cap avió amb aquesta matrícula.");
                    }
                    else if (airTrafficController.SearchAirplane(licensePlate) instanceof CommercialAirplane) {
                        CommercialAirplane commercialAirplane = (CommercialAirplane) airTrafficController.SearchAirplane(licensePlate);

                        System.out.print("Disparar? (S/N): ");
                        String optionShoot = sc.next();

                        if (optionShoot.equals("S")) {
                            System.out.println("Avió enderrocat!");
                            airTrafficController.RemoveAirplane(commercialAirplane);
                        }
                    }
                    else if (airTrafficController.SearchAirplane(licensePlate) instanceof BattleAirplane) {
                        BattleAirplane battleAirplane = (BattleAirplane) airTrafficController.SearchAirplane(licensePlate);

                        System.out.print("Disparar? (S/N): ");
                        String optionShoot = sc.next();

                        if (optionShoot.equals("S")) {
                            System.out.println("Avió enderrocat!");
                            airTrafficController.RemoveAirplane(battleAirplane);
                        }
                    }
                }

                break;
        }
    }
}
