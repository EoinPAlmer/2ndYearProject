
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._
/*1.2*/import javax.swing.text.html.HTML

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*3.2*/main("home",user)/*3.19*/{_display_(Seq[Any](format.raw/*3.20*/("""
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

  def render(user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(user)

  def f:((models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (user) => apply(user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Mar 27 11:36:47 GMT 2019
                  SOURCE: /home/wdd/2ndYearProject/app/views/index.scala.html
                  HASH: 7b47d489dd10c383c84c328f6f097405d2716edf
                  MATRIX: 651->1|1000->36|1119->63|1144->80|1182->81|1213->86|1458->305|1472->311|1535->354|1660->452|1675->458|1722->484|1920->655|1935->661|2006->711|2132->810|2147->816|2194->842|2396->1017|2411->1023|2480->1071|2605->1169|2620->1175|2667->1201|2869->1376|2884->1382|2947->1424|3072->1522|3087->1528|3134->1554|4644->3037|4659->3043|4720->3083
                  LINES: 24->1|29->2|34->3|34->3|34->3|35->4|39->8|39->8|39->8|41->10|41->10|41->10|47->16|47->16|47->16|49->18|49->18|49->18|55->24|55->24|55->24|57->26|57->26|57->26|63->32|63->32|63->32|65->34|65->34|65->34|92->61|92->61|92->61
                  -- GENERATED --
              */
          