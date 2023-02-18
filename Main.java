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
    }
}