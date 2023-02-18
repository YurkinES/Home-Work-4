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
        }
        if (ageHum4 >= 7 && ageHum4 <= 18) {
            System.out.println("Если возраст человека " + ageHum4 + " то ему нужно ходить в школу");
        }
        if (ageHum4 > 18 && ageHum4 <= 24) {
            System.out.println("Если возраст человека " + ageHum4 + " то его место в университете");
        }
        if (ageHum4 > 24) {
            System.out.println("Если возраст человека " + ageHum4 + " то ему пора ходить на работу");
        }
    //Task #5
        byte ageHum5 = 16;
        if (ageHum5 < 5) {
            System.out.println("Если возраст человека " + ageHum5 + " то он не может кататься на атракционе");
        }
        if (ageHum5 >= 5 && ageHum5 < 14) {
            System.out.println("Если возраст человека " + ageHum5 + " то он может кататься на атракционе только в сопровождении взрослого");
        }
        if (ageHum5 > 14) {
            System.out.println("Если возраст человека " + ageHum5 + " то он может кататься на атракционе без сопровождения взрослого");
        }
        }
    }

