import org.junit.Test;

import static org.junit.Assert.assertThat;


public class UserMapperTest {
    @Test
    public void shouldMapUserToUserCommand() {
        //given
        User user = new User();

        //when
        UserCommand userCommand = UserMapper.INSTANCE.UserToUserCommand(user);

        //then
        assertThat(user,null);
        assertThat(carDto.getMake()).isEqualTo("Morris");
        assertThat(carDto.getSeatCount()).isEqualTo(5);
        assertThat(carDto.getType()).isEqualTo("SEDAN");
    }
}

