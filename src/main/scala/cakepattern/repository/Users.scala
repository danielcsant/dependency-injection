package cakepattern.repository

import cakepattern.model.User

/**
  * Created by dcarroza on 14/07/16.
  */
trait Users {
  this: UserRepositoryComponent =>

  def getUser(id: Int): User = {
    userRepository.get(id)
  }

  def findUser(username: String): User = {
    userRepository.find(username)
  }
}
