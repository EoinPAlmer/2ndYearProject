
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
/*1.2*/import helper._

object addProduct extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[models.products.Product],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(addProductForm: Form[models.products.Product])(user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.1*/("""

    """),_display_(/*5.6*/main("AddProduct", user)/*5.30*/ {_display_(Seq[Any](format.raw/*5.32*/("""

        """),format.raw/*7.9*/("""<div class="container">
            <h2 class = "text-center text-muted">Add A Product To <span class = "logo">Sneaker Sanctuary</span></h2>

            <div class="row">

                <div class="col-lg-8 col-md-8 col-sm-10 col-xs-12 col-centered">


                """),_display_(/*15.18*/form(action = routes.HomeController.addProductSubmit(), 'class -> "form-horizontal", 'role -> "form", 'enctype -> "multipart/form-data")/*15.154*/ {_display_(Seq[Any](format.raw/*15.156*/("""
                    """),format.raw/*16.49*/("""
                    """),format.raw/*17.109*/("""
                    """),_display_(/*18.22*/CSRF/*18.26*/.formField),format.raw/*18.36*/("""

                    """),_display_(/*20.22*/inputText(addProductForm("id"), '_label -> "ID", 'class -> "form-control")),format.raw/*20.96*/("""
                    """),_display_(/*21.22*/inputText(addProductForm("name"), '_label -> "Name", 'class -> "form-control")),format.raw/*21.100*/("""
                    """),_display_(/*22.22*/inputText(addProductForm("brand"), '_label -> "Brand", 'class -> "form-control")),format.raw/*22.102*/("""
                    """),_display_(/*23.22*/inputText(addProductForm("size"), '_label -> "Size", 'class -> "form-control")),format.raw/*23.100*/("""
                    """),_display_(/*24.22*/inputText(addProductForm("stock"), '_label -> "Stock", 'class -> "form-control")),format.raw/*24.102*/("""
                    """),_display_(/*25.22*/inputText(addProductForm("price"), '_label -> "Price", 'class -> "form-control")),format.raw/*25.102*/("""

                    """),_display_(/*27.22*/inputText(addProductForm("id"), '_label -> "", 'hidden -> "hidden")),format.raw/*27.89*/("""
                   
               
                    """),format.raw/*30.21*/("""<label>Image Upload</label>
                    <input class = "btn btn-dark" type = "file" name = "upload">

                    <br>

                    <div class="actions">
                        <input type="submit" value="Add Product" class="btn btn-dark">


                        """),format.raw/*39.131*/("""
                        """),format.raw/*40.25*/("""<a href=""""),_display_(/*40.35*/routes/*40.41*/.HomeController.products()),format.raw/*40.67*/("""" class="btn btn-danger">Cancel</a>


                    </div>
                </div>
            </div>
        </div>

    """)))}),format.raw/*48.6*/("""

    """)))}))
      }
    }
  }

  def render(addProductForm:Form[models.products.Product],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(addProductForm)(user)

  def f:((Form[models.products.Product]) => (models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (addProductForm) => (user) => apply(addProductForm)(user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Mar 20 18:45:54 GMT 2019
                  SOURCE: /home/wdd/2ndYearProject/app/views/addProduct.scala.html
                  HASH: 20d70428e731882539b04b3691df43d88872fa4f
                  MATRIX: 651->1|1017->18|1183->91|1215->98|1247->122|1286->124|1322->134|1622->407|1768->543|1809->545|1858->594|1908->703|1957->725|1970->729|2001->739|2051->762|2146->836|2195->858|2295->936|2344->958|2446->1038|2495->1060|2595->1138|2644->1160|2746->1240|2795->1262|2897->1342|2947->1365|3035->1432|3120->1489|3440->1886|3493->1911|3530->1921|3545->1927|3592->1953|3750->2081
                  LINES: 24->1|29->2|34->3|36->5|36->5|36->5|38->7|46->15|46->15|46->15|47->16|48->17|49->18|49->18|49->18|51->20|51->20|52->21|52->21|53->22|53->22|54->23|54->23|55->24|55->24|56->25|56->25|58->27|58->27|61->30|70->39|71->40|71->40|71->40|71->40|79->48
                  -- GENERATED --
              */
          