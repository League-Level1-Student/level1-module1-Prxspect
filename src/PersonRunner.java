
public class PersonRunner {
 public static void main(String[] args) {

Person person1 = new Person();
Person person2 = new Person();
Person person3 = new Person();

person1.setName("bob");
person1.setSuperpower("flying");
System.out.println(person1.getSuperpower());
System.out.println(person1.getName());
System.out.println(person1.toString());

person2.setName("james");
person2.setSuperpower("super speed");
System.out.println(person2.getSuperpower());
System.out.println(person2.getName());
System.out.println(person2.toString());

person3.setName("mike");
person3.setSuperpower("super strength");
System.out.println(person3.getSuperpower());
System.out.println(person3.getName());
System.out.println(person3.toString());


 }
}
