public class Main {
    public static void main(String[] args) {
    //Task #1
        byte ageHuman = 16;
        if (ageHuman >= 18) {
            System.out.println("Если возраст человека равен " + ageHuman + " то он соверщеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + ageHuman + " то он не соверщеннолетний, нужно немного подождать :(");
        }
    //Task #2
        byte OutdoorTemp = 6;
        if (OutdoorTemp >= 5) {
            System.out.println("Сегодня тепло, можно идти без шапки");
        } else {
            System.out.println("На улице холодно, нужно надеть шапку");
        }
    //Task #3
        short carSpeed = 95;
        if (carSpeed > 60) {
            System.out.println("Если скорость " + carSpeed + "км/ч придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + carSpeed + " можно ездить спокойно");
        }
    //Task #4
        byte ageHum4 = 18;
        if (ageHum4 >= 2 && ageHum4 <= 6) {
            System.out.println("Если возраст человека " + ageHum4 + " то ему нужно идти в детский сад");
        }else if (ageHum4 >= 7 && ageHum4 <= 18) {
            System.out.println("Если возраст человека " + ageHum4 + " то ему нужно ходить в школу");
        }else if (ageHum4 > 18 && ageHum4 <= 24) {
            System.out.println("Если возраст человека " + ageHum4 + " то его место в университете");
        }else if (ageHum4 > 24) {
            System.out.println("Если возраст человека " + ageHum4 + " то ему пора ходить на работу");
        }
    //Task #5
        byte ageHum5 = 16;
        if (ageHum5 < 5) {
            System.out.println("Если возраст человека " + ageHum5 + " то он не может кататься на атракционе");
        }else if (ageHum5 >= 5 && ageHum5 < 14) {
            System.out.println("Если возраст человека " + ageHum5 + " то он может кататься на атракционе только в сопровождении взрослого");
        }else if (ageHum5 > 14) {
            System.out.println("Если возраст человека " + ageHum5 + " то он может кататься на атракционе без сопровождения взрослого");
        }
    //Task #6
        byte allPlaces = 102;
        byte seatingPlaces = 60;
        byte stayPlaces = (byte) (allPlaces - seatingPlaces);
        byte occupiedSeatingPlaces = 60;
        byte occupiedStayPlaces = 40;
        if (occupiedSeatingPlaces >= seatingPlaces && occupiedStayPlaces >= stayPlaces) {
            System.out.println("Свободных мест в вагоне нет");
        } else if (occupiedSeatingPlaces < seatingPlaces && occupiedStayPlaces < stayPlaces) {
            byte freeSeatingPlaces = (byte) (seatingPlaces - occupiedSeatingPlaces);
            byte freeStayPlaces = (byte) (stayPlaces - occupiedStayPlaces);
            System.out.println("В вагоне есть свободные места: " + freeSeatingPlaces + " сидячих места и " + freeStayPlaces + " стоячих места");
        } else if (occupiedSeatingPlaces >= seatingPlaces && occupiedStayPlaces < stayPlaces) {
            byte freeStayPlaces = (byte) (stayPlaces - occupiedStayPlaces);
            System.out.println("В вагоне есть свободные места: " + freeStayPlaces + " стоячих места");
        } else if (occupiedSeatingPlaces < seatingPlaces && occupiedStayPlaces >= stayPlaces) {
            byte freeSeatingPlaces = (byte) (seatingPlaces - occupiedSeatingPlaces);
            System.out.println("В вагоне есть свободные места: " + freeSeatingPlaces + " сидячих места");
        }
    //Task #7
        int one = 6;
        int two = 8;
        int three = 2;
        if (one > two && one > three) {
            System.out.println("число " + one + " самое большое");
        } else if (two > one && two > three) {
            System.out.println("число " + two + " самое большое");
        } else if (three > one && three > two) {
            System.out.println("число " + three + " самое большое");
        }
        }
    }

