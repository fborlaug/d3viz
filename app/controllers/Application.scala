package controllers

import play.api._
import play.api.mvc._

object Application extends Controller {

  def index = Action {
    Ok(views.html.index("Your new application is ready."))
  }

  def d3_1 = Action {
    Ok(views.html.d3_1("Your new application is ready."))
  }


  def d3_2 = Action {
    Ok(views.html.d3_2("Your new application is ready."))
  }

  def d3_3 = Action {
    Ok(views.html.d3_3("Your new application is ready."))
  }


}