public class Main {
    public static void main(String[] args) {
        PersonBuilder personBuilder = new PersonBuilder();
        Person person1 = personBuilder.setFirstName("Gianni").setLastName("Giannelli").build();
        Person person2 = personBuilder.setFirstName("Jianni").setLastName("Gianne").build();
        Person person3 = personBuilder.setFirstName("Giannone").setLastName("Gian").build();

        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);

    }
}