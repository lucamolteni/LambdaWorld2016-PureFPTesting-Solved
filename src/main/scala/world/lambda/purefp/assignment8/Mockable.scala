package world.lambda.purefp.assignment8

import java.util.logging.Logger

import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global

trait DBRepository {
  def getNumberOfElements(params: String): Future[Int]
}

trait HTTPService {
  def callHttpService(params: String): Future[String]
}

class Mockable(db: DBRepository, http: HTTPService, logger: Logger) {

  def doComplicatedStuff(params: String): Unit =
    db.getNumberOfElements(params).zip(http.callHttpService(params)).map {

      case (numberOfElements, "Ok") if numberOfElements > 0 =>
        logger.info(s"Received $numberOfElements elements, sent to webservice")

      case _ =>
        logger.info(s"No element in the database")
    }
}
