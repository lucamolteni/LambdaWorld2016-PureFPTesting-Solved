package world.lambda.purefp.assignment8

import java.util.logging.Logger

import org.specs2.mock.Mockito
import org.specs2.mutable.Specification

import scala.concurrent.Future


class Test8Mockable extends Specification with Mockito {

  "MockableTest" >> {

    val dbRepository = mock[DBRepository]
    val httpService = mock[HTTPService]
    val logger = mock[Logger]

    httpService.callHttpService(anyString) returns Future.successful("Ok")
    dbRepository.getNumberOfElements(anyString) returns Future.successful(10)

    val mockable = new Mockable(dbRepository, httpService, logger)

    val result = mockable.doComplicatedStuff("myparams")

    there was one(logger).info("Received 10 elements, sent to webservice")
  }
}
