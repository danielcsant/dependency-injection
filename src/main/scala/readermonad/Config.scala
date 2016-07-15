package readermonad

import readermonad.repository.UserRepository

/**
  * Created by dcarroza on 14/07/16.
  */
trait Config {
  def userRepository: UserRepository
//  def mailService: MailService
}
