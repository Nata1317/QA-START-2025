public class Lesson4Email {

        public static void main(String[] args) {

        String email =
                "my.home.mail@gmail.com";
        boolean isGmail =
                email.endsWith("gmail.com");
        int countAt = 0;
        for(int i = 0; i<email.length(); i++) {

            if (email.charAt(i) == '@') {
                    countAt++;
            }

        }

        boolean oneAt = countAt == 1;
        int lastDot =
                email.lastIndexOf('.');
        String part1 = email.substring(0, lastDot).replace('.', '_');
        String part2 = email.substring(lastDot);
        String result = part1 + part2;

        System.out.println(isGmail);
        System.out.println(oneAt);
        System.out.println(result);
    }

}


