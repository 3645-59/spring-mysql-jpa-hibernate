package example;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import example.entities.User;
import example.repositories.UserRepository;

@SuppressWarnings("deprecation")
@RunWith(SpringRunner.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace=Replace.NONE)
public class UserControllerTest {
	@Autowired
	private UserRepository userRepository;


	@Test
	public void whenFindById_thenReturnUser() {
		// given
		User user = new User();
		user.setEmail("test@yopmail.com");
		user.setName("TEST");

		userRepository.save(user);

		// when
		User found = userRepository.findByName(user.getName());

		// then
		assertThat(found.getName()).isEqualTo(user.getName());
	}
}
