package readermonad.service

import readermonad.repository.Users

/**
  * Created by dcarroza on 14/07/16.
  */
object UserInfo extends Users {

  def userEmail(id: Int) = {
    getUser(id) map (_.email)
  }

  def userInfo(username: String) =
    for {
      user <- findUser(username)
      boss <- getUser(user.supervisorId)
    } yield Map(
      "fullName" -> s"${user.firstName} ${user.lastName}",
      "email" -> s"${user.email}",
      "boss" -> s"${boss.firstName} ${boss.lastName}"
    )
}