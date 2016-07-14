package cakepattern.repository.mongodb

import cakepattern.model.User
import cakepattern.repository.{UserRepository, UserRepositoryComponent}

/**
  * Created by dcarroza on 14/07/16.
  */
trait UserRepositoryComponentImpl extends UserRepositoryComponent {

  def userRepository = new UserRepositoryImpl

  class UserRepositoryImpl extends UserRepository {

    override def get(id: Int): User = User(2, "daniel", "daniel@gmmail.com", 2, "daniel", "carroza")

    override def find(username: String): User = {
      User(2, "daniel", "daniel@gmmail.com", 2, "daniel", "carroza")
    }
  }

}
