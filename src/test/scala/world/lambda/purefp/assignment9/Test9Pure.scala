package world.lambda.purefp.assignment9

import org.specs2.concurrent.ExecutionEnv
import org.specs2.mutable.Specification

import scala.concurrent.Future

class Test9Pure extends Specification {

  "Pure test" >> { implicit ee: ExecutionEnv =>

    val numberOfElements: String => Future[Int] = _ => Future.successful(10)
    val callHttpService: String => Future[String] = _ => Future.successful("Ok")

    val pure = new Pure(numberOfElements, callHttpService)

    val result: Future[String] = pure.doComplicatedStuff("myparams")

    result.map(_ === "Received 10 elements, sent to webservice").await
  }

}
