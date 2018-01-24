/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tests;

import com.google.gson.Gson;
import laba2.Person;
import org.junit.Test;
import nl.jqno.equalsverifier.EqualsVerifier;
import nl.jqno.equalsverifier.Warning;
import static org.junit.Assert.*;

/**
 *
 * @author Egor
 */
public class Test_Laba2 {

    public Test_Laba2() {
    }

    @Test
    public void equalsTest1() {
        EqualsVerifier.forClass(Person.class);
    }

    @Test
    public void equalsTest2() {
        Person obj1 = new Person("Jhon", "Smith", 20, true);
        Gson gson = new Gson();
        String json = gson.toJson(obj1);
        Person obj2 = gson.fromJson(json, Person.class);
       assertEquals(obj1,obj2);
    }
}
