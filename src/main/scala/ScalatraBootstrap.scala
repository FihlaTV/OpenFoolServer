import org.scalatra.LifeCycle
import javax.servlet.ServletContext
import ru.hyst329.openfoolserver.Server

class ScalatraBootstrap extends LifeCycle {
  override def init(context: ServletContext) {
    context mount (new Server, "/*")
  }
}
