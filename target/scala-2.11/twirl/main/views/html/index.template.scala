
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
                <img src=""""),_display_(/*8.28*/routes/*8.34*/.Assets.versioned("images/offwhite-j1.jpg")),format.raw/*8.77*/("""" alt="First Image">
                <div class="carousel-caption">
                    <a href=""""),_display_(/*10.31*/routes/*10.37*/.HomeController.products()),format.raw/*10.63*/("""">
                    </a>
                </div>
                <!--end of carousel caption-->
            </div>
            <!--end of carousel caption-->
            <div class="item">
                <img src=""""),_display_(/*17.28*/routes/*17.34*/.Assets.versioned("images/offwhite-vapormax1.jpg")),format.raw/*17.84*/("""" alt="Second Image">
                <div class="carousel-caption">
                    <a href=""""),_display_(/*19.31*/routes/*19.37*/.HomeController.products()),format.raw/*19.63*/("""">
                    </a>
                </div>
                <!--end of carousel caption-->
            </div>
            <!--end of carousel caption-->
            <div class="item">
                <img src=""""),_display_(/*26.28*/routes/*26.34*/.Assets.versioned("images/yeezy-v2-beluga2.jpg")),format.raw/*26.82*/("""" alt="Third Image">
                <div class="carousel-caption">
                    <a href=""""),_display_(/*28.31*/routes/*28.37*/.HomeController.products()),format.raw/*28.63*/("""">
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
                <h3 class="text-muted">We are Sneaker Sanctuary</h3>
                <p class="text-muted">Quality sneakers for sale here, no better price, no better place... no better time </p>
            </div>
            <div class="col-md-6">
                <img src=""""),_display_(/*54.28*/routes/*54.34*/.Assets.versioned("images/yeezy350.jpg")),format.raw/*54.74*/("""" class="img-responsive">
            </div>
        </div>
    </div>
    <div class="container">
        <div class="row">
            <div class="col-md-12">
                <h3 class="text-center">Contact Us For Any Sneaker You Would Like To See On Our Site!</h3>
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
                    <button type="submit" class="btn btn-dark btn-lg">Submit
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
                  DATE: Wed Feb 27 17:01:56 GMT 2019
                  SOURCE: /home/wdd/2ndYearProject/app/views/index.scala.html
                  HASH: fb23439f0f3ac8628de93c7b2ccc4ee8bbf564d7
                  MATRIX: 812->36|926->55|953->57|978->74|1016->75|1047->80|1292->299|1306->305|1369->348|1494->446|1509->452|1556->478|1801->696|1816->702|1887->752|2013->851|2028->857|2075->883|2320->1101|2335->1107|2404->1155|2529->1253|2544->1259|2591->1285|3751->2418|3766->2424|3827->2464
                  LINES: 30->2|35->2|36->3|36->3|36->3|37->4|41->8|41->8|41->8|43->10|43->10|43->10|50->17|50->17|50->17|52->19|52->19|52->19|59->26|59->26|59->26|61->28|61->28|61->28|87->54|87->54|87->54
                  -- GENERATED --
              */
          