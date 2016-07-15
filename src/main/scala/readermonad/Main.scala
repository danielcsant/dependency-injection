package readermonad

import readermonad.repository.mongodb.UserRepositoryImpl
import readermonad.repository.{UserRepository, Users}
import readermonad.service.UserInfo

/**
  * Created by dcarroza on 14/07/16.
  */
object Main {
  def main(args: Array[String]) {
    Application.printUser(2)
  }
}

object Application extends Application(
  new Config {
    override def userRepository: UserRepository = UserRepositoryImpl
  }
)

class Application(config: Config) extends Users {

  def printUser(id: Int): Unit = {
    val foundUser = UserInfo.findUser("daniel")(config)
    println(foundUser)
  }

}
