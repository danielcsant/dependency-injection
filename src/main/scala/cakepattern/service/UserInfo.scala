package cakepattern.service

import cakepattern.repository.{UserRepositoryComponent, Users}

/**
  * Created by dcarroza on 14/07/16.
  */
trait UserInfo extends Users {
  this: UserRepositoryComponent =>

  def userEmail(id: Int): String = {
    getUser(id).email
  }

  def userInfo(username: String): Map[String, String] = {
    val user = findUser(username)
    val boss = getUser(user.supervisorId)
    Map(
      "fullName" -> s"${user.firstName} ${user.lastName}",
      "email" -> s"${user.email}",
      "boss" -> s"${boss.firstName} ${boss.lastName}"
    )
  }
}
