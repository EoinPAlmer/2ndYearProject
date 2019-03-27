
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
                            """),format.raw/*38.29*/("""class="active"""")))}),format.raw/*38.44*/("""><a href=""""),_display_(/*38.55*/routes/*38.61*/.HomeController.index()),format.raw/*38.84*/("""">Home</a></li>
                        <li """),_display_(/*39.30*/if(title == "products")/*39.53*/ {_display_(Seq[Any](format.raw/*39.55*/("""
                            """),format.raw/*40.29*/("""class="active"""")))}),format.raw/*40.44*/("""><a href=""""),_display_(/*40.55*/routes/*40.61*/.HomeController.onsale()),format.raw/*40.85*/("""">Products</a></li>
                        """),_display_(/*41.26*/if((user != null) && ("admin".equals(user.getRole())))/*41.80*/ {_display_(Seq[Any](format.raw/*41.82*/("""
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

  def render(title:String,user:models.users.User,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title,user)(content)

  def f:((String,models.users.User) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title,user) => (content) => apply(title,user)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Mar 27 14:50:46 GMT 2019
                  SOURCE: /home/wdd/2ndYearProject/app/views/main.scala.html
                  HASH: 3028366beabf722ff841421353e5a3ab2c775fa7
                  MATRIX: 970->1|1098->58|1160->92|2441->1346|2456->1352|2525->1399|3341->2188|3356->2194|3400->2217|3767->2557|3795->2576|3835->2578|3892->2607|3938->2622|3976->2633|3991->2639|4035->2662|4107->2707|4139->2730|4179->2732|4236->2761|4282->2776|4320->2787|4335->2793|4380->2817|4452->2862|4515->2916|4555->2918|4612->2947|4644->2952|4679->2978|4719->2980|4767->2997|4834->3037|4849->3043|4898->3071|5008->3150|5061->3175|5093->3180|5122->3200|5161->3201|5209->3218|5263->3245|5288->3261|5328->3263|5385->3292|5422->3302|5437->3308|5482->3332|5538->3370|5551->3375|5590->3376|5647->3405|5686->3417|5701->3423|5747->3448|5784->3458|5797->3462|5828->3472|5889->3502|5938->3523|6143->3701|6171->3708|6207->3717|7393->4875|7422->4876|7463->4889|7531->4930|7560->4931|7602->4945|7660->4975|7689->4976|7735->4994|7977->5208|8006->5209|8055->5230|8168->5315|8197->5316|8238->5329|8267->5330
                  LINES: 28->1|31->2|34->3|48->17|48->17|48->17|63->32|63->32|63->32|68->37|68->37|68->37|69->38|69->38|69->38|69->38|69->38|70->39|70->39|70->39|71->40|71->40|71->40|71->40|71->40|72->41|72->41|72->41|73->42|73->42|73->42|73->42|73->42|74->43|74->43|74->43|76->45|77->46|77->46|77->46|77->46|77->46|78->47|78->47|78->47|79->48|79->48|79->48|79->48|80->49|80->49|80->49|81->50|81->50|81->50|81->50|81->50|81->50|81->50|82->51|83->52|90->59|90->59|91->60|113->82|113->82|114->83|115->84|115->84|117->86|117->86|117->86|119->88|123->92|123->92|124->93|125->94|125->94|126->95|126->95
                  -- GENERATED --
              */
          