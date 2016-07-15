package readermonad.repository

import readermonad.model.User

/**
  * Created by dcarroza on 14/07/16.
  */
trait UserRepository {
  def get(id: Int): User
  def find(username: String): User
}
