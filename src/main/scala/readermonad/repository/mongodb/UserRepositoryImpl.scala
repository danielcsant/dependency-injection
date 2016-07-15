package readermonad.repository.mongodb

import readermonad.model.User
import readermonad.repository.UserRepository

/**
  * Created by dcarroza on 14/07/16.
  */
object UserRepositoryImpl extends UserRepository {

  override def get(id: Int): User =
    User(2, "daniel", "daniel@gmmail.com", 2, "daniel", "carroza")

  override def find(username: String): User = {
    User(2, "daniel", "daniel@gmmail.com", 2, "daniel", "carroza")
  }
}
