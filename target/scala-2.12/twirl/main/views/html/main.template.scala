
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

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[String,models.users.User,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String, user: models.users.User)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import javax.swing.text.html.HTML


Seq[Any](format.raw/*3.1*/("""<html>
    <head>
        <title>Sneaker Sancturay</title>
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
                    <a class="navbar-brand" href=""""),_display_(/*32.52*/routes/*32.58*/.HomeController.index()),format.raw/*32.81*/("""" id="navbarlogo">Sneaker Sancturay &trade;</a>
                </div>
                    <!-- Collect the nav links, forms, and other content for toggling -->
                <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                    <ul class="nav navbar-nav navbar-right">
                        <li """),_display_(/*37.30*/if(title == "home")/*37.49*/ {_display_(Seq[Any](format.raw/*37.51*/("""
                            """),format.raw/*38.29*/("""class="active"""")))}),format.raw/*38.44*/("""><a href=""""),_display_(/*38.55*/routes/*38.61*/.HomeController.index()),format.raw/*38.84*/("""">Home</a>
                            </li>
                            <li """),_display_(/*40.34*/if(title == "products")/*40.57*/ {_display_(Seq[Any](format.raw/*40.59*/("""
                            """),format.raw/*41.29*/("""class="active"""")))}),format.raw/*41.44*/("""><a href=""""),_display_(/*41.55*/routes/*41.61*/.HomeController.onsale()),format.raw/*41.85*/("""">Products</a>
                            </li>
                            <li """),_display_(/*43.34*/if(title == "Register")/*43.57*/ {_display_(Seq[Any](format.raw/*43.59*/("""class="active"""")))}),format.raw/*43.74*/(""">
                            <a href=""""),_display_(/*44.39*/routes/*44.45*/.LoginController.registerUser()),format.raw/*44.76*/("""">Register user</a>
                            </li>
                        """),_display_(/*46.26*/if((user != null) && ("Admin".equals(user.getRole())))/*46.80*/ {_display_(Seq[Any](format.raw/*46.82*/("""
                            """),format.raw/*47.29*/("""<li """),_display_(/*47.34*/if(title == "Add Product")/*47.60*/ {_display_(Seq[Any](format.raw/*47.62*/("""class = "active"""")))}),format.raw/*47.79*/(""">
                            <a href=""""),_display_(/*48.39*/routes/*48.45*/.HomeController.addProduct()),format.raw/*48.73*/("""">Add A Product</a>
                            </li>
                            <li """),_display_(/*50.34*/if(title == "Administrators")/*50.63*/ {_display_(Seq[Any](format.raw/*50.65*/("""class="active"""")))}),format.raw/*50.80*/(""">
                            <a href=""""),_display_(/*51.39*/routes/*51.45*/.HomeController.usersAdmin()),format.raw/*51.73*/("""">View Admin</a>
                            </li>
				            <li """),_display_(/*53.22*/if(title == "Customers")/*53.46*/ {_display_(Seq[Any](format.raw/*53.48*/("""class="active"""")))}),format.raw/*53.63*/(""">
                            <a href=""""),_display_(/*54.39*/routes/*54.45*/.HomeController.usersCustomer()),format.raw/*54.76*/("""">View Customers</a>
                            </li>

                        """)))}),format.raw/*57.26*/("""
                        """),format.raw/*58.25*/("""<li """),_display_(/*58.30*/if(title == "login")/*58.50*/{_display_(Seq[Any](format.raw/*58.51*/("""class = "active"""")))}),format.raw/*58.68*/(""">
                        """),_display_(/*59.26*/if(user == null)/*59.42*/ {_display_(Seq[Any](format.raw/*59.44*/("""
                            """),format.raw/*60.29*/("""<a href=""""),_display_(/*60.39*/routes/*60.45*/.LoginController.login()),format.raw/*60.69*/("""">Login</a>
                        """)))}/*61.27*/else/*61.32*/{_display_(Seq[Any](format.raw/*61.33*/("""
                            """),format.raw/*62.29*/("""<a href = """"),_display_(/*62.41*/routes/*62.47*/.LoginController.logout()),format.raw/*62.72*/("""">Logout """),_display_(/*62.82*/user/*62.86*/.getName()),format.raw/*62.96*/("""</a>
                        """)))}),format.raw/*63.26*/("""
                    """),format.raw/*64.21*/("""</ul>

                </div>
                    <!-- /.navbar-collapse -->
            </div>
                <!-- /.container-->
        </nav> <!--End of navbar--->
        """),_display_(/*71.10*/content),format.raw/*71.17*/("""
        """),format.raw/*72.9*/("""<footer id="footer">
            <div class="container">
                <div class="row footerinfo">
                    <div class="col-xs-6 col-sm-6 col-md-6 col-lg-6">
                        <h4 contenteditable="true">COPYRIGHT © 2019 Sneaker Sancturay</h4>
                        <p>Eoin Palmer - X00136028
                        <br>Paul Roche - X0014500
                        <br>Finn Harvey - X00127705 </p>
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

        function confirmDel()"""),format.raw/*94.30*/("""{"""),format.raw/*94.31*/("""
            """),format.raw/*95.13*/("""return confirm('Are you sure?');
        """),format.raw/*96.9*/("""}"""),format.raw/*96.10*/("""

            """),format.raw/*98.13*/("""$(document).ready(function () """),format.raw/*98.43*/("""{"""),format.raw/*98.44*/("""

                """),format.raw/*100.17*/("""var docHeight = $(window).height();
                var footerHeight = $('#footer').height();
                var footerTop = $('#footer').position().top + footerHeight;

                if (footerTop < docHeight) """),format.raw/*104.44*/("""{"""),format.raw/*104.45*/("""
                    """),format.raw/*105.21*/("""$('#footer').css('margin-top', 10 + (docHeight - footerTop) + 'px');
                """),format.raw/*106.17*/("""}"""),format.raw/*106.18*/("""
            """),format.raw/*107.13*/("""}"""),format.raw/*107.14*/(""");
    </script>

</html>
"""))
      }
    }
  }

  def render(title:String,user:models.users.User,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title,user)(content)

  def f:((String,models.users.User) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title,user) => (content) => apply(title,user)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Apr 02 12:34:41 IST 2019
                  SOURCE: /home/wdd/2ndYearProject/app/views/main.scala.html
                  HASH: 2b032764165977d2b97dc6958c1e2b181139bccc
                  MATRIX: 970->1|1098->58|1160->92|2441->1346|2456->1352|2525->1399|3341->2188|3356->2194|3400->2217|3767->2557|3795->2576|3835->2578|3892->2607|3938->2622|3976->2633|3991->2639|4035->2662|4140->2740|4172->2763|4212->2765|4269->2794|4315->2809|4353->2820|4368->2826|4413->2850|4522->2932|4554->2955|4594->2957|4640->2972|4707->3012|4722->3018|4774->3049|4880->3128|4943->3182|4983->3184|5040->3213|5072->3218|5107->3244|5147->3246|5195->3263|5262->3303|5277->3309|5326->3337|5440->3424|5478->3453|5518->3455|5564->3470|5631->3510|5646->3516|5695->3544|5794->3616|5827->3640|5867->3642|5913->3657|5980->3697|5995->3703|6047->3734|6159->3815|6212->3840|6244->3845|6273->3865|6312->3866|6360->3883|6414->3910|6439->3926|6479->3928|6536->3957|6573->3967|6588->3973|6633->3997|6689->4035|6702->4040|6741->4041|6798->4070|6837->4082|6852->4088|6898->4113|6935->4123|6948->4127|6979->4137|7040->4167|7089->4188|7294->4366|7322->4373|7358->4382|8544->5540|8573->5541|8614->5554|8682->5595|8711->5596|8753->5610|8811->5640|8840->5641|8887->5659|9130->5873|9160->5874|9210->5895|9324->5980|9354->5981|9396->5994|9426->5995
                  LINES: 28->1|31->2|34->3|48->17|48->17|48->17|63->32|63->32|63->32|68->37|68->37|68->37|69->38|69->38|69->38|69->38|69->38|71->40|71->40|71->40|72->41|72->41|72->41|72->41|72->41|74->43|74->43|74->43|74->43|75->44|75->44|75->44|77->46|77->46|77->46|78->47|78->47|78->47|78->47|78->47|79->48|79->48|79->48|81->50|81->50|81->50|81->50|82->51|82->51|82->51|84->53|84->53|84->53|84->53|85->54|85->54|85->54|88->57|89->58|89->58|89->58|89->58|89->58|90->59|90->59|90->59|91->60|91->60|91->60|91->60|92->61|92->61|92->61|93->62|93->62|93->62|93->62|93->62|93->62|93->62|94->63|95->64|102->71|102->71|103->72|125->94|125->94|126->95|127->96|127->96|129->98|129->98|129->98|131->100|135->104|135->104|136->105|137->106|137->106|138->107|138->107
                  -- GENERATED --
              */
          