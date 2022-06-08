public class Main {
    public static void main(String[] args) {
// первое задание
        int clientOS = 0;
        if (clientOS == 1) {
            System.out.println("Установите версию приложения Android по ссылке");
        }else {
            System.out.println("Установите версию приложения IOS по ссылке");
        }

//второе задание
        int clientOs = 1;
        int productionYear = 2015;
        if (clientOs ==1 && productionYear >=2015) {
            System.out.println("Установите версию приложения Android");

        }else if (clientOs !=1 && productionYear >= 2015){
            System.out.println("Установите версию приложения IOS");
        }else if (clientOs ==1 && productionYear < 2015){
            System.out.println("Установите облегченную версию приложения Android");
        }else if (clientOS !=1 && productionYear < 2015){
            System.out.println("Установите облегченную версию приложения IOS");
        }
//третье задание
        int year = 2021;
        float check = year % 4;
        float check2 = year % 100;
        float check3 = year % 400;
        if (check == 0 && check2 != 0 || check3 ==0){
            System.out.println("Год является високосным");

            } else {
            System.out.println("Год не является високосным");
        }
//четвертое задание
        int deliveryDistance = 35;
        int deliverySpeed = 1;
        if (deliveryDistance <= 20) {
            System.out.println("Для доставки потребуется " + deliverySpeed + " день");
        } else  if (deliveryDistance > 20 && deliveryDistance <=60) {
            int deliverySpeed2 = 2;
            System.out.println("Для доставки потребуется " + deliverySpeed2 + " дня");
        } else if (deliveryDistance > 60 && deliveryDistance <=100) {
            int deliverySpeed3 = 3;
            System.out.println("Для доставки потребуется "+ deliverySpeed3 + " дня");
        }
//пятое задание
        int monthNumber = 1;
        switch (monthNumber){
            case 12:
            case 1:
            case 2:
                System.out.println("Сейчас зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Сейчас весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Сейчас лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Сейчас осень");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }

    }

}