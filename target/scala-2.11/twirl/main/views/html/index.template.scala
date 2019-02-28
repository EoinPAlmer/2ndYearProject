
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
            </div>
            <!--end of carousel caption-->
            <div class="item">
                <img src=""""),_display_(/*16.28*/routes/*16.34*/.Assets.versioned("images/offwhite-vapormax1.jpg")),format.raw/*16.84*/("""" alt="Second Image">
                <div class="carousel-caption">
                    <a href=""""),_display_(/*18.31*/routes/*18.37*/.HomeController.products()),format.raw/*18.63*/("""">
                    </a>
                </div>
                <!--end of carousel caption-->
            </div>
            <div class="item">
                <img src=""""),_display_(/*24.28*/routes/*24.34*/.Assets.versioned("images/yeezy-v2-beluga2.jpg")),format.raw/*24.82*/("""" alt="Third Image">
                <div class="carousel-caption">
                    <a href=""""),_display_(/*26.31*/routes/*26.37*/.HomeController.products()),format.raw/*26.63*/("""">
                    </a>
                </div>
                <!--end of carousel caption-->
            </div>
            <div class="item">
                <img src=""""),_display_(/*32.28*/routes/*32.34*/.Assets.versioned("images/balenciaga.jpg")),format.raw/*32.76*/("""" alt="Forth Image">
                <div class="carousel-caption">
                    <a href=""""),_display_(/*34.31*/routes/*34.37*/.HomeController.products()),format.raw/*34.63*/("""">
                    </a>
                </div>
                <!--end of carousel caption-->
            </div>
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
                <p class="text-muted">For over a decade, Sneaker Sanctuary has changed the landscape of sneaker retail. Carrying every brand name on the market, Sneaker Sanctuary has evolved from a one-stop sneaker destination, to a cultural hub for sneaker enthusiasts and novices alike.</p>
                <p class="text-muted"> Sneaker Sanctuary remains as the premiere source for everything sneakers.</p>
                <p class="text-muted"> From Yeeƶys to Nike, adidas, Balenciaga and more, we have it all.</p>
            </div>
            <div class="col-md-6">
                <img src=""""),_display_(/*61.28*/routes/*61.34*/.Assets.versioned("images/yeezy350.jpg")),format.raw/*61.74*/("""" class="img-responsive">
            </div>
        </div>
    </div>
    <div class="container">
        <div class="row">
            <div class="col-md-12">
                <h3 class="text-center">Sign Up For Our Weekly News Letter</h3>
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
                  DATE: Thu Feb 28 14:05:49 GMT 2019
                  SOURCE: /home/wdd/2ndYearProject/app/views/index.scala.html
                  HASH: e9e319e6725fe9f7a94d0665909a6beeb30e2979
                  MATRIX: 812->36|926->55|953->57|978->74|1016->75|1047->80|1292->299|1306->305|1369->348|1494->446|1509->452|1556->478|1754->649|1769->655|1840->705|1966->804|1981->810|2028->836|2230->1011|2245->1017|2314->1065|2439->1163|2454->1169|2501->1195|2703->1370|2718->1376|2781->1418|2906->1516|2921->1522|2968->1548|4478->3031|4493->3037|4554->3077
                  LINES: 30->2|35->2|36->3|36->3|36->3|37->4|41->8|41->8|41->8|43->10|43->10|43->10|49->16|49->16|49->16|51->18|51->18|51->18|57->24|57->24|57->24|59->26|59->26|59->26|65->32|65->32|65->32|67->34|67->34|67->34|94->61|94->61|94->61
                  -- GENERATED --
              */
          