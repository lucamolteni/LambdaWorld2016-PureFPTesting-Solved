package world.lambda.purefp.assignment9

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Future

class Pure(getNumberOfElements: String => Future[Int],
           callHttpService: String => Future[String]) {

  def doComplicatedStuff(params: String): Future[String] =
    getNumberOfElements(params).zip(callHttpService(params)).map {

      case (numberOfElements, "Ok") if numberOfElements > 0 =>
        s"Received $numberOfElements elements, sent to webservice"

      case _ =>
        s"No element in the database"
    }
}
