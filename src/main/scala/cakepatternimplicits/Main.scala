package cakepatternimplicits

import cakepatternimplicits.repository.UserRepository
import cakepatternimplicits.repository.mongodb.UserRepositoryImpl
import cakepatternimplicits.service.UserInfoImpl

/**
  * Created by dcarroza on 14/07/16.
  */
object Main {

  def main(args: Array[String]) {
    implicit val userRepository: UserRepository = new UserRepositoryImpl
    val foundUser = UserInfoImpl.findUser("daniel")

    println(foundUser)

    println(UserInfoImpl.userInfo("daniel"))
  }

}
