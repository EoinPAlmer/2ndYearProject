
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object index_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._

     object index_Scope1 {
import javax.swing.text.html.HTML

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[models.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(user: models.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.21*/("""
"""),_display_(/*3.2*/main("home",user)/*3.19*/{_display_(Seq[Any](format.raw/*3.20*/("""
    """),format.raw/*4.5*/("""<div id="mycarousel" class="carousel slide" data-ride="carousel">
        <!-- Wrapper for slides -->
        <div class="carousel-inner" role="listbox">
            <div class="item active">
                <img src=""""),_display_(/*8.28*/routes/*8.34*/.Assets.versioned("images/slide1_img.jpg")),format.raw/*8.76*/("""" alt="First Image">
                <div class="carousel-caption">
                    <a href=""""),_display_(/*10.31*/routes/*10.37*/.HomeController.products()),format.raw/*10.63*/("""">
                        <p class="carouseltext text-center">Shop now</p>
                        <p class="carouselsubtext text-center">Click here to view our latest products</p>
                    </a>
                </div>
                <!--end of carousel caption-->
            </div>
            <!--end of carousel caption-->
            <div class="item">
                <img src=""""),_display_(/*19.28*/routes/*19.34*/.Assets.versioned("images/slide2_img.jpg")),format.raw/*19.76*/("""" alt="Second Image">
                <div class="carousel-caption">
                    <a href=""""),_display_(/*21.31*/routes/*21.37*/.HomeController.products()),format.raw/*21.63*/("""">
                        <p class="carouseltext text-center">Shop now</p>
                        <p class="carouselsubtext text-center">Click here to view our latest products</p>
                    </a>
                </div>
                <!--end of carousel caption-->
            </div>
            <!--end of carousel caption-->
            <div class="item">
                <img src=""""),_display_(/*30.28*/routes/*30.34*/.Assets.versioned("images/slide3_img.jpg")),format.raw/*30.76*/("""" alt="Second Image">
                <div class="carousel-caption">
                    <a href=""""),_display_(/*32.31*/routes/*32.37*/.HomeController.products()),format.raw/*32.63*/("""">
                        <p class="carouseltext text-center">Shop now</p>
                        <p class="carouselsubtext text-center">Click here to view our latest products</p>
                    </a>
                </div>
                <!--end of carousel caption-->
            </div>
            <!--end of carousel caption-->
        </div>
        <!--end of carousel inner-->
        <!-- Controls -->
        <a class="left carousel-control" href="#mycarousel" role="button" data-slide="prev">
            <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
            <span class="sr-only">Previous</span>
        </a>
        <a class="right carousel-control" href="#mycarousel" role="button" data-slide="next">
            <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
            <span class="sr-only">Next</span>
        </a>
    </div>
    <div class="container">
        <div class="row">
            <div class="col-md-6">
                <h1>Who Are We?</h1>
                <h3 class="text-muted">We are Sourced Soles</h3>
                <p class="text-muted">Have you ever seen a sneaker online and wish you could purchase it, but it became deadstock and stores no longer sell it. Well thats where we come in, we are Sourced Soles and as the name suggests we have contacts all over the world that source sneakers &nbsp;(Brand new or Second hand) . We source sneakers for you and ship them to you within 3-5 working days. Its as simple as that, no sneaker is too hard for us to find!</p>
            </div>
            <div class="col-md-6">
                <img src=""""),_display_(/*60.28*/routes/*60.34*/.Assets.versioned("images/yeezy350.jpg")),format.raw/*60.74*/("""" class="img-responsive">
            </div>
        </div>
    </div>
    <div class="container">
        <div class="row">
            <div class="col-md-12">
                <h3 class="text-center">Contact Us For Any Sneaker You Would Like Us To Source For You!</h3>
            </div>
        </div>
        <div class="row text-center">
            <div class="col-md-offset-3 col-md-6">
                <form role="form">
                    <div class="form-group">
                        <label class="control-label" for="exampleInputEmail1">Name</label>
                        <input class="form-control" id="exampleInputEmail1" placeholder="Name" type="text">
                    </div>
                    <div class="form-group">
                        <label class="control-label" for="exampleInputPassword1">Email Address</label>
                        <input class="form-control" id="exampleInputPassword1" placeholder="Example@Example.com" type="email">
                    </div>
                    <div class="form-group">
                        <label class="control-label" for="exampleInputPassword1">Sneaker You Want Us To Source</label>
                        <input class="form-control" id="exampleInputPassword1" placeholder="Sneaker Name" type="text">
                    </div>
                    <div class="form-group">
                        <label class="control-label" for="exampleInputPassword1">Phone Number</label>
                        <input class="form-control" id="exampleInputPassword1" placeholder="Phone Number" type="text">
                    </div>
                    <button type="submit" class="btn btn-danger btn-lg">Submit
                        <i class="-o fa fa-fw fa-send"></i>
                    </button>
                </form>
            </div>
        </div>
    </div>
""")))}))
      }
    }
  }

  def render(user:models.User): play.twirl.api.HtmlFormat.Appendable = apply(user)

  def f:((models.User) => play.twirl.api.HtmlFormat.Appendable) = (user) => apply(user)

  def ref: this.type = this

}


}
}

/**/
object index extends index_Scope0.index_Scope1.index
              /*
                  -- GENERATED --
                  DATE: Fri Feb 22 14:31:53 GMT 2019
                  SOURCE: /home/wdd/IanDaly-sourcedsoles-d991719c7913/app/views/index.scala.html
                  HASH: 3e44107d8bfe898192426e02de810f08db93a68e
                  MATRIX: 812->36|926->55|953->57|978->74|1016->75|1047->80|1292->299|1306->305|1368->347|1493->445|1508->451|1555->477|1979->874|1994->880|2057->922|2183->1021|2198->1027|2245->1053|2669->1450|2684->1456|2747->1498|2873->1597|2888->1603|2935->1629|4610->3277|4625->3283|4686->3323
                  LINES: 30->2|35->2|36->3|36->3|36->3|37->4|41->8|41->8|41->8|43->10|43->10|43->10|52->19|52->19|52->19|54->21|54->21|54->21|63->30|63->30|63->30|65->32|65->32|65->32|93->60|93->60|93->60
                  -- GENERATED --
              */
          