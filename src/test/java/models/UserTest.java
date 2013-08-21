package models;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class UserTest {

    private User user;

    @Before
    public void setUp() throws Exception {
        user = new User();
    }

    @Test
    public void testEmptyEmailIsNotValidForAuth() throws Exception {

        user.setEmail("");
        user.setPassword("asjkd");
        assertThat(user.IsValidFoAuth(), is(false));
    }

    @Test
    public void testNullEmailIsNotValidForAuth() throws Exception {

        user.setPassword("asjkd");
        assertThat(user.IsValidFoAuth(), is(false));
    }

    @Test
    public void testEmptyPasswordIsNotValidForAuth() throws Exception {
        user.setEmail("jmured@gmail.com");
        user.setPassword("");
        assertThat(user.IsValidFoAuth(), is(false));
    }

    @Test
    public void testNullPasswordIsNotValidForAuth() throws Exception {
        user.setEmail("jmured@gmail.com");
        assertThat(user.IsValidFoAuth(), is(false));
    }

    @Test
    public void testValidEmailIsRequiredForAuth() throws Exception {
        user.setEmail("jmured");
        user.setPassword("asd");
        assertThat(user.IsValidFoAuth(), is(false));
    }
}
