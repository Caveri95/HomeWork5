public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int age = 15;
        if (age >= 18) {
            System.out.println("Поздравляем с соверешннолетием!");
        } else {
            System.out.println("Возраст совершеннолетия еще не наступил, нужно подождать");
        }
        System.out.println("--");
        System.out.println("Задача 2");
        age = 50;
        if (age >= 7 && age < 18) {
            System.out.println("Ребенок ходит в школу");
        }
        if (age >= 18 && age < 24) {
            System.out.println("Человек уже закончил школу и может отправляться в университет");
        }
        if (age >= 24) {
            System.out.println("Человек окончил университет и ему пора искать первую работу");
        }
        System.out.println("--");
        System.out.println("Задача 3");

        int totalPlace = 102;
        int sitPlace = 60;
        int people = 57;

        if (people <= sitPlace) {
            System.out.println("Место в вагоне есть: сидячее");
        }
        if (people > sitPlace && people <= totalPlace) {
            System.out.println("Место в вагоне есть: стоячее");
        }
        if (people > totalPlace) {
            System.out.println("Вагон уже полностью забит");
        }
        System.out.println("--");
        System.out.println("Задача 4");

        age = 8;
        if (age >= 18) {
            System.out.println("Поздравляем с совершеннолетием!");
        } else {
            System.out.println("Возраст совершеннолетия еще не наступил, нужно подождать");
        }

        System.out.println("--");
        System.out.println("Задача 5");

        age = 7;
        if (age >= 7 && age < 18) {
            System.out.println("Ребенок ходит в школу");
        } else {
            if (age >= 18 && age < 24) {
                System.out.println("Человек уже закончил школу и может отправляться в университет");
            } else {
                System.out.println("Человек окончил университет и ему пора искать первую работу");
            }


        }
        System.out.println("--");
        System.out.println("Задача 6");

        int sitPlaces = 60;
        int totalPlaces = 102;
        int passanger = 200;

        if (passanger <= 60) {
            System.out.println("Места в вагоне есть: сидячие");
        } else {
            if (passanger > 60 && passanger <= 102) {
                System.out.println("Места в вагоне есть: стоячие");
            } else {
                System.out.println("Мест нет");
            }
        }
        System.out.println("--");
        System.out.println("Задача 7");
        age = 45;
        boolean goToNursery = age >= 2 && age <= 6;
        boolean goToSchool = age > 7 && age <= 18;
        boolean goToUniversity = age > 18 && age <= 24;

        if (goToNursery) {
            System.out.println("Если возраст человека равен " + age + " то ему нужно ходить в детский сад");
        } else {
            if (goToSchool) {
                System.out.println("Если возраст человека равен " + age + " то ему нужно ходить в школу");
            } else {
                if (goToUniversity) {
                    System.out.println("Если возраст человека равен " + age + " то ему нужно ходить в университет");
                } else {
                    System.out.println("Если возраст человека равен " + age + " то ему пора ходить на работу");
                }
            }
        }
        System.out.println("--");
        System.out.println("Задача 8");

        age = 17;
        boolean adult = true;
        boolean noAttraction = age < 5;
        boolean attractionWithAdult = age >= 5 && age <= 14 && adult;
        boolean canGoToAttraction = age > 14;

        if (noAttraction) {
            System.out.println("Ребенку возрастом " + age + " лет кататься на аттракционе нельзя");
        } else {
            if (attractionWithAdult) {
                System.out.println("Ребенку возрастом " + age + " лет кататься на аттракционе можно в сопровождение взрослого");
            } else {
                if (canGoToAttraction) {
                    System.out.println("Ребенку возрастом " + age + " лет можно кататься на аттракционе");
                } else {
                    System.out.println("Ребенку возрастом " + age + " лет нельзя кататься на аттракционе без сопровождения взрослого");
                }


            }
        }
        System.out.println("--");
        System.out.println("Задача 9");




        int one = 1;
        int two = 2;
        int three = 3;

        if (one > two && one >three) {
            System.out.println("Число " + one + " бОльшее");
        } else {
            if (two > three) {
                System.out.println("Число " + two + " бОльшее");
            } else {
                System.out.println("Число " + three + " бОльшее");
            }
        }


    }
}