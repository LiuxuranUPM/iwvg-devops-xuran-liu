package es.upm.miw.iwvg_devops.code;

import es.upm.miw.iwvg_devops.code.Fraction;
import es.upm.miw.iwvg_devops.code.User;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTest {
    private User user;
    private List<Fraction> fractions1;

    @Test
    void testUserId() {
        List<Fraction> fractions1;
        fractions1=new ArrayList<>();
        User user = new User("1", "Mario", "Weeb", fractions1);
        assertEquals("1", user.getId());

    }
    @Test
    void testUserName() {
        List<Fraction> fractions1;
        fractions1=new ArrayList<>();
        User user = new User("1", "Mario", "Weeb", fractions1);
        assertEquals("Mario", user.getName());

    }
    @Test
    void testUserFamilyName() {
        List<Fraction> fractions1;
        fractions1=new ArrayList<>();
        User user = new User("1", "Mario", "Weeb", fractions1);
        assertEquals("Weeb", user.getFamilyName());
    }
    @Test
    void testUserFraction() {
        List<Fraction> fractions1;
        fractions1=new ArrayList<>();
        User user = new User("1", "Mario", "Weeb", fractions1);
        assertEquals(fractions1, user.getFractions());

    }
    @Test
    void testUserSetName() {
        List<Fraction> fractions1;
        fractions1=new ArrayList<>();
        User user = new User("1", "Mario", "Weeb", fractions1);
        user.setName("Luis");
        assertEquals("Luis", user.getName());

    }
    @Test
    void testUserSetFamilyName() {
        List<Fraction> fractions1;
        fractions1=new ArrayList<>();
        User user = new User("1", "Mario", "Weeb", fractions1);
        user.setFamilyName("setillo");
        assertEquals("setillo", user.getFamilyName());

    }
    @Test
    void testUserSetFraction() {
        List<Fraction> fractions1;
        fractions1=new ArrayList<>();
        User user = new User("1", "Mario", "Weeb", fractions1);
        List<Fraction> fractions2;
        fractions2=new ArrayList<>();
        user.setFractions(fractions2);
        assertEquals(fractions2, user.getFractions());

    }

}