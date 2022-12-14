package AdvanceJava.javaOptional;

import java.util.Optional;


public class javaOptional {
    public static void main(String[] args) {

        Optional.ofNullable("angelo@gmail.com").ifPresent(email -> System.out.println("Sending email to" + email));
        Optional.ofNullable(null).ifPresentOrElse(email -> System.out.println("Sending email to" + email), () -> {System.out.println("Cannot send email");});

        // Person person = new Person("ahha", "AHHAH@gmail.com");

        // if(person.getName().isPresent()) {
        //     String email = person.getEmail().get();
        //     System.out.println(email.toLowerCase());
        // } else {
        //     System.out.println("email not provided");
        // }

        class Person {
            private final String name;
            private final String email;
            Person(String name, String email){
                this.name = name;
                this.email = email;
            }
            public String getName(){
                return name;
            }
            public Optional<String> getEmail(){
                return Optional.ofNullable(email);
            }
        }


        Optional<String> hello = Optional.ofNullable("hello");

        System.out.println(hello.isPresent());

        hello.ifPresentOrElse(System.out::println, () -> System.out.println("world"));

        String orElse = hello
        .map(String::toUpperCase)
        .orElseGet(() -> {
            return "world";
        });

    System.out.println(orElse);

    }
}