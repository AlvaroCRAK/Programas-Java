  GNU nano 7.2                                                                                                       Main.java
import java.util.Objects;
class Animal {
  private String name;
  private int age;
  Animal (String name, int age){
    this.name = name;
    this.age = age;
  }
  private void setName(String name){
    this.name = name;
  }
  private void setAge(int age){
    this.age = age;
  }
  private String getName(){
    return name;
  }
  private int getAge(){
    return age;
  }
  @Override
  public String toString() {
    return String.format("Name = %s  -  Age = %d\n", name, age);
  }
  @Override
  public boolean equals(Object object){
    if ( this == object ) return true;
    if ( object == null || this.getClass() != object.getClass() ) return false;
    Animal obj = (Animal) object;
    return name.equals(obj.name) && age == obj.age;
  }
  @Override
  public int hashCode() {
    return Objects.hash(name, age);
  }
}
class Main{
  public static void main(String[] args){
    Animal animal1 = new Animal("Masciel", 18);
    Animal animal2 = new Animal("Masciel", 19);
    System.out.println(animal1.equals(animal2));
    System.out.println(animal1 + " " + animal1.getClass());
    System.out.println(animal2 + " " + animal2.getClass());

    System.out.println(animal1.hashCode());
    System.out.println(animal2.hashCode());
  }
}
