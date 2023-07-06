package com.zipcodewilmington.person;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 2/12/18.
 */
public class TestPerson {
    @Test
    public void testDefaultConstructor() {
        // Given
        String expectedName = "";
        Integer expectedAge = Integer.MAX_VALUE;

        // When
        Person person = new Person();

        // Then
        String actualName = person.getName();
        Integer actualAge = person.getAge();

        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedAge, actualAge);
    }

    @Test
    public void testConstructorWithName() {
        // Given
        String expected = "Leon";

        // When
        Person person = new Person(expected);

        // Then
        String actual = person.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testConstructorWithAge() {
        // Given
        Integer expected = 5;

        // When
        Person person = new Person(expected);

        // Then
        Integer actual = person.getAge();
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testConstructorWithNameAndAge() {
        // Given
        Integer expectedAge = 5;
        String expectedName = "Leon";

        // When
        Person person = new Person(expectedName, expectedAge);

        // Then
        Integer actualAge = person.getAge();
        String actualName = person.getName();

        Assert.assertEquals(expectedAge, actualAge);
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void testSetName() {
        // Given
        Person person = new Person();
        String expected = "Leon";

        // When
        person.setName(expected);
        String actual = person.getName();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetAge() {
        // Given
        Person person = new Person();
        Integer expected = 5;

        // When
        person.setAge(expected);

        // Then
        Integer actual = person.getAge();
        Assert.assertEquals(expected, actual);
    }
    public void testGetFavColor() {
        // Given
        Person person = new Person();
        String expected = "red";

        // When
        person.setFavColor(expected);

        // Then
        String actual = person.getFavColor();
        Assert.assertEquals(expected, actual);

    }

    public void testGetNickname() {
        // Given
        Person person = new Person();
        String expected = "Bean Man";

        // When
        person.setNickname(expected);

        // Then
        String actual = person.getNickname();
        Assert.assertEquals(expected, actual);
    }

    public void testGetFavoriteNum() {
        // Given
        Person person = new Person();
        Integer expected = 16;

        // When
        person.setFavoriteNum(expected);

        // Then
        Integer actual = person.getFavoriteNum();
        Assert.assertEquals(expected, actual);
    }

    public void testIsAlive() {
        // Given
        Person person = new Person();
        boolean expected = false;

        // When
        person.setAlive(expected);

        // Then
        boolean actual = person.isAlive();
        Assert.assertEquals(expected, actual);
    }

    public void testGetPhoneNumber() {
        // Given
        Person person = new Person();
        String expected = "867-5309";

        // When
        person.setPhoneNumber(expected);

        // Then
        String actual = person.getPhoneNumber();
        Assert.assertEquals(expected, actual);
    }

    public void testSetFavColor() {
        // Given
        Person person = new Person();
        String expected = "Spaghetti red";

        // When
        person.setFavColor(expected);

        // Then
        String actual = person.getFavColor();
        Assert.assertEquals(expected, actual);
    }

    public void testSetNickname() {
        // Given
        Person person = new Person();
        String expected = "Catwoman";

        // When
        person.setNickname(expected);

        // Then
        String actual = person.getNickname();
        Assert.assertEquals(expected, actual);
    }

    public void testSetFavoriteNum() {
        // Given
        Person person = new Person();
        Integer expected = 45902;

        // When
        person.setFavoriteNum(expected);

        // Then
        Integer actual = person.getFavoriteNum();
        Assert.assertEquals(expected, actual);
    }

    public void testSetAlive() {
        // Given
        Person person = new Person();
        boolean expected = true;

        // When
        person.setAlive(expected);

        // Then
        boolean actual = person.isAlive();
        Assert.assertEquals(expected, actual);
    }

    public void testSetPhoneNumber() {
        // Given
        Person person = new Person();
        String expected = "444-555-1212";

        // When
        person.setPhoneNumber(expected);

        // Then
        String actual = person.getPhoneNumber();
        Assert.assertEquals(expected, actual);
    }
}
