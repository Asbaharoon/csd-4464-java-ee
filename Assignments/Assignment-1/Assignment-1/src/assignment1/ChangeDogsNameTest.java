package assignment1;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ChangeDogsNameTest {

	@Test
	void personWithDog() {
		Dog d = new Dog("Kai", 9);
		Person p = new Person("Ryan", 20, d);
		p.changeDogsName("Fred");
		assertEquals(p.getDog().get().getName(), "Fred");
	}
	
	@Test
	void personWithoutDog() {
		Person p = new Person("Ryan", 20);
		RuntimeException ex = assertThrows(RuntimeException.class, () -> {
			p.changeDogsName("Fred");
		});
		assertEquals("Ryan does not own a dog!", ex.getMessage());
	}

}
