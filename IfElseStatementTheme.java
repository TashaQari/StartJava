public class IfElseStatementTheme {

    public static void main(String[] args) {
        System.out.println("\n1. Перевод псевдокода на язык Java");
        int age = 16;
        char gender = 'm';
        double height = 1.70;
        if (age > 20) {
            System.out.println("Возраст больше 20 лет");
        } else if (age < 20) {
            System.out.println("Возраст меньше 20 лет");
        }
        if (gender == 'm') {
            System.out.println("Пол мужской");
        } else if (gender != 'm') {
            System.out.println("Другой пол");
        }
        if (height < 1.80) {
            System.out.println("Рост до 1.80");
        } else if (height > 1.80) {
            System.out.println("Рост больше 1.80");
        }
        char firstInitial = "Micael".charAt(0);
        if (firstInitial == 'M') {
            System.out.println("Имя на букву М");
        } if (firstInitial == 'I') {
            System.out.println("Имя на букву I");
        } else {
            System.out.println("Имя на другую букву");
        }

        System.out.println("\n2. Поиск max и min числа");
        int num1 = 3245;
        int num2 = 56743;
        if (num1 > num2) {
            System.out.println("Число с max значением: " + num1 + 
                "\nЧисло с минимальным значением " + num2);
        } else if (num1 < num2) {
            System.out.println("Число с max значением: " + num2 + 
                "\nЧисло с минимальным значением: " + num1);
        } else {
            System.out.println("Числа не равны");
        }

        System.out.println("\n3. Работа с числом");
        int srcNum = 47;
        if (srcNum != 0) {
            if (srcNum % 2 == 0) {
                System.out.println("Число четное");
            } else {
                System.out.println("Число нечетное");
            }
            if (srcNum > 0) {
                System.out.println("Число положительное");
            } else {
                System.out.println("Число отрицательное");
            }
        }

        System.out.println("\n4. Поиск одинаковых цифр в числах");
        int num3 = 386;
        int num4 = 286;
        System.out.println(num3 + " " + num4);
        int ones1 = num3 % 10;
        int tens1 = num3 / 10 % 10;
        int hundreds1 = num3 / 100;
        int ones2 = num4 % 10;
        int tens2 = num4 / 10 % 10;
        int hundreds2 = num4 / 100;
        if (ones1 == ones2) {
            System.out.println(ones1 + " третий разряд");
        }
        if (tens1 == tens2) {
            System.out.println(tens1 + " второй разряд");
        }
        if (hundreds1 == hundreds2) {
            System.out.println(hundreds1 + " первый разряд");
        }

        System.out.println("\n5. Определение буквы, числа или символа по их коду");
        char code = '\u0057';
        System.out.println(code);
        if (code >= 'a' && code <= 'z') {
            System.out.println("маленькая буква");
        } else if (code >= 'A' & code <= 'Z') {
            System.out.println("большая буква");
        } else if (code >= '0' & code <= '9') {
            System.out.println("число");
        } else {
            System.out.println("не буква и не число");
        }

        System.out.println("\n6. Определение суммы вклада и начисленных банком %");
        int deposit = 300000;
        int percent = 1;
        if (deposit < 100000) {
            percent = deposit / 100 * 5;
        } else if (deposit >= 100000 && deposit <= 300000) {
            percent = deposit / 100 * 7;
        } else if (deposit > 300000) {
            percent = deposit / 100 * 10;
        }
        System.out.println("Сумма вклада " + deposit);
        System.out.println("Начисленный % " + (deposit + percent));

        System.out.println("\n7. Определение оценки по предметам");
        int percentHist = 54;
        int grade = 1;
        if(percentHist > 91) {
            grade = 5;
        }else if(percentHist > 73) {
            grade = 4;
        }else if(percentHist > 60) {
            grade = 3;
        }else if(percentHist <=60) {
            grade = 2;
        }
        System.out.println("Оценка " + grade);
        int percentProg = 91;
        int grade1 = 1;
        if(percentProg > 91) {
            grade1 = 5;
        } else if(percentProg > 73) {
            grade1=4;
        } else if(percentProg > 60) {
            grade1=3;
        } else if(percentProg <=60) {
            grade1=2;
        }
        System.out.println("Оценка " + grade1);
        System.out.println(((grade + grade1) / 2) + " средняя оценка по предметам");
        System.out.println(((percentHist + percentProg) / 2) + " средний процент по предметам");

        System.out.println("\n8. Расчет прибыли");
        int revenue = 13000;
        int cost = 9000;
        int expenses = 5000;
        int profityear = (revenue - cost - expenses) * 12;
        if (profityear > 0) {
            System.out.println("+ " + profityear);
        } else {
            System.out.println(profityear);
        }

        System.out.println("\n9. Подсчет количества банкнот\n");
        int sum = 567;
        int hundredsInStock = 10;
        int tensInStock = 5;
        int onesInStock = 50;
        int needHundreds = sum / 100;
        int needTens = sum / 10 % 10;
        int needOnes = sum % 10;
        if(needHundreds > hundredsInStock) {
            needTens = (needHundreds - hundredsInStock) * 10 + needTens;
            needHundreds = hundredsInStock;
        }
        if(needTens > tensInStock) {
            needOnes = (needTens - tensInStock) * 10 + needOnes;
            needTens = tensInStock;
        }
        if(needOnes > onesInStock) {
            System.out.println("Сумму " + sum + " выдать невозможно");
        } else {
            System.out.println("К выдаче:\n" + needHundreds + " сотен\n" + needTens + " десяток\n" 
                + needOnes + " единичек\nИтого: " + (needHundreds * 100 + needTens * 10 + needOnes));
        }
    }
}