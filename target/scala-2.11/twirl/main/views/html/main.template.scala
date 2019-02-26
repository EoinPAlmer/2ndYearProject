
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object main_Scope0 {
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

class main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[String,models.User,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String, user: models.User)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import javax.swing.text.html.HTML

Seq[Any](format.raw/*1.51*/("""
"""),format.raw/*3.1*/("""<html>
    <head>
        <title>Sourced Soles-The Latest In Sourced Footwear</title>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
            <!-- Latest compiled and minified CSS -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
        <script type="text/javascript" src="http://cdnjs.cloudflare.com/ajax/libs/jquery/2.0.3/jquery.min.js"></script>
        <script type="text/javascript" src="http://netdna.bootstrapcdn.com/bootstra/p3.3.4/js/bootstrap.min.js"></script>
        <link href="http://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.3.0/css/font-awesome.min.css" rel="stylesheet" type="text/css">
        <link href="http://cdn.phpoll.com/css/animate.css" rel="stylesheet">
            <!--Animated css file-->
            <!-- Latest compiled and minified JavaScript -->
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
        <link rel="stylesheet" type="text/css" href=""""),_display_(/*17.55*/routes/*17.61*/.Assets.versioned("stylesheets/stylesheet.css")),format.raw/*17.108*/("""">
        <link href="https://fonts.googleapis.com/css?family=Pacifico" rel="stylesheet">
    </head>

    <body>
        <nav class="navbar">
            <div class="container">
                    <!-- Brand and toggle get grouped for better mobile display -->
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand" href=""""),_display_(/*32.52*/routes/*32.58*/.HomeController.index()),format.raw/*32.81*/("""" id="navbarlogo">Sneaker Sancturay</a>
                </div>
                    <!-- Collect the nav links, forms, and other content for toggling -->
                <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                    <ul class="nav navbar-nav navbar-right">
                        <li """),_display_(/*37.30*/if(title == "home")/*37.49*/ {_display_(Seq[Any](format.raw/*37.51*/("""
                            """),format.raw/*38.29*/("""class="active"""")))}),format.raw/*38.44*/("""><a href=""""),_display_(/*38.55*/routes/*38.61*/.HomeController.index()),format.raw/*38.84*/("""">Home</a></li>
                        <li """),_display_(/*39.30*/if(title == "products")/*39.53*/ {_display_(Seq[Any](format.raw/*39.55*/("""
                            """),format.raw/*40.29*/("""class="active"""")))}),format.raw/*40.44*/("""><a href=""""),_display_(/*40.55*/routes/*40.61*/.HomeController.products()),format.raw/*40.87*/("""">Products</a></li>
                        """),_display_(/*41.26*/if(user != null)/*41.42*/ {_display_(Seq[Any](format.raw/*41.44*/("""
                            """),format.raw/*42.29*/("""<li """),_display_(/*42.34*/if(title == "Add Product")/*42.60*/ {_display_(Seq[Any](format.raw/*42.62*/("""class = "active"""")))}),format.raw/*42.79*/(""">
                            <a href=""""),_display_(/*43.39*/routes/*43.45*/.HomeController.addProduct()),format.raw/*43.73*/("""">Add A Product</a>
                            </li>
                        """)))}),format.raw/*45.26*/("""
                        """),format.raw/*46.25*/("""<li """),_display_(/*46.30*/if(title == "login")/*46.50*/{_display_(Seq[Any](format.raw/*46.51*/("""class = "active"""")))}),format.raw/*46.68*/(""">
                        """),_display_(/*47.26*/if(user == null)/*47.42*/ {_display_(Seq[Any](format.raw/*47.44*/("""
                            """),format.raw/*48.29*/("""<a href=""""),_display_(/*48.39*/routes/*48.45*/.LoginController.login()),format.raw/*48.69*/("""">Login</a>
                        """)))}/*49.27*/else/*49.32*/{_display_(Seq[Any](format.raw/*49.33*/("""
                            """),format.raw/*50.29*/("""<a href = """"),_display_(/*50.41*/routes/*50.47*/.LoginController.logout()),format.raw/*50.72*/("""">Logout """),_display_(/*50.82*/user/*50.86*/.getName()),format.raw/*50.96*/("""</a>
                        """)))}),format.raw/*51.26*/("""
                    """),format.raw/*52.21*/("""</ul>

                </div>
                    <!-- /.navbar-collapse -->
            </div>
                <!-- /.container-->
        </nav> <!--End of navbar--->
        """),_display_(/*59.10*/content),format.raw/*59.17*/("""
        """),format.raw/*60.9*/("""<footer id="footer">
            <div class="container">
                <div class="row footerinfo">
                    <div class="col-xs-6 col-sm-6 col-md-6 col-lg-6">
                        <h4 contenteditable="true">COPYRIGHT © 2019 Sneaker Sancturay</h4>
                        <p>Eoin Palmer - X00136028
                        <br>Paul Roche - X00
                        <br>Finn Harvey - X00 </p>
                    </div>
                    <div class="col-xs-6 col-sm-6 col-md-6 col-lg-6">
                        <a href="#"><i class="fa fa-3x fa-fw fa-instagram text-inverse pull-right"></i></a>
                        <a href="#"><i class="fa fa-3x fa-fw fa-twitter text-inverse pull-right"></i></a>
                        <a href="#"><i class="fa fa-3x fa-fw fa-facebook text-inverse pull-right"></i></a>
                        <a href="#"><i class="fa fa-3x fa-fw fa-github text-inverse pull-right"></i></a>
                    </div>
                </div>
            </div>
        </footer>
    </body>
        <!--Javascript file to make footer always on bottom of page -->
    <script>

        function confirmDel()"""),format.raw/*82.30*/("""{"""),format.raw/*82.31*/("""
            """),format.raw/*83.13*/("""return confirm('Are you sure?');
        """),format.raw/*84.9*/("""}"""),format.raw/*84.10*/("""

            """),format.raw/*86.13*/("""$(document).ready(function () """),format.raw/*86.43*/("""{"""),format.raw/*86.44*/("""

                """),format.raw/*88.17*/("""var docHeight = $(window).height();
                var footerHeight = $('#footer').height();
                var footerTop = $('#footer').position().top + footerHeight;

                if (footerTop < docHeight) """),format.raw/*92.44*/("""{"""),format.raw/*92.45*/("""
                    """),format.raw/*93.21*/("""$('#footer').css('margin-top', 10 + (docHeight - footerTop) + 'px');
                """),format.raw/*94.17*/("""}"""),format.raw/*94.18*/("""
            """),format.raw/*95.13*/("""}"""),format.raw/*95.14*/(""");
    </script>

</html>
"""))
      }
    }
  }

  def render(title:String,user:models.User,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title,user)(content)

  def f:((String,models.User) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title,user) => (content) => apply(title,user)(content)

  def ref: this.type = this

}


}

/**/
object main extends main_Scope0.main
              /*
                  -- GENERATED --
                  DATE: Tue Feb 26 11:10:58 GMT 2019
                  SOURCE: /home/wdd/beG/app/views/main.scala.html
                  HASH: ae42307b495600d1a1ac8b20b80531748f113d56
                  MATRIX: 760->1|937->50|964->86|2272->1367|2287->1373|2356->1420|3172->2209|3187->2215|3231->2238|3590->2570|3618->2589|3658->2591|3715->2620|3761->2635|3799->2646|3814->2652|3858->2675|3930->2720|3962->2743|4002->2745|4059->2774|4105->2789|4143->2800|4158->2806|4205->2832|4277->2877|4302->2893|4342->2895|4399->2924|4431->2929|4466->2955|4506->2957|4554->2974|4621->3014|4636->3020|4685->3048|4795->3127|4848->3152|4880->3157|4909->3177|4948->3178|4996->3195|5050->3222|5075->3238|5115->3240|5172->3269|5209->3279|5224->3285|5269->3309|5325->3347|5338->3352|5377->3353|5434->3382|5473->3394|5488->3400|5534->3425|5571->3435|5584->3439|5615->3449|5676->3479|5725->3500|5930->3678|5958->3685|5994->3694|7169->4841|7198->4842|7239->4855|7307->4896|7336->4897|7378->4911|7436->4941|7465->4942|7511->4960|7753->5174|7782->5175|7831->5196|7944->5281|7973->5282|8014->5295|8043->5296
                  LINES: 27->1|32->1|33->3|47->17|47->17|47->17|62->32|62->32|62->32|67->37|67->37|67->37|68->38|68->38|68->38|68->38|68->38|69->39|69->39|69->39|70->40|70->40|70->40|70->40|70->40|71->41|71->41|71->41|72->42|72->42|72->42|72->42|72->42|73->43|73->43|73->43|75->45|76->46|76->46|76->46|76->46|76->46|77->47|77->47|77->47|78->48|78->48|78->48|78->48|79->49|79->49|79->49|80->50|80->50|80->50|80->50|80->50|80->50|80->50|81->51|82->52|89->59|89->59|90->60|112->82|112->82|113->83|114->84|114->84|116->86|116->86|116->86|118->88|122->92|122->92|123->93|124->94|124->94|125->95|125->95
                  -- GENERATED --
              */
          