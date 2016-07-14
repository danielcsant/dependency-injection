package cakepattern

import cakepattern.model.User
import cakepattern.repository.{UserRepository, UserRepositoryComponent}
import cakepattern.service.UserInfo
import org.scalamock.scalatest.MockFactory
import org.scalatest.FunSuite
/**
  * Created by dcarroza on 14/07/16.
  */
class TestUserInfo
  extends FunSuite
    with MockFactory
    with UserInfo
    with UserRepositoryComponent {

  lazy val userRepository = mock[UserRepository]

  test("userRepository mock") {
    val mockReturn = User(1, "Peter", "Peter@gmmail.com", 2, "other", "other")
    (userRepository.find _).expects("Peter").returning(mockReturn)

    val userFound = userRepository.find("Peter")

    assert(userFound == mockReturn)
  }
}
