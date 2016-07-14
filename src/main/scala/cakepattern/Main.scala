package cakepattern

import cakepattern.service.UserInfoImpl

/**
  * Created by dcarroza on 14/07/16.
  */
object Main {

  def main(args: Array[String]) {
    val foundUser = UserInfoImpl.findUser("daniel")

    println(foundUser)

    println(UserInfoImpl.userInfo("daniel"))
  }

}
