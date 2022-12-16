public class Main {
    public static void main(String[] args) {
        //todo код программы писать тут
        int[] weightOfHumans = new int[10];
        int minA = 40;
        int maxB = 100;

        for (int i = 0; i < weightOfHumans.length; i++) {
            weightOfHumans[i] = ((int) (Math.random() * (maxB - minA)) + minA);
            System.out.print(weightOfHumans[i] + " ");
        }
        System.out.println();

        int sum = 0;
        for (int weightOfHuman : weightOfHumans) {
            sum = weightOfHuman + sum;
        }
        int averageWeight = sum / weightOfHumans.length;
        System.out.println("Средний вес людей - " + averageWeight + ".");

        int count = 0;
        for (int i : weightOfHumans) {
            if (i >= 60 && i <= 80) {
                count++;
            }
        }
        System.out.println("Количество людей с весом от 60 до 80 кг: " + count + ".");
    }
}
