public class Test {
    public static void main(String[] args) {
         MyTime time = new MyTime(14, 1, 9);
         System.out.println(time.toString()); // Kết quả: 14:01:09

 // test setHour
         time.setHour(15);
         System.out.println(time.getHour()); // Kết quả: 15

// test setMinute
         time.setMinute(30);
         System.out.println(time.getMinute()); // Kết quả: 30

// Test setSecond
         time.setSecond(45);
         System.out.println(time.getSecond()); // Kết quả: 45
         System.out.println(time.toString()); // Kết quả: 15:30:45

// test nextSecond
         time.nextSecond();
         System.out.println(time.toString()); // Kết quả: 15:30:46

//test previousSecond
         time.previousSecond();
         System.out.println(time.toString()); // Kết quả: 15:30:45

// testpreviousHour
         time.previousHour();
         System.out.println(time.toString()); // Kết quả: 14:30:45

    }
}
