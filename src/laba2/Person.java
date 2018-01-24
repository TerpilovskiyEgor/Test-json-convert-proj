/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laba2;

/**
 *
 * @author Egor
 */
public class Person {

    private String Name;
    private String Surname;
    private Integer Age;
    private Boolean Gender;

    public Person(String name, String surname, int age, Boolean isMan) {
        Name = name;
        Surname = surname;
        Age = age;
        Gender = isMan;
    }

//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj) {
//            return true;
//        }
//        if (!(obj instanceof Person)) {
//            return false;
//        }
//
//        Person p = (Person) obj;
//        return Name.equals(p.Name) && Surname.equals(p.Surname) && Age.equals(p.Age) && Gender.equals(p.Gender);
//    }
}
