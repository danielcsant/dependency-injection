package cakepatternimplicits.repository

/**
  * Created by dcarroza on 14/07/16.
  */
trait Users {

  def getUser(id: Int)(implicit userRepository: UserRepository) = {
    userRepository.get(id)
  }

  def findUser(username: String)(implicit userRepository: UserRepository) = {
    userRepository.find(username)
  }
}
