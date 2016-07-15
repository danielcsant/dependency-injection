package readermonad.repository

import readermonad.Config

/**
  * Created by dcarroza on 14/07/16.
  */
trait Users {
  import scalaz.Reader

  def getUser(id: Int) =
    Reader(
      (config: Config) => config.userRepository.get(id)
    )

  def findUser(username: String) =
    Reader(
      (config: Config) => config.userRepository.find(username)
    )
}
