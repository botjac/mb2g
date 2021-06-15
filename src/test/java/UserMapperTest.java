import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertThat;


public class UserMapperTest {
    @Test
    public void shouldMapUserToUserCommand() {
        //given
        User user = new User("Oom","Frikkie","oom@frik.com");

        //when
        UserCommand userCommand = UserMapper.INSTANCE.UserToUserCommand(user);

        //then
        assertThat(userCommand,is(notNullValue()));
        assertThat(userCommand.getFirstName(),is("Oom"));

    }

    @Test
    public void shouldMapUserCommandToUser() {
        //given
        UserCommand userCommand = new UserCommand("Oom","Frikkie","oom@frik.com");

        //when
        User user = UserMapper.INSTANCE.UserCommandToUser(userCommand);

        //then
        assertThat(user,is(notNullValue()));
        assertThat(user.getFirstName(),is("Oom"));

    }
}

