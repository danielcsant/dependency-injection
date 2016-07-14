package cakepattern.service

import cakepattern.repository.mongodb.UserRepositoryComponentImpl

/**
  * Created by dcarroza on 14/07/16.
  */
object UserInfoImpl
  extends UserInfo
  with UserRepositoryComponentImpl
