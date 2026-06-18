//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установи приложение по ссылке для iOS");
        } else if (clientOS == 1) {
            System.out.println("Установите приложение по ссылке для Android");
        }
        System.out.println("Задача 2");
        int clientDeviceYear = 2015;
        if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите приложение по ссылке для Android");
        } else if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установи приложение по ссылке для iOS");
        }
        System.out.println("Задача 3");
        int year = 2021;
        if (year > 1584) {
            if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
                System.out.println(year + " год является високосным");
            } else {
                System.out.println(year + " год не является високосным");
            }
        } else {
            System.out.println("Год не может быть меньше 1585");

            }
        System.out.println("Задача 4");
         int deliveryDistance = 95;
         int deliveryDay = 1;
         if (deliveryDistance > 100) {
             System.out.println("В этих пределах нет доставки");
         }else if (deliveryDistance <= 20) {
             System.out.println("Потребуется дней " + deliveryDay);
         } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
             System.out.println("Потребуется дней " + (deliveryDay +1));
         } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
             System.out.println("Потребуется дней "+(deliveryDay+ 2));
         }

         System.out.println("Задача 5");
         int monthNumber = 12;
         switch (monthNumber){
             case 1:
             case 2:
             case 12:
                 System.out.println("Это зимний месяц");
                 break;
             case 3:
             case 4:
             case 5:
                 System.out.println("Это весенний месяц");
                 break;
             case 6:
             case 7:
             case 8:
                 System.out.println("Это летний месяц");
                 break;
             case 9:
             case 10:
             case 11:
                 System.out.println("Это осенний месяц");
             default:
         }
    }
    }



















