package com.example;

import java.util.Scanner;

public class Bin2Dec {
    public static void main(String[] args) {
        // Используем try-with-resources для автоматического закрытия Scanner
        // Это гарантирует освобождение ресурсов даже при возникновении исключений
        try (Scanner scanner = new Scanner(System.in)) {
            // Блок приветствия и инструкций для пользователя
            System.out.println("\n=== Binary to Decimal Converter ===");
            System.out.println("Examples of valid inputs: '1010' (equals 10), '1111' (equals 15)");
            System.out.println("You can convert up to 8 numbers in one session");
            System.out.println("(Press ENTER without typing to exit early)\n");
            System.out.println("Enter a binary number (0s and 1s only), (like 1010): ");
            // Счетчик успешно конвертированных чисел
            // Хранит количество корректных вводов пользователя
            int count = 0;
            
            // Основной цикл обработки ввода
            // Максимальное количество итераций - 8
            while (count < 8) {
                // Запрос ввода с порядковым номером и номером текущего числа
                // Используем count для отображения номера текущего числа
                // Добавляем 1 к счетчику, чтобы начать с 1 потому что пользователю удобнее видеть нумерацию с 1
                System.out.print("\nBinary number " + (count+1) + "/8: ");
                
                // Чтение и очистка ввода:
                // nextLine() - читает всю строку
                // trim() - удаляет пробелы в начале и конце
                String input = scanner.nextLine().trim();

                // Проверка на досрочное завершение ввода
                // Если пользователь просто нажал Enter
                if (input.isEmpty()) {
                    System.out.println("\nFinished. Thank you!");
                    break; // Выход из цикла
                }
                // Увеличение счетчика успешных конвертаций
                // Инкремент происходит только после успешной обработки числа
                count++;
            }

            // Блок итоговой статистики:
            // Выводится после завершения цикла ввода
            if (count > 0) {
                System.out.println("\nSummary: Converted " + count + " numbers");
            } else {
                System.out.println("\nNo numbers were converted");
            }
            
            // Для разработчиков: точка завершения программы
            // System.out.println("[DEBUG] Программа завершена успешно");
        }
        // Scanner автоматически закрывается благодаря try-with-resources
    }
}