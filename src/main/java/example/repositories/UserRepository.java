package example.repositories;

import org.springframework.data.repository.CrudRepository;

import example.entities.User;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface UserRepository extends CrudRepository<User, Long> {
	public User findById(Integer id);
	public User findByName(String name);
}