package readermonad

import readermonad.model.User
import readermonad.repository.UserRepository
import org.scalamock.scalatest.MockFactory
import org.scalatest.FunSuite

/**
  * Created by dcarroza on 14/07/16.
  */
class TestUserInfo
  extends FunSuite
    with MockFactory {

  lazy val userRepository = mock[UserRepository]

  test("userRepository mock with implicits") {
    val mockReturn = User(1, "Peter", "Peter@gmmail.com", 2, "other", "other")
    (userRepository.find _).expects("Peter").returning(mockReturn)

    val userFound = userRepository.find("Peter")

    assert(userFound == mockReturn)
  }
}
