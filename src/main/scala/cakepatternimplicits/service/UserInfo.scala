package cakepatternimplicits.service

import cakepatternimplicits.repository.{UserRepository, Users}

/**
  * Created by dcarroza on 14/07/16.
  */
trait UserInfo extends Users {

  def userEmail(id: Int)(implicit userRepository: UserRepository) = {
    getUser(id).email
  }

  def userInfo(username: String)(implicit userRepository: UserRepository) = {
    val user = findUser(username)
    val boss = getUser(user.supervisorId)
    Map(
      "fullName" -> s"${user.firstName} ${user.lastName}",
      "email" -> s"${user.email}",
      "boss" -> s"${boss.firstName} ${boss.lastName}"
    )
  }
}
