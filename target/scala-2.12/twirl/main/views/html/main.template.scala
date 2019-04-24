
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
        <title>Sneaker Sanctuary</title>
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
                    <a class="navbar-brand" href=""""),_display_(/*32.52*/routes/*32.58*/.HomeController.index()),format.raw/*32.81*/("""" id="navbarlogo">Sneaker Sanctuary &trade;</a>
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
                            <a href=""""),_display_(/*44.39*/routes/*44.45*/.LoginController.registerUser()),format.raw/*44.76*/("""">Create Account</a>
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
                        """),_display_(/*58.26*/if((user != null) && ("customer".equals(user.getRole())))/*58.83*/ {_display_(Seq[Any](format.raw/*58.85*/("""
                            """),format.raw/*59.29*/("""<li """),_display_(/*59.34*/if(title == "Orders")/*59.55*/ {_display_(Seq[Any](format.raw/*59.57*/("""class="active"""")))}),format.raw/*59.72*/("""><a href=""""),_display_(/*59.83*/routes/*59.89*/.ShoppingCtrl.viewOrders),format.raw/*59.113*/("""">View Orders</a></li>
                            <li """),_display_(/*60.34*/if(title == "Basket")/*60.55*/ {_display_(Seq[Any](format.raw/*60.57*/("""class="active"""")))}),format.raw/*60.72*/("""><a href=""""),_display_(/*60.83*/routes/*60.89*/.ShoppingCtrl.showBasket),format.raw/*60.113*/("""">Basket</a></li>
                        """)))}),format.raw/*61.26*/("""
                        """),format.raw/*62.25*/("""<li """),_display_(/*62.30*/if(title == "login")/*62.50*/{_display_(Seq[Any](format.raw/*62.51*/("""class = "active"""")))}),format.raw/*62.68*/(""">
                        """),_display_(/*63.26*/if(user == null)/*63.42*/ {_display_(Seq[Any](format.raw/*63.44*/("""
                            """),format.raw/*64.29*/("""<a href=""""),_display_(/*64.39*/routes/*64.45*/.LoginController.login()),format.raw/*64.69*/("""">Login</a>
                        """)))}/*65.27*/else/*65.32*/{_display_(Seq[Any](format.raw/*65.33*/("""
                            """),format.raw/*66.29*/("""<a href = """"),_display_(/*66.41*/routes/*66.47*/.LoginController.logout()),format.raw/*66.72*/("""">Logout """),_display_(/*66.82*/user/*66.86*/.getName()),format.raw/*66.96*/("""</a>
                        """)))}),format.raw/*67.26*/("""
                    """),format.raw/*68.21*/("""</ul>

                </div>
                    <!-- /.navbar-collapse -->
            </div>
                <!-- /.container-->
        </nav> <!--End of navbar--->
        """),_display_(/*75.10*/content),format.raw/*75.17*/("""
        """),format.raw/*76.9*/("""<footer id="footer">
                <div class="row footerinfo">
                    <div class="col-xs-6 col-sm-6 col-md-6 col-lg-6">
                        <h4 contenteditable="true">COPYRIGHT © 2019 Sneaker Sanctuary</h4>
                        <p>Eoin Palmer - X00136028
                        <br>Paul Roche - X0014500
                        <br>Finn Harvey - X00127705 </p>
                    </div>
                    <div class="col-xs-6 col-sm-6 col-md-6 col-lg-6">
                        <a href="https://www.instagram.com/sneaker_sanctuary/?hl=en"><i class="fa fa-3x fa-fw fa-instagram text-inverse pull-right"></i></a>
                        <a href="https://twitter.com/SneakerSanctua1"><i class="fa fa-3x fa-fw fa-twitter text-inverse pull-right"></i></a>
                        <a href="https://www.facebook.com"><i class="fa fa-3x fa-fw fa-facebook text-inverse pull-right"></i></a>
                        <a href="https://github.com/EoinPAlmer/2ndYearProject"><i class="fa fa-3x fa-fw fa-github text-inverse pull-right"></i></a>
                    </div>
            </div>
        </footer>
    </body>
        <!--Javascript file to make footer always on bottom of page -->
    <script>

        function confirmDel()"""),format.raw/*96.30*/("""{"""),format.raw/*96.31*/("""
            """),format.raw/*97.13*/("""return confirm('Are you sure?');
        """),format.raw/*98.9*/("""}"""),format.raw/*98.10*/("""

            """),format.raw/*100.13*/("""$(document).ready(function () """),format.raw/*100.43*/("""{"""),format.raw/*100.44*/("""

                """),format.raw/*102.17*/("""var docHeight = $(window).height();
                var footerHeight = $('#footer').height();
                var footerTop = $('#footer').position().top + footerHeight;

                if (footerTop < docHeight) """),format.raw/*106.44*/("""{"""),format.raw/*106.45*/("""
                    """),format.raw/*107.21*/("""$('#footer').css('margin-top', 10 + (docHeight - footerTop) + 'px');
                """),format.raw/*108.17*/("""}"""),format.raw/*108.18*/("""
            """),format.raw/*109.13*/("""}"""),format.raw/*109.14*/(""");
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
                  DATE: Wed Apr 24 15:32:57 IST 2019
                  SOURCE: /home/wdd/2ndYearProject/app/views/main.scala.html
                  HASH: 17c1a692547dc9204e10f93d734e542643c30d5d
                  MATRIX: 970->1|1098->58|1160->92|2441->1346|2456->1352|2525->1399|3341->2188|3356->2194|3400->2217|3767->2557|3795->2576|3835->2578|3892->2607|3938->2622|3976->2633|3991->2639|4035->2662|4140->2740|4172->2763|4212->2765|4269->2794|4315->2809|4353->2820|4368->2826|4413->2850|4522->2932|4554->2955|4594->2957|4640->2972|4707->3012|4722->3018|4774->3049|4881->3129|4944->3183|4984->3185|5041->3214|5073->3219|5108->3245|5148->3247|5196->3264|5263->3304|5278->3310|5327->3338|5441->3425|5479->3454|5519->3456|5565->3471|5632->3511|5647->3517|5696->3545|5795->3617|5828->3641|5868->3643|5914->3658|5981->3698|5996->3704|6048->3735|6160->3816|6213->3842|6279->3899|6319->3901|6376->3930|6408->3935|6438->3956|6478->3958|6524->3973|6562->3984|6577->3990|6623->4014|6706->4070|6736->4091|6776->4093|6822->4108|6860->4119|6875->4125|6921->4149|6995->4192|7048->4217|7080->4222|7109->4242|7148->4243|7196->4260|7250->4287|7275->4303|7315->4305|7372->4334|7409->4344|7424->4350|7469->4374|7525->4412|7538->4417|7577->4418|7634->4447|7673->4459|7688->4465|7734->4490|7771->4500|7784->4504|7815->4514|7876->4544|7925->4565|8130->4743|8158->4750|8194->4759|9470->6007|9499->6008|9540->6021|9608->6062|9637->6063|9680->6077|9739->6107|9769->6108|9816->6126|10059->6340|10089->6341|10139->6362|10253->6447|10283->6448|10325->6461|10355->6462
                  LINES: 28->1|31->2|34->3|48->17|48->17|48->17|63->32|63->32|63->32|68->37|68->37|68->37|69->38|69->38|69->38|69->38|69->38|71->40|71->40|71->40|72->41|72->41|72->41|72->41|72->41|74->43|74->43|74->43|74->43|75->44|75->44|75->44|77->46|77->46|77->46|78->47|78->47|78->47|78->47|78->47|79->48|79->48|79->48|81->50|81->50|81->50|81->50|82->51|82->51|82->51|84->53|84->53|84->53|84->53|85->54|85->54|85->54|88->57|89->58|89->58|89->58|90->59|90->59|90->59|90->59|90->59|90->59|90->59|90->59|91->60|91->60|91->60|91->60|91->60|91->60|91->60|92->61|93->62|93->62|93->62|93->62|93->62|94->63|94->63|94->63|95->64|95->64|95->64|95->64|96->65|96->65|96->65|97->66|97->66|97->66|97->66|97->66|97->66|97->66|98->67|99->68|106->75|106->75|107->76|127->96|127->96|128->97|129->98|129->98|131->100|131->100|131->100|133->102|137->106|137->106|138->107|139->108|139->108|140->109|140->109
                  -- GENERATED --
              */
          