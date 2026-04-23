public class Lesson4Email {

        public static void main(String[] args) {

                String email =
                        "my.home.mail@gmail.com";
                boolean isGmail =
                        email.endsWith("gmail.com");
                int countDogs = 0;
                for (int i = 0; i < email.length(); i++) {

                        if (email.charAt(i) == '@') {
                                countDogs++;

                        }
                }

                boolean isOneDog = countDogs == 1;
                int lastDot =
                        email.lastIndexOf('.');
                String part1 = email.substring(0, lastDot).replace('.', '_');
                String part2 = email.substring(lastDot);
                String result = part1 + part2;

                if (isGmail && isOneDog){
                        System.out.println(result);
                        System.out.println("Is Gmail: " + isGmail);
                        System.out.println("Is one @: " + isOneDog);
                        System.out.println("Valid email");
                } else {
                        System.out.println(result);
                        System.out.println("Is Gmail: " + isGmail);
                        System.out.println("Is one @: " + isOneDog);
                        System.out.println("Invalid email");
                }

                }
        }




